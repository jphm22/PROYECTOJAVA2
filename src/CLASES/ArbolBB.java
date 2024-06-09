package CLASES;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JPanel;

public class ArbolBB {

    private NodoABB raiz;
    int num_nodos;
    int alt;

    public ArbolBB() {
        raiz = null;
    }

    public boolean agregar(int dato) {
        NodoABB nuevo = new NodoABB(dato, null, null);
        insertar(nuevo, raiz);
        return true;
    }

    //Metodo para insertar un dato en el arbol...no acepta repetidos :)
    public void insertar(NodoABB nuevo, NodoABB pivote) {
        if (this.raiz == null) {
            raiz = nuevo;
        } else {
            if (nuevo.getDato() <= pivote.getDato()) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nuevo);
                } else {
                    insertar(nuevo, pivote.getIzq());
                }
            } else {
                if (pivote.getDer() == null) {
                    pivote.setDer(nuevo);
                } else {
                    insertar(nuevo, pivote.getDer());
                }
            }
        }

    }

    public NodoABB getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoABB raiz) {
        this.raiz = raiz;
    }

    //Recorrido preorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList preOrden() {
        LinkedList rec = new LinkedList();
        preorden(raiz, rec);
        return rec;
    }

    public void preorden(NodoABB aux, LinkedList recorrido) {
        if (aux != null) {
            recorrido.add(aux.getDato());
            preorden(aux.getIzq(), recorrido);
            preorden(aux.getDer(), recorrido);
        }
    }

    //Recorrido inorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList inOrden() {
        LinkedList rec = new LinkedList();
        inorden(raiz, rec);
        return rec;
    }

    public void inorden(NodoABB aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getIzq(), recorrido);
            recorrido.add(aux.getDato());
            inorden(aux.getDer(), recorrido);
        }
    }

    //Recorrido postorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList postOrden() {
        LinkedList rec = new LinkedList();
        postorden(raiz, rec);
        return rec;
    }

    public void postorden(NodoABB aux, LinkedList recorrido) {
        if (aux != null) {
            postorden(aux.getIzq(), recorrido);
            postorden(aux.getDer(), recorrido);
            recorrido.add(aux.getDato());
        }
    }

    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(int dato) {
        NodoABB aux = raiz;
        while (aux != null) {
            if (dato == aux.getDato()) {
                return true;
            } else if (dato > aux.getDato()) {
                aux = aux.getDer();
            } else {
                aux = aux.getIzq();
            }
        }
        return false;
    }

    private void altura(NodoABB aux, int nivel) {
        if (aux != null) {
            altura(aux.getIzq(), nivel + 1);
            alt = nivel;
            altura(aux.getDer(), nivel + 1);
        }
    }

    //Devuleve la altura del arbol
    public int getAltura() {
        altura(raiz, 1);
        return alt;
    }

    public boolean buscar(int x) {
        return (buscar(this.raiz, x));
    }

    private boolean buscar(NodoABB r, int x) {
        if (r == null) {
            return (false);
        }
        int compara = ((Comparable) r.getDato()).compareTo(x);
        if (compara > 0) {
            return (buscar(r.getIzq(), x));
        } else if (compara < 0) {
            return (buscar(r.getDer(), x));
        } else {
            return (true);
        }
    }
    //buscar min

    public int borrar(int x) {
        if (!this.buscar(x)) {
            return 0;
        }

        NodoABB z = borrar(this.raiz, x);
        this.setRaiz(z);
        return x;
    }

    private NodoABB borrar(NodoABB r, int x) {
        if (r == null) {
            return null; // Dato no encontrado
        }
        int compara = ((Comparable) r.getDato()).compareTo(x);
        if (compara > 0) {
            r.setIzq(borrar(r.getIzq(), x));
        } else if (compara < 0) {
            r.setDer(borrar(r.getDer(), x));
        } else {
            System.out.println("Encontro el dato:" + x);
            if (r.getIzq() != null && r.getDer() != null) {
                // Caso 1: Tomar el menor de la rama derecha
                NodoABB minRamaDerecha = buscarMinRamaDerecha(r.getDer());
                r.setDato(minRamaDerecha.getDato());
                r.setDer(borrar(r.getDer(), minRamaDerecha.getDato()));
            } else {
                r = (r.getIzq() != null) ? r.getIzq() : r.getDer();
            }
        }
        return r;
    }

    private NodoABB buscarMinRamaDerecha(NodoABB nodo) {
        while (nodo.getIzq() != null) {
            nodo = nodo.getIzq();
        }
        return nodo;
    }
    private NodoABB borrar1(NodoABB r, int x) {
    if (r == null) {
        return null; // Dato no encontrado
    }
    int compara = ((Comparable) r.getDato()).compareTo(x);
    if (compara > 0) {
        r.setIzq(borrar(r.getIzq(), x));
    } else if (compara < 0) {
        r.setDer(borrar(r.getDer(), x));
    } else {
        System.out.println("Encontro el dato:" + x);
        if (r.getIzq() != null && r.getDer() != null) {
            // Caso 2: Tomar el mayor de la rama izquierda
            NodoABB maxRamaIzquierda = buscarMaxRamaIzquierda(r.getIzq());
            r.setDato(maxRamaIzquierda.getDato());
            r.setIzq(borrar(r.getIzq(), maxRamaIzquierda.getDato()));
        } else {
            r = (r.getIzq() != null) ? r.getIzq() : r.getDer();
        }
    }
    return r;
}

private NodoABB buscarMaxRamaIzquierda(NodoABB nodo) {
    while (nodo.getDer() != null) {
        nodo = nodo.getDer();
    }
    return nodo;
}

    public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
