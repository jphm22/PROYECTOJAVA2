package GRAFOS.clases;

import GRAFOS.clases.VentanaArista;
import GRAFOS.clases.EliminarAristas;
import GRAFOS.clases.Arboles;
import GRAFOS.clases.Pintar;
import GRAFOS.clases.Algoritmo_Dijkstra;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class VentanaPrincipal extends javax.swing.JFrame {
       
    /**
     * Creates new form VentanaPincipal
     */
   Pintar pintar =new Pintar();
   Arboles arboles = new Arboles();  
   
   
   public static void R_repaint(int tope, Arboles arboles) //pinta lo q esta antes en el panel 
   {
        for (int j = 0; j < tope; j++) 
        {
            for (int k = 0; k < tope; k++) 
            {
                if(arboles.getmAdyacencia(j, k) == 1)
                     Pintar.pintarLinea(jPanel1.getGraphics(),arboles.getCordeX(j),
                             arboles.getCordeY(j), arboles.getCordeX(k), 
                             arboles.getCordeY(k),arboles.getmCoeficiente(j, k));
            }
        }
        for (int j = 0; j < tope; j++) 
            Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(j),
                    arboles.getCordeY(j),String.valueOf(arboles.getNombre(j)));
                
   }
 
public static int ingresarNodoOrigen(String nodoOrige, String noExiste,int tope)
{
 int nodoOrigen = 0;
        try
        {
              nodoOrigen = Integer.parseInt(JOptionPane.showInputDialog(""+nodoOrige));   
              if(nodoOrigen>=tope)
                {  
                  JOptionPane.showMessageDialog(null,
                          ""+noExiste+"\nDebe de ingresar  un Nodo existente");
                  nodoOrigen = ingresarNodoOrigen(nodoOrige,noExiste, tope);
                }
        }
        catch(Exception ex)
        {
            nodoOrigen = ingresarNodoOrigen(nodoOrige,noExiste,tope);
        }
        return nodoOrigen;
} 

 public  int ingresarTamano(String tama)
 {        
  int tamano = 0;
        try
        {
            tamano = Integer.parseInt(JOptionPane.showInputDialog(""+tama));
            
            if(tamano<1)
            { 
                JOptionPane.showMessageDialog(null,"Debe Ingresar un Tamaño Aceptado..");
                tamano = ingresarTamano(tama);//no es nesario hacer esto
            }
        }
        catch(Exception ex)
        {
            tamano = ingresarTamano(tama);
        }
        return tamano;
    }
 
 public boolean cicDerechoSobreNodo(int xxx,int yyy)
 { 
     for (int j = 0; j < tope; j++) // consultamos si se ha sado  click sobre algun nodo 
     {
            if((xxx+2) > arboles.getCordeX(j) && 
                    xxx < (arboles.getCordeX(j)+13) && (yyy+2) > arboles.getCordeY(j) && yyy<(arboles.getCordeY(j)+13) ) 
            {
               if(n==0)
               {
                   id = j;
                   R_repaint(tope,arboles);
                   Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null,Color.orange);       
                   n++;                   
               }
               else
               { 
                   id2=j;                   
                   n++;
                   Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null,Color.orange); 
                   
                   if(id==id2) // si id == id2 por q se volvio a dar click sobre el mismos nodo, se cancela el click anterio
                   {
                       n=0;
                       Pintar.pintarCirculo(jPanel1.getGraphics(),arboles.getCordeX(id), arboles.getCordeY(id),String.valueOf(arboles.getNombre(id)));
                       id=-1;
                       id2=-1;
                   }
               } 
               nn=0;
               return true;              
            }
         }
         return false;
 }  
 
 public void clicIzqSobreNodo(int xxx, int yyy)
 {
            for (int j = 0; j <tope; j++) 
            {
              if((xxx+2) > arboles.getCordeX(j) && xxx < (arboles.getCordeX(j)+13) && (yyy+2) > arboles.getCordeY(j) && yyy<(arboles.getCordeY(j)+13) ) 
              {
                if(nn==0)
                {
                   permanente =j; 
                   R_repaint(tope, arboles);                   
                }
               else
                { 
                    nodoFin = j;
                }
                nn++;
                n=0;
                id =-1;
                Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null,Color.GREEN);  
                   break;
               }
           
            }
            
     
 }
 
 public void adactarImagen(File file)
 {
    try
    {   
       BufferedImage read = ImageIO.read(file);
       Image scaledInstance = read.getScaledInstance(mapa.getWidth(),mapa.getHeight(), Image.SCALE_DEFAULT);
       mapa.setIcon(new ImageIcon(scaledInstance));  
    }
    catch(Exception ex)
    {
     JOptionPane.showMessageDialog(null,"Error al cargar la imagen");
    }
 }
         

    public VentanaPrincipal() 
    { 
        initComponents();
        jPanel2.setVisible(false);   
        jDialog1.setLocationRelativeTo(null);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        mapa = new javax.swing.JLabel();
        Actualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        CaminoCorto = new javax.swing.JButton();
        NuevaArista = new javax.swing.JButton();
        AbrirMapa = new javax.swing.JButton();
        BorrarArista = new javax.swing.JButton();
        BorrarNodo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PesoCaminoCorto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NuevoProyecto = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();

        jDialog1.setMinimumSize(new java.awt.Dimension(700, 450));
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(null);

        jFileChooser2.setMaximumSize(new java.awt.Dimension(21475, 21474));
        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jFileChooser2);
        jFileChooser2.setBounds(10, 20, 670, 390);

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ruta de actividades por Lima");
        setBackground(new java.awt.Color(0, 204, 204));
        setIconImage(getIconImage());
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 204)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(770, 522));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(null);

        mapa.setBackground(new java.awt.Color(204, 204, 204));
        mapa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mapaKeyPressed(evt);
            }
        });
        jPanel1.add(mapa);
        mapa.setBounds(0, 10, 980, 650);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 970, 580);

        Actualizar.setBackground(new java.awt.Color(204, 204, 204));
        Actualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Actualizar.setText("Actualiizar");
        Actualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Actualizar);
        Actualizar.setBounds(1000, 130, 120, 25);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setForeground(new java.awt.Color(153, 153, 0));
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 10, 20, 20);

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setForeground(new java.awt.Color(153, 153, 0));
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(40, 10, 20, 20);

        jButton4.setBackground(new java.awt.Color(189, 182, 182));
        jButton4.setForeground(new java.awt.Color(153, 153, 0));
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(100, 10, 20, 20);

        jButton5.setBackground(new java.awt.Color(51, 0, 51));
        jButton5.setForeground(new java.awt.Color(153, 153, 0));
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(10, 40, 20, 20);

        jButton6.setBackground(java.awt.Color.lightGray);
        jButton6.setForeground(new java.awt.Color(153, 153, 0));
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(40, 40, 20, 20);

        jButton7.setBackground(new java.awt.Color(164, 167, 255));
        jButton7.setForeground(new java.awt.Color(153, 153, 0));
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton7MouseReleased(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(70, 70, 20, 20);

        jButton8.setBackground(new java.awt.Color(141, 141, 141));
        jButton8.setForeground(new java.awt.Color(153, 153, 0));
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton8MouseReleased(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(100, 40, 20, 20);

        jButton9.setBackground(new java.awt.Color(0, 0, 255));
        jButton9.setForeground(new java.awt.Color(153, 153, 0));
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton9MouseReleased(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(100, 70, 20, 20);

        jButton10.setBackground(new java.awt.Color(153, 0, 0));
        jButton10.setForeground(new java.awt.Color(153, 153, 0));
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton10MouseReleased(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);
        jButton10.setBounds(70, 10, 20, 20);

        jButton11.setBackground(new java.awt.Color(0, 102, 102));
        jButton11.setForeground(new java.awt.Color(153, 153, 0));
        jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton11MouseReleased(evt);
            }
        });
        jPanel2.add(jButton11);
        jButton11.setBounds(40, 70, 20, 20);

        jButton12.setForeground(new java.awt.Color(153, 153, 0));
        jButton12.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton12MouseReleased(evt);
            }
        });
        jPanel2.add(jButton12);
        jButton12.setBounds(70, 40, 20, 20);

        jButton13.setBackground(new java.awt.Color(0, 51, 51));
        jButton13.setForeground(new java.awt.Color(153, 153, 0));
        jButton13.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton13MouseReleased(evt);
            }
        });
        jPanel2.add(jButton13);
        jButton13.setBounds(10, 70, 20, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 40, 0, 0);

        CaminoCorto.setText("Camino mas corto");
        CaminoCorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaminoCortoActionPerformed(evt);
            }
        });
        getContentPane().add(CaminoCorto);
        CaminoCorto.setBounds(990, 400, 150, 24);

        NuevaArista.setText("Nueva Arista ");
        NuevaArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaAristaActionPerformed(evt);
            }
        });
        getContentPane().add(NuevaArista);
        NuevaArista.setBounds(990, 200, 120, 24);

        AbrirMapa.setText("Abrir Mapa");
        AbrirMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirMapaActionPerformed(evt);
            }
        });
        getContentPane().add(AbrirMapa);
        AbrirMapa.setBounds(1000, 100, 120, 24);

        BorrarArista.setText("Borrar Arista");
        BorrarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarAristaActionPerformed(evt);
            }
        });
        getContentPane().add(BorrarArista);
        BorrarArista.setBounds(990, 230, 120, 24);

        BorrarNodo.setText("Borrar Nodo");
        BorrarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarNodoActionPerformed(evt);
            }
        });
        getContentPane().add(BorrarNodo);
        BorrarNodo.setBounds(990, 260, 120, 24);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ciudad de LIMA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1000, 40, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Escoge una opcion");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(990, 170, 140, 20);

        PesoCaminoCorto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        PesoCaminoCorto.setEnabled(false);
        PesoCaminoCorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoCaminoCortoActionPerformed(evt);
            }
        });
        getContentPane().add(PesoCaminoCorto);
        PesoCaminoCorto.setBounds(1010, 470, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Coste");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1010, 440, 110, 20);

        jMenu1.setText("Opciones");

        NuevoProyecto.setText("Nuevo Proyecto      ");
        NuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(NuevoProyecto);
        jMenu1.add(jSeparator5);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleName("Ciudad de Puebla");

        setSize(new java.awt.Dimension(1157, 664));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       int xxx, yyy;   
       xxx=evt.getX();
       yyy=evt.getY();
       if(evt.isMetaDown())
       {
          clicIzqSobreNodo(xxx, yyy );     
       
          if(nn==2)
          {
            nn=0;
            Algoritmo_Dijkstra Dijkstra = new Algoritmo_Dijkstra(arboles,tope,permanente, nodoFin);
            Dijkstra.dijkstra();
            PesoCaminoCorto.setText(""+Dijkstra.getAcumulado());   
          }
       }
       else
       {
            if(!cicDerechoSobreNodo(xxx,yyy))// si  clik sobre  nodo es falso entra
            {
                if(tope<50)
                {
                  arboles.setCordeX(tope,xxx);
                  arboles.setCordeY(tope,yyy);
                  arboles.setNombre(tope, tope);
                  Pintar.pintarCirculo(jPanel1.getGraphics(),arboles.getCordeX(tope), arboles.getCordeY(tope),String.valueOf(arboles.getNombre(tope)));
                  tope++;          
                } 
                else JOptionPane.showMessageDialog(null,"Se ha llegado al Maximo de nodos..");
       } 
            if(n==2 )
            {
              n=0; 
              int  ta = ingresarTamano("Ingrese Tamaño");
              if(aristaMayor < ta) aristaMayor=ta;
              arboles.setmAdyacencia(id2, id, 1);
              arboles.setmAdyacencia(id, id2, 1);
              arboles.setmCoeficiente(id2, id,ta );
              arboles.setmCoeficiente(id, id2, ta);
              Pintar.pintarLinea(jPanel1.getGraphics(),arboles.getCordeX(id), arboles.getCordeY(id), arboles.getCordeX(id2), arboles.getCordeY(id2), ta); 
              Pintar.pintarCirculo(jPanel1.getGraphics(),arboles.getCordeX(id), arboles.getCordeY(id),String.valueOf(arboles.getNombre(id)));
              Pintar.pintarCirculo(jPanel1.getGraphics(),arboles.getCordeX(id2), arboles.getCordeY(id2),String.valueOf(arboles.getNombre(id2)));
              id=-1;
              id2=-1;
            }
        }
    }//GEN-LAST:event_jPanel1MousePressed

    
    
    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        R_repaint(tope,arboles);  
    }//GEN-LAST:event_ActualizarActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
     // TODO add your handling code here:
      
        
         
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
     
    }//GEN-LAST:event_jPanel1KeyReleased

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
       // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void PesoCaminoCortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoCaminoCortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesoCaminoCortoActionPerformed

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
 
    JFileChooser selectorArchios = (JFileChooser) evt.getSource();
    String comando = evt.getActionCommand();
    
        if(comando.equals(JFileChooser.APPROVE_SELECTION))
        {
            File archiSeleccionado = selectorArchios.getSelectedFile();
            adactarImagen(archiSeleccionado);
            jDialog1.setVisible(false);
            //JOptionPane.showMessageDialog(null, ""+archiSeleccionado+"  nOMBRE"+archiSeleccionado.getName());
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    private void jButton13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseReleased
        R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13MouseReleased

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
        jPanel1.setBackground(jButton13.getBackground());  // TODO add your handling code here:
    }//GEN-LAST:event_jButton13MousePressed

    private void jButton12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseReleased
        R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseReleased

    private void jButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MousePressed
        jPanel1.setBackground(jButton12.getBackground()); // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MousePressed

    private void jButton11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseReleased
        R_repaint(tope,arboles);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseReleased

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
        jPanel1.setBackground(jButton11.getBackground());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseReleased
        R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseReleased

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
        jPanel1.setBackground(jButton10.getBackground());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MousePressed

    private void jButton9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseReleased
        R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseReleased

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        jPanel1.setBackground(jButton9.getBackground());     // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseReleased
        R_repaint(tope,arboles);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseReleased

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        jPanel1.setBackground(jButton8.getBackground());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseReleased
        R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseReleased

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        jPanel1.setBackground(jButton7.getBackground());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
        R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseReleased

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        jPanel1.setBackground(jButton6.getBackground());  // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
        R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseReleased

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        jPanel1.setBackground(jButton5.getBackground());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        R_repaint(tope,arboles);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        jPanel1.setBackground(jButton4.getBackground());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        jPanel1.setBackground(jButton3.getBackground());
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        R_repaint(tope,arboles);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        jPanel1.setBackground(jButton2.getBackground());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MousePressed

    private void CaminoCortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaminoCortoActionPerformed
       if(tope>=2)
       {
          permanente =  ingresarNodoOrigen("Ingrese Nodo Origen..","nodo Origen No existe",tope);// hacemos el llamano de la funcion         
          nodoFin =  ingresarNodoOrigen("Ingrese Nodo Fin..","nodo fin No existe",tope);
          Algoritmo_Dijkstra Dijkstra = new Algoritmo_Dijkstra(arboles,tope,permanente,nodoFin);
          Dijkstra.dijkstra();
          PesoCaminoCorto.setText(""+Dijkstra.getAcumulado());
        }
        else JOptionPane.showMessageDialog(null,"Se deben de crear mas nodos ... ");
    }//GEN-LAST:event_CaminoCortoActionPerformed

    private void BorrarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarNodoActionPerformed
       int Eliminar= ingresarNodoOrigen("Ingrese Nodo a Eliminar ","Nodo No existe",tope); 
       
        if(Eliminar<=tope && Eliminar>=0 && tope>0)
        {
            for (int j = 0; j < tope; j++) 
            {
                for (int k = 0; k < tope; k++)
                {
                  if(j==Eliminar ||k==Eliminar)
                    {
                       arboles.setmAdyacencia(j, k, -1);                    
                    }
                }
            }
            
            for (int l = 0; l < tope-1; l++) 
            {
                for (int m = 0; m < tope; m++) 
                {
                    if(arboles.getmAdyacencia(l, m)==-1)
                    {
                        arboles.setmAdyacencia(l, m,arboles.getmAdyacencia(l+1, m)); 
                        arboles.setmAdyacencia(l+1, m,-1);
                        arboles.setmCoeficiente(l, m,arboles.getmCoeficiente(l+1, m));
                    }
                  }
            }
            
            for (int l = 0; l < tope; l++) 
            {
                for (int m = 0; m < tope-1; m++) 
                {
                    if(arboles.getmAdyacencia(l, m)==-1)
                    {
                        arboles.setmAdyacencia(l, m,arboles.getmAdyacencia(l, m+1)); 
                        arboles.setmAdyacencia(l, m+1,-1);
                        arboles.setmCoeficiente(l, m,arboles.getmCoeficiente(l, m+1));    
                    }
                }
            }
                arboles.setCordeX(Eliminar,-10);
                arboles.setCordeY(Eliminar,-10);
                arboles.setNombre(Eliminar, -10);
            
            for (int j = 0; j < tope; j++) 
            {
                for (int k = 0; k < tope-1; k++) 
                {
                    if(arboles.getCordeX(k)==-10)
                    {
                        arboles.setCordeX(k, arboles.getCordeX(k+1));
                        arboles.setCordeX(k+1, -10);
                        arboles.setCordeY(k, arboles.getCordeY(k+1));
                        arboles.setCordeY(k+1, -10);
                        arboles.setNombre(k, arboles.getNombre(k+1));
                        arboles.setNombre(k+1,-10);
                    }
                }
            }
            
            for (int j = 0; j < tope; j++)   
                
                arboles.setNombre(j,j);// renombramos             
                
            // eliminamos los -1 y  los -10 
            for (int j = 0; j < tope+1; j++) 
            {
                for (int k = 0; k < tope+1; k++) 
                {
                    if( arboles.getmAdyacencia(j, k)!=-1)
                    {
                        arboles.setmAdyacencia(j, k, arboles.getmAdyacencia(j, k));
                    }
                    else
                    {
                          arboles.setmAdyacencia(j, k, 0);
                    }
                    
                    if(arboles.getmCoeficiente(j, k) !=-10)
                    {
                        arboles.setmCoeficiente(j, k, arboles.getmCoeficiente(j, k));
                    }
                    else
                    {
                        arboles.setmCoeficiente(j, k, 0);   
                    }
                }         
            }
            tope--;
            jPanel1.paint(jPanel1.getGraphics());
            R_repaint(tope,arboles);
        }    
    }//GEN-LAST:event_BorrarNodoActionPerformed

    private void BorrarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarAristaActionPerformed
             // TODO add your handling code here:
        if(tope>=2)
        {
           this.setEnabled(false);
           new EliminarAristas(pintar,arboles,tope,this).setVisible(true);
           jPanel1.paint(jPanel1.getGraphics());
           R_repaint(tope,arboles); 
        }
        else  JOptionPane.showMessageDialog(null,"No Hay Nodos Enlazados... ");
    
    }//GEN-LAST:event_BorrarAristaActionPerformed
    
    private void AbrirMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirMapaActionPerformed
    jDialog1.setVisible(true); // TODO add your handling code here: 
    
    }//GEN-LAST:event_AbrirMapaActionPerformed

    private void NuevaAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaAristaActionPerformed
        if(tope<=1)
        {
            JOptionPane.showMessageDialog(null,"Cree nuevo nodo : ");
        }
        else
        {
          this.setEnabled(false);
          new VentanaArista(arboles,pintar,tope,this).setVisible(true);
          jPanel1.paint(jPanel1.getGraphics());
          R_repaint(tope,arboles);        
        }                                       
      
    }//GEN-LAST:event_NuevaAristaActionPerformed

    private void NuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProyectoActionPerformed
        // TODO add your handling code here:
              
         
        for (int j = 0; j < tope; j++) 
        {
            arboles.setCordeX(j,0);
            arboles.setCordeY(j,0);              
            arboles.setNombre(j,0);            
        }
        
        for (int j = 0; j < tope; j++) 
        {
            for (int k = 0; k < tope; k++) 
            {
                arboles.setmAdyacencia(j, k, 0);
                arboles.setmCoeficiente(j, k, 0);                 
            }            
        }
    tope=00;   
    jPanel1.repaint();   
    
    }//GEN-LAST:event_NuevoProyectoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
          System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void mapaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mapaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mapaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {        
        
    }
    private int tope=0;// lleva el # de nodos creado 
    private int nodoFin;
    private int permanente;
    int n=0,nn=0,id,id2;// permite controlar que se halla dado click sobre un nodo
    private int aristaMayor;
 
   
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirMapa;
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton BorrarArista;
    private javax.swing.JButton BorrarNodo;
    private javax.swing.JButton CaminoCorto;
    private javax.swing.JButton NuevaArista;
    private javax.swing.JMenuItem NuevoProyecto;
    private javax.swing.JTextField PesoCaminoCorto;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel mapa;
    // End of variables declaration//GEN-END:variables
}
