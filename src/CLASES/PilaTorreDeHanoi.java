
package torredehanoi;

public class PilaTorreDeHanoi {
    private int ContNodo=0;
    private NodoTorreDeHanoi Cabeza;

    public int getContNodo() {
        return ContNodo;
    }

    public NodoTorreDeHanoi getCabeza() {
        return Cabeza;
    }
    
    public void Push(NodoTorreDeHanoi N){
    ContNodo++;
        if (Cabeza==null) {
            Cabeza=N; 
        }
        else{
            N.setAbajo(Cabeza);
            Cabeza.setArriba(N);
            Cabeza=N;
        }      
    }
    
    public void Pop(){
        if (ContNodo>0) {
            ContNodo--;
            Cabeza=Cabeza.getAbajo();
            
        }
    
    }
    
    public String Peek(){
    return Cabeza.getDato();
    }

}
