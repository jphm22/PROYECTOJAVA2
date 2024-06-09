/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author ANIBAL
 */
public class NodoPila {
    
    private Habitacion dato;
    private NodoPila sig;

    public NodoPila(Habitacion dato) {
        this.dato = dato;
        this.sig = null;
    }

    public Habitacion getDato() {
        return dato;
    }

    public void setDato(Habitacion dato) {
        this.dato = dato;
    }

    public NodoPila getSig() {
        return sig;
    }

    public void setSig(NodoPila sig) {
        this.sig = sig;
    }
}
