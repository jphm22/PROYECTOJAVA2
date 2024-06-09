package VISTA;

import CLASES.Habitacion;
import CLASES.ListaColas;
import CLASES.ListaEnlazada;
import CLASES.ListaPila;
import CLASES.Nodo;
import CLASES.NodoCola;
import CLASES.NodoPila;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Habitacion1 extends javax.swing.JPanel {
    
    public static List<Habitacion> lista=new ArrayList<>();
    
     ListaPila listaPila = new ListaPila(10);
     private void actualizarTabla2() {
        // Código para actualizar la tabla con los datos de la lista
        // Utiliza DefaultTableModel para manejar los datos de la tabla
        DefaultTableModel model = (DefaultTableModel) TablaHABITACIONES.getModel();
        model.setRowCount(0); // Limpiar la tabla

        // Recorrer la lista y agregar filas a la tabla
        NodoPila current = listaPila.getCima();
        while (current != null) {
            Object dato = current.getDato();
        if (dato instanceof Habitacion) {
            Habitacion habitacion = (Habitacion) dato;
            Object[] row = {habitacion.getIdhabitacion(), habitacion.getNumero(), habitacion.getPiso(),
                            habitacion.getPrecio_diario(), habitacion.getTipo_habitacion()};
            model.addRow(row);
        } else {
            // Manejo de error o log
            System.err.println("Error: El dato no es una instancia de Habitacion");
        }
        current = current.getSig();
     }
    }  
    
    ListaColas listaCola = new ListaColas(); // Asegúrate de que la clase se llama ListaCola o como la hayas llamado
        private void actualizarTabla1() {
        // Código para actualizar la tabla con los datos de la lista
        // Utiliza DefaultTableModel para manejar los datos de la tabla
        DefaultTableModel model = (DefaultTableModel) TablaHABITACIONES.getModel();
        model.setRowCount(0); // Limpiar la tabla

        // Recorrer la lista y agregar filas a la tabla
        NodoCola current = listaCola.getInicio();
        while (current != null) {
            Object dato = current.getDato();
        if (dato instanceof Habitacion) {
            Habitacion habitacion = (Habitacion) dato;
            Object[] row = {habitacion.getIdhabitacion(), habitacion.getNumero(), habitacion.getPiso(),
                            habitacion.getPrecio_diario(), habitacion.getTipo_habitacion()};
            model.addRow(row);
        } else {
            // Manejo de error o log
            System.err.println("Error: El dato no es una instancia de Habitacion");
        }
        current = current.getSig();
     }
    }
        private DefaultTableModel dtm;

    private ListaEnlazada listaHabitaciones = new ListaEnlazada();
    private void actualizarTabla() {
    // Código para actualizar la tabla con los datos de la lista
    // Utiliza DefaultTableModel para manejar los datos de la tabla
    DefaultTableModel model = (DefaultTableModel) TablaHABITACIONES.getModel();
    model.setRowCount(0); // Limpiar la tabla

    // Recorrer la lista y agregar filas a la tabla
    Nodo current = listaHabitaciones.getInicio();  // 'current' es un nodo que se utiliza para recorrer la lista
    while (current != null) {
        // Obtener el objeto almacenado en el nodo actual
        Object dato = current.getDato();

        // Verificar si el objeto es una instancia de la clase Habitacion
        if (dato instanceof Habitacion) {
            // Si es una instancia de Habitacion, realizar un casting para obtener el objeto Habitacion
            Habitacion habitacion = (Habitacion) dato;

            // Crear un arreglo de objetos con los datos de la Habitacion actual
            Object[] row = {habitacion.getIdhabitacion(), habitacion.getNumero(), habitacion.getPiso(),
                            habitacion.getPrecio_diario(), habitacion.getTipo_habitacion()};

            // Agregar la fila a la tabla del modelo
            model.addRow(row);
        } else {
            // Si el objeto no es una instancia de Habitacion, imprimir un mensaje de error en la consola
            System.err.println("Error: El dato no es una instancia de Habitacion");
        }

        // Mover al siguiente nodo en la lista
        current = current.getSig();
    }
}
                                     

    public Habitacion1() {
        initComponents();
        dtm=(DefaultTableModel)TablaHABITACIONES.getModel();

    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtPiso = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        btnCola = new javax.swing.JButton();
        btnDesencolar = new javax.swing.JButton();
        btnInsIni = new javax.swing.JButton();
        btnInsFin = new javax.swing.JButton();
        btnRecorrer = new javax.swing.JButton();
        btnEliIni = new javax.swing.JButton();
        btnEliFin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHABITACIONES = new javax.swing.JTable();
        btnPush = new javax.swing.JButton();
        btnPull = new javax.swing.JButton();
        btnEliSelec = new javax.swing.JButton();
        btnEliMedio = new javax.swing.JButton();
        btnInsertarMedio = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(1052, 150));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-cama-matrimonial-96.png"))); // NOI18N
        jLabel2.setText("HABITACION DISPONIBLES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("Registro:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("Habitacion");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Categoria Huesped");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de Habitación:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setText("Precio Diario:");

        txtRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPisoActionPerformed(evt);
            }
        });

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtPiso))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        btnCola.setBackground(new java.awt.Color(255, 255, 0));
        btnCola.setText("Encolar");
        btnCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColaActionPerformed(evt);
            }
        });

        btnDesencolar.setBackground(new java.awt.Color(255, 255, 0));
        btnDesencolar.setText("Desencolar");
        btnDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarActionPerformed(evt);
            }
        });

        btnInsIni.setBackground(new java.awt.Color(153, 153, 255));
        btnInsIni.setText("Insertar Inicio");
        btnInsIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsIniActionPerformed(evt);
            }
        });

        btnInsFin.setBackground(new java.awt.Color(153, 153, 255));
        btnInsFin.setText("Insertar Final");
        btnInsFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsFinActionPerformed(evt);
            }
        });

        btnRecorrer.setBackground(new java.awt.Color(153, 153, 255));
        btnRecorrer.setText("Recorrer");
        btnRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorrerActionPerformed(evt);
            }
        });

        btnEliIni.setBackground(new java.awt.Color(153, 153, 255));
        btnEliIni.setText("Eliminar Inicio");
        btnEliIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliIniActionPerformed(evt);
            }
        });

        btnEliFin.setBackground(new java.awt.Color(153, 153, 255));
        btnEliFin.setText("Eliminar Final");
        btnEliFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliFinActionPerformed(evt);
            }
        });

        TablaHABITACIONES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Registro", "Piso", "Numero", "Precio Dia", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(TablaHABITACIONES);

        btnPush.setBackground(new java.awt.Color(255, 204, 51));
        btnPush.setText("PUSH");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        btnPull.setBackground(new java.awt.Color(255, 204, 51));
        btnPull.setText("POP");
        btnPull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPullActionPerformed(evt);
            }
        });

        btnEliSelec.setBackground(new java.awt.Color(153, 153, 255));
        btnEliSelec.setText("Eliminar Seleccion");
        btnEliSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliSelecActionPerformed(evt);
            }
        });

        btnEliMedio.setBackground(new java.awt.Color(153, 153, 255));
        btnEliMedio.setText("Eliminar medio");
        btnEliMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliMedioActionPerformed(evt);
            }
        });

        btnInsertarMedio.setBackground(new java.awt.Color(153, 153, 255));
        btnInsertarMedio.setText("Insertar medio");
        btnInsertarMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarMedioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnEliIni, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                            .addComponent(btnInsIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnInsFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnEliFin, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                                .addContainerGap(27, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPull, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(btnRecorrer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnInsertarMedio)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliMedio)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEliSelec)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCola, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(btnDesencolar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInsIni, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsFin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliIni, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliFin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliMedio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliSelec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsertarMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCola, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(btnDesencolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRecorrer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPull, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroActionPerformed

    }//GEN-LAST:event_txtRegistroActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaActionPerformed
    // Supongamos que tienes JTextField para obtener los datos de la habitación
    int idhabitacion = Integer.parseInt(txtRegistro.getText());
    String numero = txtNumero.getText();
    String piso = txtPiso.getText();
    double precioDiario = Double.parseDouble(txtPrecio.getText());
    String tipoHabitacion = txtTipo.getText();

    // Crear una instancia de Habitacion con los datos obtenidos
    Habitacion nuevaHabitacion = new Habitacion(idhabitacion, numero, piso, precioDiario, tipoHabitacion);

    // Llamar al método encolar con la instancia de Habitacion
    listaCola.encolar(nuevaHabitacion);

    // Actualizar la tabla después de la inserción
    actualizarTabla1();        

    }//GEN-LAST:event_btnColaActionPerformed

    private void btnDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarActionPerformed

    // Llamar al método desencolar
    listaCola.desencolar();

    // Actualizar la tabla después de la eliminación
    actualizarTabla1();
    }//GEN-LAST:event_btnDesencolarActionPerformed

    private void btnInsIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsIniActionPerformed
       // Código para el botón "Insertar Inicio"
        // Supongamos que tienes JTextField para obtener los datos de la habitación
        int idhabitacion = Integer.parseInt(txtRegistro.getText());
        String numero = txtNumero.getText();
        String piso = txtPiso.getText();
        double precioDiario = Double.parseDouble(txtPrecio.getText());
        String tipoHabitacion = txtTipo.getText();

        Habitacion nuevaHabitacion = new Habitacion(idhabitacion, numero, piso, precioDiario, tipoHabitacion);
        listaHabitaciones.inserIni(nuevaHabitacion);
        actualizarTabla(); 
        
    }//GEN-LAST:event_btnInsIniActionPerformed
 
    private void txtPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPisoActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnEliIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliIniActionPerformed
            listaHabitaciones.eliminarIni();
            actualizarTabla();
    }//GEN-LAST:event_btnEliIniActionPerformed

    private void btnEliFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliFinActionPerformed
        listaHabitaciones.eliminarFin();
        actualizarTabla();
    }//GEN-LAST:event_btnEliFinActionPerformed

    private void btnInsFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsFinActionPerformed
        // Código para el botón "Insertar Final"
        // Similar al caso anterior, pero usando el método inserFin de la lista
        // Asegúrate de obtener los datos de los JTextField
        int idhabitacion = Integer.parseInt(txtRegistro.getText());
        String numero = txtNumero.getText();
        String piso = txtPiso.getText();
        double precioDiario = Double.parseDouble(txtPrecio.getText());
        String tipoHabitacion = txtTipo.getText();

        Habitacion nuevaHabitacion = new Habitacion(idhabitacion, numero, piso, precioDiario, tipoHabitacion);
        listaHabitaciones.inserFin(nuevaHabitacion);
        actualizarTabla();
    }//GEN-LAST:event_btnInsFinActionPerformed

    private void btnRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorrerActionPerformed
        listaHabitaciones.recNodos();
    }//GEN-LAST:event_btnRecorrerActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        int idhabitacion = Integer.parseInt(txtRegistro.getText());
        String numero = txtNumero.getText();
        String piso = txtPiso.getText();
        double precioDiario = Double.parseDouble(txtPrecio.getText());
        String tipoHabitacion = txtTipo.getText();
    
    Habitacion habitacion = new Habitacion(idhabitacion, numero, piso, precioDiario, tipoHabitacion);

    // Realizar push en la pila
    listaPila.push(habitacion);

    // Actualizar el JTable
    actualizarTabla2();
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnPullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPullActionPerformed
       // Realizar pop en la pila
    listaPila.pop();

    // Actualizar el JTable
    actualizarTabla2();
    }//GEN-LAST:event_btnPullActionPerformed

    private void btnEliSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliSelecActionPerformed
        // TODO add your handling code here:
        if (TablaHABITACIONES.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un registro de tabla","ERROR AL ELIMINAR REGISTRO",JOptionPane.ERROR_MESSAGE);
        }
        else{
        dtm.removeRow(TablaHABITACIONES.getSelectedRow());
        }
    }//GEN-LAST:event_btnEliSelecActionPerformed

    private void btnInsertarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarMedioActionPerformed
        // TODO add your handling code here:
        
        int idhabitacion = Integer.parseInt(txtRegistro.getText());
        String numero = txtNumero.getText();
        String piso = txtPiso.getText();
        double precioDiario = Double.parseDouble(txtPrecio.getText());
        String tipoHabitacion = txtTipo.getText();
        Habitacion habitacion = new Habitacion(idhabitacion, numero, piso, precioDiario, tipoHabitacion);
        
        listaHabitaciones.insertarEnMedio(habitacion);
        
        int posicion=lista.size()/2;
        
        lista.add(posicion, habitacion);
        
        int rowCount = TablaHABITACIONES.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        for (Habitacion habitacion1 : lista) {
            Object[] fila = {habitacion.getIdhabitacion(), habitacion.getNumero(), habitacion.getPiso(), habitacion.getPrecio_diario(), habitacion.getTipo_habitacion()};
            dtm.addRow(fila);
        }
        
        
        
        
    }//GEN-LAST:event_btnInsertarMedioActionPerformed

    private void btnEliMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliMedioActionPerformed
        // TODO add your handling code here:
        
        if (dtm.getRowCount()>0) {
            int filaSeleccionada = dtm.getRowCount() / 2;
            if (filaSeleccionada>=0&& filaSeleccionada<dtm.getRowCount()) {
                int IdHabitacion = (int)dtm.getValueAt(filaSeleccionada, 0);
                Habitacion habitacionEliminar=null;
                for(Habitacion habitacion: lista){
                    if (habitacion.getIdhabitacion()==IdHabitacion) {
                        habitacionEliminar=habitacion;
                        break;
                    }
                }
                if (habitacionEliminar!=null) {
                    listaHabitaciones.eliminarEnMedio(habitacionEliminar);
                    lista.remove(habitacionEliminar);
                    dtm.removeRow(filaSeleccionada);
                }
            }            
        }
        
        
        
    }//GEN-LAST:event_btnEliMedioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaHABITACIONES;
    private javax.swing.JButton btnCola;
    private javax.swing.JButton btnDesencolar;
    private javax.swing.JButton btnEliFin;
    private javax.swing.JButton btnEliIni;
    private javax.swing.JButton btnEliMedio;
    private javax.swing.JButton btnEliSelec;
    private javax.swing.JButton btnInsFin;
    private javax.swing.JButton btnInsIni;
    private javax.swing.JButton btnInsertarMedio;
    private javax.swing.JButton btnPull;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnRecorrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPiso;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRegistro;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

}
