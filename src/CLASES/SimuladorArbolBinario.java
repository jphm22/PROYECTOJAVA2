package CLASES;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JPanel;

public class SimuladorArbolBinario {

    ArbolBB miArbol = new ArbolBB();

    public SimuladorArbolBinario() {
    }

    public boolean insertar(Integer dato) {
        return (this.miArbol.agregar(dato));
    }

    //metodo para mostrar los recorridos del arbol
    public String preOrden() {
        LinkedList it = this.miArbol.preOrden();
        return (recorrido(it, "Recorrido PreOrden"));
    }

    public String inOrden() {
        LinkedList it = this.miArbol.inOrden();
        return (recorrido(it, "Recorrido InOrden"));
    }

    public String postOrden() {
        LinkedList it = this.miArbol.postOrden();
        return (recorrido(it, "Recorrido PosOrden"));
    }

    //metodo para poder mostrar los tipos d recorrido
    private String recorrido(LinkedList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "";
            i++;
        }
        return (r);
    }

    public boolean borrar(int dato, boolean caso1) {
        return borrar(this.miArbol.getRaiz(), dato, caso1) != null;
    }

    private NodoABB borrar(NodoABB r, int dato, boolean caso1) {
        if (r == null) {
            return null;
        }

        if (dato < r.getDato()) {
            r.setIzq(borrar(r.getIzq(), dato, caso1));
        } else if (dato > r.getDato()) {
            r.setDer(borrar(r.getDer(), dato, caso1));
        } else {
            if (r.getIzq() == null) {
                return r.getDer();
            } else if (r.getDer() == null) {
                return r.getIzq();
            }

            if (caso1) {
                r.setDato(buscarMinimo(r.getDer()));
                r.setDer(borrar(r.getDer(), r.getDato(), caso1));
            } else {
                r.setDato(buscarMaximo(r.getIzq()));
                r.setIzq(borrar(r.getIzq(), r.getDato(), caso1));
            }
        }

        return r;
    }

    private int buscarMinimo(NodoABB nodo) {
        int minimo = nodo.getDato();
        while (nodo.getIzq() != null) {
            minimo = nodo.getIzq().getDato();
            nodo = nodo.getIzq();
        }
        return minimo;
    }

    private int buscarMaximo(NodoABB nodo) {
        int maximo = nodo.getDato();
        while (nodo.getDer() != null) {
            maximo = nodo.getDer().getDato();
            nodo = nodo.getDer();
        }
        return maximo;
    }

    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    }

}
