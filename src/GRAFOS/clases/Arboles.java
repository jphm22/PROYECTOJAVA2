package GRAFOS.clases;
/**
 * Clase Arboles para representar estructuras de datos de grafos,
 * especialmente para operaciones relacionadas con árboles.
 */
public class Arboles {
// Matriz de coeficientes para representar pesos en las aristas entre nodos
   private int mCoeficiente[][] = new int [51][51];
   // Matriz de adyacencia para representar la conexión entre nodos (ej., 0: no conectado, 1: conectado)
   private int mAdyacencia [][] = new int [51][51];
   // Coordenadas X para representar la posición de los nodos en un plano, si se requiere para visualización
   private int cordeX [] = new int [51];
   // Coordenadas Y para representar la posición de los nodos en un plano, similar a cordeX
   private int cordeY [] = new int [51];
   // Arreglo para almacenar identificadores o nombres de los nodos
   private int nombre [] = new int [51];
   // Arreglo para marcar nodos que ya han sido incluidos en el árbol
   private int enArbol [];
   
   /**
    * Constructor por defecto de la clase Arboles.
    * Inicializa las estructuras de datos necesarias para representar el grafo.
    */
   
   public Arboles(){
        
    }
    // Métodos getter y setter para acceder y modificar los atributos de la clase

    public int getmCoeficiente(int i, int j ) {
        return mCoeficiente[i][j];
    }

    public int getmAdyacencia(int i,int j) {
        return mAdyacencia[i][j];
    }

    public int getCordeX(int i) {
        return cordeX[i];
    }

    public int getCordeY(int i) {
        return cordeY[i];
    }

    public int getNombre(int i) {
        return nombre[i];
    }
    
    /**
     * Obtiene el estado de un nodo, indicando si ha sido incluido en el árbol.
     * @param i Índice del nodo.
     * @return Estado del nodo en el árbol.
     */
    
    public int getEnArbol(int i) {
        return enArbol[i];
    }

    public void setmCoeficiente(int i,int j ,int mCoeficiente) {
        this.mCoeficiente[i][j] = mCoeficiente;
    }

    public void setmAdyacencia(int i,int j ,int mAdyacencia) {
        this.mAdyacencia[i][j] = mAdyacencia;
    }

    public void setCordeX(int i,int cordeX) {
        this.cordeX[i] = cordeX;
    }

    public void setCordeY(int i, int cordeY) {
        this.cordeY[i] = cordeY;
    }

    public void setNombre(int i,int nombre) {
        this.nombre[i] = nombre;
    }

    public void setEnArbol(int i,int enArbol) {
        this.enArbol[i] = enArbol;
    }
    
        /**
     * Inicializa el arreglo enArbol con el tamaño especificado.
     * Este arreglo se utiliza para marcar los nodos que han sido incluidos en el árbol.
     * @param i Tamaño del arreglo enArbol.
     */
    
    public void crearEnArbol(int i){
       enArbol = new int [i]; 
    }  
    
}

