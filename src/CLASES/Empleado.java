
package CLASES;


public class Empleado {
    private int codigo;
    private String nombre;
    private String apellido;    
    private int dniHuesped;

    public Empleado(int codigo, String nombre, String apellido, int dniHuesped) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dniHuesped = dniHuesped;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", dniHuesped=" + dniHuesped + '}';
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDniHuesped() {
        return dniHuesped;
    }

    public void setDniHuesped(int dniHuesped) {
        this.dniHuesped = dniHuesped;
    }
   
}
