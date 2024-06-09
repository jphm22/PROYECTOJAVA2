package GRAFOS.clases;
import GRAFOS.clases.Arboles;
import GRAFOS.clases.Nodo;
import GRAFOS.clases.Pintar;
import static GRAFOS.clases.VentanaPrincipal.jPanel1;
import static GRAFOS.clases.VentanaPrincipal.R_repaint;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Algoritmo_Dijkstra {
    
   private Arboles arboles; // Estructura que contiene el grafo sobre el cual se aplicará Dijkstra
   private int subTope;
   private Nodo auxi=null; // Nodo auxiliar para el proceso
   private int auxAumulado; // Acumulador auxiliar para comparaciones
   private int subAcomulado;
   private Nodo nodo[]; // Arreglo de nodos del grafo
   private int tope; // Número total de nodos en el grafo
   private int permanente; // Nodo permanente actual en el algoritmo de Dijkstra
   private int nodoFin; // Nodo objetivo o final
   
   // Constructor de la clase
   public Algoritmo_Dijkstra (Arboles arboles, int tope,int permanente, int nodoFin){
        this.arboles = arboles;        
        this.tope = tope;
        this.nodo= new Nodo[tope]; // Inicializa el arreglo de nodos según el número de nodos del grafo
        this.permanente = permanente; // Nodo de inicio para el algoritmo
        this.nodoFin = nodoFin; // Nodo objetivo o final
    }
   // Método para obtener el acumulado final, es decir, la distancia mínima al nodo objetivo
    public int getAcumulado(){
        return nodo[nodoFin].getAcumulado(); 
    }
    // Método principal que implementa el algoritmo de Dijkstra    
    public void dijkstra(){ 
        // Inicialización de nodos
         for (int i = 0; i < tope; i++)  // creamos el vector nodo del tamaño de tope el cual tiene el numero de nodo pintados 
                    nodo[i]= new Nodo(); 
        // Verifica si el nodo permanente es diferente del nodo final
        if(permanente != nodoFin){
            // Refresca la visualización del grafo
             jPanel1.paint(jPanel1.getGraphics());
             R_repaint(tope, arboles);   
             Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(permanente), arboles.getCordeY(permanente), null,Color.GREEN); // pinta de color GREEN los nodos
            
        
            nodo[permanente].setVisitado(true);        
            nodo[permanente].setNombre(permanente);       
            
            do{            
              subAcomulado=0;
              auxAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, supuestamente  nunca sera mayor 
              nodo[permanente].setEtiqueta(true); 
              for (int j = 0; j < tope; j++) {
                  if(arboles.getmAdyacencia(j, permanente)==1){
                        subAcomulado= nodo[permanente].getAcumulado()+arboles.getmCoeficiente(j, permanente);                                 
                        if(subAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado()==true && nodo[j].isEtiqueta()== false){
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]);
                        }
                        else if( nodo[j].isVisitado()==false){
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]); 
                       }
                 }
              }
              for (int i = 0; i <tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como permanente 
                if(nodo[i].isVisitado()== true && nodo[i].isEtiqueta()== false){
                   if(nodo[i].getAcumulado()<=auxAumulado){
                       permanente= nodo[i].getNombre();
                       auxAumulado= nodo[i].getAcumulado();
                   }
                }               
             }
            subTope++;                
          }while(subTope<tope+1);          
          auxi= nodo[nodoFin]; 
           if(auxi.getPredecesor() == null )
             JOptionPane.showMessageDialog(null,"No se Pudo LLegar Al Nodo "+nodoFin);          
          while(auxi.getPredecesor() != null){           
              Pintar.pintarCamino(jPanel1.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), arboles.getCordeX(auxi.getPredecesor().getNombre()), arboles.getCordeY(auxi.getPredecesor().getNombre()),Color.GREEN);
              Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), null,Color.GREEN);
             auxi=auxi.getPredecesor();              
          }  
         Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null,Color.GREEN);     
       }
       else Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null,Color.GREEN);    
    }
    
    
 
}
