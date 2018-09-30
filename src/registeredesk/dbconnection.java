/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeredesk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Xerllene Kwamboka
 */
public class dbconnection {
        private Connection dbconnection;
    public Connection connect(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("succeful connection");
        }
        catch (ClassNotFoundException cnfe){
            System.out.println("connection error"+cnfe);
        }
        String url="jdbc:mysql://localhost:3306/admins?zeroDateTimeBehavior=convertToNull";
        try{
            dbconnection= (Connection) DriverManager.getConnection(url,"root","");
            System.out.println("connected database");
        }
        catch(SQLException se){
            System.out.println("no database connection"+se);
        }
        return dbconnection;
       
    }
    
            
    
}


