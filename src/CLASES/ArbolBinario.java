
package CLASES;

import javax.swing.table.DefaultTableModel;

public class ArbolBinario {
    NoditoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

 // Método privado para insertar un nodo recursivamente
    public void insertar(int codigo, int numeroDias, int propina, int precioHabitacion, int total) {
        raiz = insertarRecursivo(raiz, codigo, numeroDias, propina, precioHabitacion,total);
    }

    private NoditoArbol insertarRecursivo(NoditoArbol nodo, int codigo, int numeroDias, int propina, int precioHabitacion,int total) {
        if (nodo == null) {
            return new NoditoArbol(codigo, numeroDias, propina, precioHabitacion,total);
        }

        // Comparar basándose en el campo 'total' para determinar la posición del nuevo nodo
        if (codigo < nodo.total) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, codigo, numeroDias, propina, precioHabitacion,total);
        } else if (codigo > nodo.total) {
            nodo.derecha = insertarRecursivo(nodo.derecha, codigo, numeroDias, propina, precioHabitacion,total);
        }

        return nodo;
    }

    // Métodos para recorrer el árbol
    public void preorden() {
        preordenRecursivo(raiz);
    }

    private void preordenRecursivo(NoditoArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.total + " ");
            preordenRecursivo(nodo.izquierda);
            preordenRecursivo(nodo.derecha);
        }
    }

    public void inorden() {
        inordenRecursivo(raiz);
    }

    private void inordenRecursivo(NoditoArbol nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.izquierda);
            System.out.print(nodo.total + " ");
            inordenRecursivo(nodo.derecha);
        }
    }

    public void postorden() {
        postordenRecursivo(raiz);
    }

    private void postordenRecursivo(NoditoArbol nodo) {
        if (nodo != null) {
            postordenRecursivo(nodo.izquierda);
            postordenRecursivo(nodo.derecha);
            System.out.print(nodo.total + " ");
        }
    }
    
public void preordenActualizarTabla(DefaultTableModel modeloTabla) {
    preordenActualizarTabla(raiz, modeloTabla);
}

public void postordenActualizarTabla(DefaultTableModel modeloTabla) {
    postordenActualizarTabla(raiz, modeloTabla);
}

public void inordenActualizarTabla(DefaultTableModel modeloTabla) {
    inordenActualizarTabla(raiz, modeloTabla);
}
    public void preordenActualizarTabla(NoditoArbol nodo, DefaultTableModel modeloTabla) {

    if (nodo != null) {
        // Agregar los datos a la tabla antes de realizar el recorrido
        Object[] fila = {nodo.codigo, nodo.numeroDias, nodo.propina, nodo.precioHabitacion, nodo.total};
        modeloTabla.addRow(fila);

        // Realizar recorrido preorden en el árbol binario
        preordenActualizarTabla(nodo.izquierda, modeloTabla);
        preordenActualizarTabla(nodo.derecha, modeloTabla);
        
    }
}


    public void postordenActualizarTabla(NoditoArbol nodo, DefaultTableModel modeloTabla) {

    if (nodo != null) {
        // Realizar recorrido postorden en el árbol binario
        postordenActualizarTabla(nodo.izquierda, modeloTabla);
        postordenActualizarTabla(nodo.derecha, modeloTabla);

        // Agregar los datos a la tabla después de realizar el recorrido
        Object[] fila = {nodo.codigo, nodo.numeroDias, nodo.propina, nodo.precioHabitacion, nodo.total};
        modeloTabla.addRow(fila);
    }
}


    public void inordenActualizarTabla(NoditoArbol nodo, DefaultTableModel modeloTabla) {
     
    if (nodo != null) {
        // Realizar recorrido inorden en el árbol binario
        inordenActualizarTabla(nodo.izquierda, modeloTabla);

        // Agregar los datos a la tabla en medio del recorrido
        Object[] fila = {nodo.codigo, nodo.numeroDias, nodo.propina, nodo.precioHabitacion, nodo.total};
        modeloTabla.addRow(fila);

        inordenActualizarTabla(nodo.derecha, modeloTabla);
    }
}
public String obtenerFormacionArbol() {
        StringBuilder sb = new StringBuilder();
        obtenerFormacionArbol(raiz, sb, 0);
        return sb.toString();
    }

    private void obtenerFormacionArbol(NoditoArbol nodo, StringBuilder sb, int nivel) {
        if (nodo != null) {
            // Agregar espacios para representar el nivel
            for (int i = 0; i < nivel; i++) {
                sb.append("  ");
            }

            // Agregar los datos del nodo al StringBuilder
            sb.append("Código: ").append(nodo.codigo)
              .append(", Días: ").append(nodo.numeroDias)
              .append(", Propina: ").append(nodo.propina)
              .append(", Precio Habitación: ").append(nodo.precioHabitacion)
              .append(", Total: ").append(nodo.total).append("\n");

            // Llamar recursivamente para los hijos izquierdo y derecho
            obtenerFormacionArbol(nodo.izquierda, sb, nivel + 1);
            obtenerFormacionArbol(nodo.derecha, sb, nivel + 1);
        }
    }
public void eliminarPorIzquierda() {
    if (raiz != null) {
        raiz = eliminarPorIzquierda(raiz);
    }
}

private NoditoArbol eliminarPorIzquierda(NoditoArbol nodo) {
    if (nodo.izquierda == null) {
        return nodo.derecha;
    }
    nodo.izquierda = eliminarPorIzquierda(nodo.izquierda);
    return nodo;
}

public void eliminarPorDerecha() {
    if (raiz != null) {
        raiz = eliminarPorDerecha(raiz);
    }
}

private NoditoArbol eliminarPorDerecha(NoditoArbol nodo) {
    if (nodo.derecha == null) {
        return nodo.izquierda;
    }
    nodo.derecha = eliminarPorDerecha(nodo.derecha);
    return nodo;
}


}

    
