/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorcolecciones;

import javax.swing.JOptionPane; //Para los msgbox
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.util.*;

/**
 *
 * @author X
 */
public class frmAddColeccionable extends javax.swing.JFrame {

    frmPrincipal frmPrinci = new frmPrincipal();
    /**
     * Creates new form frmAddColeccionable
     */
    public frmAddColeccionable() {
        initComponents();
        
        //Centramos el formulario en pantalla
        this.setLocationRelativeTo(null);
        
        //Ocultamos los paneles de los radiobutton
        jPanelDisco.setVisible(false);
        jPanelPubPer.setVisible(false);
        
        //Creamos un grupo para los radioButton
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(jRadioDisco);
        grupo1.add(jRadioLibro);
        grupo1.add(jRadioPubPer);
        
        //Rellenamos el combo de tipo de publicación con todos los valores del enum
        for (TipoPublicacion tipo : TipoPublicacion.values()) {
            jComboTipoPubli.addItem(tipo.toString());
        }
        
        //Rellenamos el combo de tipo de soporte con todos los valores del enum
        for(TipoSoporte soporte : TipoSoporte.values()){
            jComboSoporte.addItem(soporte.toString());
        }
        
        //Rellenamos el combo de temática con todos los valores del enum
        for(Tematica tema : Tematica.values()){
            jComboTema.addItem(tema.toString());
        }
    }

    
    public frmAddColeccionable(frmPrincipal frm) {
        initComponents();
        
        //Guardamos la instancia del frmPrincipal para llamar
        //a la función refrescar tabla cuando añadamos un coleccionable nuevo
        frmPrinci = frm;
        
        //Centramos el formulario en pantalla
        this.setLocationRelativeTo(null);
        
        //Ocultamos los paneles de los radiobutton
        jPanelDisco.setVisible(false);
        jPanelPubPer.setVisible(false);
        
        //Creamos un grupo para los radioButton
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(jRadioDisco);
        grupo1.add(jRadioLibro);
        grupo1.add(jRadioPubPer);
        
        //Rellenamos el combo de tipo de publicación con todos los valores del enum
        for (TipoPublicacion tipo : TipoPublicacion.values()) {
            jComboTipoPubli.addItem(tipo.toString());
        }
        
        //Rellenamos el combo de tipo de soporte con todos los valores del enum
        for(TipoSoporte soporte : TipoSoporte.values()){
            jComboSoporte.addItem(soporte.toString());
        }
        
        //Rellenamos el combo de temática con todos los valores del enum
        for(Tematica tema : Tematica.values()){
            jComboTema.addItem(tema.toString());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextCodBar = new javax.swing.JTextField();
        jSpinAnio = new javax.swing.JSpinner();
        jComboTema = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboIdioma = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextPiso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextPasillo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextSección = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextEstante = new javax.swing.JTextField();
        jTextTitulo = new javax.swing.JTextField();
        jTextAutor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioPubPer = new javax.swing.JRadioButton();
        jRadioDisco = new javax.swing.JRadioButton();
        jRadioLibro = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanelDisco = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSpinnerNumDisco = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jComboSoporte = new javax.swing.JComboBox<>();
        jPanelLibro = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextISBN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSpinnerNumPags = new javax.swing.JSpinner();
        jPanelPubPer = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jComboTipoPubli = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir coleccionable");
        setPreferredSize(new java.awt.Dimension(500, 750));
        setResizable(false);

        jSpinAnio.setValue(2017);

        jLabel1.setText("Título");

        jComboIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Valenciano", "Inglés", "Francés", "Alemán", "Italiano", "Portugués", "Chino" }));

        jLabel2.setText("Autor");

        jLabel3.setText("Temática");

        jLabel4.setText("Idioma");

        jLabel5.setText("Codigo barras");

        jLabel6.setText("Año de publicación");

        jLabel7.setText("Ubicación");

        jLabel8.setText("Piso");

        jLabel9.setText("Pasillo");

        jLabel10.setText("Sección");

        jLabel11.setText("Estante");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Agregar coleccionable");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioPubPer.setText("Publicación periódica");
        jRadioPubPer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioPubPerItemStateChanged(evt);
            }
        });

        jRadioDisco.setText("Disco");
        jRadioDisco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioDiscoItemStateChanged(evt);
            }
        });

        jRadioLibro.setSelected(true);
        jRadioLibro.setText("Libro");
        jRadioLibro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioLibroItemStateChanged(evt);
            }
        });

        jLabel12.setText("Tipo de coleccionable");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jRadioLibro)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioDisco)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioPubPer))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel12)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioLibro)
                    .addComponent(jRadioDisco)
                    .addComponent(jRadioPubPer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDisco.setPreferredSize(new java.awt.Dimension(275, 100));

        jLabel15.setText("Num. discos");

        jLabel16.setText("Tipo soporte");

        javax.swing.GroupLayout jPanelDiscoLayout = new javax.swing.GroupLayout(jPanelDisco);
        jPanelDisco.setLayout(jPanelDiscoLayout);
        jPanelDiscoLayout.setHorizontalGroup(
            jPanelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiscoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDiscoLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerNumDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDiscoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jComboSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanelDiscoLayout.setVerticalGroup(
            jPanelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiscoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jSpinnerNumDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelLibro.setPreferredSize(new java.awt.Dimension(275, 100));

        jLabel13.setText("ISBN");

        jLabel14.setText("Num. páginas");

        javax.swing.GroupLayout jPanelLibroLayout = new javax.swing.GroupLayout(jPanelLibro);
        jPanelLibro.setLayout(jPanelLibroLayout);
        jPanelLibroLayout.setHorizontalGroup(
            jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLibroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLibroLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerNumPags, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLibroLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jTextISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelLibroLayout.setVerticalGroup(
            jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jSpinnerNumPags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanelPubPer.setPreferredSize(new java.awt.Dimension(275, 100));

        jLabel17.setText("Tipo publicación");

        javax.swing.GroupLayout jPanelPubPerLayout = new javax.swing.GroupLayout(jPanelPubPer);
        jPanelPubPer.setLayout(jPanelPubPerLayout);
        jPanelPubPerLayout.setHorizontalGroup(
            jPanelPubPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPubPerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboTipoPubli, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelPubPerLayout.setVerticalGroup(
            jPanelPubPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPubPerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPubPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboTipoPubli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanelDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanelLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanelPubPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 89, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanelDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanelLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanelPubPer, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextCodBar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboTema, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextSección, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextPasillo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextCodBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPasillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextSección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento de cambio de estado del radio. En funcion de si es selected o no
    //muestra u oculta el panel especifico
    private void jRadioLibroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioLibroItemStateChanged
        JRadioButton radio = (JRadioButton)evt.getItem();
        
        if (radio.isSelected())
            jPanelLibro.setVisible(true);
        else
            jPanelLibro.setVisible(false);
        
    }//GEN-LAST:event_jRadioLibroItemStateChanged

    //Evento de cambio de estado del radio. En funcion de si es selected o no
    //muestra u oculta el panel especifico
    private void jRadioDiscoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioDiscoItemStateChanged
        JRadioButton radio = (JRadioButton)evt.getItem();
        
        if (radio.isSelected())
            jPanelDisco.setVisible(true);
        else
            jPanelDisco.setVisible(false);
    }//GEN-LAST:event_jRadioDiscoItemStateChanged

    //Evento de cambio de estado del radio. En funcion de si es selected o no
    //muestra u oculta el panel especifico
    private void jRadioPubPerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioPubPerItemStateChanged
        JRadioButton radio = (JRadioButton)evt.getItem();
        
        if (radio.isSelected())
            jPanelPubPer.setVisible(true);
        else
            jPanelPubPer.setVisible(false);
    }//GEN-LAST:event_jRadioPubPerItemStateChanged

    //Evento Click agregar coleccionable
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AgregarColeccionable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AgregarColeccionable(){
        
        Coleccionable nuevo;
        SerializadorColeccionable nuevoSer = new SerializadorColeccionable();    
        List<Coleccionable> nuevaLista = nuevoSer.getListaColeccionables();
        Localizacion lc = new Localizacion(jTextPiso.getText(),jTextPasillo.getText(),
                        jTextSección.getText(),jTextEstante.getText());
        
        
        if(jTextAutor.getText().equals("") || jTextTitulo.getText().equals("")){
            //Si se deja autor o titulo en blanco mostramos esto
            JOptionPane.showMessageDialog(null, "Debe rellenar almenos el titulo y autor", 
                    "Atención", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            if(jRadioDisco.isSelected())
                nuevo = new Disco(jTextTitulo.getText(),jTextAutor.getText(),jTextCodBar.getText(),
                        jSpinAnio.getValue().toString(),jComboIdioma.getSelectedItem().toString(),
                        lc,Tematica.valueOf(jComboTema.getSelectedItem().toString()),
                        TipoSoporte.valueOf(jComboSoporte.getSelectedItem().toString()),
                        (int)jSpinnerNumDisco.getValue());
            
            else if (jRadioLibro.isSelected())
                nuevo = new Libro(jTextTitulo.getText(),jTextAutor.getText(),jTextCodBar.getText(),
                        jSpinAnio.getValue().toString(),jComboIdioma.getSelectedItem().toString(),
                        lc,Tematica.valueOf(jComboTema.getSelectedItem().toString()),
                        jTextISBN.getText(),(int)jSpinnerNumPags.getValue());
            else
                nuevo = new PublicacionPeriodica(jTextTitulo.getText(),jTextAutor.getText(),jTextCodBar.getText(),
                        jSpinAnio.getValue().toString(),jComboIdioma.getSelectedItem().toString(),
                        lc,Tematica.valueOf(jComboTema.getSelectedItem().toString()),
                        TipoPublicacion.valueOf(jComboTipoPubli.getSelectedItem().toString()));
            
            //añadimos el coleccionable a la lista y lo guardamos con el serializador
            nuevaLista.add(nuevo);
            nuevoSer.GuardaListaColeccionable(nuevaLista);
            JOptionPane.showMessageDialog(null, "Coleccionable agregado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);     
            //refrescamos los coleccionables en la tabla del frmPrincipal
            frmPrinci.CargaColeccionables();
            //cerramos el form
            this.setVisible(false);
        }
    }
    
    //Sets para meter los valores cuando llamamos desde frmPrincipal para cargar
    //datos de row selected
    public void SetTitulo(String titulo){
        jTextTitulo.setText(titulo);
    }
    public void SetAutor(String autor){
        jTextAutor.setText(autor);
    }
    public void SetCodBarras(String codBar){
        jTextCodBar.setText(codBar);
    }
    public void SetAnio(String anio){
        jSpinAnio.setValue(Integer.parseInt(anio));
    }
    public void SetNumDiscos(int numDiscos){
        jSpinnerNumDisco.setValue(numDiscos);
    }
    public void SetNumPaginas(int numPaginas){
        jSpinnerNumPags.setValue(numPaginas);
    }
    public void SetUbicacionPiso (String piso){
        jTextPiso.setText(piso);
    }
    public void SetUbicacionPasillo (String pasillo){
        jTextPasillo.setText(pasillo);
    }
    public void SetUbicacionEstante (String estante){
        jTextEstante.setText(estante);
    }
    public void SetUbicacionSeccion (String seccion){
        jTextSección.setText(seccion);
    }
    public void SetISBN(String Isbn){
        jTextISBN.setText(Isbn);
    }
    public void SetIdioma(String idioma){
        jComboIdioma.removeAllItems();
        jComboIdioma.addItem(idioma);
    }  
    public void SetTipoSoporte(String soporte ){
        jComboSoporte.removeAllItems();
        jComboSoporte.addItem(soporte);
    }
    public void SetTematica(String tematica){
        jComboTema.removeAllItems();
        jComboTema.addItem(tematica);
    }
    public void SetTipoPublicacion(String tipo){
        jComboTipoPubli.removeAllItems();
        jComboTipoPubli.addItem(tipo);
    }
    public void SetSelectedRadioDisco(boolean valor){
        jRadioDisco.setSelected(valor);
    }
    public void SetSelectedRadioPubPer(boolean valor){
        jRadioPubPer.setSelected(valor);
    }
    public void SetSelectedRadioLibro(boolean valor){
        jRadioLibro.setSelected(valor);
    }
    //para ocultar boton cuando vayamos a cargarla desde frmPrincipal
    public void OcultaBoton(boolean valor){
        if(valor)
           jButton1.setVisible(false);
        else
            jButton1.setVisible(true);
    }
    
    //Para habilitar y deshibilitar los items afectados en la visualización
    public void SetItemsHabilitados(boolean val){
        jRadioLibro.setEnabled(val);
        jRadioPubPer.setEnabled(val);
        jRadioDisco.setEnabled(val);
        jComboTipoPubli.setEnabled(val);
        jComboTema.setEnabled(val);
        jComboSoporte.setEnabled(val);
        jComboIdioma.setEnabled(val);
        jTextISBN.setEnabled(val);
        jTextSección.setEnabled(val);
        jTextEstante.setEnabled(val);
        jTextPasillo.setEnabled(val);
        jTextPiso.setEnabled(val);
        jSpinnerNumPags.setEnabled(val);
        jSpinnerNumDisco.setEnabled(val);
        jSpinAnio.setEnabled(val);
        jTextCodBar.setEnabled(val);
        jTextTitulo.setEnabled(val);
        jTextAutor.setEnabled(val);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboIdioma;
    private javax.swing.JComboBox<String> jComboSoporte;
    private javax.swing.JComboBox<String> jComboTema;
    private javax.swing.JComboBox<String> jComboTipoPubli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDisco;
    private javax.swing.JPanel jPanelLibro;
    private javax.swing.JPanel jPanelPubPer;
    private javax.swing.JRadioButton jRadioDisco;
    private javax.swing.JRadioButton jRadioLibro;
    private javax.swing.JRadioButton jRadioPubPer;
    private javax.swing.JSpinner jSpinAnio;
    private javax.swing.JSpinner jSpinnerNumDisco;
    private javax.swing.JSpinner jSpinnerNumPags;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextCodBar;
    private javax.swing.JTextField jTextEstante;
    private javax.swing.JTextField jTextISBN;
    private javax.swing.JTextField jTextPasillo;
    private javax.swing.JTextField jTextPiso;
    private javax.swing.JTextField jTextSección;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
