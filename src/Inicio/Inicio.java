
package Inicio;

import bd.inicio;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import rojeru_san.complementos.RSAnimation;

/**
 *
 * @author Arturo
 */
public class Inicio extends javax.swing.JFrame {

    public Connection connection = null;
    private Timer t;
    private int n = 0;

    public Inicio() {
        initComponents();

        barra.setValue(0);
        barra.setColorBackground(Color.BLACK);
        pnltexto.setBackground(new Color(0, 0, 0, 0));

        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        //Posicion de donde saldran/posicion en donde se colocan y tiempo y salto  
       // RSAnimation.setBajar(-200, 45, 20, 5, );
        RSAnimation.setSubir(490, 280, 20, 5, pnltexto);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (n <= 100) {
                    barra.setValue(n);
                    n = n + 10;
                } else {
                    t.stop();
                    dispose();
                    iniciar();
                    new bd.inicio(connection).setVisible(true);
                }
            }
        };
        t = new Timer(500, accion);
        t.start();
    }

    public void iniciar() {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("bd.tabla.<init>()");
        SQLServerDataSource ds = new SQLServerDataSource();
//        ds.setUser(jTextField1.getText());
//        ds.setPassword(jPasswordField1.getText());

/*EN ESTA PARTE DEBE DE IR LA CONFIGURACION DE LA BASE DE DATOS PARA QUE PUEDA TENER LA INFORMACION DE LA BASE DE DATOS.*/
        ds.setUser("sa");
        ds.setPassword("12345");
        ds.setServerName("LAPTOP-QVPCPV0E\\SQLExpress");
        ds.setPortNumber(1433);
        ds.setDatabaseName("inventario");
        System.out.println("2");
        try {
            connection = ds.getConnection();
        } catch (SQLServerException ex) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("3");

        if (connection != null) {

            System.out.println("Conectado");
        } else {

            JOptionPane.showMessageDialog(null, "Contraseña incorrecta...");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        pnltexto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barra = new rojerusan.componentes.RSProgressBarSinText();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(51, 181, 229));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 153, 204));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.CENTRAL);
        rSPanelGradiente1.setMinimumSize(new java.awt.Dimension(690, 490));
        rSPanelGradiente1.setPreferredSize(new java.awt.Dimension(690, 491));
        rSPanelGradiente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnltexto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setText("FARMACIA JOSE");

        javax.swing.GroupLayout pnltextoLayout = new javax.swing.GroupLayout(pnltexto);
        pnltexto.setLayout(pnltextoLayout);
        pnltextoLayout.setHorizontalGroup(
            pnltextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltextoLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        pnltextoLayout.setVerticalGroup(
            pnltextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnltextoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );

        rSPanelGradiente1.add(pnltexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 289, 670, -1));

        barra.setColorForeground(new java.awt.Color(255, 255, 255));
        rSPanelGradiente1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 690, 20));

        rSPanelShadow1.add(rSPanelGradiente1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.componentes.RSProgressBarSinText barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnltexto;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    // End of variables declaration//GEN-END:variables
}
