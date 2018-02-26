
import java.sql.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umit Kilic
 */
public class ConnecttoDB {
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/ogrenciler";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    Connection conn=null;
    
    public Connection connectdb(){
        
    
    
        try{
            Class.forName(DATABASE_DRIVER);
            
            System.out.println("Connecting to db...");
            conn=DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
            System.out.println("Connected...");
        }catch(Exception e){
            System.out.println("baglanamadi...");
            e.printStackTrace();
            
        }
        return conn;
    }
    
    public Connection disconnectdb(Connection c){
        if(c!=null){
            try{
                c.close();
                c=null;
                System.out.println("connection has closed.= "+c);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return c;
    }
}
