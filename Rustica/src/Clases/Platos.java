//Si se usa
package Clases;

public class Platos extends Carta {

    @Override
    public void setCantidad(int cantidad) {
        super.setCantidad(cantidad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCantidad() {
        return super.getCantidad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrecio() {
        return super.getPrecio(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDescripcion(String descripcion) {
        super.setDescripcion(descripcion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMonto(double monto) {
        super.setMonto(monto);
    }

    @Override
    public double getMonto() {
        return super.getMonto();
    }

    @Override
    public void setIdplatos(String idplatos) {
        super.setIdplatos(idplatos);
    }

    @Override
    public String getIdplatos() {
        return super.getIdplatos();
    }
}
