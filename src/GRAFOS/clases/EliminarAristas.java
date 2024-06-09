package GRAFOS.clases;

import GRAFOS.clases.Arboles;
import GRAFOS.clases.Pintar;
import GRAFOS.clases.VentanaPrincipal;
import java.awt.Frame;
import javax.swing.JOptionPane;


public class EliminarAristas extends javax.swing.JFrame {
int i;


public void R_repaint(){
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                if(arboles.getmAdyacencia(j, k) == 1)
                Pintar.pintarLinea(VentanaPrincipal.jPanel1.getGraphics(),arboles.getCordeX(j),arboles.getCordeY(j), 
                arboles.getCordeX(k), arboles.getCordeY(k),arboles.getmCoeficiente(j, k));
            }
        }
        for (int j = 0; j < i; j++) {
            Pintar.pintarCirculo(VentanaPrincipal.jPanel1.getGraphics(), arboles.getCordeX(j),arboles.getCordeY(j),
                String.valueOf(arboles.getNombre(j)));
           
       }
   }
 Pintar pintar ;
      Arboles arboles ;
      Frame frame;
    public EliminarAristas(Pintar pinta , Arboles arbole ,int ii, Frame fram) {
        initComponents();
        i=ii;
        this.pintar =pinta;
       this.arboles=arbole;
       frame = fram;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        n2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setTitle(":Eliminr:");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 110, 90, 24);

        jLabel1.setText("Vertice 1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 60, 18);

        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        n1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                n1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n1KeyReleased(evt);
            }
        });
        getContentPane().add(n1);
        n1.setBounds(90, 40, 40, 20);

        jLabel2.setText("Vertice 2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 70, 60, 18);

        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        n2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n2KeyReleased(evt);
            }
        });
        getContentPane().add(n2);
        n2.setBounds(90, 70, 40, 24);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Borrar Arista");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 10, 130, 20);

        setBounds(60, 130, 165, 176);
    }// </editor-fold>//GEN-END:initComponents

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1ActionPerformed

    private void n1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1KeyPressed

    private void n1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyReleased
        String tem = new String(n1.getText());
        StringBuffer tem2= new StringBuffer();
        for (int j = 0; j < tem.length(); j++) {
            if(Character.isDigit(tem.charAt(j))){
                tem2.append(tem.charAt(j));
            }
        }
        n1.setText(""+tem2);
    }//GEN-LAST:event_n1KeyReleased

    private void n2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n2KeyReleased
        String tem = new String(n2.getText());
        StringBuffer tem2= new StringBuffer();
        for (int j = 0; j < tem.length(); j++) {
            if(Character.isDigit(tem.charAt(j))){
                tem2.append(tem.charAt(j));
            }
        }
        n2.setText(""+tem2);        // TODO add your handling code here:
    }//GEN-LAST:event_n2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x;int y;int ta;
        if(n1.getText().length()<1 || n2.getText().length()<1 )
        JOptionPane.showMessageDialog(null,"Error.. Faltan datos : ");
        else{
            x=Integer.parseInt(n1.getText());
            y=Integer.parseInt(n2.getText());
           

            if(x==y)
            JOptionPane.showMessageDialog(null,"Error.. Debe digitar un nodo diferente a : "+y);
            else if(x<0 || x>=i || y<0 || y>=i){
                JOptionPane.showMessageDialog(null,"Error.. Nodos No validos ");
            }else{
                arboles.setmAdyacencia(x, y, 0);
                arboles.setmAdyacencia(y, x, 0);
                arboles.setmCoeficiente(x, y, 0);
                arboles.setmCoeficiente(y, x, 0);
                n1.setText(null);
                n2.setText(null);
                VentanaPrincipal.jPanel1.paint(VentanaPrincipal.jPanel1.getGraphics());
                
               R_repaint();

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      frame.setEnabled(true);  // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EliminarAristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarAristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarAristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarAristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    // End of variables declaration//GEN-END:variables
}
