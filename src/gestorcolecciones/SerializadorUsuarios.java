/* 
Clase encargada de cargar y guardar los objetos usuario serializados

@autor Fco. Javier Abril Lopez
*/

package gestorcolecciones;

import java.util.*;
import java.io.*; //Para los input-output stream de usuarios
import javax.swing.JOptionPane; //Para los msgbox

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.ABAC025C-43F3-0E45-15DB-CAD14C04FAE0]
// </editor-fold> 
public class SerializadorUsuarios {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5711AB0A-A017-15EA-0C0A-222C6ECD1E4E]
    // </editor-fold> 
    private List<Usuario> listaUsuarios=new ArrayList<Usuario>();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AFDE686E-1FEA-26F9-0C60-3D0B467E333F]
    // </editor-fold> 
    public SerializadorUsuarios () {
        this.leeFicheroUsuarios();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.16457B6E-AE8F-A086-28B0-8AF87FC662A2]
    // </editor-fold> 
    public List<Usuario> getListaUsuarios () {
        return listaUsuarios;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.323F904C-42C1-36E8-3761-BFFEE35DD53D]
    // </editor-fold> 
    public void GuardaListaUsuarios (List<Usuario> lista) {
        
        try{
            FileOutputStream fout = new FileOutputStream("usuarios.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(lista);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.36C9FF9D-24C0-4196-6F45-4C8093B1A0F0]
    // </editor-fold> 
    private void leeFicheroUsuarios () {
    
        try{
            
            FileInputStream fin = new FileInputStream("usuarios.dat");
            ObjectInputStream ois = new ObjectInputStream(fin);

            this.listaUsuarios= (List<Usuario>) ois.readObject();

            ois.close();
            
            
        }
        catch(Exception ex){
            //Si da error añadimos el usuario admin a la lista
            Usuario admin = new Usuario();
            admin.setEsAdmin(true);
            admin.setNombreUsuario("admin");
            admin.setPassword("admin");
            
            this.listaUsuarios.add(admin);
            
        }
        
    }

}

