package controlador;

import config.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Ccliente extends conexion {
    
    public boolean autenticacion(String usuario, String password){
        PreparedStatement ps=null;
        ResultSet rs = null;
        
        try {
            String s="SELECT * from CLIENTE WHERE CORREO_CLI=? and  (aes_decrypt(CLAVE_CLI,'aes')) =?";
            ps  = conectar().prepareStatement(s);
            ps.setString(1, usuario);
            ps.setString(2, password);
            rs=ps.executeQuery(); //Guardo mi consulta en el resultset            
            if(rs.absolute(1)){ //Si existe un registro retorname true;
                return true;
            }            
        } catch (Exception e) {
            System.err.println("Error"+e);
        } finally{
            try {
                if (conectar()!=null) conectar();
                if(ps!=null)ps.close();
                if(rs!=null)rs.close();
            } catch (Exception e) {
                System.err.println("Error"+e);
            }
        }        
        return false;
    }
    
}
