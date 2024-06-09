//Este nodo pertenece a la lista enlazada 
package CLASES;


public class Nodo {

    // Atributos de la clase Nodo
    private Habitacion dato;  // Almacena el objeto Habitacion en el nodo
    private Nodo sig;  // Almacena la referencia al siguiente nodo en la lista

    // Constructor para insertar al inicio
    public Nodo(Habitacion dato, Nodo sig){
        // Inicializa el nodo con un objeto Habitacion y una referencia al siguiente nodo
        this.dato = dato;
        this.sig = sig;
    }
    
    // Constructor para insertar al final
    public Nodo(Habitacion dato){
        // Inicializa el nodo con un objeto Habitacion y establece la referencia al siguiente nodo como nula
        this.dato = dato;
        this.sig = null;
    }

    // Método para obtener el objeto Habitacion almacenado en el nodo
    public Habitacion getDato() {
        return dato;
    }

    // Método para establecer el objeto Habitacion en el nodo
    public void setDato(Habitacion dato) {
        this.dato = dato;
    }

    // Método para obtener la referencia al siguiente nodo en la lista
    public Nodo getSig() {
        return sig;
    }

    // Método para establecer la referencia al siguiente nodo en la lista
    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}

