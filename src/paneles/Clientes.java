/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Arturo
 */
public class Clientes extends javax.swing.JPanel {
    private Connection connection = null;
    String d = "";
    String m = "";
    String a = "";
    String mm="";
     
    DefaultTableModel modelo = new DefaultTableModel();
    public Clientes(Connection conn) {
        connection = conn;
        initComponents();
        sex.setVisible(false);
        fec.setVisible(false);
        TablaC.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de Nacimiento");
        modelo.addColumn("Sexo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        
       
          
    }
    public void insertardatos(String id, String nombre, String telefono, String fecha, String sexo, String correo) throws InterruptedException {
        try {
            Statement sentencia;

            System.out.println("in 1");
            sentencia = this.connection.createStatement();
            System.out.println("in 2");

            String query = "INSERT INTO Clientes VALUES('"+id+"','" + nombre + "','" + fecha + "','" + sexo + "','" + telefono + "','" + correo + "')";
            
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
            String SQL = "SELECT * FROM Clientes ";

            ResultSet rs = stnt.executeQuery(SQL);

            System.out.println("Mostrando Tabla");
            int cantidadColumnas = 6;

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

            int Fila = TablaC.getSelectedRow();
            String codigo = TablaC.getValueAt(Fila, 0).toString();

            sentencia = this.connection.prepareStatement("DELETE FROM Clientes where id_Cliente=?");
            sentencia.setString(1, codigo);
            modelo.removeRow(Fila);
            JOptionPane.showMessageDialog(null, "Cliente Eliminado");
            System.out.println(sentencia);

            int retorno = sentencia.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void limpiar(){
        Nom.setText("");
        fec.setText("");
        sex.setText("");
        tel.setText("");
        email.setText("");
        numero.setText("");
    }
    public void eliminar() {
        int fila = TablaC.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
     private void filtro(String consulta, JTable jtableBuscar){
        modelo = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Nom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        año = new javax.swing.JComboBox<>();
        hombre = new javax.swing.JCheckBox();
        mujer = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        fec = new javax.swing.JTextField();
        sex = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rSButton3 = new rojeru_san.RSButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaC = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1060, 560));
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

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 260, 10));

        Nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nom.setBorder(null);
        Nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NomKeyPressed(evt);
            }
        });
        jPanel1.add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 260, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 81, 23));

        dia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        dia.setBorder(null);
        dia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });
        jPanel1.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 57, -1));

        mes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01-Enero", "02-Febrero", "03-Marzo", "04-Abril", "05-Mayo", "06-Junio\t", "07-Julio", "08-Agosto", "09-Septiembre", "10-Octubre", "11-Noviembre", "12-Diciembre", " " }));
        mes.setToolTipText("Mes");
        mes.setBorder(null);
        mes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 120, -1));

        año.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018\t", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", " " }));
        año.setBorder(null);
        año.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });
        jPanel1.add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 69, -1));

        hombre.setBackground(new java.awt.Color(255, 255, 255));
        hombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hombre.setText("Hombre");
        hombre.setBorder(null);
        hombre.setContentAreaFilled(false);
        hombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/Hombreb.png"))); // NOI18N
        hombre.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/Hombre.png"))); // NOI18N
        hombre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/Hombre.png"))); // NOI18N
        hombre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        hombre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hombreActionPerformed(evt);
            }
        });
        jPanel1.add(hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 90, 80));

        mujer.setBackground(new java.awt.Color(255, 255, 255));
        mujer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mujer.setText("Mujer");
        mujer.setContentAreaFilled(false);
        mujer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mujer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mujer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/mujerdos.png"))); // NOI18N
        mujer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/mujer.png"))); // NOI18N
        mujer.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mujer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mujerActionPerformed(evt);
            }
        });
        jPanel1.add(mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 403, 120, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sexo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 80, 30));

        email.setBorder(null);
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 260, 30));
        jPanel1.add(fec, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 531, 20, -1));
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 531, 20, -1));

        tel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tel.setBorder(null);
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Telefono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 81, 30));

        numero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero.setBorder(null);
        jPanel1.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 130, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/Card_Header.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 110));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Fecha de nacimiento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Correo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, 30));

        rSButton3.setBackground(new java.awt.Color(153, 153, 255));
        rSButton3.setText("Agregar");
        rSButton3.setColorHover(new java.awt.Color(102, 102, 255));
        rSButton3.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 170, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, 500, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo (1).png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, -1, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/CLIENTE.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 420, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Buscar");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 70, 30));

        buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 170, 30));

        rSButton1.setBackground(new java.awt.Color(153, 153, 255));
        rSButton1.setText("Mostrar");
        rSButton1.setColorHover(new java.awt.Color(102, 102, 255));
        rSButton1.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });
        add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 120, 40));

        rSButton2.setBackground(new java.awt.Color(255, 51, 51));
        rSButton2.setText("Eliminar");
        rSButton2.setColorHover(new java.awt.Color(204, 0, 0));
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });
        add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 110, 40));

        TablaC.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaC.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        TablaC.setColorFilasBackgound1(new java.awt.Color(204, 204, 204));
        TablaC.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        TablaC.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        TablaC.setColorSelBackgound(new java.awt.Color(255, 255, 255));
        TablaC.setColorSelForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TablaC);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 500, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        d = dia.getSelectedItem().toString();
    }//GEN-LAST:event_diaActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        m = mes.getSelectedItem().toString();
        mm = m.substring(0,2);
    }//GEN-LAST:event_mesActionPerformed

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        a = año.getSelectedItem().toString();

        fec.setText(a+mm+d);
    }//GEN-LAST:event_añoActionPerformed

    private void hombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombreActionPerformed
       if(hombre.isSelected()==true){
        String h = "M";
        sex.setText(h);
       }else if(mujer.isSelected()==false){
           
       }
    }//GEN-LAST:event_hombreActionPerformed

    private void mujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mujerActionPerformed
       if(mujer.isSelected()==true){
        String m = "F";
        sex.setText(m);
       }else if(hombre.isSelected()==false){
           
       }
    }//GEN-LAST:event_mujerActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        filtro(buscar.getText().toUpperCase(),TablaC);
    }//GEN-LAST:event_buscarKeyReleased

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
         eliminar();
        mostrardatos();
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
         int pregunta = JOptionPane.showConfirmDialog(this,"¿Seguro que deseas eliminar el dato?","pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(pregunta == 0){
        try {
            eliminardatos();
        } catch (InterruptedException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton3ActionPerformed
        String id = numero.getText();
        String nombre = Nom.getText();
        String telefono= tel.getText();
        String fecha=fec.getText();
        String sexo = sex.getText();
        String correo=email.getText();
        
        try{
            insertardatos(id,nombre, telefono, fecha, sexo, correo);
        }catch(InterruptedException ex){
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void NomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomKeyPressed
        String name = Nom.getText();
        String n = name.substring(0,2);
        int num = (int) (Math.random() * 1000 + 10);
        numero.setText(n+num+"");
    }//GEN-LAST:event_NomKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nom;
    private rojerusan.RSTableMetro TablaC;
    private javax.swing.JComboBox<String> año;
    private javax.swing.JTextField buscar;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fec;
    private javax.swing.JCheckBox hombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JCheckBox mujer;
    private javax.swing.JTextField numero;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private javax.swing.JTextField sex;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
