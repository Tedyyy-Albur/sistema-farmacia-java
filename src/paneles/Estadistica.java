/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Estadistica extends javax.swing.JPanel {

    private Connection connection = null;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();
    DefaultTableModel modelo4 = new DefaultTableModel();
    DefaultTableModel modelo5 = new DefaultTableModel();
    DefaultTableModel modelo6 = new DefaultTableModel();
    float mes1 = 0;
    float mes2 = 0;
    float mes3 = 0;
    String ms1 = "";
    String ms2 = "";
    String ms3 = "";
    String a;

    public Estadistica(Connection conn, int aa) {
        connection = conn;
        initComponents();
        jTable1.setModel(modelo);
        modelo.addColumn("Dato");

        jTable2.setModel(modelo2);
        modelo2.addColumn("Dato");

        jTable3.setModel(modelo3);
        modelo3.addColumn("Dato");

        jTable4.setModel(modelo4);
        modelo4.addColumn("Dato");
        
        jTable5.setModel(modelo5);
        modelo5.addColumn("Dato");
        
        Tablamas.setModel(modelo6);
        modelo6.addColumn("Producto");
        modelo6.addColumn("Numero");

        jTable1.setVisible(false);
        jTable2.setVisible(false);
        jTable3.setVisible(false);
        jTable4.setVisible(false);
        jTable5.setVisible(false);
        jTextField1.setVisible(false);

        if (aa == 1) {
            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println("Fecha: " + dateFormat.format(date));
            fechahoy.setText("" + dateFormat.format(date));

            DateFormat mes = new SimpleDateFormat("MM");
            String fc = mes.format(date);
            //OBTIENE EL MES Y LE RESTA UNO AL MES
            int num = Integer.parseInt(fc);
            int res = num-1;
            a ="0"+res;

            MostrarFecha4(fc);
            total.setText(sSuma4() + "0");
            String xx = total.getText();
            //SUMA TOTAL DE LA VENTA DEL MES
            float x = Float.valueOf(xx);
            
            ticket(fc);
            jTextField1.setText(sSuma5()+" ");
            String yy = jTextField1.getText();
            //OBTENER EL VALOR DE CUANTAS PERSONAS HAN COMPRADO
            float y = Float.valueOf(yy);
            
            float z = x / y;
            promedio.setText(z+"0");
            String p = promedio.getText();
            float pp= Float.valueOf(p);
            
            if(pp>150){
            new Alerta.Semaforo().setVisible(true);
            }
            if(pp<150 && pp>100){
                new Alerta.Semaforo2().setVisible(true);
            }
            if(pp<99 && pp>50){
                new Alerta.Semaforo3().setVisible(true);
            }
            //MANDA EL DATO AL METODO PARA PODER IMPRIMIR LO DEL MES PASADO 
            Productomasvendidodelmes(a);
            
            txt2.setText("Productos mas vendidos del mes: "+a);

        }

    }
    

    public void MostrarFecha1(String f) {
        try {
            Statement stnt = connection.createStatement();
            String SQL = "SELECT  SUM(Venta_total) FROM Ventas WHERE MONTH(fecha) = " + f + " AND YEAR(fecha) = 2021\n"
                    + "UNION ALL\n"
                    + "SELECT SUM(Venta) FROM Comprascliente WHERE MONTH(fecha) = " + f + " AND YEAR(fecha) = 2021";

            ResultSet rs = stnt.executeQuery(SQL);

            System.out.println("Mostrando Tabla");
            int cantidadColumnas = 1;
           
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

    public void MostrarFecha2(int f2) {
        try {
            Statement stnt = connection.createStatement();
            String SQL = "SELECT  SUM(Venta_total) FROM Ventas WHERE MONTH(fecha) = " + f2 + " AND YEAR(fecha) = 2021\n"
                    + "UNION ALL\n"
                    + "SELECT SUM(Venta) FROM Comprascliente WHERE MONTH(fecha) = " + f2 + " AND YEAR(fecha) = 2021";

            ResultSet rs = stnt.executeQuery(SQL);

            System.out.println("Mostrando Tabla");
            int cantidadColumnas = 1;

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo2.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println("Error en la base de datos: " + e.getMessage());
        }
    }

    public void MostrarFecha3(int f3) {
        try {
            Statement stnt = connection.createStatement();
            String SQL = "SELECT  SUM(Venta_total) FROM Ventas WHERE MONTH(fecha) = " + f3 + " AND YEAR(fecha) = 2021\n"
                    + "UNION ALL\n"
                    + "SELECT SUM(Venta) FROM Comprascliente WHERE MONTH(fecha) = " + f3 + " AND YEAR(fecha) = 2021";

            ResultSet rs = stnt.executeQuery(SQL);

            System.out.println("Mostrando Tabla");
            int cantidadColumnas = 1;

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo3.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println("Error en la base de datos: " + e.getMessage());
        }
    }

    public void MostrarFecha4(String fc1) {
        try {
            Statement stnt = connection.createStatement();
            String SQL = "SELECT  SUM(Venta_total) FROM Ventas WHERE MONTH(fecha) = " + fc1 + " AND YEAR(fecha) = 2021\n"
                    + "UNION ALL\n"
                    + "SELECT SUM(Venta) FROM Comprascliente WHERE MONTH(fecha) = " + fc1 + " AND YEAR(fecha) = 2021";

            ResultSet rs = stnt.executeQuery(SQL);

            System.out.println("Mostrando Tabla");
            int cantidadColumnas = 1;

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo4.addRow(filas);
            }
        } catch (SQLException e) {

            System.err.println("Error en la base de datos: " + e.getMessage());
        }
    }

    public void ticket(String t) {
        try {
            Statement stnt = connection.createStatement();
            String SQL = "SELECT   count(*) FROM Ventas WHERE MONTH(fecha) = "+t+" AND YEAR(fecha) = 2021\n"
                    + "UNION ALL\n"
                    + "SELECT  count(*) FROM Comprascliente WHERE MONTH(fecha) = "+t+" AND YEAR(fecha) = 2021";

            ResultSet rs = stnt.executeQuery(SQL);
           
            System.out.println("Mostrando Tabla");
            int cantidadColumnas = 1;

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo5.addRow(filas);
            }
        } catch (SQLException e) {

            System.err.println("Error en la base de datos: " + e.getMessage());
        }
    }
    public void Productomasvendidodelmes(String a) {
        try {
            Statement stnt = connection.createStatement();
            String SQL = "select top 3 Producto,count(*) as Numero from Compras WHERE MONTH(Fecha) = '"+a+"' AND YEAR(Fecha) = 2021"
                    + "group by Producto having count(*)>1 order by Numero desc";

            ResultSet rs = stnt.executeQuery(SQL);

            System.out.println("Mostrando Tabla");
            int cantidadColumnas = 2;

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo6.addRow(filas);
            }
        } catch (SQLException e) {

            System.err.println("Error en la base de datos: " + e.getMessage());
        }
    }


    public float sSuma() {
        int colum = modelo.getRowCount();
        float suu = 0;

        for (int i = 0; i < colum; i++) {

            suu = suu + Float.parseFloat(modelo.getValueAt(i, 0).toString());

        }
        return suu;
    }

    public float sSuma2() {
        int colum = modelo2.getRowCount();
        float suu = 0;

        for (int i = 0; i < colum; i++) {

            suu = suu + Float.parseFloat(modelo2.getValueAt(i, 0).toString());

        }
        return suu;
    }

    public float sSuma3() {
        int colum = modelo3.getRowCount();
        float suu = 0;

        for (int i = 0; i < colum; i++) {

            suu = suu + Float.parseFloat(modelo3.getValueAt(i, 0).toString());

        }
        return suu;
    }

    public float sSuma4() {
        int colum = modelo4.getRowCount();
        float suu = 0;

        for (int i = 0; i < colum; i++) {

            suu = suu + Float.parseFloat(modelo4.getValueAt(i, 0).toString());

        }
        return suu;
    }
    public float sSuma5() {
        int colum = modelo5.getRowCount();
        float suu = 0;

        for (int i = 0; i < colum; i++) {

            suu = suu + Float.parseFloat(modelo5.getValueAt(i, 0).toString());

        }
        return suu;
    }

    public void eliminar() {
        int fila = jTable1.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void eliminar2() {
        int fila = jTable2.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo2.removeRow(i);
        }
    }

    public void eliminar3() {
        int fila = jTable3.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo3.removeRow(i);
        }
    }

    public void Grafico() {
        float n1 = mes1;
        float n2 = mes2;
        float n3 = mes3;
        DefaultCategoryDataset dato = new DefaultCategoryDataset();
        dato.setValue(n1, "Ventas", ms1);
        dato.setValue(n2, "Ventas", ms2);
        dato.setValue(n3, "Ventas ", ms3);

        JFreeChart g = ChartFactory.createBarChart3D(
                "Grafica", //Nombre del grafico
                "Meses", //nombre de las barars 
                "Suma", //Nombre de la numeracion 
                dato, // Los datos
                PlotOrientation.VERTICAL, // Hoprientacion
                true,
                true,
                false
        );

        ChartPanel panel = new ChartPanel(g);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400, 400));

        grafico.setLayout(new BorderLayout());
        grafico.add(panel, BorderLayout.NORTH);
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grafico = new javax.swing.JPanel();
        m1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        m2 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        mes = new javax.swing.JComboBox<>();
        mes4 = new javax.swing.JComboBox<>();
        mes5 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        promedio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fechahoy = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        total = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        jLabel4 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tablamas = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1146, 589));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grafico.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout graficoLayout = new javax.swing.GroupLayout(grafico);
        grafico.setLayout(graficoLayout);
        graficoLayout.setHorizontalGroup(
            graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        graficoLayout.setVerticalGroup(
            graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        add(grafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 550, 400));

        m1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 100, 25));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 20, 20));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 20, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 20, 20));

        m2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 100, 25));

        m3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 110, 25));

        mes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01-Enero", "02-Febrero", "03-Marzo", "04-Abril", "05-Mayo", "06-Junio\t", "07-Julio", "08-Agosto", "09-Septiembre", "10-Octubre", "11-Noviembre", "12-Diciembre", " " }));
        mes.setToolTipText("Mes");
        mes.setBorder(null);
        mes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 100, -1));

        mes4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mes4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01-Enero", "02-Febrero", "03-Marzo", "04-Abril", "05-Mayo", "06-Junio\t", "07-Julio", "08-Agosto", "09-Septiembre", "10-Octubre", "11-Noviembre", "12-Diciembre" }));
        mes4.setToolTipText("Mes");
        mes4.setBorder(null);
        mes4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mes4ActionPerformed(evt);
            }
        });
        add(mes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 100, -1));

        mes5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mes5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01-Enero", "02-Febrero", "03-Marzo", "04-Abril", "05-Mayo", "06-Junio\t", "07-Julio", "08-Agosto", "09-Septiembre", "10-Octubre", "11-Noviembre", "12-Diciembre", " " }));
        mes5.setToolTipText("Mes");
        mes5.setBorder(null);
        mes5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mes5ActionPerformed(evt);
            }
        });
        add(mes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 100, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 200, 20));

        promedio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        promedio.setBorder(null);
        add(promedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 200, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ticket Promedio ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, 40));

        fechahoy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fechahoy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechahoy.setBorder(null);
        add(fechahoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 160, -1));

        jScrollPane4.setEnabled(false);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 20, 20));

        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total.setBorder(null);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 190, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ventas Del Mes");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, 40));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 20, 20));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 20, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/ES.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 550, 100));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo (1).png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, 160));

        rSButton1.setBackground(new java.awt.Color(153, 153, 255));
        rSButton1.setText("Graficar");
        rSButton1.setColorHover(new java.awt.Color(102, 102, 255));
        rSButton1.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });
        add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 530, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Seleccionar meses");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        txt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt2.setBorder(null);
        add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 350, -1));

        Tablamas.setModel(new javax.swing.table.DefaultTableModel(
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
        Tablamas.setAltoHead(45);
        Tablamas.setFuenteFilas(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tablamas.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tablamas.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tablamas.setPreferredSize(new java.awt.Dimension(300, 68));
        jScrollPane7.setViewportView(Tablamas);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 240, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        eliminar();
        ms1 = mes.getSelectedItem().toString();
        String mm = ms1.substring(0, 2);
        //int num1 = Integer.parseInt(mm);

        MostrarFecha1(mm);
    }//GEN-LAST:event_mesActionPerformed

    private void mes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mes4ActionPerformed
        eliminar2();
        ms2 = mes4.getSelectedItem().toString();
        String mm2 = ms2.substring(0, 2);
        int num2 = Integer.parseInt(mm2);
        MostrarFecha2(num2);
    }//GEN-LAST:event_mes4ActionPerformed

    private void mes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mes5ActionPerformed
        eliminar3();
        ms3 = mes5.getSelectedItem().toString();
        String mm3 = ms3.substring(0, 2);
        int num3 = Integer.parseInt(mm3);
        MostrarFecha3(num3);
    }//GEN-LAST:event_mes5ActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed

        m1.setText(sSuma() + "");
        m1.getText();
        String s = m1.getText();

        mes1 = Float.valueOf(s);

        m2.setText(sSuma2() + "");
        m2.getText();
        String s2 = m2.getText();
        mes2 = Float.valueOf(s2);

        m3.setText(sSuma3() + "");
        m3.getText();
        String s3 = m3.getText();
        mes3 = Float.valueOf(s3);

        Grafico();
        
       
    }//GEN-LAST:event_rSButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro Tablamas;
    private javax.swing.JTextField fechahoy;
    private javax.swing.JPanel grafico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JComboBox<String> mes4;
    private javax.swing.JComboBox<String> mes5;
    private javax.swing.JTextField promedio;
    private rojeru_san.RSButton rSButton1;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables

}
