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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arturo
 */
public class ClientesV extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    private Connection connection = null;
    int cantidad, stoc;
    double precio, res;
    int cantidad2;
    int r;
    int modi;
    String codigo = "";
    String producto = "";
    String cantidaddeventa = "";
    String resultado = "";
    String dia="";

    public ClientesV(Connection conn) {
        connection = conn;
        initComponents();
        idtext.setVisible(false);
        provedortext.setVisible(false);
        PRECIO.setVisible(false);
        CODIGO_PRODUCTO.setVisible(false);

        TablaVC.setModel(modelo);
        // modelo.addColumn("Código");
        modelo.addColumn("Medicamento");
        modelo.addColumn("Compro");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha");
        TablaVC.getColumnModel().getColumn(0).setPreferredWidth(250);
        TablaVC.getColumnModel().getColumn(1).setPreferredWidth(100);
        TablaVC.getColumnModel().getColumn(2).setPreferredWidth(100);
        TablaVC.getColumnModel().getColumn(3).setPreferredWidth(100);
    }

    public void eliminar() {
        int fila = TablaVC.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public float sSuma() {
        int colum = modelo.getRowCount();
        float suu = 0;
        System.out.println("aa");
        for (int i = 0; i < colum; i++) {

            suu = suu + Float.parseFloat(modelo.getValueAt(i, 2).toString());
            System.out.println("aaa");
        }
        return suu;
    }

    public void mostrardatos() {
        try {
            Statement stnt = connection.createStatement();
            String SQL = "SELECT * FROM Medicamentos ";

            ResultSet rs = stnt.executeQuery(SQL);

            System.out.println("Mostrando Tabla");
            int cantidadColumnas = 6;
            /*for (int i = 0;i<=cantidadColumnas; i++) {
                modelo.removeRow(i);
            }*/

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

    public void insertardatos() throws InterruptedException {
        try {
            //Statement sentencia;
            PreparedStatement sentencia;
        for(int i=0; i<TablaVC.getRowCount();i++){
            sentencia = this.connection.prepareStatement("INSERT INTO Compras(Producto,Cantidad,Precio,Fecha)VALUES(?,?,?,?)");
             
           // String query = "INSERT INTO Compras VALUES('" + producto + "','" + cantidaddeventa + "','" + resultado + "')";
           // System.out.println(query);
           sentencia.setString(1,TablaVC.getValueAt(i,0).toString());
           sentencia.setString(2,TablaVC.getValueAt(i,1).toString());
           sentencia.setString(3,TablaVC.getValueAt(i,2).toString());
           sentencia.setString(4,TablaVC.getValueAt(i,3).toString());
            sentencia.executeUpdate();
        }
            System.out.println("\n\nLos datos ya fueron almacenados en la BD \n\n");

        } catch (SQLException ex) {
            Logger.getLogger(ClientesV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Clientesventa(String id, String venta, String fecha) throws InterruptedException {
        try {
            Statement sentencia;

            System.out.println("in 1");
            sentencia = this.connection.createStatement();
            System.out.println("in 2");

            String query = "INSERT INTO Comprascliente VALUES('"+id+"','" + venta + "','" + fecha + "')";
            
            System.out.println(query);
            sentencia.executeUpdate(query);

            System.out.println("\n\nLos datos ya fueron almacenados en la BD \n\n");

        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agre() {
        PreparedStatement sentencia;

        try {
            
            
            sentencia = this.connection.prepareStatement("Update Medicamentos SET  cantidad=? where id_Medicamento=?");
            sentencia.setInt(1, modi);
            sentencia.setString(2, codigo);

            sentencia.executeUpdate();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void limpiargeneral() {
        nacimiento.setText("");
        sexo.setText("");
        telefono.setText("");
        correo.setText("");
        CODIGO_PRODUCTO.setText("");
        medicamento.setText("");
        stock.setText("");
        preciotext.setText("");
        cantuser.setText("");
        total.setText("");
        nombre.setText("");
        idcliente.setText("");
        suma.setText("");
    }
    public void limpiar() {
        
        CODIGO_PRODUCTO.setText("");
        medicamento.setText("");
        stock.setText("");
        preciotext.setText("");
        cantuser.setText("");
        total.setText("");
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        total = new javax.swing.JTextField();
        cantuser = new javax.swing.JTextField();
        CODIGO_PRODUCTO = new javax.swing.JTextField();
        PRECIO = new javax.swing.JTextField();
        provedortext = new javax.swing.JTextField();
        suma = new javax.swing.JTextField();
        idtext = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        medicamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        preciotext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        idcliente = new javax.swing.JTextField();
        rSButton5 = new rojeru_san.RSButton();
        jPanel4 = new javax.swing.JPanel();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        nacimiento = new javax.swing.JTextField();
        sexo = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        rSButton1 = new rojeru_san.RSButton();
        rSButton4 = new rojeru_san.RSButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVC = new rojerusan.RSTableMetro();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 75, 27));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 80, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 150, 10));

        total.setEditable(false);
        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setBorder(null);
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 100, 20));

        cantuser.setBorder(null);
        cantuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantuserActionPerformed(evt);
            }
        });
        cantuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantuserKeyReleased(evt);
            }
        });
        jPanel1.add(cantuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 150, 25));

        CODIGO_PRODUCTO.setEditable(false);
        jPanel1.add(CODIGO_PRODUCTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 10, -1));

        PRECIO.setText("jTextField3");
        jPanel1.add(PRECIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 13, -1));

        provedortext.setText("jTextField2");
        jPanel1.add(provedortext, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 12, -1));

        suma.setEditable(false);
        suma.setBackground(new java.awt.Color(255, 255, 255));
        suma.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        suma.setBorder(null);
        jPanel1.add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 190, 90));
        jPanel1.add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 26, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medicamento.setEditable(false);
        medicamento.setBackground(new java.awt.Color(255, 255, 255));
        medicamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        medicamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        medicamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 11, 210, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Medicamento");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, -1, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Stock");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 63, 18));

        stock.setEditable(false);
        stock.setBackground(new java.awt.Color(255, 255, 255));
        stock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 76, 140, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Precio");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 63, 24));

        preciotext.setEditable(false);
        preciotext.setBackground(new java.awt.Color(255, 255, 255));
        preciotext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        preciotext.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(preciotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 88, 24));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("IdCliente");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 92, 30));

        idcliente.setEditable(false);
        idcliente.setBackground(new java.awt.Color(255, 255, 255));
        idcliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idcliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 88, 24));

        rSButton5.setBackground(new java.awt.Color(153, 255, 102));
        rSButton5.setText("IDCliente");
        rSButton5.setColorHover(new java.awt.Color(102, 255, 51));
        rSButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(rSButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 94, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 570, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        rSButton2.setBackground(new java.awt.Color(153, 153, 255));
        rSButton2.setText("Agregar");
        rSButton2.setColorHover(new java.awt.Color(102, 102, 255));
        rSButton2.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });

        rSButton3.setBackground(new java.awt.Color(255, 51, 51));
        rSButton3.setText("Eliminar");
        rSButton3.setColorHover(new java.awt.Color(204, 0, 0));
        rSButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(rSButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(rSButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/VEN.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 320, 100));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo (1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, 160));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre.setBorder(null);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 280, 60));

        nacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nacimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 150, -1));

        sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 150, -1));

        telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 150, -1));

        correo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 150, -1));

        rSButton1.setBackground(new java.awt.Color(153, 153, 255));
        rSButton1.setText("Seleccionar");
        rSButton1.setColorHover(new java.awt.Color(102, 102, 255));
        rSButton1.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 250, -1));

        rSButton4.setBackground(new java.awt.Color(153, 153, 255));
        rSButton4.setText("Total");
        rSButton4.setColorHover(new java.awt.Color(102, 102, 255));
        rSButton4.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("DATOS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 100, -1));

        TablaVC.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaVC.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaVC.setColorBackgoundHead(new java.awt.Color(102, 255, 51));
        TablaVC.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        TablaVC.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        TablaVC.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        TablaVC.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        TablaVC.setColorSelForeground(new java.awt.Color(0, 0, 0));
        TablaVC.setPreferredSize(new java.awt.Dimension(543, 64));
        jScrollPane1.setViewportView(TablaVC);
        if (TablaVC.getColumnModel().getColumnCount() > 0) {
            TablaVC.getColumnModel().getColumn(0).setPreferredWidth(250);
            TablaVC.getColumnModel().getColumn(1).setResizable(false);
            TablaVC.getColumnModel().getColumn(1).setPreferredWidth(100);
            TablaVC.getColumnModel().getColumn(2).setPreferredWidth(100);
            TablaVC.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 550, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cantuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantuserActionPerformed

    private void cantuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantuserKeyReleased

        precio = Double.parseDouble(preciotext.getText());
        cantidad2 = Integer.parseInt(cantuser.getText());

        res = precio * cantidad2;

        total.setText(""+res);

    }//GEN-LAST:event_cantuserKeyReleased

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        Lista2 l = new Lista2(connection);
        l.show();
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        String s = stock.getText();
        int sn = Integer.parseInt(s);
        if (sn == 0) {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock");
        } else {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Fecha: " + dateFormat.format(date));
            codigo = CODIGO_PRODUCTO.getText();
            cantidad = Integer.parseInt(cantuser.getText());
            stoc = Integer.parseInt(ClientesV.stock.getText());
            modi = stoc - cantidad;
            agre();
            producto = medicamento.getText();
            String stockk = stock.getText();
            cantidaddeventa = cantuser.getText();
            resultado = total.getText();
            dia = dateFormat.format(date);

            int cantidadColumnas = 4;
            String[] fila = new String[cantidadColumnas];

            fila[0] = producto;
            fila[1] = cantidaddeventa;
            fila[2] = resultado;
            fila[3] = dia;

            modelo.addRow(fila);
           
            limpiar();
             suma.setText(Float.toString(sSuma())+"0");
        }
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton3ActionPerformed
        PreparedStatement sentencia;
        int pregunta = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas eliminar el dato?", "pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (pregunta == 0) {
            eliminar();

        }
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void rSButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton4ActionPerformed
        String numcliente = idcliente.getText();
        String suma2 = suma.getText();
        
        if(suma2.isEmpty()){
            JOptionPane.showMessageDialog(null,"Los campos estan vacios");
        }else{
        try {
            insertardatos();
            Clientesventa(numcliente, suma2, dia);
            JOptionPane.showMessageDialog(null,"Compra Realizada");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ClientesV.class.getName()).log(Level.SEVERE, null, ex);
        }
        Ticket t = new Ticket();
        t.setVisible(true);
        for (int i = 0; i < TablaVC.getRowCount(); i++) {
            String Datos[] = new String[4];
            Datos[0] = TablaVC.getValueAt(i, 0).toString();
            Datos[1] = TablaVC.getValueAt(i, 1).toString();
            Datos[2] = TablaVC.getValueAt(i, 2).toString();
            Datos[3] = TablaVC.getValueAt(i, 3).toString();

            t.modelo2.addRow(Datos);
        }
        String rec=suma.getText();
        Ticket.recibe.setText(rec);
        String cl =nombre.getText();
        Ticket.cL.setText(cl);
        String idclien = idcliente.getText();
        Ticket.idcl.setText(idclien);
        eliminar();
        limpiargeneral();
        }
    }//GEN-LAST:event_rSButton4ActionPerformed

    private void rSButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton5ActionPerformed
        LisClientes l = new LisClientes(connection);
        l.show();
    }//GEN-LAST:event_rSButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField CODIGO_PRODUCTO;
    public static javax.swing.JTextField PRECIO;
    private rojerusan.RSTableMetro TablaVC;
    private javax.swing.JTextField cantuser;
    public static javax.swing.JTextField correo;
    public static javax.swing.JTextField idcliente;
    public static javax.swing.JTextField idtext;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField medicamento;
    public static javax.swing.JTextField nacimiento;
    public static javax.swing.JTextField nombre;
    public static javax.swing.JTextField preciotext;
    public static javax.swing.JTextField provedortext;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSButton rSButton4;
    private rojeru_san.RSButton rSButton5;
    public static javax.swing.JTextField sexo;
    public static javax.swing.JTextField stock;
    private javax.swing.JTextField suma;
    public static javax.swing.JTextField telefono;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

    
}
