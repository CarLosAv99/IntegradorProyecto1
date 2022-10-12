package ventanas;

import Clases.Mesero;
import Clases.Usuario;
import Controlador.bd_Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Frank
 */
public class RegistroMesero extends javax.swing.JFrame {

    public RegistroMesero() {
        initComponents();
        setTitle("Registrar nuevo Mesero");
        setSize(632, 400);//mantener el tamaño de la interfaz para que no se pueda editar
        setResizable(false);//para que no se pueda editar 
        setResizable(false);
        setLocationRelativeTo(null);//centrar la interfaz para cuando se ejecute

        //para evitar que el programa finalice al cerrar la interfaz de registro de usuario
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    //cambiar la imagen del logo de la taza 
    //Inicio
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_numerodeMesero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_numerodemesa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txt_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txt_telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero de mesero:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        cmb_numerodeMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "1", "2", "3", "4", "5" }));
        cmb_numerodeMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_numerodeMeseroActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_numerodeMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mesas Asignadas:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txt_numerodemesa.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_numerodemesa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_numerodemesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numerodemesaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_numerodemesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        txt_username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 210, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        txt_password.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 210, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 120, 100));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Registrar Mesero");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed

    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        int k = (int) evt.getKeyChar();
        int can = txt_telefono.getText().length();
        int tam = 11;
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || can >= tam) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_numerodemesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numerodemesaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_numerodemesaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //varibles de recuperacion de datos
        int numeroDeMesero = 0;
        String mesasAsignadas = "";
        int validacion = 0;
        String nombre = "", mail = "", telefono = "", username = "", pass = "", tipoNivel = "Mesero";
        //recuperar valores dentro de los texfile
        try {
            mail = txt_email.getText().trim();//metodo trim eliminamos los espacios que estan al inicio y al final de la cadena de texto
            username = txt_username.getText().trim();
            pass = txt_password.getText().trim();
            nombre = txt_nombre.getText().trim();
            telefono = txt_telefono.getText().trim();
            numeroDeMesero = cmb_numerodeMesero.getSelectedIndex();
            mesasAsignadas = txt_numerodemesa.getText().trim();
        } catch (Exception e) {
            System.out.println(e);
        }
        //combox
        String txt;
        String nombreM = "";
        bd_Conexion conex = new bd_Conexion();
        if (numeroDeMesero == 0) {
            validacion++;
            txt_numerodemesa.setBackground(Color.red);
        }
        if (numeroDeMesero == 1) {
            txt_numerodemesa.setText("");
            if (conex.seleccionarNM(1) == "Prueba") {
                txt_numerodemesa.setText("");
                txt = "1,2,3";
                txt_numerodemesa.setText(txt);
                txt_numerodemesa.setBackground(Color.green);
            } else {
                JOptionPane.showMessageDialog(rootPane, "N° DE MESERO YA ESTABLECIDO, ELIJA OTRO1");
                validacion++;
                txt_numerodemesa.setBackground(Color.red);
            }
        }
        if (numeroDeMesero == 2) {
            txt_numerodemesa.setText("");
            if (conex.seleccionarNM(2) == "Prueba") {
                txt = "4,5,6";
                txt_numerodemesa.setText(txt);
                txt_numerodemesa.setBackground(Color.green);
            } else {
                JOptionPane.showMessageDialog(rootPane, "N° DE MESERO YA ESTABLECIDO, ELIJA OTRO");
                validacion++;
                txt_numerodemesa.setBackground(Color.red);
            }
        }
        if (numeroDeMesero == 3) {
            txt_numerodemesa.setText("");
            if (conex.seleccionarNM(3) == "Prueba") {
                txt = "7,8,9";
                txt_numerodemesa.setText(txt);
                txt_numerodemesa.setBackground(Color.green);
            } else {
                JOptionPane.showMessageDialog(rootPane, "N° DE MESERO YA ESTABLECIDO, ELIJA OTRO");
                validacion++;
                txt_numerodemesa.setBackground(Color.red);
            }
        }
        if (numeroDeMesero == 4) {
            txt_numerodemesa.setText("");
            System.out.println(conex.seleccionarNM(4));
            if (conex.seleccionarNM(4) == "Prueba") {
                txt = "10,11,12";
                txt_numerodemesa.setText(txt);
                txt_numerodemesa.setBackground(Color.green);
            } else {
                JOptionPane.showMessageDialog(rootPane, "N° DE MESERO YA ESTABLECIDO, ELIJA OTRO");
                validacion++;
                txt_numerodemesa.setBackground(Color.red);
            }
        }
        if (numeroDeMesero == 5) {
            txt_numerodemesa.setText("");
            if (conex.seleccionarNM(5) == "Prueba") {
                txt = "13,14,15";
                txt_numerodemesa.setText(txt);
                txt_numerodemesa.setBackground(Color.green);
            } else {
                JOptionPane.showMessageDialog(rootPane, "N° DE MESERO YA ESTABLECIDO, ELIJA OTRO");
                validacion++;
                txt_numerodemesa.setBackground(Color.red);
            }
        }
        //se cambian de color a rojo
        //validamos los campos antes de enviar los datos
        if (mail.equals("")) {
            txt_email.setBackground(Color.red);
            validacion++;
        } else {
            txt_email.setBackground(Color.green);
        }
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        } else {
            txt_nombre.setBackground(Color.green);
        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion++;
        } else {
            txt_telefono.setBackground(Color.green);
        }
        if (username.equals("")) {
            txt_username.setBackground(Color.red);
            validacion++;
        } else {
            txt_username.setBackground(Color.green);
        }
        if (pass.equals("")) {
            txt_password.setBackground(Color.red);
            validacion++;
        } else {
            txt_password.setBackground(Color.green);
        }
        if (validacion == 0) {
            //JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
           
            txt_email.setBackground(Color.white);
            txt_nombre.setBackground(Color.white);
            txt_telefono.setBackground(Color.white);
            txt_username.setBackground(Color.white);
            txt_password.setBackground(Color.white);
            txt_numerodemesa.setBackground(Color.white);

            //Enviamos los datos obtenidos a las clases que hemos creado
            Usuario usuario = new Usuario();
            Mesero mesero = new Mesero();
            bd_Conexion con = new bd_Conexion();
            mesero.setNombre(nombre);
            mesero.setMailUsuario(mail);
            mesero.setTelefono(telefono);
            mesero.setUsernameUsuario(username);
            mesero.setContrasenaUsuario(pass);
            mesero.setNumeroDeMesero(numeroDeMesero);
            //Usuario

            usuario.setNombre(nombre);
            usuario.setMailUsuario(mail);
            usuario.setTelefono(telefono);
            usuario.setUsernameUsuario(username);
            usuario.setContrasenaUsuario(pass);
            usuario.setTipoNivelUsuario(tipoNivel);

            if (con.insertarMesero(mesero) && con.insertarUsuarios(usuario)) {
                JOptionPane.showMessageDialog(null, "Mesero Registrado corecctamente");
                Limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error Contacte con el Administrador");
            }
            //prueba de datos ingresados por consola
            System.out.println(mesero.getNombre()
                    + mesero.getMailUsuario()
                    + mesero.getTelefono()
                    + mesero.getUsernameUsuario()
                    + mesero.getContrasenaUsuario()
                    + mesero.getTipoNivelUsuario()
                    + mesero.getNumeroDeMesero()
                    + mesero.getMesasAsignadas());
        } else {
            JOptionPane.showMessageDialog(null, "Debe de completar las casillas de rojo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmb_numerodeMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_numerodeMeseroActionPerformed
        // TODO add your handling code here:
        //mostrar numero de mesa al selecionar numero de mesero
        String txt;
        if (cmb_numerodeMesero.getSelectedIndex() == 1) {
            txt = ("1,2,3");
            txt_numerodemesa.setText(txt);
        } else if (cmb_numerodeMesero.getSelectedIndex() == 2) {
            txt = ("4,5,6");
            txt_numerodemesa.setText(txt);
        } else if (cmb_numerodeMesero.getSelectedIndex() == 3) {
            txt = ("7,8,9");
            txt_numerodemesa.setText(txt);
        } else if (cmb_numerodeMesero.getSelectedIndex() == 4) {
            txt = ("10,11,12");
            txt_numerodemesa.setText(txt);
        } else if (cmb_numerodeMesero.getSelectedIndex() == 5) {
            txt = ("13,14,15");
            txt_numerodemesa.setText(txt);
        }

    }//GEN-LAST:event_cmb_numerodeMeseroActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroMesero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_numerodeMesero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numerodemesa;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_email.setText("");
        txt_nombre.setText("");
        txt_password.setText("");
        txt_telefono.setText("");
        txt_username.setText("");
        txt_numerodemesa.setText("");
        cmb_numerodeMesero.setSelectedIndex(0);
    }
}
