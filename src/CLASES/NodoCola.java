
package CLASES;

public class NodoCola {
    
    private Habitacion dato;
    private NodoCola sig;

    public NodoCola(Habitacion dato) {
        this.dato = dato;
        this.sig = null;
    }

    public Habitacion getDato() {
        return dato;
    }

    public void setDato(Habitacion dato) {
        this.dato = dato;
    }

    public NodoCola getSig() {
        return sig;
    }

    public void setSig(NodoCola sig) {
        this.sig = sig;
    }
}
