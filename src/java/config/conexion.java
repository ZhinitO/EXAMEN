package config;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class conexion { 
    Connection conectar = null;
        public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDVElectro","root","12345678");
            System.out.println(" conectado ");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar: "+e.getMessage());
        }
        return conectar;
    }  
    
//     public static void main(String[] args) {
//        Conexion con = new Conexion();
//        con.conectar();
//}
   

//        SELECT * from CLIENTE WHERE CORREO_CLI='A18104074@IDAT.EDU.PE' and  (aes_decrypt(CLAVE_CLI,'aes')) ='75097290';


}
