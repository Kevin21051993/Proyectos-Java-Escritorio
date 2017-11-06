package dao;
import beans.*;
import util.Conexion;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Negocio {
    
    public void Adicion(String numTel, String nombCli, int tipo, int cantidad){
        try{
           //llamando al procedimiento
           PreparedStatement st=Conexion.Conecta().prepareStatement("insert into telefono values(?,?,?,?)");
           st.setString(1,numTel);
           st.setString(2,nombCli);
           st.setInt(3,tipo);
           st.setInt(4,cantidad);
           st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    //Listado total de Llamadas
     public List<Telefono> LisLlam(){
        List<Telefono> lis=new ArrayList();
        try{
           String sql="select * from telefono";
           PreparedStatement st = Conexion.Conecta().prepareStatement(sql);
           ResultSet rs = st.executeQuery();
           while(rs.next()){
               Telefono c = new Telefono();
               c.setNumTel(rs.getString(1));
               c.setNombCli(rs.getString(2));
               c.setTipo(rs.getInt(3));
               c.setCantidad(rs.getInt(4));
               lis.add(c);
           }
        }catch(Exception ex){
           ex.printStackTrace();
        }
           return lis;
     }
     
     //Listado de llamadas realizadas por cierto numero de telefono
     public List<Telefono> BuscarLlamadas(String nroTel){
        List<Telefono> lis=new ArrayList();
        try{
           String sql= " select * from telefono where telefono.NroTelefono="+nroTel+" ";
           PreparedStatement st = Conexion.Conecta().prepareStatement(sql);
           ResultSet rs = st.executeQuery();
           while(rs.next()){
               Telefono c = new Telefono();
               c.setNumTel(rs.getString(1));
               c.setNombCli(rs.getString(2));
               c.setTipo(rs.getInt(3));
               c.setCantidad(rs.getInt(4));
               lis.add(c);
           }
        }catch(Exception ex){
           ex.printStackTrace();
        }
        return lis;
     }
    
    //Listamos las llamadas Ordenadas por Nombre de los clientes
     public List<Telefono> LisOrd(){
        List<Telefono> lis=new ArrayList();
        try{
           String sql=" select * from telefono order by telefono.NombreCliente asc ";
           PreparedStatement st = Conexion.Conecta().prepareStatement(sql);
           ResultSet rs = st.executeQuery();
           while(rs.next()){
               Telefono c = new Telefono();
               c.setNumTel(rs.getString(1));
               c.setNombCli(rs.getString(2));
               c.setTipo(rs.getInt(3));
               c.setCantidad(rs.getInt(4));
               lis.add(c);
           }
        }catch(Exception ex){
           ex.printStackTrace();
        }
           return lis;
     }
     
    //Anular llamadas realizadas por cierto numero de telefono
    public void AnulaLlam(String numeroTel){
        try{
           String sql="delete from telefono where telefono.NroTelefono="+numeroTel+" ";
           PreparedStatement st = Conexion.Conecta().prepareStatement(sql);
           st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
     
    
    
}
