
package VISTA;

import java.util.Arrays;

public class VentanaPlegamiento extends javax.swing.JFrame {

    // Lógica de Hash
    private String[] arreglo; // Array que actuará como la tabla de hash
    private int tamaño, contador; // Variables para gestionar la tabla
    private final int capacidadMaxima = 8;  // Establece la capacidad máxima deseada
    
    public VentanaPlegamiento() {
        initComponents();
               
       // Inicializar la lógica de Hash
        tamaño = 60; // Tamaño de la tabla
        arreglo = new String[tamaño];
        Arrays.fill(arreglo, "vacio"); // Llena el array con "vacio" para indicar posiciones vacías
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnPlegamiento = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Edad");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnPlegamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlegamiento.setText("Plegamiento");
        btnPlegamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlegamientoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Teléfono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtTelefono))
                        .addGap(38, 38, 38)
                        .addComponent(btnPlegamiento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlegamiento))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlegamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlegamientoActionPerformed
        
    // Lógica de Hash
    String edadInput = txtEdad.getText();
    String nombre = txtNombre.getText();
    String telefono = txtTelefono.getText();
    
    // Verificar si la tabla está llena  
    if (contador >= capacidadMaxima) {
        txtArea.append("La tabla está llena. No se pueden agregar más elementos.\n");
        return;
    }

    String[] nuevosEdades = edadInput.split(",");

    // Aplicar la función de Hash
    funcionHash(nuevosEdades, nombre, telefono, arreglo);
    contador++;  // Incrementar el contador de elementos

    // Mostrar el resultado en el txttArea
    mostrar();
        
    }//GEN-LAST:event_btnPlegamientoActionPerformed

    /**
     * @param args the command line arguments
     */
    
   public void funcionHash(String[] cadenaArreglo, String nombre, String telefono, String[] arreglo) {
        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            String edad = cadenaArreglo[i].trim(); // Obtiene un elemento y elimina espacios en blanco
            int indiceArreglo = plegamiento(edad); // Utilizar el Plegamiento

            // Tratando las Colisiones
            while (!arreglo[indiceArreglo].equals("vacio")) { // Mientras el índice actual en el arreglo no esta vacio
                

                // Buscar el siguiente índice disponible
                indiceArreglo++;
                txtArea.append("Cambiando al índice " + indiceArreglo + "\n"); // Se impprime el indice cambiado
                indiceArreglo %= tamaño; // Asegurarse de que el índice esté dentro del rango válido
                
            }
            arreglo[indiceArreglo] = edad + " - " + nombre + " - " + telefono; // Combina elemento, nombre y telefono
        }
    }
   
       private int plegamiento(String Edad) {
    // Obtener el valor numérico de textElemento
    int edad = Integer.parseInt(Edad);

    // Dividir el valor de textElemento en dos partes
    int parte1 = edad / 10;
    int parte2 = edad % 10;

    // Calcular un índice preliminar sumando las dos partes
    int indicePreliminar = parte1 + parte2;

    // Asegurar de que el índice preliminar sea positivo
    if (indicePreliminar < 0) {
        indicePreliminar += tamaño;
    }

    // Calcular el índice final
    return indicePreliminar % tamaño;     


    }

    // Método para mostrar la tabla
    public void mostrar() {
    txtArea.setText(""); // Limpiar el JTextArea antes de mostrar nuevo contenido
    txtArea.append("Índice\tEdad\tNombre\tTeléfono\n");

    for (int i = 0; i < tamaño; i++) {
        if (arreglo[i].equals("vacio")) {
            txtArea.append("Índice " + i + ":\tVacío\n");
        } else {
            String[] partes = arreglo[i].split(" - ");
            txtArea.append("Índice " + i + ":\t" + partes[0] + "\t" + partes[1] + "\t" + partes[2] + "\n");
        }
    }

    txtArea.append("\nNúmero actual de elementos: " + contador + " de " + capacidadMaxima + "\n");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlegamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}