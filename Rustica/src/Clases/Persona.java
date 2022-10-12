//Si se usa
package Clases;

public class Persona {

    private String nombre;
    private String dni;
    private String telefono;
    private int numeroDeMesero;
    private String mesasAsignadas;

    //contructores
    public Persona() {
    }

    public Persona(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }
    // get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumeroDeMesero() {
        return numeroDeMesero;
    }

    public void setNumeroDeMesero(int numeroDeMesero) {
        this.numeroDeMesero = numeroDeMesero;
    }

    public String getMesasAsignadas() {
        return mesasAsignadas;
    }

    public void setMesasAsignadas(String mesasAsignadas) {
        this.mesasAsignadas = mesasAsignadas;
    }

}
