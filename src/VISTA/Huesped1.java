package VISTA;


import CLASES.Huesped;
import CLASES.Ordenamientos_Busquedas;
import java.awt.Component;
import javax.swing.JOptionPane;

public class Huesped1 extends javax.swing.JPanel {
   
    Ordenamientos_Busquedas refH;
       
    public Huesped1() {
        initComponents();
        refH=new Ordenamientos_Busquedas();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FONDO = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHUESPED = new javax.swing.JTable();
        btnGuardarH = new javax.swing.JToggleButton();
        btnApellidoH = new javax.swing.JToggleButton();
        btnBusquedaS = new javax.swing.JToggleButton();
        btnNombreH = new javax.swing.JToggleButton();
        btnEdadH = new javax.swing.JToggleButton();
        btnDNIH = new javax.swing.JToggleButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(802, 540));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1052, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-cliente-96.png"))); // NOI18N
        jLabel1.setText("INFORMACION DEL HUESPED");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        FONDO.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("APELLIDO");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("EDAD");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("DNI");

        javax.swing.GroupLayout FONDOLayout = new javax.swing.GroupLayout(FONDO);
        FONDO.setLayout(FONDOLayout);
        FONDOLayout.setHorizontalGroup(
            FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FONDOLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FONDOLayout.setVerticalGroup(
            FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FONDOLayout.createSequentialGroup()
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FONDOLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3))
                    .addGroup(FONDOLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FONDOLayout.createSequentialGroup()
                                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FONDOLayout.createSequentialGroup()
                                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tablaHUESPED.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "EDAD"
            }
        ));
        jScrollPane2.setViewportView(tablaHUESPED);

        btnGuardarH.setBackground(new java.awt.Color(100, 149, 237));
        btnGuardarH.setText("GUARDAR");
        btnGuardarH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHActionPerformed(evt);
            }
        });

        btnApellidoH.setBackground(new java.awt.Color(0, 206, 209));
        btnApellidoH.setText("Ord. Seleccion por Apellido ");
        btnApellidoH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApellidoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApellidoHActionPerformed(evt);
            }
        });

        btnBusquedaS.setBackground(new java.awt.Color(189, 183, 107));
        btnBusquedaS.setText("Busq. Secuencial por DNI");
        btnBusquedaS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusquedaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaSActionPerformed(evt);
            }
        });

        btnNombreH.setBackground(new java.awt.Color(0, 206, 209));
        btnNombreH.setText("Ord. Burbuja por Nombre");
        btnNombreH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNombreH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreHActionPerformed(evt);
            }
        });

        btnEdadH.setBackground(new java.awt.Color(0, 206, 209));
        btnEdadH.setText("Ord. Quick sort por Edad");
        btnEdadH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdadH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdadHActionPerformed(evt);
            }
        });

        btnDNIH.setBackground(new java.awt.Color(0, 206, 209));
        btnDNIH.setText("Ord. Inserción por DNI");
        btnDNIH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDNIH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDNIHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardarH, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(btnBusquedaS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNombreH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnApellidoH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdadH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDNIH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FONDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FONDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardarH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBusquedaS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnNombreH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnApellidoH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdadH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDNIH))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(311, 311, 311))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 private void listarHuesped(){
        for(int i=0; i<refH.getListaH().size();i++){
            tablaHUESPED.setValueAt(refH.getListaH().get(i).getDni(), i, 0);
            tablaHUESPED.setValueAt(refH.getListaH().get(i).getNombre(), i, 1);
            tablaHUESPED.setValueAt(refH.getListaH().get(i).getApellido(), i, 2);
            tablaHUESPED.setValueAt(refH.getListaH().get(i).getEdad(), i, 3); 
        }
    }
 
    private void btnGuardarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHActionPerformed
        int dni=Integer.parseInt(txtDni.getText());
        String nomb=txtNombre.getText();
        String Apell=txtApellido.getText();
        int edad=Integer.parseInt(txtEdad.getText());
        
        Huesped refC=new Huesped(nomb, Apell,dni, edad);
        refH.ingresarHuesped(refC);
        listarHuesped();
        
        //Limpiamos controles
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
    }//GEN-LAST:event_btnGuardarHActionPerformed

    private void btnApellidoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApellidoHActionPerformed
        refH.ordenarPorApellidos();
        listarHuesped();

    }//GEN-LAST:event_btnApellidoHActionPerformed

    private void btnBusquedaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaSActionPerformed
        int DniBusq;
        
        DniBusq=Integer.parseInt(JOptionPane.showInputDialog("Ingrese DNI a buscar :"));
        
        Huesped refC=refH.busquedaS(DniBusq);
        
        if(refC!=null){
            Component rootPane = null;
            JOptionPane.showMessageDialog(rootPane, refC.getNombre() + " "+
                    refC.getApellido());
        }else{
            Component rootPane = null;
            JOptionPane.showMessageDialog(rootPane, "NO ESTA REGISTRADO");
        }
        
    }//GEN-LAST:event_btnBusquedaSActionPerformed

    private void btnNombreHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreHActionPerformed
        refH.ordenarPorNombres();
        listarHuesped();   
    }//GEN-LAST:event_btnNombreHActionPerformed

    private void btnEdadHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdadHActionPerformed
        refH.ordenarHuespedAscPorEdad();
        listarHuesped(); 
    }//GEN-LAST:event_btnEdadHActionPerformed

    private void btnDNIHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDNIHActionPerformed
        refH.ordenarHuespedAscPorDNI();
        listarHuesped(); 
    }//GEN-LAST:event_btnDNIHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FONDO;
    private javax.swing.JToggleButton btnApellidoH;
    private javax.swing.JToggleButton btnBusquedaS;
    private javax.swing.JToggleButton btnDNIH;
    private javax.swing.JToggleButton btnEdadH;
    private javax.swing.JToggleButton btnGuardarH;
    private javax.swing.JToggleButton btnNombreH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaHUESPED;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    
}
