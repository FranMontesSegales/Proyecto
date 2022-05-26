
package bbdd;

import java.sql.*;
import javax.swing.JOptionPane;


public class conexion {
	
	static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String dbName = "pokedex";
	static String url = "jdbc:mysql://localhost:3306/" + dbName + timeZone;
	static String user = "root";
	static String pass = "";
	static String driver = "com.mysql.cj.jdbc.Driver";
    
    static Connection conexion;
    static Statement consulta;
    static ResultSet resultado;
    
    public static Connection Conectar(){
    	try {
           Class.forName(driver) ;
           conexion = DriverManager.getConnection(url, user, pass);
           System.out.println("Base de datos situada en :\n "+url);
           consulta = conexion.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
		return conexion;
    }
    
    public static ResultSet EjecutarSentencia(String Sentencia){
        try {
        	resultado = consulta.executeQuery(Sentencia);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
      
    public static void ejecutarUpdate(String sentencia){
    	try{
    		consulta.executeUpdate(sentencia);
    		System.out.println("Done: " + sentencia);
    	}catch(SQLException e){
    		JOptionPane.showMessageDialog(null, e.getMessage());
        System.out.println("Error: " + sentencia);
    	} 
    }
    
    public static void CerrarConexion(){
        try{
        	consulta.close();
        }catch(Exception e){}
    }


    
}