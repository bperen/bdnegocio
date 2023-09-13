

package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdnegocio","root","");
            
        } catch (Exception e){
            System.err.println("No se pudo establecer la conexion con la Base de datos. Error: "+e);
            
    }
}
    public Connection getConnection(){
        return con;
    }

    public Connection gertConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}