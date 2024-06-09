
package VISTA;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import torredehanoi.NodoTorreDeHanoi;
import torredehanoi.PilaTorreDeHanoi;

public class VentanaP extends javax.swing.JPanel {
    
    int ContNumMov=0;
    PilaTorreDeHanoi PilaTorreA;
    PilaTorreDeHanoi PilaTorreB;
    PilaTorreDeHanoi PilaTorreC;
    
    DefaultTableModel ModeloTablaTorreA,ModeloTablaTorreB,ModeloTablaTorreC;
    
    int Objetivo=0;
    double NumMinMov=0;
    boolean Stop=false;

  
    public VentanaP() {
        initComponents();
        
        ModeloTablaTorreA=(DefaultTableModel) TorreA.getModel();
        ModeloTablaTorreA.setRowCount(10);
        
        ModeloTablaTorreB=(DefaultTableModel) TorreB.getModel();
        ModeloTablaTorreB.setRowCount(10);
        
        ModeloTablaTorreC=(DefaultTableModel) TorreC.getModel();
        ModeloTablaTorreC.setRowCount(10);
        
        DefaultTableCellRenderer renderA=new DefaultTableCellRenderer();
        renderA.setHorizontalAlignment(SwingConstants.CENTER);
        TorreA.getColumnModel().getColumn(0).setCellRenderer(renderA);
        
        DefaultTableCellRenderer renderB=new DefaultTableCellRenderer();
        renderB.setHorizontalAlignment(SwingConstants.CENTER);
        TorreB.getColumnModel().getColumn(0).setCellRenderer(renderB);
        
        DefaultTableCellRenderer renderC=new DefaultTableCellRenderer();
        renderC.setHorizontalAlignment(SwingConstants.CENTER);
        TorreC.getColumnModel().getColumn(0).setCellRenderer(renderC);
    }
    
    private void Limpiar(){
    ContNumMov=0;
    NumMinMov=0;
    
    cbNumdisc.setSelectedItem(String.valueOf(Objetivo));
    
    }
    
    private void PresentarCantMov(){
    ContNumMov++;
    lblNumMov.setText(String.valueOf(ContNumMov));
    }
    
    private void Reiniciar(){
        try {
            
            if (!lblMinMov.getText().equals("")) {
                
                Limpiar();
                Iniciar();
                
            }
            
        } catch (Exception E) {
            System.out.println("ERROR"+E.getMessage());
        }
    
    }
    
    private void Iniciar(){
        
        try {
      PilaTorreA=new PilaTorreDeHanoi();
      PilaTorreB=new PilaTorreDeHanoi();
      PilaTorreC=new PilaTorreDeHanoi();
      
      Objetivo= Integer.parseInt(cbNumdisc.getSelectedItem().toString());
      
      NumMinMov=Math.pow(2, Objetivo)-1;
      
      lblNumMov.setText(String.valueOf(ContNumMov));
      lblMinMov.setText(String.valueOf(String.format("%.0f", NumMinMov)));
      
      
      for(int x=Objetivo;x>=1;x--){
      NodoTorreDeHanoi plataforma=new NodoTorreDeHanoi();
      String Disco="";
      for(int y=x;y>0;y--){
      Disco+="#";
      }
      
      plataforma.setDato(Disco);
      PilaTorreA.Push(plataforma);
      }
      
      PresentarTorreA();
      PresentarTorreB();
      PresentarTorreC();
            
        } catch (Exception E) {
            System.out.println("ERROR"+E.getMessage());
        }
    }
    
    private void PresentarTorreA(){
    ((DefaultTableModel)TorreA.getModel()).setRowCount(0);
    ModeloTablaTorreA.setRowCount(10);
    NodoTorreDeHanoi K;
    int RowDisco=(10-PilaTorreA.getContNodo());
    if (PilaTorreA.getContNodo()>0) {
            for(K=PilaTorreA.getCabeza();K.getAbajo()!=null;K=K.getAbajo()){
                String[] VectorNormal={K.getDato()};
                ModeloTablaTorreA.insertRow(RowDisco, VectorNormal);
                RowDisco++;
            }
            if (K.getAbajo()==null) {
                String[] VectorNormal={K.getDato()};
                ModeloTablaTorreA.insertRow(RowDisco, VectorNormal);
            } 
        }
        TorreA.setModel(ModeloTablaTorreA);
        ModeloTablaTorreA.setRowCount(10);  
    }
    
    private void PresentarTorreB(){
    ((DefaultTableModel)TorreB.getModel()).setRowCount(0);
    ModeloTablaTorreB.setRowCount(10);
    NodoTorreDeHanoi K;
    int RowDisco=(10-PilaTorreB.getContNodo());
        if (PilaTorreB.getContNodo()>0) {
            for(K=PilaTorreB.getCabeza();K.getAbajo()!=null;K=K.getAbajo()){
                String[] VectorNormal={K.getDato()};
                ModeloTablaTorreB.insertRow(RowDisco, VectorNormal);
                RowDisco++;
            }
            if (K.getAbajo()==null) {
                String[] VectorNormal={K.getDato()};
                ModeloTablaTorreB.insertRow(RowDisco, VectorNormal);
            } 
        }
        TorreB.setModel(ModeloTablaTorreB);
        ModeloTablaTorreB.setRowCount(10);  
    }
    
    private void PresentarTorreC(){
    ((DefaultTableModel)TorreC.getModel()).setRowCount(0);
    ModeloTablaTorreC.setRowCount(10);
    NodoTorreDeHanoi K;
    int RowDisco=(10-PilaTorreC.getContNodo());
        if (PilaTorreC.getContNodo()>0) {
            for(K=PilaTorreC.getCabeza();K.getAbajo()!=null;K=K.getAbajo()){
                String[] VectorNormal={K.getDato()};
                ModeloTablaTorreC.insertRow(RowDisco, VectorNormal);
                RowDisco++;
            }
            if (K.getAbajo()==null) {
                String[] VectorNormal={K.getDato()};
                ModeloTablaTorreC.insertRow(RowDisco, VectorNormal);
            } 
        }
        TorreC.setModel(ModeloTablaTorreC);
        ModeloTablaTorreC.setRowCount(10);  
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnC_B = new javax.swing.JButton();
        btnC_A = new javax.swing.JButton();
        btnA_C = new javax.swing.JButton();
        btnB_C = new javax.swing.JButton();
        btnB_A = new javax.swing.JButton();
        btnA_B = new javax.swing.JButton();
        cbNumdisc = new javax.swing.JComboBox<>();
        lblNumMov = new javax.swing.JLabel();
        lblMinMov = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnResolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TorreB = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TorreC = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TorreA = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 0));

        btnC_B.setText("B");
        btnC_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC_BActionPerformed(evt);
            }
        });

        btnC_A.setText("A");
        btnC_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC_AActionPerformed(evt);
            }
        });

        btnA_C.setText("C");
        btnA_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA_CActionPerformed(evt);
            }
        });

        btnB_C.setText("C");
        btnB_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB_CActionPerformed(evt);
            }
        });

        btnB_A.setText("A");
        btnB_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB_AActionPerformed(evt);
            }
        });

        btnA_B.setText("B");
        btnA_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA_BActionPerformed(evt);
            }
        });

        cbNumdisc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" }));

        lblNumMov.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNumMov.setForeground(new java.awt.Color(255, 102, 0));
        lblNumMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumMov.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMinMov.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMinMov.setForeground(new java.awt.Color(255, 102, 0));
        lblMinMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinMov.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Numero de discos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Numero mininmo de movimientos:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Numero de movimientos:");

        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnResolver.setText("RESOLVER");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        TorreB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TorreB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TorreB.setAutoscrolls(false);
        TorreB.setFocusable(false);
        TorreB.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(TorreB);
        if (TorreB.getColumnModel().getColumnCount() > 0) {
            TorreB.getColumnModel().getColumn(0).setResizable(false);
        }

        TorreC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TorreC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TorreC.setAutoscrolls(false);
        TorreC.setFocusable(false);
        TorreC.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(TorreC);
        if (TorreC.getColumnModel().getColumnCount() > 0) {
            TorreC.getColumnModel().getColumn(0).setResizable(false);
        }

        TorreA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TorreA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TorreA.setAutoscrolls(false);
        TorreA.setFocusable(false);
        TorreA.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(TorreA);
        if (TorreA.getColumnModel().getColumnCount() > 0) {
            TorreA.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnC_A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC_B, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumMov, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbNumdisc, 0, 0, Short.MAX_VALUE)
                                .addGap(245, 245, 245)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 247, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(340, 340, 340)
                            .addComponent(lblMinMov, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnA_B, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnA_C, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(72, 72, 72)
                                    .addComponent(btnB_A, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnB_C, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)))
                            .addGap(25, 25, 25))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC_A)
                    .addComponent(btnC_B)
                    .addComponent(btnA_C)
                    .addComponent(btnB_C)
                    .addComponent(btnA_B)
                    .addComponent(btnB_A))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(cbNumdisc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMinMov, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnIniciar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnReiniciar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResolver)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblNumMov, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MoverDeA_C(){
        try {
            if (PilaTorreA.getContNodo()>0) {
                NodoTorreDeHanoi Plataforma=new NodoTorreDeHanoi();
                Plataforma.setDato(PilaTorreA.Peek());
                if (PilaTorreC.getContNodo()>0) {
                    if (Plataforma.getDato().compareTo(PilaTorreC.Peek())>0) {
                        return;
                    }
                }
                PilaTorreA.Pop();
                PilaTorreC.Push(Plataforma);
                PresentarTorreA();
                PresentarTorreC();
                PresentarCantMov();
                
                if (PilaTorreC.getContNodo()==Objetivo&&ContNumMov==NumMinMov) {
                    JOptionPane.showMessageDialog(null, "Felicidades, haz alcanzado el objetivo de minimo de movimientos","Felicitaciones",JOptionPane.WARNING_MESSAGE);
                }
                
                else if (PilaTorreC.getContNodo()==Objetivo&&ContNumMov!=NumMinMov) {
                    JOptionPane.showMessageDialog(null, "Felicidades, lo haz resuelto","Felicitaciones",JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
        } catch (Exception E) {
            System.out.println("Error: "+E.getMessage());
        }
        
        
    
    }
    private void btnA_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA_CActionPerformed
        // TODO add your handling code here:
        MoverDeA_C();
    }//GEN-LAST:event_btnA_CActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
ContNumMov=0;
Iniciar();

      
      
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        Reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void MoverDeA_B(){
        try {
            if (PilaTorreA.getContNodo()>0) {
                
                NodoTorreDeHanoi Plataforma=new NodoTorreDeHanoi();
                
                Plataforma.setDato(PilaTorreA.Peek());
                
                if (PilaTorreB.getContNodo()>0) {
                    if (Plataforma.getDato().compareTo(PilaTorreB.Peek())>0) {
                        return;
                        
                    }
                    
                }
                PilaTorreA.Pop();
                PilaTorreB.Push(Plataforma);
                
                PresentarTorreA();
                PresentarTorreB();
                PresentarCantMov();
                
            }
            
        } catch (Exception E) {
            System.out.println("Error: "+E.getMessage());
        }
    }
    private void btnA_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA_BActionPerformed
        // TODO add your handling code here:
        MoverDeA_B();
        
    }//GEN-LAST:event_btnA_BActionPerformed

    private void MoverDeB_A(){
        try {
            if (PilaTorreB.getContNodo()>0) {
                
                NodoTorreDeHanoi Plataforma=new NodoTorreDeHanoi();
                
                Plataforma.setDato(PilaTorreB.Peek());
                
                if (PilaTorreA.getContNodo()>0) {
                    if (Plataforma.getDato().compareTo(PilaTorreA.Peek())>0) {
                        return;
                        
                    }
                    
                }
                PilaTorreB.Pop();
                PilaTorreA.Push(Plataforma);
                
                PresentarTorreB();
                PresentarTorreA();
                PresentarCantMov();
                
            }
            
        } catch (Exception E) {
            System.out.println("Error: "+E.getMessage());
        }
    
    }
    private void btnB_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB_AActionPerformed
        // TODO add your handling code here:
        MoverDeB_A();
    }//GEN-LAST:event_btnB_AActionPerformed

    
    private void MoverDeB_C(){
         try {
            if (PilaTorreB.getContNodo()>0) {
                NodoTorreDeHanoi Plataforma=new NodoTorreDeHanoi();
                Plataforma.setDato(PilaTorreB.Peek());
                if (PilaTorreC.getContNodo()>0) {
                    if (Plataforma.getDato().compareTo(PilaTorreC.Peek())>0) {
                        return;
                    }
                }
                PilaTorreB.Pop();
                PilaTorreC.Push(Plataforma);
                PresentarTorreB();
                PresentarTorreC();
                PresentarCantMov();
                
                if (PilaTorreC.getContNodo()==Objetivo&&ContNumMov==NumMinMov) {
                    JOptionPane.showMessageDialog(null, "Felicidades, haz alcanzado el objetivo de minimo de movimientos","Felicitaciones",JOptionPane.WARNING_MESSAGE);
                }
                
                else if (PilaTorreC.getContNodo()==Objetivo&&ContNumMov!=NumMinMov) {
                    JOptionPane.showMessageDialog(null, "Felicidades, lo haz resuelto","Felicitaciones",JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
        } catch (Exception E) {
            System.out.println("Error: "+E.getMessage());
        }
        
    }
    private void btnB_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB_CActionPerformed
        // TODO add your handling code here:
        MoverDeB_C();
    }//GEN-LAST:event_btnB_CActionPerformed

    private void MoverDeC_A(){
        try {
            if (PilaTorreC.getContNodo()>0) {
                
                NodoTorreDeHanoi Plataforma=new NodoTorreDeHanoi();
                
                Plataforma.setDato(PilaTorreC.Peek());
                
                if (PilaTorreA.getContNodo()>0) {
                    if (Plataforma.getDato().compareTo(PilaTorreA.Peek())>0) {
                        return;
                        
                    }
                    
                }
                PilaTorreC.Pop();
                PilaTorreA.Push(Plataforma);
                
                PresentarTorreA();
                PresentarTorreC();
                PresentarCantMov();
                
            }
            
        } catch (Exception E) {
            System.out.println("Error: "+E.getMessage());
        }
    }
    private void btnC_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC_AActionPerformed
        // TODO add your handling code here:
        MoverDeC_A();
        
    }//GEN-LAST:event_btnC_AActionPerformed

    private void MoverDeC_B(){
        try {
            if (PilaTorreC.getContNodo()>0) {
                NodoTorreDeHanoi Plataforma=new NodoTorreDeHanoi();
                Plataforma.setDato(PilaTorreC.Peek());
                if (PilaTorreB.getContNodo()>0) {
                    if (Plataforma.getDato().compareTo(PilaTorreB.Peek())>0) {
                        return;
                    }
                }
                PilaTorreC.Pop();
                PilaTorreB.Push(Plataforma);
                PresentarTorreB();
                PresentarTorreC();
                PresentarCantMov();
                
//                if (PilaTorreC.getContNodo()==Objetivo&&ContNumMov==NumMinMov) {
//                    JOptionPane.showMessageDialog(null, "Felicidades, haz alcanzado el objetivo de minimo de movimientos","Felicitaciones",JOptionPane.WARNING_MESSAGE);
//                }
//                
//                else if (PilaTorreC.getContNodo()==Objetivo&&ContNumMov!=NumMinMov) {
//                    JOptionPane.showMessageDialog(null, "Felicidades, lo haz resuelto","Felicitaciones",JOptionPane.INFORMATION_MESSAGE);
//                    
//                }
            }
        } catch (Exception E) {
            System.out.println("Error: "+E.getMessage());
        }
    
    }
    private void btnC_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC_BActionPerformed
        // TODO add your handling code here:
        MoverDeC_B();
    }//GEN-LAST:event_btnC_BActionPerformed

    boolean stop=false;
    
    private void MoverPlataforma(PilaTorreDeHanoi Origen, PilaTorreDeHanoi Destino){
        if (stop==false) {
            NodoTorreDeHanoi Plataforma=new NodoTorreDeHanoi();
            Plataforma.setDato(Origen.Peek());
            Origen.Pop();
            Destino.Push(Plataforma);
            
            PresentarTorreA();
            PresentarTorreB();
            PresentarTorreC();
            PresentarCantMov();
            
            JOptionPane pane=new JOptionPane("Paso # "+lblNumMov.getText()+"\n\n¿continuar?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
            JDialog dialog=pane.createDialog("Numero de pasos");
            
            dialog.setLocation(600,400);
            dialog.setVisible(true);
            
            int opt=(int)pane.getValue();
            
            if (opt==JOptionPane.NO_OPTION) {
                stop=true;
                
            }
        }
    
    }
    
    private void ResolverHanoiRecursivo(int n,PilaTorreDeHanoi Origen, PilaTorreDeHanoi Auxiliar, PilaTorreDeHanoi Destino){
    
        if (n==1) {
            MoverPlataforma(Origen, Destino);
            
        }
        else{
            ResolverHanoiRecursivo(n-1, Origen, Destino, Auxiliar);
            MoverPlataforma(Origen, Destino);
            
            ResolverHanoiRecursivo(n-1, Auxiliar, Origen, Destino);
        }
    }
    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        // TODO add your handling code here:
        if (!lblMinMov.getText().equals("")&&PilaTorreC.getContNodo()!=Objetivo) {
            Reiniciar();
            stop=false;
            ResolverHanoiRecursivo(Objetivo, PilaTorreA, PilaTorreB, PilaTorreC);
            
        }
    }//GEN-LAST:event_btnResolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TorreA;
    private javax.swing.JTable TorreB;
    private javax.swing.JTable TorreC;
    private javax.swing.JButton btnA_B;
    private javax.swing.JButton btnA_C;
    private javax.swing.JButton btnB_A;
    private javax.swing.JButton btnB_C;
    private javax.swing.JButton btnC_A;
    private javax.swing.JButton btnC_B;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JComboBox<String> cbNumdisc;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMinMov;
    private javax.swing.JLabel lblNumMov;
    // End of variables declaration//GEN-END:variables
}
