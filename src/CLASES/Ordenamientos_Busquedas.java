
package CLASES;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Ordenamientos_Busquedas {
    
    private ArrayList<Huesped> listaH;
    private ArrayList<Empleado> listaE;
    
    public Ordenamientos_Busquedas() {
        listaH=new ArrayList<>();
        listaE=new ArrayList<>();

    }
    public ArrayList<Huesped> getListaH() {
        return listaH;
    }   
    public ArrayList<Empleado> getListaE() {
        return listaE;        
    }
    //Busqueda Secuencial Huesped
    public Huesped busquedaS(int dni){
        Huesped refH=null;
        
        boolean estado=false;
        int i=0;
        
        while(i<listaH.size() && estado==false){
            if(listaH.get(i).getDni()==dni){
                estado =true;
                refH=listaH.get(i);
            }else{
                i++;
            }
        }        
        return refH;
    }
    
  
    //Ingresar Huesped
    public void ingresarHuesped(Huesped refC){
        Huesped objC=busquedaS(refC.getDni());
        
        if(objC==null){
            listaH.add(refC);
            JOptionPane.showMessageDialog(null, "El Huesped ha registrado");
        }else{
            JOptionPane.showMessageDialog(null, "El Huesped ya esta en el iBED");
        }        
    }
        // Busqueda Secuencial para Empleado
    public Empleado busquedaSEmpleado(int cod) {
        Empleado refE = null;
        
        boolean estado = false;
        int i = 0;
        
        while (i < listaE.size() && !estado==false) {
            if (listaE.get(i).getCodigo() == cod) {
                estado = true;
                refE = listaE.get(i);
            } else {
                i++;
            }
        }        
        return refE;
    }
    // Ingresar Empleado
    public void ingresarEmpleado(Empleado refE) {
        Empleado objE = busquedaSEmpleado(refE.getCodigo());
        
        if (objE == null) {
            listaE.add(refE);
            JOptionPane.showMessageDialog(null, "El Empleado ha sido registrado");
        } else {
            JOptionPane.showMessageDialog(null, "El Empleado ya está en el iBED");
        }        
    }
    
    //Ordenamiento por Insercion para Huesped
        public void ordenarHuespedAscPorDNI(){
        int i, j;
        Huesped aux;

        for (i = 1; i < listaH.size(); i++) {
             aux = listaH.get(i);
             j = i - 1;

             while (j >= 0 && listaH.get(j).getDni() > aux.getDni()) {
                listaH.set(j + 1, listaH.get(j));
                j--;
            } 

            listaH.set(j + 1, aux);
        }   
    }
    // Ordenamiento por Quick sort para Huesped
        public void ordenarHuespedAscPorEdad(){
        quicksortEdad(listaH, 0, listaH.size() - 1);
        }

        private void quicksortEdad(ArrayList<Huesped> lista, int inicio, int fin) {
        if (inicio < fin) {
        int indiceParticion = particionEdad(lista, inicio, fin);
        quicksortEdad(lista, inicio, indiceParticion - 1);
        quicksortEdad(lista, indiceParticion + 1, fin);
            }
        }

        private int particionEdad(ArrayList<Huesped> lista, int inicio, int fin) {
         Huesped pivote = lista.get(fin);
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
        if (lista.get(j).getEdad() <= pivote.getEdad()) {
            i++;
            intercambiar(lista, i, j);
        }
        }

        intercambiar(lista, i + 1, fin);
        return i + 1;
        }

        private void intercambiar(ArrayList<Huesped> lista, int i, int j) {
        Huesped temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
    // Ordenamiento por Seleccion para Huesped
        
    public void ordenarPorApellidos(){
        int i,j,minimo;
        Huesped aux;
        
        for(i=0; i<listaH.size()-1; i++){
            minimo=i;
            for(j=i+1; j<listaH.size(); j++){
                if(listaH.get(j).getApellido().compareToIgnoreCase(listaH.get(minimo).getApellido())<0){
                    minimo = j;
                  }
                }
                
                   aux=listaH.get(i);
                   listaH.set(i, listaH.get(minimo));
                   listaH.set(minimo, aux);
            
        }
    }
    //Ordenamiento Burbuja para Huesped
    public void ordenarPorNombres(){
        int i,j;
        Huesped aux;
        
        for(i=0;i<listaH.size()-1;i++){
            for(j=i+1;j<listaH.size();j++){
                if(listaH.get(i).getNombre().compareToIgnoreCase(listaH.get(j).getNombre())>0){
                    aux=listaH.get(i);
                    listaH.set(i, listaH.get(j));
                    listaH.set(j, aux);
                }
            }
        }
    }
    //Busqueda Binaria para Empleado
    public Empleado busquedaB(int cod){
        Empleado refE=null;
        
        int izq, der,cen;
        boolean estado=false;
        
        izq=0;
        der=listaE.size()-1;
        
        while(izq<=der  && estado==false){
            cen=(izq+der)/2;
            if(cod==listaE.get(cen).getCodigo()){
                refE=listaE.get(cen);
                estado=true;
            }else if(cod<listaE.get(cen).getCodigo()){
                der=cen-1;
            }else{
                izq=cen+1;
            }
        }
        return refE;
    }
    // Ordenamiento Shell Sort para Empleado
    
    public void ordenarEmpleadoPorCodigo() {
    int n = listaE.size();
    int brecha = n / 2; // Inicializamos la brecha

    while (brecha > 0) {
        for (int i = brecha; i < n; i++) {
            Empleado temp = listaE.get(i);
            int j = i;

            while (j >= brecha && listaE.get(j - brecha).getCodigo() > temp.getCodigo()) {
                listaE.set(j, listaE.get(j - brecha));
                j -= brecha;
            }

            listaE.set(j, temp);
        }

        brecha /= 2; // Reducimos la brecha
    }
}
    
    //Ordenamiento CODIGO
    public void ordenarEmpleadoPorCODIGO(){
        int i,j;
        Empleado aux;
        
        for(i=0;i<listaE.size()-1;i++){
            for(j=i+1;j<listaE.size();j++){
                if(listaE.get(i).getCodigo()>listaE.get(j).getCodigo()){
                    aux=listaE.get(i);
                    listaE.set(i, listaE.get(j));
                    listaE.set(j, aux);
                }
            }
        }
    }


}
