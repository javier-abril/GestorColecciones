/* 
Clase hija de coleccionable que almacena los coleccionables tipo Libro

@autor Fco. Javier Abril Lopez
*/

package gestorcolecciones;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A3630CD0-2CFE-0B79-3A5C-BC6C83B5DA02]
// </editor-fold> 
public class Libro extends Coleccionable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.42FDEB2A-C987-9428-0E58-4B558B585804]
    // </editor-fold> 
    private String ISBN;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5BD1278B-0B30-6A38-86CC-869EE050070F]
    // </editor-fold> 
    private int numeroPaginas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.00E71AA5-DE65-4EF8-AE0D-62ADD431E809]
    // </editor-fold> 
    public Libro () {
        super();
    }

    public Libro(String titulo, String autor, String CodigoBarras, 
            String anioPublicacion,String idioma, Localizacion ubicacion,Tematica tematic,
            String ISBN,int numPags){
        super(titulo,autor,CodigoBarras,anioPublicacion,idioma,ubicacion,tematic);
        this.ISBN = ISBN;
        this.numeroPaginas = numPags;
    }
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EA8DE488-A206-57CD-CF31-2A6976CF8BBE]
    // </editor-fold> 
    public String getISBN () {
        return ISBN;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.69B79E83-6D9A-6C7C-FB24-BA22AD2068E5]
    // </editor-fold> 
    public void setISBN (String val) {
        this.ISBN = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.92D6DD56-D13F-8529-00B3-3CD06A647924]
    // </editor-fold> 
    public int getNumeroPaginas () {
        return numeroPaginas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B621D27F-5176-7CEB-BFE7-341B6CA51E5C]
    // </editor-fold> 
    public void setNumeroPaginas (int val) {
        this.numeroPaginas = val;
    }


}

