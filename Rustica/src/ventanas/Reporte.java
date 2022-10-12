package ventanas;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.WindowConstants;

/**
 *
 * @author Frank
 */
public class Reporte extends javax.swing.JFrame {

    public Reporte() {
        initComponents();
        setSize(500, 316);
        setResizable(false);
        setTitle("Panel de Reportes");
        setLocationRelativeTo(null);
        //para evitar que el programa finalice al cerrar la interfaz de registro de usuario
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    //cambiar la imagen del logo de la taza 
    //Inicio
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
        return retValue;
    } //Fin

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Meseeros = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Panel de Reportes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("Meseros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("Clientes");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        Meseeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/find_user_male_100px.png"))); // NOI18N
        Meseeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MeseerosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MeseerosMouseExited(evt);
            }
        });
        Meseeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeseerosActionPerformed(evt);
            }
        });
        getContentPane().add(Meseeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/groups_96px.png"))); // NOI18N
        Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClientesMouseExited(evt);
            }
        });
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        getContentPane().add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel_Wallpaper.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportess.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        // TODO add your handling code here:
        BuscarCliente cl = new BuscarCliente();
        cl.setVisible(true);
    }//GEN-LAST:event_ClientesActionPerformed

    private void MeseerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeseerosActionPerformed
        // TODO add your handling code here:
        ListaMesero C = new ListaMesero();
        C.setVisible(true);
    }//GEN-LAST:event_MeseerosActionPerformed

    private void ClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMouseEntered
        // TODO add your handling code here:
        Clientes.setBackground(Color.CYAN);
    }//GEN-LAST:event_ClientesMouseEntered

    private void ClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMouseExited
        // TODO add your handling code here:
        Clientes.setBackground(Color.white);
    }//GEN-LAST:event_ClientesMouseExited

    private void MeseerosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeseerosMouseEntered
        // TODO add your handling code here:
        Meseeros.setBackground(Color.CYAN);
    }//GEN-LAST:event_MeseerosMouseEntered

    private void MeseerosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeseerosMouseExited
        // TODO add your handling code here:
        Meseeros.setBackground(Color.white);
    }//GEN-LAST:event_MeseerosMouseExited

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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Meseeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
