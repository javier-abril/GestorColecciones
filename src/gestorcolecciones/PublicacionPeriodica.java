/* 
Clase hija de coleccionable que almacena los coleccionables tipo PublicacionPeriodica

@autor Fco. Javier Abril Lopez
*/

package gestorcolecciones;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.0E1ED604-0A47-51F8-32A7-E7B347DB48F2]
// </editor-fold> 
public class PublicacionPeriodica extends Coleccionable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DA465690-9593-0859-385F-3B10D114025C]
    // </editor-fold> 
    private TipoPublicacion tipoPublicacion;


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3DB50D13-4B16-4EDE-7C56-2D3146B95D6C]
    // </editor-fold> 
    public PublicacionPeriodica () {
    }

    public PublicacionPeriodica(String titulo, String autor, String CodigoBarras, 
            String anioPublicacion,String idioma, Localizacion ubicacion,Tematica tematic,
            TipoPublicacion tipoPubli){
        super(titulo,autor,CodigoBarras,anioPublicacion,idioma,ubicacion,tematic);
        this.tipoPublicacion = tipoPubli;

    }
 
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0AA14DC9-67BA-914C-2BFA-2DA4E6C41CC0]
    // </editor-fold> 
    public TipoPublicacion getTipoPublicacion () {
        return tipoPublicacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.879954A0-FEBB-C856-A8D1-4EA8B8DF97F5]
    // </editor-fold> 
    public void setTipoPublicacion (TipoPublicacion val) {
        this.tipoPublicacion = val;
    }

}

