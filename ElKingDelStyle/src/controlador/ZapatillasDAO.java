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
import modelo.Zapatillas;

/**
 *
 * @author Acid8
 */
public class ZapatillasDAO {
    public Zapatillas buscarPolerones(String cod){
        Zapatillas Zap=null;
        try{
            Connection con=Conexion.getConexion();
            String query="select * from tbZapatillas where codigo='"+cod+"'";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Zap= new Zapatillas(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5));
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex1) {
            Logger.getLogger(PoleronesDAO.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return Zap;
    }
    
  public boolean IngresarProductos(Zapatillas Zapas){
      boolean resultado=false;  
      try{
          Connection con=Conexion.getConexion();
          String query="insert into tbZapatillas(cod,producto,cantidad,talla,color) values(?,?,?,?,?,?,?)";
          PreparedStatement ps=con.prepareStatement(query);
          
          ps.setString(1, Zapas.getCod());
          ps.setString(4, Zapas.getProducto());
          ps.setInt(5, Zapas.getCantidad());
          ps.setInt(6, Zapas.getTalla());
          ps.setString(7, Zapas.getColor());
          
          resultado=ps.executeUpdate()==1;
          ps.close();
      }catch(SQLException | ClassNotFoundException ex){
          Logger.getLogger(ZapatillasDAO.class.getName()).log(Level.SEVERE, null,ex);
      }return resultado;
  }
  
  public boolean ModificarProductos(Zapatillas Zapas){
      boolean resultado=false;
      try{
          Connection con=Conexion.getConexion() ;
          String query ="update tbZapatillas set nombre=?, rut=?, producto=?, cantidad=?,talla=?,color=? set where id=?";
          PreparedStatement ps=con.prepareStatement(query);
          
          ps.setString(1, Zapas.getCod());
          ps.setString(4, Zapas.getProducto());
          ps.setInt(5, Zapas.getCantidad());
          ps.setInt(6, Zapas.getTalla());
          ps.setString(7, Zapas.getColor());
          
          resultado=ps.executeUpdate()==1;
          ps.close();
          
      } catch(SQLException ex){
          Logger.getLogger(ZapatillasDAO.class.getName()).log(Level.SEVERE, null, ex);
      }catch (ClassNotFoundException ex){
            Logger.getLogger(ZapatillasDAO.class.getName()).log(Level.SEVERE, null,ex);
      }return resultado;
  }
  
  public boolean Eliminarproductos(String codigo){
      boolean resultado=false;
      try{
          Connection con=Conexion.getConexion();
          String query="delete from tbZapatillas where id=?'"+codigo+"'";
          PreparedStatement ps=con.prepareStatement(query);
          
          //ps.setString(1, rut);
          resultado=ps.executeUpdate()==1;
          ps.close();
      }catch(SQLException ex){
          Logger.getLogger(ZapatillasDAO.class.getName()).log(Level.SEVERE, null,ex);
      }catch(ClassNotFoundException ex){
          Logger.getLogger(ZapatillasDAO.class.getName()).log(Level.SEVERE, null,ex);
      }
      return resultado;
  }
  
    public ArrayList<Zapatillas> todasLasZapas()
    {
        ArrayList <Zapatillas> listaZapas=new ArrayList<Zapatillas>();
        try {
            Connection con=Conexion.getConexion();
            String query="select * from tbZapatillas";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Zapatillas zap;
            while(rs.next())
            {
                zap=new Zapatillas(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5));
                listaZapas.add(zap);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ZapatillasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ZapatillasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return listaZapas;
    }

}
