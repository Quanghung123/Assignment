/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nguyen
 */
public class DBConnect {
    public static Connection getConnection() {
        Connection cons = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            //cons = DriverManager.getConnection("jdbc:sqlsever://Assignment3.mssql.somee.com");
            cons = DriverManager.getConnection("jdbc:sqlserver://Assignment3.mssql.somee.com;"
                    + "databaseName=Assignment3;"
                    + "user=phamquanghung_SQLLogin_1;"
                    + "password=lthdm7nzsw");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }
 
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
