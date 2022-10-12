package ventanas;

import Clases.Boleta;
import Clases.Cliente;
import Clases.Platos;
import Controlador.bd_Conexion;
import Controlador.conexion;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
//new
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
//finish
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Boletas extends javax.swing.JFrame {

    static double subtotal, igv1, igv2, montoTotal1, montoTotal2;
    DefaultTableModel modelo = new DefaultTableModel();
    public static String nombreM = "";

    public Boletas() {
        initComponents();
        setSize(685, 560);
        setResizable(false);
        setTitle("Boleta");
        setLocationRelativeTo(null);
        setVisible(true);
        //para evitar que el programa finalice al cerrar la interfaz de registro de usuario
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        try {
            mostrar();
        } catch (Exception e) {
            System.out.println(e);
        }
        txt_subtotal.setText(Double.toString(subTotal()));
        subtotal = Double.parseDouble(txt_subtotal.getText());
        igv1 = subtotal * 0.18;
        igv2 = redondearDecimales(igv1, 2);
        txt_igv.setText(Double.toString(igv2));
        montoTotal1 = subtotal + igv2;
        montoTotal2 = redondearDecimales(montoTotal1, 2);
        txt_montototal.setText(Double.toString(montoTotal2));
        System.out.println(jTable_listadodeF.getRowCount());
//        bd_Conexion cone = new bd_Conexion();
//        cone.vaciarTabla();
    }

    public double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
        return resultado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDNIORuc = new javax.swing.JLabel();
        txtTELEFONOCLIENTE = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_listadodeF = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTELEFONOCLIENTE1 = new javax.swing.JLabel();
        cmb_nm = new javax.swing.JComboBox<>();
        txtIGV = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JLabel();
        txtHorario = new javax.swing.JLabel();
        txtHorario1 = new javax.swing.JLabel();
        txtHorario2 = new javax.swing.JLabel();
        btnPAGAR = new javax.swing.JButton();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        txt_atendidoP = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JLabel();
        txt_montototal = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_nombreCliente = new javax.swing.JTextField();
        txtIGV1 = new javax.swing.JLabel();
        txt_igv = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("RUSTICA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Perú, Breña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Telef: +51 923288546");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de Cliente:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtDNIORuc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtDNIORuc.setForeground(new java.awt.Color(255, 255, 255));
        txtDNIORuc.setText("DNI                      :");
        getContentPane().add(txtDNIORuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        txtTELEFONOCLIENTE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTELEFONOCLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        txtTELEFONOCLIENTE.setText("Telefono               :");
        getContentPane().add(txtTELEFONOCLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTable_listadodeF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable_listadodeF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Cantidad", "Precio Unitario", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_listadodeF.setColumnSelectionAllowed(true);
        jTable_listadodeF.getTableHeader().setReorderingAllowed(false);
        jTable_listadodeF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_listadodeFMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_listadodeF);
        jTable_listadodeF.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 660, 140));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BOLETA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder__Mastercard_1156750.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder__Visa_1156753.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder__American_Express_1156736.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, -1, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Num. Mesa    :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Atendido por  :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        txtTELEFONOCLIENTE1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTELEFONOCLIENTE1.setForeground(new java.awt.Color(255, 255, 255));
        txtTELEFONOCLIENTE1.setText("Fecha             :");
        getContentPane().add(txtTELEFONOCLIENTE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        cmb_nm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cmb_nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nmActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 100, -1));

        txtIGV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtIGV.setForeground(new java.awt.Color(255, 255, 255));
        txtIGV.setText("SUB TOTAL    :");
        getContentPane().add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        txtMontoTotal.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtMontoTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoTotal.setText("MONTO TOTAL   :");
        getContentPane().add(txtMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        txtHorario.setBackground(new java.awt.Color(255, 255, 255));
        txtHorario.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        txtHorario.setForeground(new java.awt.Color(255, 255, 255));
        txtHorario.setText("Horario de Atencion");
        getContentPane().add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        txtHorario1.setBackground(new java.awt.Color(255, 51, 51));
        txtHorario1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtHorario1.setForeground(new java.awt.Color(255, 255, 255));
        txtHorario1.setText("Lunes a Sábado 9:00 am a 9:00 pm");
        getContentPane().add(txtHorario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        txtHorario2.setBackground(new java.awt.Color(255, 51, 51));
        txtHorario2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtHorario2.setForeground(new java.awt.Color(255, 255, 255));
        txtHorario2.setText("Domingos y Festivos 10:00 am a 8:00 pm");
        getContentPane().add(txtHorario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        btnPAGAR.setBackground(new java.awt.Color(0, 102, 102));
        btnPAGAR.setForeground(new java.awt.Color(255, 255, 255));
        btnPAGAR.setText("GENERAR BOLETA");
        btnPAGAR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnPAGAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPAGARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPAGARMouseExited(evt);
            }
        });
        btnPAGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAGARActionPerformed(evt);
            }
        });
        getContentPane().add(btnPAGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, 40));
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        txt_atendidoP.setForeground(new java.awt.Color(255, 255, 255));
        txt_atendidoP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_atendidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 130, 20));

        txt_subtotal.setToolTipText("");
        txt_subtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 100, 20));

        txt_montototal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_montototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 100, 20));

        txt_dni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 200, 20));

        txt_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 200, 20));

        txt_nombreCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreClienteActionPerformed(evt);
            }
        });
        txt_nombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 200, 20));

        txtIGV1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtIGV1.setForeground(new java.awt.Color(255, 255, 255));
        txtIGV1.setText("IGV    :");
        getContentPane().add(txtIGV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        txt_igv.setToolTipText("");
        txt_igv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_igv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 100, 20));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -6, 690, 570));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nmActionPerformed

        //        /*VERIFICACION DEL COMBOBOX*/
        //
        bd_Conexion con = new bd_Conexion();
        int cmbNM;
        //  String nombreM = "";
        cmbNM = cmb_nm.getSelectedIndex();

        if (cmbNM == 1 || cmbNM == 2 || cmbNM == 3) {
            int numeroMesero = 1;
            nombreM = con.seleccionarNM(numeroMesero);
            txt_atendidoP.setText(nombreM);
            //motrar
            txt_atendidoP.getText();
        } else if (cmbNM == 4 || cmbNM == 5 || cmbNM == 6) {
            int numeroMesero = 2;
            nombreM = con.seleccionarNM(numeroMesero);
            txt_atendidoP.setText(nombreM);
            //motrar
            txt_atendidoP.getText();
        } else if (cmbNM == 7 || cmbNM == 8 || cmbNM == 9) {
            int numeroMesero = 3;
            nombreM = con.seleccionarNM(numeroMesero);
            txt_atendidoP.setText(nombreM);
            //motrar
            txt_atendidoP.getText();
        } else if (cmbNM == 10 || cmbNM == 11 || cmbNM == 12) {
            int numeroMesero = 4;
            nombreM = con.seleccionarNM(numeroMesero);
            txt_atendidoP.setText(nombreM);
            //motrar
            txt_atendidoP.getText();
        } else if (cmbNM == 13 || cmbNM == 14 || cmbNM == 15) {
            int numeroMesero = 5;
            nombreM = con.seleccionarNM(numeroMesero);
            txt_atendidoP.setText(nombreM);
            //motrar
            txt_atendidoP.getText();
        }

    }//GEN-LAST:event_cmb_nmActionPerformed

    private void btnPAGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAGARActionPerformed
        //variables para recuperar datos
        try {
            String fecha;
            String nombre, dni, telefono;
            //Datos Obtenidos de las casillas del diseño de los txt
            // montoTotal =Double.parseDouble(txtPrecioTotal.getText());
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            fecha = df.format(txt_fecha.getDate());
            nombre = txt_nombreCliente.getText();
            int validacion = 0;
            dni = txt_dni.getText();
            telefono = txt_telefono.getText();
            if (nombre.equals("")) {
                txt_nombreCliente.setBackground(Color.red);
                validacion++;
            } else {
                txt_nombreCliente.setBackground(Color.white);
            }
            if (dni.equals("")) {
                txt_dni.setBackground(Color.red);
                validacion++;
            } else {
                txt_dni.setBackground(Color.white);
            }
            if (telefono.equals("")) {
                txt_telefono.setBackground(Color.red);
                validacion++;
            } else {
                txt_telefono.setBackground(Color.white);
            }
            if (fecha.equals("")) {
                txt_fecha.setBackground(Color.red);
                validacion++;
            } else {
                txt_fecha.setBackground(Color.white);
            }
            if (validacion == 0) {
                //JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");

                txt_nombreCliente.setBackground(Color.green);
                txt_dni.setBackground(Color.green);
                txt_telefono.setBackground(Color.green);
                //        /*VERIFICACION DEL COMBOBOX*/
                //
                bd_Conexion con = new bd_Conexion();
                int cmbNM;
                String nombreM = "";
                cmbNM = cmb_nm.getSelectedIndex() + 1;

                if (cmbNM == 1 || cmbNM == 2 || cmbNM == 3) {
                    int numeroMesero = 1;
                    nombreM = con.seleccionarNM(numeroMesero);
                    txt_atendidoP.setText(nombreM);
                    //motrar
                    txt_atendidoP.getText();
                } else if (cmbNM == 4 || cmbNM == 5 || cmbNM == 6) {
                    int numeroMesero = 2;
                    nombreM = con.seleccionarNM(numeroMesero);
                    txt_atendidoP.setText(nombreM);
                    //motrar
                    txt_atendidoP.getText();
                } else if (cmbNM == 7 || cmbNM == 8 || cmbNM == 9) {
                    int numeroMesero = 3;
                    nombreM = con.seleccionarNM(numeroMesero);
                    txt_atendidoP.setText(nombreM);
                    //motrar
                    txt_atendidoP.getText();
                } else if (cmbNM == 10 || cmbNM == 11 || cmbNM == 12) {
                    int numeroMesero = 4;
                    nombreM = con.seleccionarNM(numeroMesero);
                    txt_atendidoP.setText(nombreM);
                    //motrar
                    txt_atendidoP.getText();
                } else if (cmbNM == 13 || cmbNM == 14 || cmbNM == 15) {
                    int numeroMesero = 5;
                    nombreM = con.seleccionarNM(numeroMesero);
                    txt_atendidoP.setText(nombreM);
                    //motrar
                    txt_atendidoP.getText();
                }
                //enviar datos obtenidos a la clase factura
                Cliente cliente = new Cliente();
                // bd_Conexion con = new bd_Conexion();
                Boleta boleta = new Boleta();
                //cliente
                cliente.setNombre(nombre);
                cliente.setDni(dni);
                cliente.setTelefono(telefono);
                cliente.setRuc("00000000000");
                cliente.setCiudad("Sin especificar");
                cliente.setCorreo("Sin especificar");
                //boleta
                bd_Conexion bol = new bd_Conexion();
                boleta.setAtendidoP(nombreM);
                boleta.setNombre(nombre);
                boleta.setDni(dni);
                boleta.setTelefono(telefono);
                boleta.setFecha(fecha);
                //valores
                boleta.setIgv(igv2);
                boleta.setSubtotal(subtotal);
                boleta.setMontoTotal(montoTotal2);
                if (bol.insertarBoleta(boleta)) {
                    JOptionPane.showMessageDialog(null, "Boleta Registrada corecctamente");

                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                //MOSTRAR DATOS DE PRUEBA
                System.out.println(boleta.getNombre()
                        + boleta.getDni()
                        + boleta.getTelefono()
                        + boleta.getMesasAsignadas()
                        + boleta.getFecha());
                //
                //

                int seleccion = JOptionPane.showOptionDialog(null, "DESEA DESCARGAR BOLETA?", "Imprimir Boleta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (seleccion == 0) {
                    Document doc = new Document();
                    ResultSet rs = conexion.getTabla("Select * from pedido;");
                    try {

                        String ruta = System.getProperty("user.home");
                        PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Desktop/Boleta" + boleta.getNombre() + ".pdf"));
                        Image header = Image.getInstance("src/imagenes/CabeceraB.jpg");
                        header.scaleToFit(650, 1000);//1000 iba mil
                        header.setAlignment(Chunk.ALIGN_CENTER);

                        Paragraph parrafo = new Paragraph();
                        parrafo.setAlignment(Paragraph.ALIGN_LEFT);
                        parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
                        parrafo.add("Nombre: " + boleta.getNombre().concat("                           " + "Dni: " + boleta.getDni() + "\n \n"));
//                    parrafo.add("Dni: " + boleta.getDni()+ " \n \n");
                        parrafo.add("Telefono: " + boleta.getTelefono().concat("                      " + "Fecha: " + boleta.getFecha() + "\n \n"));
//                    parrafo.add("Fecha: " + boleta.getFecha()+ "\n \n");
                        doc.open();
                        doc.add(header);
                        doc.add(parrafo);

                        /*creacion de las columnas de la table falta la base de datos*/
                        PdfPTable tabla = new PdfPTable(4);
                        String rotulosColumnas[] = {"Descripcion", "Cantidad", "Precio Unitario", "Total"};
                        tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
                        tabla.setWidthPercentage(100);

                        PdfPCell CeldaFinal = new PdfPCell(new Paragraph());
                        CeldaFinal.setColspan(4);
                        for (int i = 0; i < rotulosColumnas.length; i++) {
                            CeldaFinal = new PdfPCell(new Paragraph(rotulosColumnas[i]));
                            CeldaFinal.setVerticalAlignment(Element.ALIGN_MIDDLE);
                            CeldaFinal.setHorizontalAlignment(Element.ALIGN_CENTER);
                            tabla.addCell(CeldaFinal);
                        }
                        while (rs.next()) {
                            CeldaFinal = new PdfPCell(new Paragraph(String.valueOf(rs.getString("descripcion"))));
                            tabla.addCell(CeldaFinal);
                            CeldaFinal = new PdfPCell(new Paragraph(String.valueOf(rs.getString("cantidad"))));
                            tabla.addCell(CeldaFinal);
                            CeldaFinal = new PdfPCell(new Paragraph(String.valueOf(rs.getString("precio"))));
                            tabla.addCell(CeldaFinal);
                            CeldaFinal = new PdfPCell(new Paragraph(String.valueOf(rs.getString("monto"))));
                            tabla.addCell(CeldaFinal);
                        }
                        Paragraph parrafo1 = new Paragraph();
                        parrafo1.setAlignment(Paragraph.ALIGN_RIGHT);
                        parrafo1.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
                        parrafo1.add("SubTotal: " + boleta.getSubtotal() + "\n \n");
                        parrafo1.add("IGV 18%: " + boleta.getIgv() + " \n \n");
                        parrafo1.add("Total: " + boleta.getMontoTotal() + "\n \n");

                        doc.add(tabla);
                        doc.add(parrafo1);

                        doc.close();
                        JOptionPane.showMessageDialog(null, "BOLETA DESCARGADA EN INICIO ");
                        this.dispose();
                    } catch (DocumentException | IOException e) {
                        System.out.println("error" + e);
                    } catch (SQLException ex) {
                        Logger.getLogger(Boleta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    //JOptionPane.showMessageDialog(null, "BOLETA NO DESCARGADA ");
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "COMPLETA");
            }
        } catch (Exception e) {
            if (txt_nombreCliente.getText().equals("")) {
                txt_nombreCliente.setBackground(Color.red);
            } else {
                txt_nombreCliente.setBackground(Color.white);
            }
            if (txt_dni.getText().equals("")) {
                txt_dni.setBackground(Color.red);
            } else {
                txt_dni.setBackground(Color.white);
            }
            if (txt_telefono.getText().equals("")) {
                txt_telefono.setBackground(Color.red);
            } else {
                txt_telefono.setBackground(Color.white);
            }
            if (txt_fecha.getDate() == null) {
                txt_fecha.setBackground(Color.red);
            } else {
                txt_fecha.setBackground(Color.white);
            }
            if (txt_atendidoP.getText().equals("")) {
                txt_atendidoP.setBackground(Color.red);
            } else {
                txt_atendidoP.setBackground(Color.white);
            }
            if (cmb_nm.getSelectedItem() == "----") {
                cmb_nm.setBackground(Color.red);
            } else {
                cmb_nm.setBackground(Color.white);
            }
            JOptionPane.showMessageDialog(rootPane, "Debe completa las casillas de rojo");
        }
        bd_Conexion cone = new bd_Conexion();
        cone.vaciarTabla();

    }//GEN-LAST:event_btnPAGARActionPerformed

    private void txt_nombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreClienteKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombreClienteKeyTyped

    private void txt_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();
        int can = txt_dni.getText().length();
        int tam = 8;
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || can >= tam) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txt_dniKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();
        int can = txt_telefono.getText().length();
        int tam = 11;
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || can >= tam) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreClienteActionPerformed

    private void btnPAGARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPAGARMouseEntered
        // TODO add your handling code here:
        btnPAGAR.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnPAGARMouseEntered

    private void btnPAGARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPAGARMouseExited
        // TODO add your handling code here:
        btnPAGAR.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPAGARMouseExited

    private void jTable_listadodeFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_listadodeFMouseClicked

    }//GEN-LAST:event_jTable_listadodeFMouseClicked
    public void mostrar() {

        ResultSet rs = conexion.getTabla("select * from pedido;");
        try {
            while (rs.next()) {
                modelo.setColumnIdentifiers(new Object[]{"Descripcion", "Cantidad", "Precio", "Monto"});
                //añade los resultados a el modelo de tabla  

                modelo.addRow(new Object[]{rs.getString("descripcion"), rs.getInt("cantidad"), rs.getDouble("precio"), rs.getDouble("monto")});
                jTable_listadodeF.setModel(modelo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Boleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double subTotal() {
        int contar = jTable_listadodeF.getRowCount();
        double subTotal = 0;
        for (int i = 0; i < contar; i++) {
            subTotal = subTotal + Double.parseDouble(jTable_listadodeF.getValueAt(i, 3).toString());
        }
        return subTotal;
    }

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
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Boletas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPAGAR;
    private javax.swing.JComboBox<String> cmb_nm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_listadodeF;
    private javax.swing.JLabel txtDNIORuc;
    private javax.swing.JLabel txtHorario;
    private javax.swing.JLabel txtHorario1;
    private javax.swing.JLabel txtHorario2;
    private javax.swing.JLabel txtIGV;
    private javax.swing.JLabel txtIGV1;
    private javax.swing.JLabel txtMontoTotal;
    private javax.swing.JLabel txtTELEFONOCLIENTE;
    private javax.swing.JLabel txtTELEFONOCLIENTE1;
    private javax.swing.JLabel txt_atendidoP;
    private javax.swing.JTextField txt_dni;
    private com.toedter.calendar.JDateChooser txt_fecha;
    private javax.swing.JLabel txt_igv;
    private javax.swing.JLabel txt_montototal;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JLabel txt_subtotal;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
public void Limpiar() {
        txt_nombreCliente.setText("");
        txt_dni.setText("");
        txt_telefono.setText("");
    }
}
