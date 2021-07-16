
package javaapplication2.Ventanas;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class VentanaCrear extends javax.swing.JFrame {

    private final static org.apache.log4j.Logger log = org.apache.log4j.Logger.getRootLogger();

    PanelPrincipal panel;

    public VentanaCrear(PanelPrincipal panel) {
        initComponents();
        this.panel = panel;

    }

    VentanaCrear() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtTamano = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setText("Agregar Persona");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombres");

        jLabel2.setText("Edad");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jLabel3.setText("Genero");

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", " " }));
        comboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGeneroActionPerformed(evt);
            }
        });

        jLabel4.setText("Tamaño");

        txtTamano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1).addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4).addComponent(jLabel3)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTamano, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE).addComponent(jButton1).addGap(55, 55, 55)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2).addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3).addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4).addComponent(txtTamano, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18).addComponent(jButton1).addContainerGap(23, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        String nombre = txtNombre.getText();
        int tamano;
        int edad;
        try {

            tamano = Integer.parseInt(txtTamano.getText());
            edad = Integer.parseInt(txtEdad.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo salio mal en las asignaciones, intentalo nuevamente");
            txtNombre.setText("");
            txtEdad.setText("");
            txtTamano.setText("");
            log.warn("Algo salio mal en asignaciones de datos en VentanaCrear");
            return;
        }
        char genero;
        boolean flag = false;
        String pat = "[a-zA-Z]+";
        if (edad < 150 && edad > 0) {
            if (tamano > 0 && tamano < 250) {
                if (Pattern.matches(pat, nombre)) {
                    flag = true;
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Error en el nombre, vuelve a intentarlo con un solo nombre y solo letras");
                    log.warn("Nombre no valido en VentanaCrear");
                }
            } else {
                if (tamano > 0) {

                    JOptionPane.showMessageDialog(this, "Error en el tamaño, ingresa un valor menor");
                    log.warn("Tamaño invalido");
                } else {
                    JOptionPane.showMessageDialog(this, "Error en el tamaño, ingresa un valor mayor");
                    log.warn("Tamaño invalido");

                }
            }
        } else {
            if (edad > 150) {
                JOptionPane.showMessageDialog(this, "Ninguna persona vivio mas de 150 años, ingresa un valor menor");
                log.debug("Edad muy alta");

            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un valor mayor a 0");
                log.debug("Edad es 0 o menor");
            }
        }
        if (comboGenero.getSelectedIndex() == 1) {
            genero = 'F';

        } else {
            genero = 'M';
        }
        if (!flag) {
            JOptionPane.showMessageDialog(this, "Ingresaste parametros incorrectos, intenta nuevamente");
            log.warn("La bandera es negativa, asi que se aborta la creacion de un nodo persona");
            return;
        }
        txtEdad.setText("");
        txtNombre.setText("");
        txtTamano.setText("");

        log.debug("Se ha creado la persona " + nombre + " " + edad + " " + tamano);
        this.panel.crearpersona(nombre, tamano, edad, genero);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNombreActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtEdadActionPerformed

    private void comboGeneroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_comboGeneroActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_comboGeneroActionPerformed

    private void txtTamanoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTamanoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtTamanoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTamano;
    // End of variables declaration//GEN-END:variables
}