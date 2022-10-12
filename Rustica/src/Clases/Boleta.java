package Clases;

public class Boleta extends Cliente {

    private double igv;
    private String fecha;
    private String atendidoP;
    private double montoTotal;
    private double subtotal;

    public Boleta() {
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAtendidoP() {
        return atendidoP;
    }

    public void setAtendidoP(String atendidoP) {
        this.atendidoP = atendidoP;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double Subtotal(int cantidad, double precio) {
        this.subtotal = cantidad * precio;
        return subtotal;
    }
}
