package ventanas;
import Clases.Bebidas;
import Clases.Carta;
import Clases.Platos;
import Controlador.bd_Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
/**
 *
 * @author Frank
 */
public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
        setSize(640,794);
        setResizable(false);
        setTitle("Menu");
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
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox_Ceviche = new javax.swing.JComboBox<>();
        jComboBox_CdePescado = new javax.swing.JComboBox<>();
        jComboBox_LomoSaltado = new javax.swing.JComboBox<>();
        jComboBox_AConMariscos = new javax.swing.JComboBox<>();
        jComboBox_BaloPobre = new javax.swing.JComboBox<>();
        jComboBox_AjiDeGallina = new javax.swing.JComboBox<>();
        jComboBox_CAUSARELLENA = new javax.swing.JComboBox<>();
        jComboBox_SDePescado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox_Cristal = new javax.swing.JComboBox<>();
        jComboBox_Pilsen = new javax.swing.JComboBox<>();
        jComboBox_cusqueña = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox_GaseosaPersonal = new javax.swing.JComboBox<>();
        jComboBox_GaseosaLitroMedio = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jComboBox_JugoSurtido = new javax.swing.JComboBox<>();
        jComboBox_JugoPapaya = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("POLLO A LA BRASA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("S/. 45");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PARRILLA DUO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("S/. 25");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PARRILLA FAMILIAR");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("S/. 55");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MONSTRITO");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("S/. 25");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("BISTEC A LO POBRE");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("S/. 30");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CHAUFA");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("S/. 20");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MEDIO POLLO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("S/. 25");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LOMO SALTADO");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("S/. 18");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        jComboBox_Ceviche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        jComboBox_Ceviche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_CevicheActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_Ceviche, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jComboBox_CdePescado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_CdePescado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jComboBox_LomoSaltado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        jComboBox_LomoSaltado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_LomoSaltadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_LomoSaltado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jComboBox_AConMariscos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_AConMariscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        jComboBox_BaloPobre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        jComboBox_BaloPobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_BaloPobreActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_BaloPobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        jComboBox_AjiDeGallina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_AjiDeGallina, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        jComboBox_CAUSARELLENA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_CAUSARELLENA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        jComboBox_SDePescado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_SDePescado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("PLATOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("MENU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("BEBIDAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("CERVEZAS");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("CRISTAL");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("PILSEN");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("CUSQUEÑA");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("S/. 6");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("S/. 7");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("S/. 8");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        jComboBox_Cristal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_Cristal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        jComboBox_Pilsen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_Pilsen, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        jComboBox_cusqueña.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_cusqueña, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("GASEOSAS");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("PERSONAL");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("1 1/2 Litro");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("S/. 3");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("S/. 8");
        jLabel37.setToolTipText("");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, 20));

        jComboBox_GaseosaPersonal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_GaseosaPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        jComboBox_GaseosaLitroMedio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_GaseosaLitroMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("JUGOS");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("SURTIDO");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("PAPAYA");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("S/. 8");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, -1, 20));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("S/. 5");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, 20));

        jComboBox_JugoSurtido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_JugoSurtido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        jComboBox_JugoPapaya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_JugoPapaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("TERMINAR ORDEN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 160, 30));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //variables para recuperar datos
        String txt = "";
        int comboBox=0,comboBox1=0,comboBox2=0,comboBox3=0,comboBox4=0,comboBox5=0,comboBox6=0,comboBox7=0;
        int comboBox8=0,comboBox9=0,comboBox10=0,comboBox11=0,comboBox12=0,comboBox13=0,comboBox14=0;
        int cantidad = 0;
        double precio= 0;
        double monto= 0;
        int numerocarta=0;     
        Platos platos1 = new Platos();
        Carta carta1 = new Carta();
        Platos platos2 = new Platos();
        Carta carta2 = new Carta();
        Platos platos3 = new Platos();
        Carta carta3 = new Carta();
        Platos platos4 = new Platos();
        Carta carta4 = new Carta();
        Platos platos5 = new Platos();
        Carta carta5 = new Carta();
        Platos platos6 = new Platos();
        Carta carta6 = new Carta();
        Platos platos7 = new Platos();
        Carta carta7 = new Carta();
        Platos platos8 = new Platos();
        Carta carta8 = new Carta();
        Bebidas bebida1 = new Bebidas();
        Carta carta9 = new Carta ();
        Bebidas bebida2 = new Bebidas();
        Carta carta10 = new Carta ();
        Bebidas bebida3 = new Bebidas();
        Carta carta11 = new Carta ();
        Bebidas bebida4 = new Bebidas();
        Carta carta12 = new Carta ();
        Bebidas bebida5 = new Bebidas();
        Carta carta13 = new Carta ();
        Bebidas bebida6 = new Bebidas();
        Carta carta14 = new Carta ();
        Bebidas bebida7 = new Bebidas();
        Carta carta15 = new Carta ();
        //se obtiene el indice del comboBox
        if(jComboBox_Ceviche.getSelectedIndex()> 0){
            comboBox= jComboBox_Ceviche.getSelectedIndex();
            if (comboBox==1) {
                txt = "POLLO A LA BRASA";
                cantidad = 1;
                precio = 45;
                int numero = 1;
            } else if (comboBox==2) {
                txt = "POLLO A LA BRASA";
                cantidad = 2;
                precio = 45;
            }else if (comboBox==3) {
                txt = "POLLO A LA BRASA";
                cantidad = 3;
                precio = 45;
            }else if (comboBox==4) {
                txt = "POLLO A LA BRASA";
                cantidad = 4;
                precio = 45;
            }else if (comboBox==5) {
                txt = "POLLO A LA BRASA";
                cantidad = 5;
                precio = 45;
            }
            else if (comboBox==6) {
                txt = "POLLO A LA BRASA";
                cantidad = 6;
                precio = 45;
            }else if (comboBox==7) {
                txt = "POLLO A LA BRASA";
                cantidad = 7;
                precio = 45;
            }else if (comboBox==8) {
                txt = "POLLO A LA BRASA";
                cantidad = 8;
                precio = 45;
            }
            //ingresando datos a la clase
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            //iNGRESANDO DATOS A LA CLASE
            platos1.setDescripcion(txt);
            carta1.setDescripcion(txt);
            platos1.setCantidad(cantidad);
            carta1.setCantidad(cantidad);
            platos1.setPrecio(precio);
            carta1.setPrecio(precio);
            platos1.setMonto(monto);
            carta1.setMonto(monto);
            if ( con.insertarPlato(platos1)&con.insertarPedido(carta1) ) {
                //JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //segundo comboBOx
        if(jComboBox_CdePescado.getSelectedIndex()>0){
            comboBox1= jComboBox_CdePescado.getSelectedIndex();
            if (comboBox1==1) {
                txt = "PARRILLA DUO";
                cantidad = 1;
                precio = 25;
            } else if (comboBox1==2) {
                txt = "PARRILLA DUO";
                cantidad = 2;
                precio = 25;
            }else if (comboBox1==3) {
                txt = "PARRILLA DUO";
                cantidad = 3;
                precio = 25;
            }else if (comboBox1==4) {
                txt = "PARRILLA DUO";
                cantidad = 4;
                precio = 25;
            }else if (comboBox1==5) {
                txt = "PARRILLA DUO";
                cantidad = 5;
                precio = 25;
            }
            else if (comboBox1==6) {
                txt = "PARRILLA DUO";
                cantidad = 6;
                precio = 25;
            }else if (comboBox1==7) {
                txt = "PARRILLA DUO";
                cantidad = 7;
                precio = 25;
            }else if (comboBox1==8) {
                txt = "PARRILLA DUO";
                cantidad = 8;
                precio = 25;
            }

            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos2.setDescripcion(txt);
            carta2.setDescripcion(txt);
            platos2.setCantidad(cantidad);
            carta2.setCantidad(cantidad);
            platos2.setPrecio(precio);
            carta2.setPrecio(precio);
            platos2.setMonto(monto);
            carta2.setMonto(monto);
            if ( con.insertarPlato(platos2)&con.insertarPedido(carta2) ) {
               // JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //tercer combobox
        if(jComboBox_LomoSaltado.getSelectedIndex()>0){
            comboBox2= jComboBox_LomoSaltado.getSelectedIndex();
            if (comboBox2==1) {
                txt = "PARRILLA FAMILIAR";
                cantidad = 1;
                precio = 55;
            } else if (comboBox2==2) {
                txt = "PARRILLA FAMILIAR";
                cantidad = 2;
                precio = 55;
            }else if (comboBox2==3) {
                txt = "PARRILLA FAMILIAR";
                cantidad = 3;
                precio = 55;
            }else if (comboBox2==4) {
                txt = "PARRILLA FAMILIAR";
                cantidad = 4;
                precio = 55;
            }else if (comboBox2==5) {
                txt = "PARRILLA FAMILIAR";
                cantidad = 5;
                precio = 55;
            }
            else if (comboBox2==6) {
                txt = "PARRILLA FAMILIAR";
                cantidad = 6;
                precio = 55;
            }else if (comboBox2==7) {
                txt = "PARRILLA FAMILIAR";
                cantidad = 7;
                precio = 55;
            }else if (comboBox2==8) {
                txt = "PARRILLA FAMILIAR";
                cantidad = 8;
                precio = 55;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos3.setDescripcion(txt);
            carta3.setDescripcion(txt);
            platos3.setCantidad(cantidad);
            carta3.setCantidad(cantidad);
            platos3.setPrecio(precio);
            carta3.setPrecio(precio);
            platos3.setMonto(monto);
            carta3.setMonto(monto);
            if ( con.insertarPlato(platos3)&con.insertarPedido(carta3) ) {
               //JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //cuarto combobox
        if(jComboBox_AConMariscos.getSelectedIndex()>0){
            comboBox3=jComboBox_AConMariscos.getSelectedIndex();
            if (comboBox3==1) {
                txt = "MONSTRITO";
                cantidad = 1;
                precio = 25;
            } else if (comboBox3==2) {
                txt = "MONSTRITO";
                cantidad = 2;
                precio = 25;
            }else if (comboBox3==3) {
                txt = "MONSTRITO";
                cantidad = 3;
                precio = 25;
            }else if (comboBox3==4) {
                txt = "MONSTRITO";
                cantidad = 4;
                precio = 25;
            }else if (comboBox3==5) {
                txt = "MONSTRITO";
                cantidad = 5;
                precio = 25;
            }
            else if (comboBox3==6) {
                txt = "MONSTRITO";
                cantidad = 6;
                precio = 25;
            }else if (comboBox3==7) {
                txt = "MONSTRITO";
                cantidad = 7;
                precio = 25;
            }else if (comboBox3==8) {
                txt = "MONSTRITO";
                cantidad = 8;
                precio = 25;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos4.setDescripcion(txt);
            carta4.setDescripcion(txt);
            platos4.setCantidad(cantidad);
            carta4.setCantidad(cantidad);
            platos4.setPrecio(precio);
            carta4.setPrecio(precio);
            platos4.setMonto(monto);
            carta4.setMonto(monto);
            if ( con.insertarPlato(platos4)&con.insertarPedido(carta4) ) {
               // JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //quinto combobox
        if(jComboBox_BaloPobre.getSelectedIndex()>0){
            comboBox4=jComboBox_BaloPobre.getSelectedIndex();
            if (comboBox4==1) {
                txt = "BISTEC A LO POBRE";
                cantidad = 1;
                precio = 30;
            } else if (comboBox4==2) {
                txt = "BISTEC A LO POBRE";
                cantidad = 2;
                precio = 30;
            }else if (comboBox4==3) {
                txt = "BISTEC A LO POBRE";
                cantidad = 3;
                precio = 30;
            }else if (comboBox4==4) {
                txt = "BISTEC A LO POBRE";
                cantidad = 4;
                precio = 30;
            }else if (comboBox4==5) {
                txt = "BISTEC A LO POBRE";
                cantidad = 5;
                precio = 30;
            }
            else if (comboBox4==6) {
                txt = "BISTEC A LO POBRE";
                cantidad = 6;
                precio = 30;
            }else if (comboBox4==7) {
                txt = "BISTEC A LO POBRE";
                cantidad = 7;
                precio = 30;
            }else if (comboBox4==8) {
                txt = "BISTEC A LO POBRE";
                cantidad = 8;
                precio = 30;
            }
        //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos5.setDescripcion(txt);
            carta5.setDescripcion(txt);
            platos5.setCantidad(cantidad);
            carta5.setCantidad(cantidad);
            platos5.setPrecio(precio);
            carta5.setPrecio(precio);
            platos5.setMonto(monto);
            carta5.setMonto(monto);
            if ( con.insertarPlato(platos5)&con.insertarPedido(carta5) ) {
               // JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //sexto combobox
        if(jComboBox_AjiDeGallina.getSelectedIndex()>0){
            comboBox5=jComboBox_AjiDeGallina.getSelectedIndex();
            if (comboBox5==1) {
                txt = "CHAUFA";
                cantidad = 1;
                precio = 20;
            } else if (comboBox5==2) {
                txt = "CHAUFA";
                cantidad = 2;
                precio = 20;
            }else if (comboBox5==3) {
                txt = "CHAUFA";
                cantidad = 3;
                precio = 20;
            }else if (comboBox5==4) {
                txt = "CHAUFA";
                cantidad = 4;
                precio = 20;
            }else if (comboBox5==5) {
                txt = "CHAUFA";
                cantidad = 5;
                precio = 20;
            }
            else if (comboBox5==6) {
                txt = "CHAUFA";
                cantidad = 6;
                precio = 20;
            }else if (comboBox5==7) {
                txt = "CHAUFA";
                cantidad = 7;
                precio = 20;
            }else if (comboBox5==8) {
                txt = "CHAUFA";
                cantidad = 8;
                precio = 20;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos6.setDescripcion(txt);
            carta6.setDescripcion(txt);
            platos6.setCantidad(cantidad);
            carta6.setCantidad(cantidad);
            platos6.setPrecio(precio);
            carta6.setPrecio(precio);
            platos6.setMonto(monto);
            carta6.setMonto(monto);
            if ( con.insertarPlato(platos6)&con.insertarPedido(carta6) ) {
                //JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //septimo combobox
        if(jComboBox_CAUSARELLENA.getSelectedIndex()>0){
            comboBox6=jComboBox_CAUSARELLENA.getSelectedIndex();
            if (comboBox6==1) {
                txt = "MEDIO POLLO";
                cantidad = 1;
                precio = 25;
            } else if (comboBox6==2) {
                txt = "MEDIO POLLO";
                cantidad = 2;
                precio = 25;
            }else if (comboBox6==3) {
                txt = "MEDIO POLLO";
                cantidad = 3;
                precio = 25;
            }else if (comboBox6==4) {
                txt = "MEDIO POLLO";
                cantidad = 4;
                precio = 25;
            }else if (comboBox6==5) {
                txt = "MEDIO POLLO";
                cantidad = 5;
                precio = 25;
            }
            else if (comboBox6==6) {
                txt = "MEDIO POLLO";
                cantidad = 6;
                precio = 25;
            }else if (comboBox6==7) {
                txt = "MEDIO POLLO";
                cantidad = 7;
                precio = 25;
            }else if (comboBox6==8) {
                txt = "MEDIO POLLO";
                cantidad = 8;
                precio = 25;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            carta7.setNumerocarta(numerocarta);
            platos7.setDescripcion(txt);
            carta7.setDescripcion(txt);
            platos7.setCantidad(cantidad);
            carta7.setCantidad(cantidad);
            platos7.setPrecio(precio);
            carta7.setPrecio(precio);
            platos7.setMonto(monto);
            carta7.setMonto(monto);
            if ( con.insertarPlato(platos7)&con.insertarPedido(carta7) ) {
               // JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //octavo combobox
        if(jComboBox_SDePescado.getSelectedIndex()>0){
            comboBox7=jComboBox_SDePescado.getSelectedIndex();
            if (comboBox7==1) {
                txt = "LOMO SALTADO";
                cantidad = 1;
                precio = 18;
            } else if (comboBox7==2) {
                txt = "LOMO SALTADO";
                cantidad = 2;
                precio = 18;
            }else if (comboBox7==3) {
                txt = "LOMO SALTADO";
                cantidad = 3;
                precio = 18;
            }else if (comboBox7==4) {
                txt = "LOMO SALTADO";
                cantidad = 4;
                precio = 18;
            }else if (comboBox7==5) {
                txt = "LOMO SALTADO";
                cantidad = 5;
                precio = 18;
            }
            else if (comboBox7==6) {
                txt = "LOMO SALTADO";
                cantidad = 6;
                precio = 18;
            }else if (comboBox7==7) {
                txt = "LOMO SALTADO";
                cantidad = 7;
                precio = 18;
            }else if (comboBox7==8) {
                txt = "LOMO SALTADO";
                cantidad = 8;
                precio = 18;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos8.setDescripcion(txt);
            carta8.setDescripcion(txt);
            platos8.setCantidad(cantidad);
            carta8.setCantidad(cantidad);
            platos8.setPrecio(precio);
            carta8.setPrecio(precio);
            platos8.setMonto(monto);
            carta8.setMonto(monto);
            if ( con.insertarPlato(platos8)&con.insertarPedido(carta8) ) {
                //JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //noveno combobox
        if(jComboBox_Cristal.getSelectedIndex()>0){
            comboBox8=jComboBox_Cristal.getSelectedIndex();
            if (comboBox8==1) {
                txt = "CRISTAL";
                cantidad = 1;
                precio = 6;
            } else if (comboBox8==2) {
                txt = "CRISTAL";
                cantidad = 2;
                precio = 6;
            }else if (comboBox8==3) {
                txt = "CRISTAL";
                cantidad = 3;
                precio = 6;
            }else if (comboBox8==4) {
                txt = "CRISTAL";
                cantidad = 4;
                precio = 6;
            }else if (comboBox8==5) {
                txt = "CRISTAL";
                cantidad = 5;
                precio = 6;
            }
            else if (comboBox8==6) {
                txt = "CRISTAL";
                cantidad = 6;
                precio = 6;
            }else if (comboBox8==7) {
                txt = "CRISTAL";
                cantidad = 7;
                precio = 6;
            }else if (comboBox8==8) {
                txt = "CRISTAL";
                cantidad = 8;
                precio = 6;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida1.setDescripcion(txt);
            carta9.setDescripcion(txt);
            bebida1.setCantidad(cantidad);
            carta9.setCantidad(cantidad);
            bebida1.setPrecio(precio);
            carta9.setPrecio(precio);
            bebida1.setMonto(monto);
            carta9.setMonto(monto);
            if (con.insertarBebida(bebida1)&con.insertarPedido(carta9) ) {
                //JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //decimo combobox
        if(jComboBox_Pilsen.getSelectedIndex()>0){
            comboBox9=jComboBox_Pilsen.getSelectedIndex();
            if (comboBox9==1) {
                txt = "PILSEN";
                cantidad = 1;
                precio = 7;
            } else if (comboBox9==2) {
                txt = "PILSEN";
                cantidad = 2;
                precio = 7;
            }else if (comboBox9==3) {
                txt = "PILSEN";
                cantidad = 3;
                precio = 7;
            }else if (comboBox9==4) {
                txt = "PILSEN";
                cantidad = 4;
                precio = 7;
            }else if (comboBox9==5) {
                txt = "PILSEN";
                cantidad = 5;
                precio = 7;
            }
            else if (comboBox9==6) {
                txt = "PILSEN";
                cantidad = 6;
                precio = 7;
            }else if (comboBox9==7) {
                txt = "PILSEN";
                precio = 7;
                cantidad = 7;
            }else if (comboBox9==8) {
                txt = "PILSEN";
                cantidad = 8;
                precio = 7;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida2.setDescripcion(txt);
            carta10.setDescripcion(txt);
            bebida2.setCantidad(cantidad);
            carta10.setCantidad(cantidad);
            bebida2.setPrecio(precio);
            carta10.setPrecio(precio);
            bebida2.setMonto(monto);
            carta10.setMonto(monto);
            if (con.insertarBebida(bebida2)&con.insertarPedido(carta10) ) {
               // JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //onceavo combobox
        if(jComboBox_cusqueña.getSelectedIndex()>0){
            comboBox10=jComboBox_cusqueña.getSelectedIndex();
            if (comboBox10==1) {
                txt = "CUSQUEÑA";
                cantidad = 1;
                precio = 8;
            } else if (comboBox10==2) {
                txt = "CUSQUEÑA";
                cantidad = 2;
                precio = 8;
            }else if (comboBox10==3) {
                txt = "CUSQUEÑA";
                cantidad = 3;
                precio = 8;
            }else if (comboBox10==4) {
                txt = "CUSQUEÑA";
                precio = 8;
                cantidad = 4;
            }else if (comboBox10==5) {
                txt = "CUSQUEÑA";
                cantidad = 5;
                precio = 8;
            }
            else if (comboBox10==6) {
                txt = "CUSQUEÑA";
                cantidad = 6;
                precio = 8;
            }else if (comboBox10==7) {
                txt = "CUSQUEÑA";
                cantidad = 7;
                precio = 8;
            }else if (comboBox10==8) {
                txt = "CUSQUEÑA";
                cantidad = 8;
                precio = 8;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida3.setDescripcion(txt);
            carta11.setDescripcion(txt);
            bebida3.setCantidad(cantidad);
            carta11.setCantidad(cantidad);
            bebida3.setPrecio(precio);
            carta11.setPrecio(precio);
            bebida3.setMonto(monto);
            carta11.setMonto(monto);
            if (con.insertarBebida(bebida3)&con.insertarPedido(carta11) ) {
                //JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //doceavo combobox
        if(jComboBox_GaseosaPersonal.getSelectedIndex()>0){
            comboBox11=jComboBox_GaseosaPersonal.getSelectedIndex();
            if (comboBox11==1) {
                txt = "GASEOSA PERSONAL";
                cantidad = 1;
                precio = 3;
            } else if (comboBox11==2) {
                txt = "GASEOSA PERSONAL";
                cantidad = 2;
                precio = 3;
            }else if (comboBox11==3) {
                txt = "GASEOSA PERSONAL";
                cantidad = 3;
                precio = 3;
            }else if (comboBox11==4) {
                txt = "GASEOSA PERSONAL";
                cantidad = 4;
                precio = 3;
            }else if (comboBox11==5) {
                txt = "GASEOSA PERSONAL";
                cantidad = 5;
                precio = 3;
            }
            else if (comboBox11==6) {
                txt = "GASEOSA PERSONAL";
                cantidad = 6;
                precio = 3;
            }else if (comboBox11==7) {
                txt = "GASEOSA PERSONAL";
                cantidad = 7;
                precio = 3;
            }else if (comboBox11==8) {
                txt = "GASEOSA PERSONAL";
                cantidad = 8;
                precio = 3;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida4.setDescripcion(txt);
            carta12.setDescripcion(txt);
            bebida4.setCantidad(cantidad);
            carta12.setCantidad(cantidad);
            bebida4.setPrecio(precio);
            carta12.setPrecio(precio);
            bebida4.setMonto(monto);
            carta12.setMonto(monto);
            if (con.insertarBebida(bebida4)&con.insertarPedido(carta12) ) {
              //  JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //treceavo combobox
        if(jComboBox_GaseosaLitroMedio.getSelectedIndex()>0){
            comboBox12=jComboBox_GaseosaLitroMedio.getSelectedIndex();
            if (comboBox12==1) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 1;
                precio = 8;
            } else if (comboBox12==2) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 2;
                precio = 8;
            }else if (comboBox12==3) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 3;
                precio = 8;
            }else if (comboBox12==4) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 4;
                precio = 8;
            }else if (comboBox12==5) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 5;
                precio = 8;
            }
            else if (comboBox12==6) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 6;
                precio = 8;
            }else if (comboBox12==7) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 7;
                precio = 8;
            }else if (comboBox12==8) {
                txt = "GASEOSA DE LITRO Y MEDIO";
                cantidad = 8;
                precio = 8;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida5.setDescripcion(txt);
            carta13.setDescripcion(txt);
            bebida5.setCantidad(cantidad);
            carta13.setCantidad(cantidad);
            bebida5.setPrecio(precio);
            carta13.setPrecio(precio);
            bebida5.setMonto(monto);
            carta13.setMonto(monto);
            if (con.insertarBebida(bebida5)&con.insertarPedido(carta13) ) {
               // JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //catorceavo combobox
        if(jComboBox_JugoSurtido.getSelectedIndex()>0){
            comboBox13=jComboBox_JugoSurtido.getSelectedIndex();
            if (comboBox13==1) {
                txt = "JUGO SURTIDO";
                cantidad = 1;
                precio = 8;
            } else if (comboBox13==2) {
                txt = "JUGO SURTIDO";
                cantidad = 2;
                precio = 8;
            }else if (comboBox13==3) {
                txt = "JUGO SURTIDO";
                cantidad = 3;
                precio = 8;
            }else if (comboBox13==4) {
                txt = "JUGO SURTIDO";
                cantidad = 4;
                precio = 8;
            }else if (comboBox13==5) {
                txt = "JUGO SURTIDO";
                cantidad = 5;
                precio = 8;
            }
            else if (comboBox13==6) {
                txt = "JUGO SURTIDO";
                cantidad = 6;
                precio = 8;
            }else if (comboBox13==7) {
                txt = "JUGO SURTIDO";
                cantidad = 7;
                precio = 8;
            }else if (comboBox13==8) {
                txt = "JUGO SURTIDO";
                cantidad = 8;
                precio = 8;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida6.setDescripcion(txt);
            carta14.setDescripcion(txt);
            bebida6.setCantidad(cantidad);
            carta14.setCantidad(cantidad);
            bebida6.setPrecio(precio);
            carta14.setPrecio(precio);
            bebida6.setMonto(monto);
            carta14.setMonto(monto);
            if (con.insertarBebida(bebida6)&con.insertarPedido(carta14) ) {
                //JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //quinceavo combobox
        if(jComboBox_JugoPapaya.getSelectedIndex()>0){
            comboBox14=jComboBox_JugoPapaya.getSelectedIndex();
            if (comboBox14==1) {
                txt = "JUGO PAPAYA";
                cantidad = 1;
                precio = 5;
            } else if (comboBox14==2) {
                txt = "JUGO PAPAYA";
                cantidad = 2;
                precio = 5;
            }else if (comboBox14==3) {
                txt = "JUGO PAPAYA";
                cantidad = 3;
                precio = 5;
            }else if (comboBox14==4) {
                txt = "JUGO PAPAYA";
                cantidad = 4;
                precio = 5;
            }else if (comboBox14==5) {
                txt = "JUGO PAPAYA";
                cantidad = 5;
                precio = 5;
            }
            else if (comboBox14==6) {
                txt = "JUGO PAPAYA";
                cantidad = 6;
                precio = 5;
            }else if (comboBox14==7) {
                txt = "JUGO PAPAYA";
                cantidad = 7;
                precio = 5;
            }else if (comboBox14==8) {
                txt = "JUGO PAPAYA";
                cantidad = 8;
                precio = 5;
            } 
            //INGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida7.setDescripcion(txt);
            carta15.setDescripcion(txt);
            bebida7.setCantidad(cantidad);
            carta15.setCantidad(cantidad);
            bebida7.setPrecio(precio);
            carta15.setPrecio(precio);
            bebida7.setMonto(monto);
            carta15.setMonto(monto);
            if (con.insertarBebida(bebida7)&con.insertarPedido(carta15) ) {
                //JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        if (comboBox==0 && comboBox1==0 && comboBox2==0 && comboBox3==0 && comboBox4==0 && comboBox5==0 && comboBox6==0 && comboBox7==0
                && comboBox8==0 && comboBox9==0 && comboBox10==0 && comboBox11==0 && comboBox12==0 && comboBox13==0 && comboBox14==0) {
            JOptionPane.showMessageDialog(null, "NO PUEDES TERMINAR COMPRA SIN HABER ELEGIDO ALGUN PLATO/BEBIDA DEL MENU");
        }else{
            JOptionPane.showMessageDialog(null, "Pedido Registrado Correctamente");
            Orden orden = new Orden();
            orden.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
         jButton1.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        
         jButton1.setBackground(new Color(60,63,65));
    }//GEN-LAST:event_jButton1MouseExited

    private void jComboBox_BaloPobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_BaloPobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_BaloPobreActionPerformed

    private void jComboBox_LomoSaltadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_LomoSaltadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_LomoSaltadoActionPerformed

    private void jComboBox_CevicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_CevicheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_CevicheActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_AConMariscos;
    private javax.swing.JComboBox<String> jComboBox_AjiDeGallina;
    private javax.swing.JComboBox<String> jComboBox_BaloPobre;
    private javax.swing.JComboBox<String> jComboBox_CAUSARELLENA;
    private javax.swing.JComboBox<String> jComboBox_CdePescado;
    private javax.swing.JComboBox<String> jComboBox_Ceviche;
    private javax.swing.JComboBox<String> jComboBox_Cristal;
    private javax.swing.JComboBox<String> jComboBox_GaseosaLitroMedio;
    private javax.swing.JComboBox<String> jComboBox_GaseosaPersonal;
    private javax.swing.JComboBox<String> jComboBox_JugoPapaya;
    private javax.swing.JComboBox<String> jComboBox_JugoSurtido;
    private javax.swing.JComboBox<String> jComboBox_LomoSaltado;
    private javax.swing.JComboBox<String> jComboBox_Pilsen;
    private javax.swing.JComboBox<String> jComboBox_SDePescado;
    private javax.swing.JComboBox<String> jComboBox_cusqueña;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
