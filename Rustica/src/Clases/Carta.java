//si se usa
package Clases;

public class Carta {

    private int idcarta;
    private String descripcion;
    private int cantidad;
    private double precio;
    private double monto;
    private int numerocarta;
    private String idplatos;
    private String idbebidas;

    public Carta() {
    }

    public Carta(int idcarta, String descripcion, int cantidad, double precio, double monto, int numerocarta, String idplatos, String idbebidas) {
        this.idcarta = idcarta;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.monto = monto;
        this.numerocarta = numerocarta;
        this.idplatos = idplatos;
        this.idbebidas = idbebidas;
    }

    public int getIdcarta() {
        return idcarta;
    }

    public void setIdcarta(int idcarta) {
        this.idcarta = idcarta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNumerocarta() {
        return numerocarta;
    }

    public void setNumerocarta(int numerocarta) {
        this.numerocarta = numerocarta;
    }

    public String getIdplatos() {
        return idplatos;
    }

    public void setIdplatos(String idplatos) {
        this.idplatos = idplatos;
    }

    public String getIdbebidas() {
        return idbebidas;
    }

    public void setIdbebidas(String idbebidas) {
        this.idbebidas = idbebidas;
    }
}
