/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author baltamar3
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroUno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroDos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbOperacion = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("SUPER CALCULADORA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setText("Numero 1:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel1.add(txtNumeroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 60, -1));

        jLabel3.setText("Numero 2:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));
        jPanel1.add(txtNumeroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 60, -1));

        jLabel4.setText("Resultado:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        txtResultado.setEditable(false);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 60, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabel5.setText("Operacion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicacion", "Division" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(472, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        String num1, num2, res;
        double n1, n2, resultado = 0;
        int op, sw = 1;

        if (txtNumeroUno.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el numero uno", " error", JOptionPane.ERROR_MESSAGE);
            txtNumeroUno.requestFocusInWindow();
            sw = 0;
        } else if (txtNumeroDos.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el numero dos", " error", JOptionPane.ERROR_MESSAGE);
            txtNumeroDos.requestFocusInWindow();
            sw = 0;
        } else {
            try {
                n1 = Double.parseDouble(txtNumeroUno.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "el primer numero debe ser un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtNumeroUno.requestFocusInWindow();
                txtNumeroUno.selectAll();
                sw=0;
            }
            try {
                n2 = Double.parseDouble(txtNumeroDos.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "el Segundo numero debe ser un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtNumeroDos.requestFocusInWindow();
                txtNumeroDos.selectAll();
                sw=0;
            }
            
        }
        if(sw==1){
            n1 = Double.parseDouble(txtNumeroUno.getText());
            n2 = Double.parseDouble(txtNumeroDos.getText());
            op = cmbOperacion.getSelectedIndex();

            if (op == 3 && n2 == 0) {
                JOptionPane.showMessageDialog(this, "no digite cero en el segundo numero", "Error", JOptionPane.ERROR_MESSAGE);
                txtNumeroDos.requestFocusInWindow();
                txtNumeroDos.selectAll();

            } else {

                switch (op) {
                    case 0:
                        resultado = n1 + n2;
                        break;
                    case 1:
                        resultado = n1 - n2;
                        break;
                    case 2:
                        resultado = n1 * n2;
                        break;
                    case 3:
                        resultado = n1 / n2;
                        break;
                }
                res = String.valueOf(resultado);
                txtResultado.setText(res);
            }
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtNumeroUno.setText("");
        txtNumeroDos.setText("");
        txtResultado.setText("");

        txtNumeroUno.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperacion;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNumeroDos;
    private javax.swing.JTextField txtNumeroUno;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
