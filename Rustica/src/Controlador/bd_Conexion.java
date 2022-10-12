package Controlador;

import Clases.Administrador;
import Clases.Bebidas;
import Clases.Boleta;
import Clases.Carta;
import Clases.Cliente;
import Clases.Factura;
import Clases.Mesero;
import Clases.Platos;
import Clases.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

public class bd_Conexion {

    private conexion mysql = new conexion();
    private Connection co = mysql.Conectar();
    private String cadena = "";

    public boolean insertarUsuarios(Usuario usua) {
        cadena = "insert into usuario(userName,contraseña,tipoNivel,mail,telefono,nombre)"
                + "values(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, usua.getUsernameUsuario());
            pst.setString(2, usua.getContrasenaUsuario());
            pst.setString(3, usua.getTipoNivelUsuario());
            pst.setString(4, usua.getMailUsuario());
            pst.setString(5, usua.getTelefono());
            pst.setString(6, usua.getNombre());

            int n = pst.executeUpdate();//de esto depende si e completo completamente
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return false;
        }
    }

    public boolean insertarCliente(Cliente cli) {
        cadena = "insert into clientes(nombre,dni,ruc,telefono,correo,ciudad)"
                + "values(?,?,?,?,?,?)";

        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, cli.getNombre());
            pst.setString(2, cli.getDni());
            pst.setString(3, cli.getRuc());///aqui va el ruc 
            pst.setString(4, cli.getTelefono());
            pst.setString(5, cli.getCorreo());///aqui va el correo
            pst.setString(6, cli.getCiudad());///aqui va ciudad

            int n = pst.executeUpdate();//de esto depende si e completo completamente
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return false;
        }
    }

    public boolean insertarAdministrador(Administrador adm) {
        cadena = "insert into Administrador(nombre,telefono,mail,contraseña,username)"
                + "values(?,?,?,?,?)";

        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, adm.getNombre());
            pst.setString(2, adm.getTelefono());
            pst.setString(3, adm.getMailUsuario());
            pst.setString(4, adm.getContrasenaUsuario());
            pst.setString(5, adm.getUsernameUsuario());

            int n = pst.executeUpdate();//de esto depende si e completo completamente
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return false;
        }
    }

    public boolean insertarMesero(Mesero mes) {
        cadena = "insert into Mesero(nombre,telefono,mail,contraseña,userName,numeroMesero)"
                + "values(?,?,?,?,?,?)";

        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, mes.getNombre());
            pst.setString(2, mes.getTelefono());
            pst.setString(3, mes.getMailUsuario());
            pst.setString(4, mes.getContrasenaUsuario());
            pst.setString(5, mes.getUsernameUsuario());
            pst.setInt(6, mes.getNumeroDeMesero());
            int n = pst.executeUpdate();//de esto depende si e completo completamente
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return false;
        }
    }

    public boolean insertarBoleta(Boleta bo) {
        cadena = "insert into Boleta(nombre,dni,telefono,atendidoPor,fecha,subTotal,igv,montoTotal)"
                + "values(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, bo.getNombre());
            pst.setString(2, bo.getDni());
            pst.setString(3, bo.getTelefono());
            pst.setString(4, bo.getAtendidoP());
            pst.setString(5, bo.getFecha());
            pst.setDouble(6, bo.getSubtotal());
            pst.setDouble(7, bo.getIgv());
            pst.setDouble(8, bo.getMontoTotal());///aqui va el subtotal

            int n = pst.executeUpdate();//de esto depende si e completo completamente
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return false;
        }
    }

    public boolean insertarFactura(Factura fac) {
        cadena = "insert into Factura(fecha,montoTotal,ciudad,ruc,correo,nombre,telefono,subTotal,atendidoPor)"
                + "values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, fac.getFecha());
            pst.setDouble(2, fac.getMontoTotal());
            pst.setString(3, fac.getCiudad());
            pst.setString(4, fac.getRuc());
            pst.setString(5, fac.getCorreo());
            pst.setString(6, fac.getNombre());
            pst.setString(7, fac.getTelefono());
            pst.setDouble(8, fac.getSubtotal());//aqui va el subtotal
            pst.setString(9, fac.getAtendidoPor());///aqui va el atendidoP
            int n = pst.executeUpdate();//de esto depende si e completo completamente
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return false;
        }
    }

    public boolean insertarPlato(Platos plat) {
        cadena = "insert into plato_pedido(nombrePlato, cantidadPlato, precioPlato, montoPlato)"
                + "values(?,?,?,?)";

        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, plat.getDescripcion());
            pst.setInt(2, plat.getCantidad());
            pst.setDouble(3, plat.getPrecio());
            pst.setDouble(4, plat.getMonto());

            int n = pst.executeUpdate();//de esto depende si e completo completamente
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return false;
        }
    }

    public boolean insertarBebida(Bebidas bebid) {
        cadena = "insert into bebida_pedido(nombreBebida, cantidadBebida, precioBebida, montoBebida)"
                + "values(?,?,?,?)";

        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, bebid.getDescripcion());
            pst.setInt(2, bebid.getCantidad());
            pst.setDouble(3, bebid.getPrecio());
            pst.setDouble(4, bebid.getMonto());

            int n = pst.executeUpdate();//de esto depende si e completo completamente
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return false;
        }
    }

    public boolean insertarPedido(Carta cart) {
        cadena = "insert into pedido(descripcion, cantidad, precio, monto, numeropedido)"
                + "values(?,?,?,?,?)";
        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, cart.getDescripcion());
            pst.setInt(2, cart.getCantidad());
            pst.setDouble(3, cart.getPrecio());
            pst.setDouble(4, cart.getMonto());
            pst.setInt(5, cart.getNumerocarta());

            int n = pst.executeUpdate();//de esto depende si e completo completamente
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return false;
        }
    }

    public String seleccionarNM(int numeroM) {
        cadena = "select nombre from mesero where numeroMesero = '" + numeroM + "'";

        try {
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(cadena);
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                return nombre;
            }
            return "Prueba";

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return null;
        }

    }

    public String seleccionarPedidos() {
        cadena = "select nombre_del_Plato , nombre_deBebida from pedido ";

        int con = 1;
        try {
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(cadena);
            if (rs.next()) {

                do {
                    String nombre = rs.getString(con);
                    con++;
                    return nombre;
                } while (rs.next());

            }
            return "Prueba";

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return null;
        }

    }

    public boolean vaciarTabla() {
        cadena = "truncate table pedido ";

        try {
            PreparedStatement pst = co.prepareStatement(cadena);

            int n = pst.executeUpdate();//de esto depende si e completo completamente
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CONTACTE CON EL ADMINISTRADOR" + e);
            return false;
        }

    }

    public boolean eliminarBoleta(String buscar) {
        cadena = "DELETE FROM boleta "
                + "WHERE nombre=?";
        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, buscar);
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminarFactura(String buscar) {
        cadena = "DELETE FROM factura "
                + "WHERE nombre=?";
        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, buscar);
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminarMesero(String buscar) {
        cadena = "DELETE FROM mesero "
                + "WHERE nombre=?";
        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, buscar);
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminarCliente(String buscar) {
        cadena = "DELETE FROM clientes "
                + "WHERE nombre=?";
        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, buscar);
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminarAdministrador(String buscar) {
        cadena = "DELETE FROM administrador "
                + "WHERE nombre=?";
        try {
            PreparedStatement pst = co.prepareStatement(cadena);
            pst.setString(1, buscar);
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

}
