/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package form;
import clases.bp;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author eder_
 */
public class Frm_bp extends javax.swing.JInternalFrame {
    
    private final bp BPS;
    TableColumnModel columnModel;
    DefaultTableModel DT = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

    };
    /**
     * Creates new form Frm_bp
     */
    public Frm_bp() {
        initComponents();
        BPS = new bp();
        columnModel = tabla.getColumnModel();
        listar();
    }
    private void listar(){
        tabla.setModel(BPS.getDatosProductos());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jrb_codigo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jrb_nombre = new javax.swing.JRadioButton();
        txt_busqueda = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Búsqueda por:");

        jrb_codigo.setBackground(new java.awt.Color(255, 255, 255));
        jrb_codigo.setText("Código");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jrb_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jrb_nombre.setText("Descripción");

        txt_busqueda.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_busquedaCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrb_codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrb_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_busqueda)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jrb_nombre)
                    .addComponent(jrb_codigo)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if(Frm_en.enviar == 1){
            int row = tabla.getSelectedRow();
            Frm_en.txt_codigo.setText(tabla.getValueAt(row, 0).toString());
            Frm_en.txt_descripcion.setText(tabla.getValueAt(row, 1).toString());
            Frm_en.txt_cantidad.requestFocus();
            Frm_en.enviar = 0;
            dispose();
        }

        else if(Frm_sali.enviar == 1){
            int row = tabla.getSelectedRow();
            Frm_sali.txt_codigo.setText(tabla.getValueAt(row, 0).toString());
            Frm_sali.txt_descripcion.setText(tabla.getValueAt(row, 1).toString());
            Frm_sali.txt_cantidad.requestFocus();
            Frm_sali.enviar = 0;
            dispose();
        }

    }//GEN-LAST:event_tablaMouseClicked

    private void txt_busquedaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_busquedaCaretUpdate
        if(jrb_nombre.isSelected()){
            String inf = txt_busqueda.getText();
            tabla.setModel(BPS.getDatoP(1,inf));
        }

        if(jrb_codigo.isSelected()){
            String inf = txt_busqueda.getText();
            tabla.setModel(BPS.getDatoP(2,inf));
        }

        if(txt_busqueda.getText().isEmpty()){
            tabla.setModel(BPS.getDatosProductos());
        }
    }//GEN-LAST:event_txt_busquedaCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrb_codigo;
    private javax.swing.JRadioButton jrb_nombre;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
