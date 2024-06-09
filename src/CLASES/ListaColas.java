/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author ANIBAL
 */
public class ListaColas {
    

    private NodoCola inicio, fin;

    public ListaColas() {
        this.inicio = null;
        this.fin = null;
    }

    public NodoCola getInicio() {
        return inicio;
    }

    public void setInicio(NodoCola inicio) {
        this.inicio = inicio;
    }

    public NodoCola getFin() {
        return fin;
    }

    public void setFin(NodoCola fin) {
        this.fin = fin;
    }

    // Métodos
    // Método insertar en la cola
    public void encolar(Habitacion habitacion) {
        NodoCola nuevo = new NodoCola(habitacion);

        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSig(nuevo);
            fin = fin.getSig();
        }
    }

    // Método para desencolar
    public void desencolar() {
        Habitacion habitacion = null;
        if (inicio != null) {
            habitacion = inicio.getDato();
            inicio = inicio.getSig();

            // En lugar de imprimir, puedes hacer lo que necesites con la habitación desencolada
            System.out.println("Elemento eliminado -- " + habitacion);
        }
    }
    
}
