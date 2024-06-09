
package CLASES;

public class NoditoArbol {
    int codigo;
    int numeroDias;
    int propina;
    int precioHabitacion;
    int total;
    NoditoArbol izquierda, derecha;

    public NoditoArbol(int codigo, int numeroDias, int propina, int precioHabitacion,int total) {
        this.codigo = codigo;
        this.numeroDias = numeroDias;
        this.propina = propina;
        this.precioHabitacion = precioHabitacion;
        this.total = (numeroDias * precioHabitacion) + propina;
        this.izquierda = null;
        this.derecha = null;
    }
    
}

    

