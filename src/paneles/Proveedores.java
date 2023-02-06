
package paneles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Proveedores extends javax.swing.JPanel {

    private Connection connection = null;
    DefaultTableModel modelo = new DefaultTableModel();
    public Proveedores(Connection conn) {
        connection = conn;
        initComponents();
        TablaP.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
    }
    public void insertardatos(String nombre,String dir,String telefono) throws InterruptedException {
        try {
            Statement sentencia;

            System.out.println("in 1");
            sentencia = this.connection.createStatement();
            System.out.println("in 2");

            String query = "INSERT INTO Proveedores VALUES('" + nombre + "','" + dir + "','" + telefono + "')";
            
            System.out.println(query);
            sentencia.executeUpdate(query);

            System.out.println("\n\nLos datos ya fueron almacenados en la BD \n\n");

        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrardatos() {
        try {
            Statement stnt = connection.createStatement();
            String SQL = "SELECT * FROM Proveedores ";

            ResultSet rs = stnt.executeQuery(SQL);

            System.out.println("Mostrando Tabla");
            int cantidadColumnas = 4;

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println("Error en la base de datos: " + e.getMessage());
        }
    }

    public void eliminardatos() throws InterruptedException {
        try {

            PreparedStatement sentencia;

            int Fila = TablaP.getSelectedRow();
            String codigo = TablaP.getValueAt(Fila, 0).toString();

            sentencia = this.connection.prepareStatement("DELETE FROM Proveedores where id_Proveedor=?");
            sentencia.setString(1, codigo);
            modelo.removeRow(Fila);
            JOptionPane.showMessageDialog(null, "Proveedor Eliminado");
            System.out.println(sentencia);

            int retorno = sentencia.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void eliminar() {
        int fila = TablaP.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    public void limpiar() {
        nom.setText("");
        tel.setText("");
        direccion.setText("");
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        nom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaP = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(980, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 260, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 260, 10));

        nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nom.setBorder(null);
        jPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 260, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 81, 23));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Direccion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, 30));

        direccion.setBorder(null);
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 260, 30));

        tel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tel.setBorder(null);
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Telefono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 81, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 260, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/pro.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 110));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 500, 330));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/P.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 24, 468, 73));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo (1).png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, 160));

        rSButton1.setBackground(new java.awt.Color(153, 153, 255));
        rSButton1.setText("Mostrar");
        rSButton1.setColorHover(new java.awt.Color(102, 102, 255));
        rSButton1.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });
        add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, -1));

        rSButton2.setBackground(new java.awt.Color(153, 153, 255));
        rSButton2.setText("Agregar");
        rSButton2.setColorHover(new java.awt.Color(102, 102, 255));
        rSButton2.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });
        add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        rSButton3.setBackground(new java.awt.Color(255, 51, 51));
        rSButton3.setText("Eliminar");
        rSButton3.setColorHover(new java.awt.Color(204, 0, 0));
        rSButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton3ActionPerformed(evt);
            }
        });
        add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        TablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaP.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        TablaP.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        TablaP.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        TablaP.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        TablaP.setColorSelBackgound(new java.awt.Color(153, 153, 153));
        TablaP.setColorSelForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TablaP);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 480, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        eliminar();
        mostrardatos();
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
         String nombre = nom.getText();
        String dir = direccion.getText();
        String telefono= tel.getText();
        
        int cantidadColumnas = 3;
        String[] fila = new String[cantidadColumnas];
        fila[0] = nombre;
        fila[1] = dir;
        fila[2] = telefono;
       
        modelo.addRow(fila);
        try {
            insertardatos(nombre,dir,telefono);
        } catch (InterruptedException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton3ActionPerformed
        int pregunta = JOptionPane.showConfirmDialog(this,"¿Seguro que deseas eliminar el dato?","pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(pregunta == 0){
            try {
                eliminardatos();
            } catch (InterruptedException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rSButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro TablaP;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nom;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
