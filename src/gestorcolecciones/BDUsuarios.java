/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorcolecciones;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author X
 */
public class BDUsuarios {
    private List<Usuario> listaUsuarios=new ArrayList<Usuario>();
    private String ipsrv;
    private String bdNombre;
    private String user;
    private String pass;
    
    
    public BDUsuarios() {
        //this.ipsrv="84.120.35.254:3306";
        this.ipsrv = "localhost:3306";
        this.bdNombre = "gestorcolecciones";
        this.user="root";
        this.pass="";
        ConectaBD();
    }
    
    public BDUsuarios(String ipsrv, String dbName, String user, String password){
        this.ipsrv = ipsrv;
        this.bdNombre= dbName;
        this.user = user;
        this.pass=password;
        ConectaBD();
    }
    
    //Nos devuelve una lista de usuarios actualizada
    public List<Usuario> GetListaUsuarios(){
        //vaciamos lista
        listaUsuarios.clear();
        //conectamos y agregamos usuarios a la lista
        ConectaBD(); 
        
        return this.listaUsuarios;
        
    }
    
    public boolean CreaUser(Usuario user){
                
        try{

            Connection con = null;
            String sURL = "jdbc:mysql://" + this.ipsrv +"/" + this.bdNombre;
            con = DriverManager.getConnection(sURL,this.user,this.pass);
            
            Statement st = con.createStatement();
            
            int admin;
            
            if (user.getEsAdmin() == true)
                admin=1;
            else
                admin=0;
            
            st.executeUpdate("INSERT INTO usuarios (nombre, password, admin, nombrecomp) "
                    + "VALUES ('" + user.getNombreUsuario() + "', '" + user.getPassword() +
                    "', " + admin + ", '" + user.getNombreCompleto() + "')");
            
            con.close();
            return true;
            
          } catch (SQLException sqle) { 
            
              JOptionPane.showMessageDialog(null, "Error en la ejecución:" + sqle.getErrorCode() + 
                      sqle.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
              return false;
          }
        
    }
    
    public boolean BorraUser(String nombre){
        
        try{

            Connection con = null;
            String sURL = "jdbc:mysql://" + this.ipsrv +"/" + this.bdNombre;
            con = DriverManager.getConnection(sURL,this.user,this.pass);
            
            Statement st = con.createStatement();

            st.executeUpdate("Delete from usuarios where nombre = '" + nombre +"'");
            
            con.close();
            return true;
            
          } catch (SQLException sqle) { 
            
              JOptionPane.showMessageDialog(null, "Error en la ejecución:" + sqle.getErrorCode() + 
                      sqle.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
              return false;
          }
        
    }
    
    private void ConectaBD(){
        
        Usuario nuevoUser = new Usuario();
        
        try{

            Connection con = null;
            String sURL = "jdbc:mysql://" + this.ipsrv +"/" + this.bdNombre;
            con = DriverManager.getConnection(sURL,this.user,this.pass);
        
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuarios"); 
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                nuevoUser = new Usuario(rs.getString("nombrecomp"),rs.getString("nombre"),
                        rs.getString("password"),rs.getBoolean("admin"));
                this.listaUsuarios.add(nuevoUser);            
            }
            
            con.close();
            
          } catch (SQLException sqle) { 
            
              JOptionPane.showMessageDialog(null, "Error en la ejecución:" + sqle.getErrorCode() + 
                      sqle.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

          }
    }
    
}
