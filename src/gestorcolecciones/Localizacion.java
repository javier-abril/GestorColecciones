/* 
Clase creada para almacenar la ubicacion de los coleccionables

@autor Fco. Javier Abril Lopez
*/

package gestorcolecciones;

import java.io.Serializable;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.240134AD-3651-6867-CB6C-7DCE3F632C6D]
// </editor-fold> 
public class Localizacion implements Serializable{

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8A0D43BC-254F-68EC-C1EC-CF1C9F70A84B]
    // </editor-fold> 
    private String estante;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D7CF21CB-A1AE-64FB-B9AD-3D4F47B0B2F3]
    // </editor-fold> 
    private String pasillo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EF30F0F4-01FD-C56D-0970-C066B16253F1]
    // </editor-fold> 
    private String piso;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A119D73E-F385-7838-6BB4-E2BBBE033919]
    // </editor-fold> 
    private String seccion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.58E151FB-2F67-B922-EDBA-53480D58C8FF]
    // </editor-fold> 
    public Localizacion () {
    }
    
    public Localizacion (String piso, String pasillo, String seccion, String estante){
        this.pasillo = pasillo;
        this.estante = estante;
        this.piso = piso;
        this.seccion = seccion;
    }
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B291951F-1AC8-D52A-CCCD-8D69EDFA4B7E]
    // </editor-fold> 
    public String getEstante () {
        return estante;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F96CB10E-8755-6E8C-648E-E2AF24B00D0F]
    // </editor-fold> 
    public void setEstante (String val) {
        this.estante = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.941EDB64-A364-8B0F-3CD0-61624D90A64A]
    // </editor-fold> 
    public String getPasillo () {
        return pasillo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E147E36E-263A-DBEB-175D-DDAB69A8244C]
    // </editor-fold> 
    public void setPasillo (String val) {
        this.pasillo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A2864E03-B302-C286-CEA9-D6CFC0D63046]
    // </editor-fold> 
    public String getPiso () {
        return piso;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.66C81881-DE81-4596-9612-2976A2B2443C]
    // </editor-fold> 
    public void setPiso (String val) {
        this.piso = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0E924015-2CB1-5A6B-4E14-275B7034FDCE]
    // </editor-fold> 
    public String getSeccion () {
        return seccion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7142052F-F3FE-3164-8415-A3A500B1139E]
    // </editor-fold> 
    public void setSeccion (String val) {
        this.seccion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CCBD885B-B7E9-9EE7-B8E8-5800A6D40FF4]
    // </editor-fold> 
    public Localizacion Unnamed () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AA4E3FBF-578C-5452-188F-11DD4B9F8283]
    // </editor-fold> 
    public int Ubicacion () {
        return 0;
    }

}

