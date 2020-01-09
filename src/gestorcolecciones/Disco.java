/* 
Clase hija de coleccionable que almacena los coleccionables tipo Disco

@autor Fco. Javier Abril Lopez
*/

package gestorcolecciones;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.2BEC33CC-6F3A-8112-7315-55449F3A2534]
// </editor-fold> 
public class Disco extends Coleccionable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.53A3FC74-1DB0-6EE6-2180-CB396C6A18DD]
    // </editor-fold> 
    private TipoSoporte tipoSoporte;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1FFC6310-6AE4-D40A-EA49-0A43A2D553B4]
    // </editor-fold> 
    private int numeroDiscos;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AD78F9BC-294C-3048-CBE7-16A0D510F575]
    // </editor-fold> 
    public Disco () {
    }
    
    public Disco(String titulo, String autor, String CodigoBarras, 
            String anioPublicacion,String idioma, Localizacion ubicacion,Tematica tematic,
            TipoSoporte soporte,int numDiscos){
        super(titulo,autor,CodigoBarras,anioPublicacion,idioma,ubicacion,tematic);
        this.tipoSoporte = soporte;
        this.numeroDiscos = numDiscos;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.135C949B-BC83-FAD5-72A1-27BF8CC4E026]
    // </editor-fold> 
    public int getNumeroDiscos () {
        return numeroDiscos;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EA42F3F1-F458-2AD6-ECA9-D7BFCB357B31]
    // </editor-fold> 
    public void setNumeroDiscos (int val) {
        this.numeroDiscos = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F570DBB6-5A51-607E-3DB1-325A8A6AA35C]
    // </editor-fold> 
    public TipoSoporte getTipoSoporte () {
        return tipoSoporte;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.663C03E2-CB49-14DF-FB9A-15F85CE85EFA]
    // </editor-fold> 
    public void setTipoSoporte (TipoSoporte val) {
        this.tipoSoporte = val;
    }

}

