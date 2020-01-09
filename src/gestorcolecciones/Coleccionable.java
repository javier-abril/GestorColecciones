/* 
Clase encargada de almacenar los objetos de la colección

@autor Fco. Javier Abril Lopez
*/

package gestorcolecciones;

import java.io.Serializable;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.BD515E31-603A-0091-EFCE-FBD91DEFB848]
// </editor-fold> 
public class Coleccionable implements Serializable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.739690B2-D2E8-E3A7-1B92-9379C26AB1C6]
    // </editor-fold> 
    private String titulo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7D523D2B-2DEF-16EF-7985-15F53417797A]
    // </editor-fold> 
    private Localizacion ubicacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.923CC139-3957-88EB-4D6A-8C9E7B6E1ED5]
    // </editor-fold> 
    private String anioPublicacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.088232BC-447E-D348-BC26-D06AF28C2F69]
    // </editor-fold> 
    private String autor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A0FFBEDB-C971-8104-3525-B043AEFDCEDA]
    // </editor-fold> 
    private String codigoBarras;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A8591830-7AA1-6E2E-F6DA-7CF112E29AC9]
    // </editor-fold> 
    private String idioma;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.622CD83F-8A13-E5BD-AE49-B90D86BCD5CC]
    // </editor-fold> 
    private Tematica tematica;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7B557F78-EDA5-F06F-E6D8-8432CFF52CF1]
    // </editor-fold> 
    public Coleccionable () {
    }
    
    public Coleccionable(String titulo, String autor, String CodigoBarras, 
            String anioPublicacion,String idioma, Localizacion ubicacion,Tematica tematic){
        
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
        this.codigoBarras = CodigoBarras;
        this.idioma = idioma;
        this.tematica = tematic;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E10BD72B-7F31-8867-2664-568E09F932C5]
    // </editor-fold> 
    public String getAutor () {
        return autor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1A8A3E27-524C-F0E4-11CD-3C79CE8AF642]
    // </editor-fold> 
    public void setAutor (String val) {
        this.autor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1AA200B3-E783-2144-0A50-12C70D3917B0]
    // </editor-fold> 
    public String getCodigoBarras () {
        return codigoBarras;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B19FC67-3404-4075-8D28-59917FA4F035]
    // </editor-fold> 
    public void setCodigoBarras (String val) {
        this.codigoBarras = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.12D40DBF-3093-9A55-624A-77DDA13AA913]
    // </editor-fold> 
    public String getAnioPublicacion () {
        return anioPublicacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C4DE0CB7-E64A-F549-6844-682B54AC772C]
    // </editor-fold> 
    public void setFechaPublicacion (String val) {
        this.anioPublicacion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3B3D9142-F89B-79AD-9662-7CBD40CA34F8]
    // </editor-fold> 
    public String getIdioma () {
        return idioma;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.862841D2-29D4-EEDA-1064-BDFA6DE6C4A9]
    // </editor-fold> 
    public void setIdioma (String val) {
        this.idioma = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4355B1B1-0C38-F7F7-62AA-5E96D8D8677B]
    // </editor-fold> 
    public Tematica getTematica () {
        return tematica;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2AB4B7A5-5819-0C1F-60D4-25A1FDE198A8]
    // </editor-fold> 
    public void setTematica (Tematica val) {
        this.tematica = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9DD47D41-D779-8DEA-7842-0FF8D1C596BE]
    // </editor-fold> 
    public String getTitulo () {
        return titulo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FD36B575-E776-B81B-C072-E37CED39EE92]
    // </editor-fold> 
    public void setTitulo (String val) {
        this.titulo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0C5E5934-12E5-2C99-22C7-08BEA7C5517B]
    // </editor-fold> 
    public Localizacion getUbicacion () {
        return ubicacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8EE320A8-B04E-CDD1-CAC2-7F5344253033]
    // </editor-fold> 
    public void setUbicacion (Localizacion val) {
        this.ubicacion = val;
    }

}

