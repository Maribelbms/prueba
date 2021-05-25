
package com.emergentes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionesDB {
    static String url ="jdbc:mysql://localhost:3306/bd_libros";
    static String usuario ="root";
    static String password = "";
    
    protected Connection conn = null;
    
    public ConexionesDB() throws SQLException{
       try{
           Class.forName("com.mysql.jdbc.Driver");
            
           conn = DriverManager.getConnection(url,usuario,password);
       } catch(ClassNotFoundException ex){
           System.out.println("Falta driver " +ex.getMessage());
       }catch(SQLException ex){
           System.out.println("Error de sql "+ex.getMessage());
           
       }
    }
    
    public Connection conectar(){
        return conn;
    }
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al conectar "+ex.getMessage());
        }
    }
}
   