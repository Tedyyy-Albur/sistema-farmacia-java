
package bd;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import paneles.CambiaPanel;


public class MenuPnl extends javax.swing.JFrame {

    int x, y;
    int a=1;
    public Connection connection = null;
    
    public MenuPnl(Connection conn, int u) {
        connection = conn;
        
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo (1).png")).getImage());
        
        this.uno.setSelected(true);
        if(u ==0){
             new CambiaPanel(pnlPrincipal, new paneles.Inventario(connection));
        }else if (u==1){
             uno.setEnabled(false);
             new CambiaPanel(pnlPrincipal, new paneles.Venta(connection));
        }
       

    }

  
    

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        uno = new rsbuttom.RSButtonMetro();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tres = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        cinco = new rsbuttom.RSButtonMetro();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cuatro = new rsbuttom.RSButtonMetro();
        clientesventa = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Fecha = new rojeru_san.RSLabelFecha();
        Hora = new rojeru_san.RSLabelHora();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlMenu.setBackground(new java.awt.Color(212, 218, 248));
        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(239, 238, 244)));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        uno.setText("Inventario");
        uno.setColorHover(new java.awt.Color(204, 204, 204));
        uno.setColorNormal(new java.awt.Color(204, 204, 204));
        uno.setColorPressed(new java.awt.Color(204, 204, 204));
        uno.setColorTextHover(new java.awt.Color(128, 128, 131));
        uno.setColorTextNormal(new java.awt.Color(128, 128, 131));
        uno.setColorTextPressed(new java.awt.Color(128, 128, 131));
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        uno.setIconTextGap(25);
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unoMousePressed(evt);
            }
        });
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        pnlMenu.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 102, 258, 50));

        jPanel4.setBackground(new java.awt.Color(212, 218, 248));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 128, 131));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pnlMenu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 258, -1));

        tres.setBackground(new java.awt.Color(239, 238, 244));
        tres.setForeground(new java.awt.Color(128, 128, 131));
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png"))); // NOI18N
        tres.setText(" Clientes");
        tres.setColorHover(new java.awt.Color(204, 204, 204));
        tres.setColorNormal(new java.awt.Color(239, 238, 244));
        tres.setColorPressed(new java.awt.Color(204, 204, 204));
        tres.setColorTextHover(new java.awt.Color(128, 128, 131));
        tres.setColorTextNormal(new java.awt.Color(128, 128, 131));
        tres.setColorTextPressed(new java.awt.Color(128, 128, 131));
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tres.setIconTextGap(25);
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tresMousePressed(evt);
            }
        });
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        pnlMenu.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 303, 258, 50));

        dos.setBackground(new java.awt.Color(239, 238, 244));
        dos.setForeground(new java.awt.Color(128, 128, 131));
        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        dos.setText("Venta");
        dos.setColorHover(new java.awt.Color(204, 204, 204));
        dos.setColorNormal(new java.awt.Color(239, 238, 244));
        dos.setColorPressed(new java.awt.Color(204, 204, 204));
        dos.setColorTextHover(new java.awt.Color(128, 128, 131));
        dos.setColorTextNormal(new java.awt.Color(128, 128, 131));
        dos.setColorTextPressed(new java.awt.Color(128, 128, 131));
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dos.setIconTextGap(25);
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dosMousePressed(evt);
            }
        });
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        pnlMenu.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 167, 258, 50));

        cinco.setBackground(new java.awt.Color(239, 238, 244));
        cinco.setForeground(new java.awt.Color(128, 128, 131));
        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png"))); // NOI18N
        cinco.setText("Estadistica");
        cinco.setColorHover(new java.awt.Color(204, 204, 204));
        cinco.setColorNormal(new java.awt.Color(239, 238, 244));
        cinco.setColorPressed(new java.awt.Color(204, 204, 204));
        cinco.setColorTextHover(new java.awt.Color(128, 128, 131));
        cinco.setColorTextNormal(new java.awt.Color(128, 128, 131));
        cinco.setColorTextPressed(new java.awt.Color(128, 128, 131));
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cinco.setIconTextGap(25);
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cincoMousePressed(evt);
            }
        });
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        pnlMenu.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 432, 258, 50));

        jPanel5.setBackground(new java.awt.Color(239, 238, 244));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(128, 128, 131));
        jLabel3.setText("-----------------------------------");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pnlMenu.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 572, 258, 40));

        cuatro.setBackground(new java.awt.Color(239, 238, 244));
        cuatro.setForeground(new java.awt.Color(128, 128, 131));
        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png"))); // NOI18N
        cuatro.setText("Proovedores");
        cuatro.setColorHover(new java.awt.Color(204, 204, 204));
        cuatro.setColorNormal(new java.awt.Color(239, 238, 244));
        cuatro.setColorPressed(new java.awt.Color(204, 204, 204));
        cuatro.setColorTextHover(new java.awt.Color(128, 128, 131));
        cuatro.setColorTextNormal(new java.awt.Color(128, 128, 131));
        cuatro.setColorTextPressed(new java.awt.Color(128, 128, 131));
        cuatro.setHideActionText(true);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cuatro.setIconTextGap(25);
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuatroMousePressed(evt);
            }
        });
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        pnlMenu.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 371, 258, 50));

        clientesventa.setBackground(new java.awt.Color(239, 238, 244));
        clientesventa.setForeground(new java.awt.Color(128, 128, 131));
        clientesventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        clientesventa.setText("Clientes Venta");
        clientesventa.setColorHover(new java.awt.Color(204, 204, 204));
        clientesventa.setColorNormal(new java.awt.Color(239, 238, 244));
        clientesventa.setColorPressed(new java.awt.Color(204, 204, 204));
        clientesventa.setColorTextHover(new java.awt.Color(128, 128, 131));
        clientesventa.setColorTextNormal(new java.awt.Color(128, 128, 131));
        clientesventa.setColorTextPressed(new java.awt.Color(128, 128, 131));
        clientesventa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        clientesventa.setIconTextGap(25);
        clientesventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesventaMousePressed(evt);
            }
        });
        clientesventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesventaActionPerformed(evt);
            }
        });
        pnlMenu.add(clientesventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 235, 258, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 8.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel1.add(pnlMenu, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(212, 218, 248));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
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

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FARMACIA JOSE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(769, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel2, gridBagConstraints);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(128, 128, 131));
        jLabel4.setText("VENTA - INVENTARIO");

        Fecha.setForeground(new java.awt.Color(0, 0, 0));
        Fecha.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N

        Hora.setForeground(new java.awt.Color(0, 0, 0));
        Hora.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Hora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addComponent(Fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlCentro, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.Inventario(connection));
        if (this.uno.isSelected()) {
            this.uno.setColorNormal(new Color(204, 204, 204));
            this.uno.setColorHover(new Color(204, 204, 204));
            this.uno.setColorPressed(new Color(204, 204, 204));

            this.dos.setColorNormal(new Color(239, 238, 244));
            this.dos.setColorHover(new Color(204, 204, 204));
            this.dos.setColorPressed(new Color(204, 204, 204));
            
            this.clientesventa.setColorNormal(new Color(239, 238, 244));
            this.clientesventa.setColorHover(new Color(204, 204, 204));
            this.clientesventa.setColorPressed(new Color(204, 204, 204));

            this.tres.setColorNormal(new Color(239, 238, 244));
            this.tres.setColorHover(new Color(204, 204, 204));
            this.tres.setColorPressed(new Color(204, 204, 204));

            this.cuatro.setColorNormal(new Color(239, 238, 244));
            this.cuatro.setColorHover(new Color(204, 204, 204));
            this.cuatro.setColorPressed(new Color(204, 204, 204));

            this.cinco.setColorNormal(new Color(239, 238, 244));
            this.cinco.setColorHover(new Color(204, 204, 204));
            this.cinco.setColorPressed(new Color(204, 204, 204));

            
        } else {
            this.uno.setColorNormal(new Color(239, 238, 244));
            this.uno.setColorHover(new Color(204, 204, 204));
            this.uno.setColorPressed(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_unoActionPerformed

    private void unoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMousePressed
        this.uno.setSelected(true);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
         this.clientesventa.setSelected(false);
       
    }//GEN-LAST:event_unoMousePressed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
       new CambiaPanel(pnlPrincipal, new paneles.Clientes(connection));
        if (this.tres.isSelected()) {
            this.tres.setColorNormal(new Color(204, 204, 204));
            this.tres.setColorHover(new Color(204, 204, 204));
            this.tres.setColorPressed(new Color(204, 204, 204));

            this.uno.setColorNormal(new Color(239, 238, 244));
            this.uno.setColorHover(new Color(204, 204, 204));
            this.uno.setColorPressed(new Color(204, 204, 204));

            this.dos.setColorNormal(new Color(239, 238, 244));
            this.dos.setColorHover(new Color(204, 204, 204));
            this.dos.setColorPressed(new Color(204, 204, 204));

            this.cuatro.setColorNormal(new Color(239, 238, 244));
            this.cuatro.setColorHover(new Color(204, 204, 204));
            this.cuatro.setColorPressed(new Color(204, 204, 204));

            this.cinco.setColorNormal(new Color(239, 238, 244));
            this.cinco.setColorHover(new Color(204, 204, 204));
            this.cinco.setColorPressed(new Color(204, 204, 204));
            
            this.clientesventa.setColorNormal(new Color(239, 238, 244));
            this.clientesventa.setColorHover(new Color(204, 204, 204));
            this.clientesventa.setColorPressed(new Color(204, 204, 204));

           
        } else {
            this.tres.setColorNormal(new Color(239, 238, 244));
            this.tres.setColorHover(new Color(204, 204, 204));
            this.tres.setColorPressed(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_tresActionPerformed

    private void tresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(true);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
         this.clientesventa.setSelected(false);
       
    }//GEN-LAST:event_tresMousePressed

    private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(true);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
         this.clientesventa.setSelected(false);
        
    }//GEN-LAST:event_dosMousePressed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
       
        new CambiaPanel(pnlPrincipal, new paneles.Venta(connection));
       
        if (this.dos.isSelected()) {
            this.dos.setColorNormal(new Color(204, 204, 204));
            this.dos.setColorHover(new Color(204, 204, 204));
            this.dos.setColorPressed(new Color(204, 204, 204));

            this.uno.setColorNormal(new Color(239, 238, 244));
            this.uno.setColorHover(new Color(204, 204, 204));
            this.uno.setColorPressed(new Color(204, 204, 204));

            this.tres.setColorNormal(new Color(239, 238, 244));
            this.tres.setColorHover(new Color(204, 204, 204));
            this.tres.setColorPressed(new Color(204, 204, 204));

            this.cuatro.setColorNormal(new Color(239, 238, 244));
            this.cuatro.setColorHover(new Color(204, 204, 204));
            this.cuatro.setColorPressed(new Color(204, 204, 204));

            this.cinco.setColorNormal(new Color(239, 238, 244));
            this.cinco.setColorHover(new Color(204, 204, 204));
            this.cinco.setColorPressed(new Color(204, 204, 204));
            
            this.clientesventa.setColorNormal(new Color(239, 238, 244));
            this.clientesventa.setColorHover(new Color(204, 204, 204));
            this.clientesventa.setColorPressed(new Color(204, 204, 204));

        } else {
            this.dos.setColorNormal(new Color(239, 238, 244));
            this.dos.setColorHover(new Color(204, 204, 204));
            this.dos.setColorPressed(new Color(204, 204, 204));
        }
       
    }//GEN-LAST:event_dosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int posicion = pnlMenu.getX();
        if (posicion > -1) {
           // Animacion.Animacion.mover_izquierda(0, -264, 2, 2, pnlMenu);
        } else {
            //Animacion.Animacion.mover_derecha(-264, 0, 2, 2, pnlMenu);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        if(a==1){
        new CambiaPanel(pnlPrincipal, new paneles.Estadistica(connection,a));
        }
        if (this.cinco.isSelected()) {
            this.uno.setColorNormal(new Color(239, 238, 244));
            this.uno.setColorHover(new Color(204, 204, 204));
            this.uno.setColorPressed(new Color(204, 204, 204));

            this.dos.setColorNormal(new Color(239, 238, 244));
            this.dos.setColorHover(new Color(204, 204, 204));
            this.dos.setColorPressed(new Color(204, 204, 204));

            this.tres.setColorNormal(new Color(239, 238, 244));
            this.tres.setColorHover(new Color(204, 204, 204));
            this.tres.setColorPressed(new Color(204, 204, 204));

            this.cuatro.setColorNormal(new Color(239, 238, 244));
            this.cuatro.setColorHover(new Color(204, 204, 204));
            this.cuatro.setColorPressed(new Color(204, 204, 204));

            this.cinco.setColorNormal(new Color(204, 204, 204));
            this.cinco.setColorHover(new Color(204, 204, 204));
            this.cinco.setColorPressed(new Color(204, 204, 204));
            
            this.clientesventa.setColorNormal(new Color(239, 238, 244));
            this.clientesventa.setColorHover(new Color(204, 204, 204));
            this.clientesventa.setColorPressed(new Color(204, 204, 204));

           
        } else {
            this.cinco.setColorNormal(new Color(239, 238, 244));
            this.cinco.setColorHover(new Color(204, 204, 204));
            this.cinco.setColorPressed(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_cincoActionPerformed

    private void cincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(true);
         this.clientesventa.setSelected(false);
        
    }//GEN-LAST:event_cincoMousePressed

    private void cuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(true);
        this.cinco.setSelected(false);
         this.clientesventa.setSelected(false);
        
    }//GEN-LAST:event_cuatroMousePressed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.Proveedores(connection));
        if (this.cuatro.isSelected()) {
            this.uno.setColorNormal(new Color(239, 238, 244));
            this.uno.setColorHover(new Color(204, 204, 204));
            this.uno.setColorPressed(new Color(204, 204, 204));

            this.dos.setColorNormal(new Color(239, 238, 244));
            this.dos.setColorHover(new Color(204, 204, 204));
            this.dos.setColorPressed(new Color(204, 204, 204));

            this.tres.setColorNormal(new Color(239, 238, 244));
            this.tres.setColorHover(new Color(204, 204, 204));
            this.tres.setColorPressed(new Color(204, 204, 204));

            this.cuatro.setColorNormal(new Color(204, 204, 204));
            this.cuatro.setColorHover(new Color(204, 204, 204));
            this.cuatro.setColorPressed(new Color(204, 204, 204));

            this.cinco.setColorNormal(new Color(239, 238, 244));
            this.cinco.setColorHover(new Color(204, 204, 204));
            this.cinco.setColorPressed(new Color(204, 204, 204));
            
            this.clientesventa.setColorNormal(new Color(239, 238, 244));
            this.clientesventa.setColorHover(new Color(204, 204, 204));
            this.clientesventa.setColorPressed(new Color(204, 204, 204));

           
        } else {
            this.cuatro.setColorNormal(new Color(239, 238, 244));
            this.cuatro.setColorHover(new Color(204, 204, 204));
            this.cuatro.setColorPressed(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_cuatroActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void clientesventaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesventaMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.clientesventa.setSelected(true);
        this.cinco.setSelected(false);
    }//GEN-LAST:event_clientesventaMousePressed

    private void clientesventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesventaActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.ClientesV(connection));
        if (this.clientesventa.isSelected()) {
            this.uno.setColorNormal(new Color(239, 238, 244));
            this.uno.setColorHover(new Color(204, 204, 204));
            this.uno.setColorPressed(new Color(204, 204, 204));

            this.dos.setColorNormal(new Color(239, 238, 244));
            this.dos.setColorHover(new Color(204, 204, 204));
            this.dos.setColorPressed(new Color(204, 204, 204));

            this.tres.setColorNormal(new Color(239, 238, 244));
            this.tres.setColorHover(new Color(204, 204, 204));
            this.tres.setColorPressed(new Color(204, 204, 204));

            this.clientesventa.setColorNormal(new Color(204, 204, 204));
            this.clientesventa.setColorHover(new Color(204, 204, 204));
            this.clientesventa.setColorPressed(new Color(204, 204, 204));
            
            this.cuatro.setColorNormal(new Color(239, 238, 244));
            this.cuatro.setColorHover(new Color(204, 204, 204));
            this.cuatro.setColorPressed(new Color(204, 204, 204));

            this.cinco.setColorNormal(new Color(239, 238, 244));
            this.cinco.setColorHover(new Color(204, 204, 204));
            this.cinco.setColorPressed(new Color(204, 204, 204));

           
        } else {
            this.clientesventa.setColorNormal(new Color(239, 238, 244));
            this.clientesventa.setColorHover(new Color(204, 204, 204));
            this.clientesventa.setColorPressed(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_clientesventaActionPerformed

    private void rSButtonIconD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconD1ActionPerformed
        dispose();

    }//GEN-LAST:event_rSButtonIconD1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPnl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPnl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPnl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPnl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSLabelFecha Fecha;
    private rojeru_san.RSLabelHora Hora;
    private rsbuttom.RSButtonMetro cinco;
    private rsbuttom.RSButtonMetro clientesventa;
    private rsbuttom.RSButtonMetro cuatro;
    private rsbuttom.RSButtonMetro dos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private rsbuttom.RSButtonMetro tres;
    private rsbuttom.RSButtonMetro uno;
    // End of variables declaration//GEN-END:variables
}
