/*
 * Clase del formulario principal de la aplicación
 */
package gestorcolecciones;

import java.awt.event.*; //para el evento de doble click de mouse en la tabla
import javax.swing.JOptionPane; //Para los msgbox
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;


/**
 *
 * @author Fco. Javier Abril Lopez
 */
public class frmPrincipal extends javax.swing.JFrame {
    
    public List<Coleccionable> listaColeccionables = new ArrayList<Coleccionable>();
    public List<Coleccionable> listaBusqueda = new ArrayList<Coleccionable>();
    
    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        
        //Centramos el formulario en pantalla
        this.setLocationRelativeTo(null);

        //cargamos todos los articulos de la colección
        CargaColeccionables();
        
        jComboTematica.addItem("Todas"); //Añadimos el primer item para buscar por todos
        //Rellenamos el combo de temática con todos los valores del enum
        for(Tematica tema : Tematica.values()){
            jComboTematica.addItem(tema.toString());
        }
        
        
        //pequeño apaño para que no sea editable la tabla al hacer doble click en una celda
        //sacado de http://stackoverflow.com/questions/1990817/how-to-make-a-jtable-non-editable
        for (int c = 0; c < jTable1.getColumnCount(); c++)
        {
            Class<?> col_class = jTable1.getColumnClass(c);
            jTable1.setDefaultEditor(col_class, null);// remove editor
        }
        
        //añadimos el listener para coger el doble click sobre las celdas de la tabla
        //abriremos la ventana de addUser con los datos y ocultando el boton
        jTable1.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
               JTable target = (JTable) e.getSource();
               int row = target.getSelectedRow();
               //Cargamos el frmAddColeccionable con los datos del row selected
               CargaFRMConDatos(row); 
            }
         }
      });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextBtitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextBautor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextBanio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboTematica = new javax.swing.JComboBox<>();
        jButtonFiltrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(910, 456));
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Título");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Autor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Año");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Temática");

        jButtonFiltrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFiltrar.setText("Buscar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextBtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jTextBautor))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextBanio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboTematica, 0, 201, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextBtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextBanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Cambiar de usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuarios");

        jMenuItem3.setText("Añadir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Eliminar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Coleccionables");

        jMenuItem5.setText("Añadir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Eliminar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento Click salir de aplicación
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    //Evento Click de boton de eliminar usuario
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //Comprobamos si es administrador
        if(this.getTitle().contains("Administrador")){
            //Mostramos el form eliminar
            frmDeleteUser formNew = new frmDeleteUser();
            formNew.setVisible(true);
            //refrescamos para que cargue los nombre de usuario
            formNew.RefrescaCombo();
        }
        else
            JOptionPane.showMessageDialog(null, "Esta opción solo puede ser ejecutada por un administrador", 
                    "Atención", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    //Evento Click de boton de añadir usuario
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //Comprobamos si es administrador
        if(this.getTitle().contains("Administrador")){
            //mostramos el form de añadir
            new frmAddUser().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Esta opción solo puede ser ejecutada por un administrador", 
                    "Atención", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    //Evento Click cambia de usuario
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //cerramos este form y abrimos el login de nuevo
        this.setVisible(false);
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    //Evento click añade coleccionable
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //solo si eres administrador
        if(this.getTitle().contains("Administrador")){
            frmAddColeccionable nuevoForm = new frmAddColeccionable(this);
            nuevoForm.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Esta opción solo puede ser ejecutada por un administrador", 
                    "Atención", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    //Evento Click eliminar coleccionable
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if(this.getTitle().contains("Administrador")){
            frmDeleteColeccionable nuevoForm = new frmDeleteColeccionable();
            nuevoForm.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Esta opción solo puede ser ejecutada por un administrador", 
                    "Atención", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    //Evento click de botón filtrar
    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        
        List<Coleccionable> listaTemp = new ArrayList<Coleccionable>();
        
        for (Coleccionable item: this.listaColeccionables){
            
            //los pasamos a minusculas para evitar busqueda case sensitive
            String autor = jTextBautor.getText().toLowerCase(); 
            String titulo=jTextBtitulo.getText().toLowerCase();
            String anio = jTextBanio.getText();
            String tematica = jComboTematica.getSelectedItem().toString();
            
            if(!titulo.equals("") && item.getTitulo().toLowerCase().contains(titulo))
            {
                listaTemp.add(item);
            }
            if(!autor.equals("") && item.getAutor().toLowerCase().contains(autor)){
                
                int existe = listaTemp.indexOf(item);
                //Para evitar duplicar objetos en la listaTemp
                if(existe==-1)//-1 => no existe
                    listaTemp.add(item);
            }
            //Aqui si que buscamos que sea igual al año, en los anteriores es que
            //contenga el valor
            if(!anio.equals("") && item.getAnioPublicacion().equals(anio)){
                
                int existe = listaTemp.indexOf(item);
                //Para evitar duplicar objetos en la listaTemp
                if(existe==-1)//-1 => no existe
                    listaTemp.add(item);
            }
            
            //Para evitar una excepcion en el siguiente if ya que Todas no existe en el enum
            if(!tematica.equals("Todas")){
                if(!tematica.equals("") && item.getTematica().equals(Tematica.valueOf(tematica))){
                    int existe = listaTemp.indexOf(item);
                    //Para evitar duplicar objetos en la listaTemp
                    if(existe==-1)//-1 => no existe
                        listaTemp.add(item);
                }
            }
            else{ //Si tematica es todas
                //Si están todos los campos en blanco y temática es todas mostramos toda la lista
                if(titulo.equals("") && autor.equals("") && anio.equals(""))
                    listaTemp = this.listaColeccionables;
            }
        }
        
        //Asignamos a lista de busqueda para que luego al hacer click coincidan
        //el id del arraylist con el id de la fila seleccionada
        this.listaBusqueda = listaTemp;
        //Cargamos la listaTemp de resultados en la tabla
        this.CargaValoresTabla(listaTemp);
        //Cambiamos el texto del botón
        this.jButtonFiltrar.setText("Volver a buscar");
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    //Función que carga los valores la lista en la tabla
    private void CargaValoresTabla (List<Coleccionable> lista){
        
        //SerializadorColeccionable sc = new SerializadorColeccionable();
        //lista = sc.getListaColeccionables();
        DefaultTableModel model = new DefaultTableModel();
        
        //Array de strings para los nombre de columna
        String[] columnNames = {
        "TITULO",
        "AUTOR",
        "TIPO",
        "TEMATICA",
        "AÑO",
        "IDIOMA"};
        //los añadimos al model
        model.setColumnIdentifiers(columnNames);
        
        for (Coleccionable c : lista) {
            Object[] o = new Object[6];
            o[0] = c.getTitulo();
            o[1] = c.getAutor();
            o[2] = c.getClass().toString().replaceAll("class gestorcolecciones.", "");
            o[3] = c.getTematica();
            o[4] = c.getAnioPublicacion();
            o[5] = c.getIdioma();
            //con el foreach añadimos todas las lineas al model
            model.addRow(o);
            }
        //añadimos el model a la tabla
        jTable1.setModel(model);
        
    }
    
    
    //Función que carga los coleccionables a la lista y a la tabla
    //la ponemos public para refrescar desde frmAddColeccionable cuando añadimos 1 nuevo
    public void CargaColeccionables(){
        
        SerializadorColeccionable ser = new SerializadorColeccionable();
        
        this.listaColeccionables = ser.getListaColeccionables();
        
        CargaValoresTabla(listaColeccionables);
    }
    
    //Funcion que abre un frmAddColeccionable y le carga los datos de la row clickada
    private void CargaFRMConDatos(int rowSelected){
        
        Coleccionable cl = new Coleccionable();
        
        //Si hemos realizado alguna busqueda el texto del boton sera "volver a buscar"
        //sabiendo eso en funcion del valor del texto del boton cogemos la lista de coleccionables
        //o la lista de busqueda para rellenar los datos
        if (this.jButtonFiltrar.getText().equals("Volver a buscar")){
            cl = listaBusqueda.get(rowSelected);
        }
        else
        {
            cl = listaColeccionables.get(rowSelected);
        }

        Localizacion loc = cl.getUbicacion();
        
        frmAddColeccionable frm = new frmAddColeccionable();
        frm.OcultaBoton(true);
        frm.SetAnio(cl.getAnioPublicacion());
        frm.SetAutor(cl.getAutor());
        frm.SetCodBarras(cl.getCodigoBarras());
        frm.SetIdioma(cl.getIdioma());
        frm.SetTitulo(cl.getTitulo());
        frm.SetTematica(cl.getTematica().toString());
        frm.SetUbicacionEstante(loc.getEstante());
        frm.SetUbicacionPasillo(loc.getPasillo());
        frm.SetUbicacionPiso(loc.getPiso());
        frm.SetUbicacionSeccion(loc.getSeccion());
        
        if(cl.getClass().toString().contains("Libro")){
            Libro lb = (Libro) cl;
            frm.SetSelectedRadioLibro(true);
            frm.SetISBN(lb.getISBN());
            frm.SetNumPaginas(lb.getNumeroPaginas());
            
        }
        else if (cl.getClass().toString().contains("Disco")){
            Disco dc = (Disco) cl;
            frm.SetSelectedRadioDisco(true);
            frm.SetNumDiscos(dc.getNumeroDiscos());
            frm.SetTipoSoporte(dc.getTipoSoporte().toString());
            
        }
        else{
            PublicacionPeriodica pb = (PublicacionPeriodica) cl;
            frm.SetSelectedRadioPubPer(true);
            frm.SetTipoPublicacion(pb.getTipoPublicacion().toString());
            
        }
        //Deshabilitamos los items para no poder modificar valores
        frm.SetItemsHabilitados(false);
        //Ajustamos el tamaño ya que al ocultar botón inferior queda mucho hueco
        frm.setSize(500, 670);
        frm.setTitle("Visualizar coleccionable");
        frm.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JComboBox<String> jComboTematica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextBanio;
    private javax.swing.JTextField jTextBautor;
    private javax.swing.JTextField jTextBtitulo;
    // End of variables declaration//GEN-END:variables
}