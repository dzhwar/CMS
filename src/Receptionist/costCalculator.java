/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptionist;

/**
 *
 * @author dd
 */
public class costCalculator extends javax.swing.JFrame {

    /**
     * Creates new form costCalculator
     */
    public costCalculator() {
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
        jchkCheck = new javax.swing.JCheckBox();
        jchkBridge = new javax.swing.JCheckBox();
        jchkFilling = new javax.swing.JCheckBox();
        jchkCosmetic = new javax.swing.JCheckBox();
        jchkExtract = new javax.swing.JCheckBox();
        jchkRoot = new javax.swing.JCheckBox();
        jbtnCalculate = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jchkCheck.setText("Check up");
        jchkCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jchkCheckMouseClicked(evt);
            }
        });

        jchkBridge.setText("Dental bridge");
        jchkBridge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkBridgeActionPerformed(evt);
            }
        });

        jchkFilling.setText("Fillings");

        jchkCosmetic.setText("Cosmetic Dentistry");

        jchkExtract.setText("Tooth Extraction");

        jchkRoot.setText("Root canal");

        jbtnCalculate.setText("Calculate");
        jbtnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalculateActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTotal.setText("Total: ");
        lblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchkCheck)
                    .addComponent(jchkExtract)
                    .addComponent(jchkFilling)
                    .addComponent(jchkBridge)
                    .addComponent(jbtnCalculate)
                    .addComponent(jchkRoot)
                    .addComponent(jchkCosmetic))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jchkCheck)
                .addGap(8, 8, 8)
                .addComponent(jchkBridge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchkFilling)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchkExtract)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchkRoot)
                .addGap(9, 9, 9)
                .addComponent(jchkCosmetic)
                .addGap(27, 27, 27)
                .addComponent(jbtnCalculate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clinic.png"))); // NOI18N
        jLabel1.setText("Aliens Clinic");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jchkBridgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkBridgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchkBridgeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void jchkCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jchkCheckMouseClicked
        
    }//GEN-LAST:event_jchkCheckMouseClicked

    private void jbtnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalculateActionPerformed
        String treat = "";
        int costs = 0;
        lblTotal.setText("");
        
        if (jchkCheck.isSelected()){
            treat = treat + "\n -" + jchkCheck.getText();
            costs = costs + 30;
        }
        if (jchkBridge.isSelected()){
            treat = treat + "\n -" + jchkBridge.getText();
            costs = costs + 200;
        }
        if (jchkFilling.isSelected()){
            treat = treat + "\n -" + jchkFilling.getText();
            costs = costs + 60;
        }
        if (jchkExtract.isSelected()){
            treat = treat + "\n -" + jchkExtract.getText();
            costs = costs + 40;
        }
        if (jchkRoot.isSelected()){
            treat = treat + "\n -" + jchkRoot.getText();
            costs = costs + 100;
        }
        if (jchkCosmetic.isSelected()){
            treat = treat + "\n -" + jchkCosmetic.getText();
            costs = costs + 600;
        }
        lblTotal.setText("Total: USD " + costs );
    }//GEN-LAST:event_jbtnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(costCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(costCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(costCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(costCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new costCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtnCalculate;
    private javax.swing.JCheckBox jchkBridge;
    private javax.swing.JCheckBox jchkCheck;
    private javax.swing.JCheckBox jchkCosmetic;
    private javax.swing.JCheckBox jchkExtract;
    private javax.swing.JCheckBox jchkFilling;
    private javax.swing.JCheckBox jchkRoot;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}