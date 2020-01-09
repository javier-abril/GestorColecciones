/* 
Clase creada para almacenar los usuarios de login

@autor Fco. Javier Abril Lopez
*/

package gestorcolecciones;

import java.io.Serializable;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.303F17EB-7712-439B-94C7-BB4B2E7E0E23]
// </editor-fold> 
//Usamos la serialización para salvar el objeto usuario y cargarlo en el login
public class Usuario implements Serializable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A5AC2B9C-8845-39B9-C80D-BFDFCAFEF49F]
    // </editor-fold> 
    private String nombreCompleto;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F73E6194-BEA9-FEC4-63F4-183D49AA7F1C]
    // </editor-fold> 
    private String nombreUsuario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D22F1C8B-07F8-7747-2C5C-0B2A39510E30]
    // </editor-fold> 
    private String password;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D1C65196-8E32-D254-06C6-486722F44BCD]
    // </editor-fold> 
    private boolean esAdmin;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.329DC345-0CDF-2C2B-12BB-5E61AC1ED12F]
    // </editor-fold> 
    public Usuario () {
    }
    
    public Usuario (String nombre, String user, String password, boolean esAdmin) {
        
        this.nombreCompleto =nombre;
        this.nombreUsuario = user;
        this.password = password;
        this.esAdmin = esAdmin;
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.360E9B0E-855A-87BD-3658-40ECA05031D6]
    // </editor-fold> 
    public boolean getEsAdmin () {
        return esAdmin;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.760115C3-5AB7-D41B-3752-02F885881F96]
    // </editor-fold> 
    public void setEsAdmin (boolean val) {
        this.esAdmin = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D33AD1C6-80EF-0085-B93A-D51D8483A191]
    // </editor-fold> 
    public String getNombreCompleto () {
        return nombreCompleto;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1385C562-2C0D-344C-FB31-831242AEA39C]
    // </editor-fold> 
    public void setNombreCompleto (String val) {
        this.nombreCompleto = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.854ED656-414F-5C74-5CAD-7B2F42D3FE4D]
    // </editor-fold> 
    public String getNombreUsuario () {
        return nombreUsuario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.34A6CB31-2707-968C-BE8D-133966961999]
    // </editor-fold> 
    public void setNombreUsuario (String val) {
        this.nombreUsuario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CA7E9C2D-8925-56FF-E238-81DABB29081D]
    // </editor-fold> 
    public String getPassword () {
        return password;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CADDE4A3-8764-3E95-7F6C-98EB038A45CA]
    // </editor-fold> 
    public void setPassword (String val) {
        this.password = val;
    }

}

