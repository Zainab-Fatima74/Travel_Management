/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Hasnain bhatti
 */
public class DatabaseConnection {
  
    private Connection conn;
    public DatabaseConnection(){
      conn = null;
      connectionMethod();
    }
    public void connectionMethod(){
        try{
     Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
     
conn=DriverManager.getConnection("jdbc:ucanaccess://C://Users//zaina//Downloads//Travel.accdb");
 System.out.print("connected");
        }
           catch(Exception e){
      System.out.print("Driver not found");}
    }
    public Connection getConnection(){
        return conn;
    }
}
