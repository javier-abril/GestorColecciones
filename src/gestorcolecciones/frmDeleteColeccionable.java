/*
 * Clase del formulario para eliminar un coleccionable
 */
package gestorcolecciones;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*; //para el model de añadir rows
/**
 *
 * @author Fco. Javier Abril Lopez
 */
public class frmDeleteColeccionable extends javax.swing.JFrame {

    /**
     * Creates new form frmDeleteColeccionable
     */
    public frmDeleteColeccionable() {
        initComponents();
        CargaValoresTabla();
        
        //Centramos el formulario en pantalla
        this.setLocationRelativeTo(null);
        
        this.setTitle("Eliminar coleccionable");
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
        jBtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TITULO", "AUTOR", "TIPO", "TEMATICA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jBtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnEliminar.setText("Eliminar seleccionado");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jBtnEliminar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento click del boton de eliminar
    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        
        SerializadorColeccionable sc = new SerializadorColeccionable();
        List<Coleccionable> lista = sc.getListaColeccionables();
        int lineaSeleccionada = jTable1.getSelectedRow();
        
        
        int result = JOptionPane.showConfirmDialog(null, "¿Desea eliminar " + 
                lista.get(lineaSeleccionada).getTitulo() + "?", 
                    "Atención", JOptionPane.YES_NO_OPTION);
        
        if(result == JOptionPane.YES_OPTION){
            //borramos de la lista
            lista.remove(lineaSeleccionada);
            //guardamos los cambios
            sc.GuardaListaColeccionable(lista);
            JOptionPane.showMessageDialog(null,"Coleccionable eliminado OK","Información",
                    JOptionPane.INFORMATION_MESSAGE);
            //cerramos el form
            this.setVisible(false);
        }
            
        
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void CargaValoresTabla (){
        
        SerializadorColeccionable sc = new SerializadorColeccionable();
        List<Coleccionable> lista = sc.getListaColeccionables();
        DefaultTableModel model = new DefaultTableModel();
        
        //Array de strings para los nombre de columna
        String[] columnNames = {
        "TITULO",
        "AUTOR",
        "TIPO",
        "TEMATICA"};
        //los añadimos al model
        model.setColumnIdentifiers(columnNames);
        
        for (Coleccionable c : lista) {
            Object[] o = new Object[4];
            o[0] = c.getTitulo();
            o[1] = c.getAutor();
            o[2] = c.getClass().toString().replaceAll("class gestorcolecciones.", "");
            o[3] = c.getTematica();
            //con el foreach añadimos todas las lineas al model
            model.addRow(o);
            }
        //añadimos el model a la tabla
        jTable1.setModel(model);
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}