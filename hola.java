/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Seccion Nocturna
 */
public class hola extends javax.swing.JFrame {

    /**
     * Creates new form hola
     */
    public hola() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        btCedula = new javax.swing.JLabel();
        Modelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        btCedula1 = new javax.swing.JLabel();
        Año = new javax.swing.JTextField();
        WWE = new java.awt.Checkbox();
        WWE1 = new java.awt.Checkbox();
        WWE2 = new java.awt.Checkbox();
        WWE3 = new java.awt.Checkbox();
        WWE4 = new java.awt.Checkbox();
        WWE5 = new java.awt.Checkbox();
        WWE6 = new java.awt.Checkbox();
        WWE7 = new java.awt.Checkbox();
        btCedula2 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        btCedula3 = new javax.swing.JLabel();
        Pintura = new javax.swing.JTextField();
        btCedula4 = new javax.swing.JLabel();
        Vededor = new javax.swing.JTextField();
        btCedula5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lleguas = new javax.swing.JTextField();
        btGuardar1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCedula.setBackground(new java.awt.Color(255, 255, 0));
        btCedula.setForeground(new java.awt.Color(255, 255, 51));
        btCedula.setText("Modelo");
        getContentPane().add(btCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 59, -1));

        Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeloActionPerformed(evt);
            }
        });
        getContentPane().add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 234, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("La Cochera");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 480, 49));

        btGuardar.setBackground(new java.awt.Color(51, 255, 0));
        btGuardar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        btCedula1.setForeground(new java.awt.Color(255, 255, 51));
        btCedula1.setText("Año");
        getContentPane().add(btCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 59, -1));

        Año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoActionPerformed(evt);
            }
        });
        getContentPane().add(Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 234, -1));

        WWE.setLabel("WWE");
        getContentPane().add(WWE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, -1));

        WWE1.setLabel("Más Dá");
        getContentPane().add(WWE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        WWE2.setLabel("Doña Mercedez");
        getContentPane().add(WWE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        WWE3.setLabel("La Toita");
        getContentPane().add(WWE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 80, -1));

        WWE4.setLabel("Moncerratii");
        getContentPane().add(WWE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        WWE5.setLabel("Febrari");
        getContentPane().add(WWE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 70, -1));

        WWE6.setLabel("Labor  yini");
        getContentPane().add(WWE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 110, -1));

        WWE7.setLabel("Ponche");
        getContentPane().add(WWE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, -1));

        btCedula2.setForeground(new java.awt.Color(255, 255, 51));
        btCedula2.setText("Matricúla");
        getContentPane().add(btCedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 59, -1));

        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });
        getContentPane().add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 234, -1));

        btCedula3.setForeground(new java.awt.Color(255, 255, 51));
        btCedula3.setText("Pintura");
        getContentPane().add(btCedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 59, -1));

        Pintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinturaActionPerformed(evt);
            }
        });
        getContentPane().add(Pintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 234, -1));

        btCedula4.setForeground(new java.awt.Color(255, 255, 51));
        btCedula4.setText("Vededor");
        getContentPane().add(btCedula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 59, -1));

        Vededor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VededorActionPerformed(evt);
            }
        });
        getContentPane().add(Vededor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 234, -1));

        btCedula5.setForeground(new java.awt.Color(255, 255, 51));
        btCedula5.setText("lleguas de empuje");
        getContentPane().add(btCedula5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 110, -1));

        jButton3.setBackground(new java.awt.Color(0, 255, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setText("Limpiarsh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        lleguas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lleguasActionPerformed(evt);
            }
        });
        getContentPane().add(lleguas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 234, -1));

        btGuardar1.setBackground(new java.awt.Color(255, 204, 204));
        btGuardar1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btGuardar1.setText("Esit");
        btGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cochera.jpg"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(1280, 1080));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 720, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModeloActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btGuardarActionPerformed

    private void AñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AñoActionPerformed

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaActionPerformed

    private void PinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PinturaActionPerformed

    private void VededorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VededorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VededorActionPerformed

    private void lleguasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lleguasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lleguasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Modelo.setText("");
Año.setText("");
matricula.setText("");
Pintura.setText("");
Vededor.setText("");
lleguas.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btGuardar1ActionPerformed

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
            java.util.logging.Logger.getLogger(hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Año;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField Modelo;
    private javax.swing.JTextField Pintura;
    private javax.swing.JTextField Vededor;
    private java.awt.Checkbox WWE;
    private java.awt.Checkbox WWE1;
    private java.awt.Checkbox WWE2;
    private java.awt.Checkbox WWE3;
    private java.awt.Checkbox WWE4;
    private java.awt.Checkbox WWE5;
    private java.awt.Checkbox WWE6;
    private java.awt.Checkbox WWE7;
    private javax.swing.JLabel btCedula;
    private javax.swing.JLabel btCedula1;
    private javax.swing.JLabel btCedula2;
    private javax.swing.JLabel btCedula3;
    private javax.swing.JLabel btCedula4;
    private javax.swing.JLabel btCedula5;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btGuardar1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField lleguas;
    private javax.swing.JTextField matricula;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
