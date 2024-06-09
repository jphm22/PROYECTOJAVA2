
package CLASES;

public class Habitacion {
    
    private int idhabitacion;
    private String numero;
    private String piso;
    private Double precio_diario;
    private String tipo_habitacion;

    public Habitacion(int idhabitacion, String numero, String piso, Double precio_diario, String tipo_habitacion) {
        this.idhabitacion = idhabitacion;
        this.numero = numero;
        this.piso = piso;
        this.precio_diario = precio_diario;

        this.tipo_habitacion = tipo_habitacion;
    }

    public Habitacion() {
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public Double getPrecio_diario() {
        return precio_diario;
    }

    public void setPrecio_diario(Double precio_diario) {
        this.precio_diario = precio_diario;
    }


    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    } 

    @Override
    public String toString() {
        return "Habitacion{" + "idhabitacion=" + idhabitacion + ", numero=" + numero + ", piso=" + piso + ", precio_diario=" + precio_diario + ", tipo_habitacion=" + tipo_habitacion + '}';
    }
}
