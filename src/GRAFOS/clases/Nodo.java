package GRAFOS.clases;
/**
   Clase Nodo utilizada para representar nodos en una estructura de grafo.
   Cada nodo tiene un identificador único, un estado de visitado, una etiqueta,
   un valor acumulado que representa distancias, y un predecesor
   sera utilizado en el algoritmos de búsqueda del camino mas corto caminos.
 
 */
public class Nodo {    
   
   // Identificador del nodo
   private int nombre;
   
   // Indica si el nodo ha sido visitado en un recorrido
   private boolean visitado;
   
   // Una etiqueta booleana para propósitos generales (su uso específico puede variar)
   private boolean etiqueta;
   
   // Acumulador, por ejemplo, para mantener la distancia desde el nodo origen en caminos más cortos
   private int acumulado;
   
   // Referencia al nodo predecesor en un camino
   private Nodo Predecesor;
   
   public Nodo(){
       this.nombre =-1;// Valor predeterminado que indica que no está asignado
       this.visitado = false;
       this.etiqueta = false;
       this.Predecesor  = null;
       this.acumulado =0;       

   }
// Métodos getter para acceder a los atributos del nodo
// Métodos setter para modificar los atributos del nodo
   
     public int getNombre() {
        return nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public Nodo getPredecesor() {
        return Predecesor;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setAcumulado(int acomulado) {
        this.acumulado = acomulado;
    }

    public void setPredecesor(Nodo Predecesor) {
        this.Predecesor = Predecesor;
    }

    
}
