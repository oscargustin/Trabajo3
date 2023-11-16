
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Productos;


public class ProductosDAO {
  public boolean IngresarProductos(Productos prod){
      boolean resultado=false;  
      try{
          Connection con=Conexion.getConexion();
          String query="insert into tbking(id,nombre,rut,producto) values(?,?,?,?)";
          PreparedStatement ps=con.prepareStatement(query);
          
          ps.setInt(1, prod.getCod());
          ps.setString(2 ,prod.getNombre());
          ps.setString(3, prod.getRut());
          ps.setString(4, prod.getProducto());
          
          resultado=ps.executeUpdate()==1;
          ps.close();
      }catch(SQLException | ClassNotFoundException ex){
          Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null,ex);
      }return resultado;
  }
  
  public boolean ModificarProductos(Productos pro){
      boolean resultado=false;
      try{
          Connection con=Conexion.getConexion() ;
          String query ="update tbking set nombre=?, rut=?, producto=? where id=?";
          PreparedStatement ps=con.prepareStatement(query);
          
          ps.setString(1, pro.getNombre());
          ps.setString(2, pro.getRut());
          ps.setString(3, pro.getProducto());
          ps.setInt(4, pro.getCod());
          
          resultado=ps.executeUpdate()==1;
          ps.close();
          
      } catch(SQLException ex){
          Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
      }catch (ClassNotFoundException ex){
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null,ex);
      }return resultado;
  }
  public boolean Eliminarproductos(String codigo){
      boolean resultado=false;
      try{
          Connection con=Conexion.getConexion();
          String query="delete from tbking where id=?'"+codigo+"'";
          PreparedStatement ps=con.prepareStatement(query);
          
          //ps.setString(1, rut);
          resultado=ps.executeUpdate()==1;
          ps.close();
      }catch(SQLException ex){
          Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null,ex);
      }catch(ClassNotFoundException ex){
          Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null,ex);
      }
      return resultado;
  }
  
  public ArrayList<Productos> obtenerTodo()
    {
        ArrayList <Productos> alumnos=new ArrayList<Productos>();
        try {
            Connection con=Conexion.getConexion();
            String query="select * from Productos";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Productos Prod;
            while(rs.next())
            {
                Prod=new Productos(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                alumnos.add(Prod);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumnos;
    }
  public boolean modificarAlumno(Productos Prod)
    {
        boolean resultado=false;
        try {
            Connection con =Conexion.getConexion();
            String query="update alumno set nombre=?,nota1=?,nota2=?,nota3=?,trabajogrupal=? where rut=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, Prod.getCod());
             ps.setString(2, Prod.getNombre());
            ps.setString(3, Prod.getRut());
            ps.setString(4, Prod.getProducto());
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}


