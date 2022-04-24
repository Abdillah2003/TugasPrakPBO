/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Lenovo
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class koneksi {
    
    String dbUrl = "jdbc:mysql://localhost/pboprak";
    String dbUsername = "root";
    String dbPassword = "";
    static final String driver = "com.mysql.cj.jdbc.Driver";
    Connection konek;
    Statement statement;

    public koneksi() {
        try{
            Class.forName(driver);
            konek=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
    }
    
    
}
