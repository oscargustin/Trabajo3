/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Polerones;

/**
 *
 * @author Acid8
 */
public class PoleronesDAO {
    public Polerones buscarPolerones(String cod){
        Polerones pol=null;
        try{
            Connection con=Conexion.getConexion();
            String query="select * from tbPolerones where codigo='"+cod+"'";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                pol= new Polerones(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex1) {
            Logger.getLogger(PoleronesDAO.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return pol;
    }
  public boolean IngresarProductos(Polerones Pole){
      boolean resultado=false;  
      try{
          Connection con=Conexion.getConexion();
          String query="insert into tbPolerones(cod,producto,cantidad,talla,color) values(?,?,?,?,?)";
          PreparedStatement ps=con.prepareStatement(query);
          
          ps.setString(1, Pole.getCod());
          ps.setString(4, Pole.getProducto());
          ps.setInt(5, Pole.getCantidad());
          ps.setString(6, Pole.getCierre());
          ps.setString(7, Pole.getColor());
          
          resultado=ps.executeUpdate()==1;
          ps.close();
      }catch(SQLException | ClassNotFoundException ex){
          Logger.getLogger(PoleronesDAO.class.getName()).log(Level.SEVERE, null,ex);
      }return resultado;
  }
  
  public boolean ModificarProductos(Polerones Pole){
      boolean resultado=false;
      try{
          Connection con=Conexion.getConexion() ;
          String query ="update tbPolerones producto=?, cantidad=?,talla=?,color=? set where id=?";
          PreparedStatement ps=con.prepareStatement(query);
          
          ps.setString(1, Pole.getCod());
          ps.setString(4, Pole.getProducto());
          ps.setInt(5, Pole.getCantidad());
          ps.setString(6, Pole.getCierre());
          ps.setString(7, Pole.getColor());
          
          resultado=ps.executeUpdate()==1;
          ps.close();
          
      } catch(SQLException ex){
          Logger.getLogger(PoleronesDAO.class.getName()).log(Level.SEVERE, null, ex);
      }catch (ClassNotFoundException ex){
            Logger.getLogger(PoleronesDAO.class.getName()).log(Level.SEVERE, null,ex);
      }return resultado;
  }
  
  public boolean Eliminarproductos(String codigo){
      boolean resultado=false;
      try{
          Connection con=Conexion.getConexion();
          String query="delete from tbPolerones where id=?'"+codigo+"'";
          PreparedStatement ps=con.prepareStatement(query);
          
          //ps.setString(1, rut);
          resultado=ps.executeUpdate()==1;
          ps.close();
      }catch(SQLException ex){
          Logger.getLogger(PoleronesDAO.class.getName()).log(Level.SEVERE, null,ex);
      }catch(ClassNotFoundException ex){
          Logger.getLogger(PoleronesDAO.class.getName()).log(Level.SEVERE, null,ex);
      }
      return resultado;
  }
  
    public ArrayList<Polerones> todosLosPolerones()
    {
        ArrayList <Polerones> listaPolerones=new ArrayList<Polerones>();
        try {
            Connection con=Conexion.getConexion();
            String query="select * from tbPolerones";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Polerones Pole;
            while(rs.next())
            {
               Pole=new Polerones(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
                listaPolerones.add(Pole);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PoleronesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PoleronesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return listaPolerones;
    }
}
