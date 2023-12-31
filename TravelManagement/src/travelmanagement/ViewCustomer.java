/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zaina
 */
public class ViewCustomer extends javax.swing.JFrame {
    String name,addrss,cnic,contact,pakage,date,seats,gender,bill;
private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private Connection conn = null;
    DatabaseConnection dbConn;
  
    /**
     * Creates new form ViewCustomer
     */
    public ViewCustomer() {
        initComponents();
        dbConn = new DatabaseConnection();
        this.conn = dbConn.getConnection();
        loadData();
    }
    // method to delete customer from database
    private void delCustomer(){
        try{
        int index ;//to get index of selected row
       
    index =  jTable3.getSelectedRow();
        
    DefaultTableModel dm = (DefaultTableModel)jTable3.getModel();
cnic =dm.getValueAt(index, 1).toString();//get the value of cnic column
  
    dm.removeRow(index);}// remove the selected row
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "please select customer");
        }
        // deleted from database
   try{
                  String query = "delete from Customer where c_cnic = ?"; //query of delete 
                preparedStatement = conn.prepareStatement(query);

preparedStatement.setString(1, cnic);

preparedStatement.executeUpdate();
JOptionPane.showMessageDialog(this, "record deleted");
loadData();
preparedStatement.close();

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, "record did not deleted");
                    System.out.println(e);
                }
    }
    // method to load datafrom databsase to table
private void loadData(){
    try{
        DefaultTableModel dm = (DefaultTableModel)jTable3.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
               jTable3.removeAll();
                statement = conn.createStatement();
                resultSet = statement.executeQuery("select * from Customer");
                while(resultSet.next()){
              name  =resultSet.getObject("c_name").toString();
               cnic  =resultSet.getObject("c_cnic").toString();
                   addrss  =resultSet.getObject("c_address").toString();
                             contact  =resultSet.getObject("c_contact").toString();
                                   pakage  =resultSet.getObject("c_pakage").toString();
                                    date  =resultSet.getObject("c_date").toString(); 
                                     seats  =resultSet.getObject("c_seat").toString(); 
                                 
                                       gender  =resultSet.getObject("c_gender").toString();
                                        bill      =resultSet.getObject("c_total").toString(); 
                   String tbData[] ={name,cnic,addrss,contact,pakage,date,seats,gender,bill}; 
                    DefaultTableModel tbModel = (DefaultTableModel)jTable3.getModel();
                    tbModel.addRow(tbData);
                    
                }
              statement.close();
            }
            catch(Exception e){
                
            } 
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        cancelbookingbutton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Details");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Customer Details");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "CNIC No", "Address", "Contact No", "Pakage Id", "Date", "Number Of seats", "Gender", "Bill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jScrollPane1.setViewportView(jScrollPane4);

        cancelbookingbutton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cancelbookingbutton.setText("Cancel Booking");
        cancelbookingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbookingbuttonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(359, 359, 359)
                                .addComponent(cancelbookingbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 381, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbookingbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbookingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbookingbuttonActionPerformed
        // TODO add your handling code here:
        delCustomer();
    }//GEN-LAST:event_cancelbookingbuttonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelbookingbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
