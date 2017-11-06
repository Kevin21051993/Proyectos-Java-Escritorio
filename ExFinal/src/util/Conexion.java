package util;
import java.sql.*;
public class Conexion {
public static Connection Conecta(){
   
     String Driver = "com.mysql.jdbc.Driver";
     String URL = "jdbc:mysql://localhost:3306/bdprestamo";
     String user = "root";
     String password = "";
        // conexion con  oracle
   /*
     String Driver = "oracle.jdbc.driver.OracleDriver";
     String URL = "jdbc:oracle:thin:@localhost:1521:XE";
     String user = "bdventas";
     String password = "1234";
     */
        //conexion con sql server
       
  /*
     String Driver = "sun.jdbc.odbc.JdbcOdbcDriver";
     String URL = "jdbc:odbc:Ventas";
     String user = "";
     String password = "";
    */
     Connection cn=null;   
     try{
        Class.forName(Driver);
       cn = DriverManager.getConnection(URL,user,password);
  System.out.print("ok");
     }catch(Exception ex){
         System.out.print(ex.getMessage());
     }
      return cn;     
    }
}
