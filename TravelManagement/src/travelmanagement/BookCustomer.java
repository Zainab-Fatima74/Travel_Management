/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;


/**
 *
 * @author Hasnain bhatti
 */
public class BookCustomer extends javax.swing.JFrame {
private DatabaseConnection dbconn;//object of DatabaseConnection class
private PreparedStatement pst;//databse statement to insert record
private Connection conn;// use for database  connection
 private java.sql.Statement statement;// sattement variable to execute sql statement
  private   java.sql.ResultSet resultSet; // to get result from database
  private int total;//variable to store the value of total bill
  boolean validID;// variable to check valid pkg id is enterd or not in the form
    /**
     * Creates new form BookCustomer
     */
    public BookCustomer() {
        initComponents();
        dbconn =  new DatabaseConnection();//creatio of object of databaseconnection class
        this.conn = dbconn.getConnection();
            total =0;//initilalizing with zero at start
            validID = false;//set to false at initial
    }
// this method insert the record in database 
    private void addCustomer(){
        try{
    
String insertquery = "INSERT INTO Customer (c_name,c_cnic,c_address,c_contact,c_pakage,c_date,c_seat,c_gender,c_total)"
         +"VALUES(?,?,?,?,?,?,?,?,?)"  ; 
pst = conn.prepareStatement(insertquery);

pst.setString(1, nameTf.getText());
pst.setString(2, cnicTf.getText());
pst.setString(3, addressTf.getText());
pst.setString(4, cnTf.getText());
pst.setString(5, pkgidTf.getText());

pst.setString(6,new Date().toString());
pst.setString(7, seatTf.getText());
pst.setString(8, jComboBox1.getSelectedItem().toString());
pst.setString(9, String.valueOf(total));
pst.executeUpdate();
 JOptionPane.showMessageDialog(null, "Record add successfully");
 // set textfiels empty
 nameTf.setText("");
 cnicTf.setText("");
 addressTf.setText("");
 cnTf.setText("");
  pkgidTf.setText("");
    seatTf.setText("");
 pst.close();
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Something went wrong......try again");
                
            } 
    }
    
    // method to calculat price
    private void calculatePrice(){
        try{
                  String query = "select price from Pakage where Pakage_ID = ?"; //query of selection of price 
                pst = conn.prepareStatement(query);


pst.setString(1, pkgidTf.getText());
resultSet =pst.executeQuery();
while(resultSet.next()){
    // multiply to no of seats with price and store it in total price
    try{
    total =  Integer.parseInt( resultSet.getObject("price").toString())* Integer.parseInt(seatTf.getText());
    }
    catch(NumberFormatException e){ // catch number format exception while converting string to number
        JOptionPane.showMessageDialog(this, "Please enter numbers oly");
    }
}
pst.close();

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, "something went wrong");
                    System.out.println(e);
                }
    }
    // methid ends
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        cnicTf = new javax.swing.JTextField();
        addressTf = new javax.swing.JTextField();
        cnTf = new javax.swing.JTextField();
        pkgidTf = new javax.swing.JTextField();
        seatTf = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        backButon = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking");

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setText("Customer Booking");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("CNIC No");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("Contact Number");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Pakage ID");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setText("Number Of Seats");

        nameTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTfKeyTyped(evt);
            }
        });

        cnicTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnicTfKeyTyped(evt);
            }
        });

        addressTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressTfKeyTyped(evt);
            }
        });

        cnTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnTfKeyTyped(evt);
            }
        });

        pkgidTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pkgidTfFocusLost(evt);
            }
        });
        pkgidTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pkgidTfKeyTyped(evt);
            }
        });

        seatTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                seatTfKeyTyped(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        backButon.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        backButon.setText("Back");
        backButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setText("Gender");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(cnTf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(94, 94, 94)
                                .addComponent(addressTf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(108, 108, 108)
                                .addComponent(nameTf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(82, 82, 82)
                                .addComponent(cnicTf))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(backButon, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(seatTf)
                                            .addComponent(pkgidTf)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cnicTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cnTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pkgidTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(seatTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seatTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seatTfKeyTyped
        // TODO add your handling code here:
        // store the typed key in a variable
         char a = evt.getKeyChar();
         // check if there is any aplhabet typed
                if(a>='0'&&a<='9'){
                    
                }
                else{
                   JOptionPane.showMessageDialog(null, "Please enter only numbers");
                    evt.consume();//delete the aplhabet that typed
                }
    }//GEN-LAST:event_seatTfKeyTyped

    private void pkgidTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pkgidTfKeyTyped
        // TODO add your handling code here:
        // store the typed key in a variable
         char a = evt.getKeyChar();
         // check if there is any aplhabet typed
                if(a>='0'&&a<='9'){
                    
                }
                else{
                   JOptionPane.showMessageDialog(null, "Please enter only numbers");
                    evt.consume();//delete the aplhabet that typed
                }
    }//GEN-LAST:event_pkgidTfKeyTyped

    private void cnTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnTfKeyTyped
        // TODO add your handling code here:
        // store the typed key in a variable
         char a = evt.getKeyChar();
         // check if there is any aplhabet typed
                if(a>='0'&&a<='9'){
                    
                }
                else{
                   JOptionPane.showMessageDialog(null, "Please enter only numbers");
                    evt.consume();//delete the aplhabet that typed
                }
    }//GEN-LAST:event_cnTfKeyTyped

    private void cnicTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnicTfKeyTyped
        // TODO add your handling code here:
        // store the typed key in a variable
         char a = evt.getKeyChar();
         // check if there is any aplhabet typed
                if(a>='0'&&a<='9'){
                    
                }
                else{
                   JOptionPane.showMessageDialog(null, "Please enter only numbers");
                    evt.consume();//delete the aplhabet that typed
                }
    }//GEN-LAST:event_cnicTfKeyTyped

    private void nameTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTfKeyTyped
        // TODO add your handling code here:
        // store the typed key in a variable
         char a = evt.getKeyChar();
         // check if there is any aplhabet typed
                if(a>='a'&&a<='z'||a>='A'&&a<='Z'){
                    
                }
                else{
                   JOptionPane.showMessageDialog(null, "Please enter only aplhabets");
                    evt.consume();//delete the aplhabet that typed
                }
    }//GEN-LAST:event_nameTfKeyTyped

    private void addressTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressTfKeyTyped
       
    }//GEN-LAST:event_addressTfKeyTyped

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        // check for empty txtboxes if empty then show error mesage
        if(nameTf.getText().equals("")||cnicTf.getText().equals("")||addressTf.getText().equals("")||seatTf.getText().equals("")||cnTf.getText().equals("")||pkgidTf.getText().equals("")){
          JOptionPane.showMessageDialog(this, "Please fill out each information");
        }
        else if(!validID){
            JOptionPane.showMessageDialog(this, "Please enter a valid pakage id to proceedd");
        }
        else{
            
            calculatePrice();
            addCustomer();
             JOptionPane.showMessageDialog(this, "Total bill is:\t "+total);
        }
    }//GEN-LAST:event_submitButtonActionPerformed
// focus listner on pakage id field to check a valid id is entered or not
    private void pkgidTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pkgidTfFocusLost
        // TODO add your handling code here:
         try{
        
               
                statement = conn.createStatement();
                resultSet = statement.executeQuery("select Pakage_ID from Pakage");
                while(resultSet.next()){
            if(resultSet.getObject("Pakage_ID").toString().equals(pkgidTf.getText())){
                validID = true;
            }
                    
                }
              statement.close();
            }
            catch(Exception e){
                
            } 
    }//GEN-LAST:event_pkgidTfFocusLost

    private void backButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_backButonActionPerformed

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
            java.util.logging.Logger.getLogger(BookCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTf;
    private javax.swing.JButton backButon;
    private javax.swing.JTextField cnTf;
    private javax.swing.JTextField cnicTf;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField pkgidTf;
    private javax.swing.JTextField seatTf;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}