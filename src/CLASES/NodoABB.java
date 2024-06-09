
package CLASES;

public class NodoABB {
    private int dato;
    private NodoABB izq,der;

    public NodoABB(int dato, NodoABB izq, NodoABB der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoABB getIzq() {
        return izq;
    }

    public void setIzq(NodoABB izq) {
        this.izq = izq;
    }

    public NodoABB getDer() {
        return der;
    }

    public void setDer(NodoABB der) {
        this.der = der;
    }
    
}
