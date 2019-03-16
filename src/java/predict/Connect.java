/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predict;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Connect {
    static Connection con=null;
    static Statement stm=null;
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    public static Connection connexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/db_memoire";
            String user="root";
            String pass="";
            con=DriverManager.getConnection(url, user, pass);
            System.out.println("ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
      return con; 
    }
    /*
    public static void main(String[] args) {
        System.out.println(Connect.connexion());
    }
*/
}
