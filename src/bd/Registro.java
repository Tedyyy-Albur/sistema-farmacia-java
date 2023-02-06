package bd;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Registro extends javax.swing.JFrame {

    private Connection connection = null;
    int LayoutX;
    int LayoutY;
    String d = "";
    String m = "";
    String a = "";

    public Registro(Connection conn)  {
        connection = conn;
        initComponents();
        this.setLocationRelativeTo(null);
        sex.setVisible(false);
        fec.setVisible(false);

    }

    public void registros(String id, String nom, String apel, String apell, String tel, String fecha, String sexo) throws InterruptedException {
        try {

            Statement sentencia;

            System.out.println("in 1");

            sentencia = this.connection.createStatement();

            System.out.println("in 2");

            String query = "INSERT INTO Registro VALUES('"+id+"','" + nom + "','" + apel + "','" + apell + "','" + tel + "','" + fecha + "','" + sexo + "')";

            System.out.println(query);
            sentencia.executeUpdate(query);

            System.out.println("\n\nLos datos ya fueron almacenados en la BD \n\n");

        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void usuario(String usua, String con, String id) throws InterruptedException {
        try {
            Statement sentencia;

            System.out.println("in 1");

            sentencia = this.connection.createStatement();

            System.out.println("in 2");
            String query = "INSERT INTO Empleado VALUES('" + usua + "',PWDENCRYPT('" + con + "'),'" + id + "')";
            System.out.println(query);
            sentencia.executeUpdate(query);

            System.out.println("\n\nLos usuarios fueron almacenados en la BD \n\n");

        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Adminis(String usua, String con, String id) throws InterruptedException {
        try {
            Statement sentencia;

            System.out.println("in 1");

            sentencia = this.connection.createStatement();

            System.out.println("in 2");
            String query = "INSERT INTO Administracion VALUES('" + usua + "',PWDENCRYPT('" + con + "'),'" + id + "')";
            System.out.println(query);
            sentencia.executeUpdate(query);

            System.out.println("\n\nLos usuarios fueron almacenados en la BD \n\n");

        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        apellidoma = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        año = new javax.swing.JComboBox<>();
        fec = new javax.swing.JTextField();
        sex = new javax.swing.JTextField();
        hombre = new javax.swing.JCheckBox();
        mujer = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        contra = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        conf = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        adminis = new javax.swing.JRadioButton();
        emplea = new javax.swing.JRadioButton();
        registronumero = new javax.swing.JButton();
        numero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(231, 134, 215));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/-.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 50, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel (1).png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel (1).png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 50, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 200, 10));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 200, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 200, 10));

        nombre.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        nombre.setBorder(null);
        jPanel3.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 35));

        apellido.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        apellido.setBorder(null);
        jPanel3.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 200, 35));

        apellidoma.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        apellidoma.setBorder(null);
        jPanel3.add(apellidoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 200, 35));

        telefono.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        telefono.setBorder(null);
        jPanel3.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 200, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 70, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellido Paterno");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Apellido Materno");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha de nacimiento");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 190, 18));

        dia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        dia.setBorder(null);
        dia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });
        jPanel3.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 57, -1));

        mes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo ", "Junio", "Julio", "Agosto", "Septiembre", "Octubre ", "Diciembre", " " }));
        mes.setToolTipText("Mes");
        mes.setBorder(null);
        mes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        jPanel3.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 70, -1));

        año.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018\t", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", " " }));
        año.setBorder(null);
        año.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });
        jPanel3.add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 69, -1));
        jPanel3.add(fec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 20, 20));
        jPanel3.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 20, -1));

        hombre.setBackground(new java.awt.Color(255, 255, 255));
        hombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        jPanel3.add(hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 60, 80));

        mujer.setBackground(new java.awt.Color(255, 255, 255));
        mujer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        jPanel3.add(mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 60, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sexo");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 70, 30));

        jButton1.setText("Registrar Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        Usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Usuario");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Contraseña");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        contra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Confirma contraseña");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        conf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(conf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 150, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/Registro.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 22, 70));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/Registro.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 455, 70));

        adminis.setText("Administrador ");
        adminis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminisActionPerformed(evt);
            }
        });
        jPanel3.add(adminis, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        emplea.setText("Empleado");
        emplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleaActionPerformed(evt);
            }
        });
        jPanel3.add(emplea, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 90, -1));

        registronumero.setText("No. Usuario");
        registronumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registronumeroActionPerformed(evt);
            }
        });
        jPanel3.add(registronumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        numero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero.setBorder(null);
        jPanel3.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 50, 30));

        Fondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 480, 600));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/Imag.png"))); // NOI18N
        Fondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 350, 340, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/pngegg.png"))); // NOI18N
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 40, 730, 660));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

        this.setLocation(evt.getXOnScreen() - LayoutX, evt.getYOnScreen() - LayoutY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            LayoutX = evt.getX();
            LayoutY = evt.getY();
        }
    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        d = dia.getSelectedItem().toString();

    }//GEN-LAST:event_diaActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        m = mes.getSelectedItem().toString();

    }//GEN-LAST:event_mesActionPerformed

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        a = año.getSelectedItem().toString();

        fec.setText(a + "/" + m + "/" + d);
    }//GEN-LAST:event_añoActionPerformed

    private void hombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombreActionPerformed
        String h = "H";
        sex.setText(h);
    }//GEN-LAST:event_hombreActionPerformed

    private void mujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mujerActionPerformed
        String m = "M";
        sex.setText(m);
    }//GEN-LAST:event_mujerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (emplea.isSelected() == true) {
            String a = contra.getText();
            String b = conf.getText();
            String c = nombre.getText();
            if (c.isEmpty() && a.isEmpty() && b.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            } else if (a.equals(b)) {
                JOptionPane.showMessageDialog(null, "Usuario Registrado");
                inicio i = new inicio(connection);
                dispose();
                
                String id = numero.getText();
                String usua = Usuario.getText();
                String con = contra.getText();

                try {
                    usuario(usua, con, id);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        } else if (adminis.isSelected() == true) {
            String a = contra.getText();
            String b = conf.getText();
            String c = nombre.getText();
            if (c.isEmpty() && a.isEmpty() && b.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            } else if (a.equals(b)) {
                JOptionPane.showMessageDialog(null, "Usuario Registrado");
                inicio i = new inicio(connection);
                dispose();
                String id = numero.getText();
                String usua = Usuario.getText();
                String con = contra.getText();

                try {
                    Adminis(usua, con, id);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void adminisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminisActionPerformed
        adminis.setSelected(true);
        emplea.setSelected(false);
    }//GEN-LAST:event_adminisActionPerformed

    private void empleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleaActionPerformed
        emplea.setSelected(true);
        adminis.setSelected(false);
    }//GEN-LAST:event_empleaActionPerformed

    private void registronumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registronumeroActionPerformed

        String a = apellido.getText();
        String b = apellidoma.getText();
        String c = nombre.getText();
        System.out.println("2");
        if (c.isEmpty() && a.isEmpty() && b.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        } else {
            int num = (int) (Math.random() * 5000 + 1000);
            numero.setText(num + "");
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
            String nom = nombre.getText();
            String apel = apellido.getText();
            String apell = apellidoma.getText();
            String tel = telefono.getText();
            String fecha = fec.getText();
            String sexo = sex.getText();
            String id = numero.getText();
            System.out.println(id + nom + apel + apell + tel + fecha + sexo);
            try {
                registros(id, nom, apel, apell, tel, fecha, sexo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_registronumeroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField Usuario;
    private javax.swing.JRadioButton adminis;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField apellidoma;
    private javax.swing.JComboBox<String> año;
    private javax.swing.JPasswordField conf;
    private javax.swing.JPasswordField contra;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JRadioButton emplea;
    private javax.swing.JTextField fec;
    private javax.swing.JCheckBox hombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JCheckBox mujer;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    private javax.swing.JButton registronumero;
    private javax.swing.JTextField sex;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
