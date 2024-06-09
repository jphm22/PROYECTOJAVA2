/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author ANIBAL
 */
public class ListaPila {
    private NodoPila cima;
    private int max;

    public ListaPila(int max) {
        this.cima = null;
        this.max = max;
    }

    public NodoPila getCima() {
        return cima;
    }

    public void setCima(NodoPila cima) {
        this.cima = cima;
    }

    public int getMax() {
        return max;
    }

    public void push(Habitacion habitacion) {
        if (size() < max) { //Verifica que la pila esta llena
            NodoPila nuevo = new NodoPila(habitacion);//Crea un nuevo nodo
            nuevo.setSig(cima);//Establece el siguiente nuevo nodo como la sima actual
            cima = nuevo; //Guarda la cima de la pila al nuevo nodo
        } else {
            System.out.println("La pila está llena. No se puede apilar más elementos.");
        }
    }

    public void pop() {
        if (cima != null) {// verifica si la pila no esta vacia 
            cima = cima.getSig();//actualiza la cima de la pila al siguiente nodo
        } else {
            System.out.println("La pila está vacía. No se puede desapilar más elementos.");
        }
    }
    //Este es el metodo para obtener el tamaño actual de la pila
    public int size() {
        int count = 0;
        NodoPila temp = cima;
        while (temp != null) {
            count++;
            temp = temp.getSig();
        }
        return count;
    }
}
