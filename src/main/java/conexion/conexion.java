package conexion;
import java.sql.*;

public class conexion {
     Connection con;
    public conexion(){
        try{
           Class. forName ("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3306/crudpromedio", "root","");
           System.out.println("Conexion exitosa");
            
        }catch(Exception e){
            System.out.println("No se puede conectar a la BD");
        }
}
   public Connection getConnection(){
    return con;  
}
}
