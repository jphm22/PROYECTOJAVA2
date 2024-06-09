
package CLASES;

public class ListaEnlazada {
    
    private Nodo inicio, fin;  // Referencias al primer y último nodo de la lista

    // Constructor de la clase ListaEnlazada
    public ListaEnlazada(){
        this.inicio = null;
        this.fin = null;
    }

    // Método para obtener el nodo de inicio
    public Nodo getInicio() {
        return inicio;
    }

    // Método para obtener el nodo final
    public Nodo getFin() {
        return fin;
    }

    // Método para insertar un nodo al inicio
    public void inserIni(Habitacion habitacion) {
        // Crea un nuevo nodo con la habitación y lo coloca al inicio de la lista
        inicio = new Nodo(habitacion, inicio);
        
        // Si la lista estaba vacía, también actualiza el fin
        if (fin == null) {
            fin = inicio;
        }
    }

    // Método para insertar un nodo al final
    public void inserFin(Habitacion habitacion) {
        // Si la lista está vacía, crea un nuevo nodo y lo establece como inicio y fin
        if (inicio == null) {
            inicio = fin = new Nodo(habitacion);
        } else {
            // Si la lista no está vacía, agrega un nuevo nodo al final
            fin.setSig(new Nodo(habitacion));
            fin = fin.getSig();
        }
    }

    // Método para recorrer los nodos e imprimir los IDs de las habitaciones
    public void recNodos() {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo elemento = inicio;
            
            while (elemento != null) {
                System.out.print(elemento.getDato().getIdhabitacion() + " --> ");
                elemento = elemento.getSig();
            }
        }
        System.out.println("");
    }

    // Método para eliminar un nodo al inicio
    public void eliminarIni() {
        if (inicio == fin) {
            // Si la lista tiene un solo nodo, lo elimina y actualiza el inicio y fin
            inicio = null;
            fin = null;
        } else {
            // Si hay más de un nodo, elimina el nodo al inicio
            inicio = inicio.getSig();
        }
    }

    // Método para eliminar un nodo al final
    public void eliminarFin() {
        if (inicio == fin) {
            // Si la lista tiene un solo nodo, lo elimina y actualiza el inicio y fin
            inicio = null;
            fin = null;
        } else {
            // Si hay más de un nodo, busca el penúltimo nodo y actualiza el fin
            Nodo temIni = inicio;
            while (temIni.getSig() != fin) {
                temIni = temIni.getSig();
            }
            fin = temIni;
            fin.setSig(null);
        }
    }

    // Método para insertar un nodo en una posición intermedia
    public void insertarEnMedio(Habitacion habitacion ) {
            Nodo nuevoNodo = new Nodo(habitacion);

            if (inicio == null) {
                inicio = nuevoNodo;
                fin = nuevoNodo;
                return;
            }

            // Encontrar la posición del medio 
            int longitud = obtenerLongitud();
            int medio = longitud / 2;

            if (medio == 0) {
                nuevoNodo.setSig(inicio);
                inicio = nuevoNodo;
            } else {
                Nodo nodoPrevio = obtenerNodoEnPosicion(medio);
                nuevoNodo.setSig(nodoPrevio.getSig());
                nodoPrevio.setSig(nuevoNodo);
            }
        }
    
    private int obtenerLongitud() {
        int longitud = 0;
        Nodo actual = inicio;
        while (actual != null) {
            longitud++;
            actual = actual.getSig();
        }
        return longitud;
    }
    
    private Nodo obtenerNodoEnPosicion(int posicion) {
        if (posicion < 0) {
            return null;
        }

        Nodo actual = inicio;
        for (int i = 0; i < posicion && actual != null; i++) {
            actual = actual.getSig();
        }

        return actual;
    }

    // Método para eliminar un nodo en una posición intermedia
    public void eliminarEnMedio(Habitacion habitacion) {
        if (inicio != null) {
            if (inicio == fin && inicio.getDato()== habitacion) {
                inicio = null;
                fin = null;
            } else if (inicio.getDato() == habitacion) {
                inicio = inicio.getSig();
            } else {
                Nodo anterior, tem;
                anterior = inicio;
                tem = inicio.getSig();
                while (tem != null && !tem.getDato().equals(habitacion)) {
                    anterior = anterior.getSig();
                    tem = tem.getSig();
                }
                if (tem != null) {
                    anterior.setSig(tem.getSig());
                    if (tem == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }

}

    
