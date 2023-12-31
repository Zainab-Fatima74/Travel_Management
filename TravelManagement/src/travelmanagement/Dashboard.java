/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelmanagement;

/**
 *
 * @author zaina
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        jLabel1 = new javax.swing.JLabel();
        cBooking = new javax.swing.JButton();
        ViewCust = new javax.swing.JButton();
        vPakage = new javax.swing.JButton();
        vPakage1 = new javax.swing.JButton();
        vPakage2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        jLabel1.setText("Welcome To Travel Management System");

        cBooking.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        cBooking.setText("Customer Booking");
        cBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBookingActionPerformed(evt);
            }
        });

        ViewCust.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        ViewCust.setText("View Customers");
        ViewCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCustActionPerformed(evt);
            }
        });

        vPakage.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        vPakage.setText("View Pakages");
        vPakage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vPakageActionPerformed(evt);
            }
        });

        vPakage1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        vPakage1.setText("Add Pakages");
        vPakage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vPakage1ActionPerformed(evt);
            }
        });

        vPakage2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        vPakage2.setText("LogOut");
        vPakage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vPakage2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vPakage2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vPakage1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vPakage, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewCust, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewCust, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vPakage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vPakage1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vPakage2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBookingActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BookCustomer().setVisible(true);
    }//GEN-LAST:event_cBookingActionPerformed

    private void ViewCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCustActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ViewCustomer().setVisible(true);
    }//GEN-LAST:event_ViewCustActionPerformed

    private void vPakageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vPakageActionPerformed
        // TODO add your handling code here:
                this.setVisible(false);
        new ViewPakage().setVisible(true);
    }//GEN-LAST:event_vPakageActionPerformed

    private void vPakage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vPakage1ActionPerformed
        // TODO add your handling code here:
               this.setVisible(false);
        new AddPakage().setVisible(true);
    }//GEN-LAST:event_vPakage1ActionPerformed

    private void vPakage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vPakage2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LogInForm().setVisible(true);
    }//GEN-LAST:event_vPakage2ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewCust;
    private javax.swing.JButton cBooking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton vPakage;
    private javax.swing.JButton vPakage1;
    private javax.swing.JButton vPakage2;
    // End of variables declaration//GEN-END:variables
}
