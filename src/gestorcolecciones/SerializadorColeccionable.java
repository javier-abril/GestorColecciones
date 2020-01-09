/* 
Clase encargada de cargar y guardar los objetos coleccionable serializados

@autor Fco. Javier Abril Lopez
*/

package gestorcolecciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JOptionPane;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.07603A13-C803-BDB5-CED2-ADFCB20B7351]
// </editor-fold> 
public class SerializadorColeccionable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.43400348-38BE-F33B-6D20-2E78BA674616]
    // </editor-fold> 
    private List<Coleccionable> listaColeccionables;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5F6C5814-5ED5-58D2-1DBC-EC77A0756646]
    // </editor-fold> 
    public SerializadorColeccionable () {
        listaColeccionables = new ArrayList<Coleccionable>();
        this.LeeFicheroColeccion();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7B8BD514-AB70-7998-DBA1-BA2FED70940F]
    // </editor-fold> 
    public List<Coleccionable> getListaColeccionables () {
        return listaColeccionables;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.86B82531-9180-FEE5-0BD2-7E6AB47EA2CA]
    // </editor-fold> 
    public void setListaColeccionables (List<Coleccionable> val) {
        this.listaColeccionables = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E4876829-BEC9-F57D-4E3D-113EE0DC46D2]
    // </editor-fold> 
    public void GuardaListaColeccionable (List<Coleccionable> lista) {
        
        try{
            FileOutputStream fout = new FileOutputStream("coleccion.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(lista);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3BCE54D9-FAA1-788A-B391-83EF6599A5A9]
    // </editor-fold> 
    private void LeeFicheroColeccion () {
        
        try{
            
            FileInputStream fin = new FileInputStream("coleccion.dat");
            ObjectInputStream ois = new ObjectInputStream(fin);

            this.listaColeccionables= (List<Coleccionable>) ois.readObject();

            ois.close();
                    
        }
        catch(Exception ex){
            //Si da error no mostramos nada
            
        }
        
    }

}

