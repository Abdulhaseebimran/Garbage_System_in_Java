/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Connection;

/**
 *
 * @author ABDUL HASEEB
 */
import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class DB_Connection {

    Connection con;
    Statement st;
    ResultSet rs;

    DB_Connection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Garbage", "root", "");
            st = con.createStatement();
            System.out.println("Db is connected");

        } catch (Exception e) {

            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        DB_Connection db = new DB_Connection();
    }

}
