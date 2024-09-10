
package grupo2_tp6_c2.Ejercicio2;

import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BusquedaPorPrecio_Ej2 extends javax.swing.JInternalFrame {
    
    TreeSet<Producto_Ej2> lista = new TreeSet<>();
    
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    
    public BusquedaPorPrecio_Ej2(TreeSet<Producto_Ej2> lista) {
        initComponents();
        this.lista = lista;
        setClosable(true);
        setDefaultCloseOperation(BusquedaPorPrecio_Ej2.DISPOSE_ON_CLOSE);
        
        armarCabecera();
        cargaTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlListado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProducto = new javax.swing.JTable();
        jbBusqueda = new javax.swing.JButton();
        jtfHasta = new javax.swing.JTextField();
        jlY = new javax.swing.JLabel();
        jtfDesde = new javax.swing.JTextField();
        jlEntre = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 232, 255));

        jlListado.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jlListado.setText("Listado por Precio");

        tProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        tProducto.setPreferredSize(new java.awt.Dimension(561, 427));
        jScrollPane1.setViewportView(tProducto);

        jbBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo2_tp6_c2/Ejercicio2/Lupita.png"))); // NOI18N
        jbBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBusquedaActionPerformed(evt);
            }
        });

        jtfHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfHastaKeyReleased(evt);
            }
        });

        jlY.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jlY.setText("y");

        jtfDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDesdeKeyReleased(evt);
            }
        });

        jlEntre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jlEntre.setText("Entre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlEntre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlListado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlListado)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlY)
                            .addComponent(jtfDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlEntre))))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBusquedaActionPerformed
        try{
            Long desde = Long.parseLong(jtfDesde.getText());
            Long hasta = Long.parseLong(jtfHasta.getText());
            borrarFilas();
            for (Producto_Ej2 p: lista){
                if((desde<=p.getPrecio()&hasta>=p.getPrecio())||(desde>=p.getPrecio()&hasta<=p.getPrecio())){
                    modelo.addRow(new Object[]{
                        p.getCodigo(),
                        p.getDescripcion(),
                        p.getPrecio(),
                        p.getStock(),
                        p.getRubro()
                    });
                }
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos");
        }
    }//GEN-LAST:event_jbBusquedaActionPerformed

    private void jtfDesdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDesdeKeyReleased
        try{
            Long desde = Long.parseLong(jtfDesde.getText());
            Long hasta = Long.parseLong(jtfHasta.getText());
            borrarFilas();
            for (Producto_Ej2 p: lista){
                if((desde<=p.getPrecio()&hasta>=p.getPrecio())||(desde>=p.getPrecio()&hasta<=p.getPrecio())){
                    modelo.addRow(new Object[]{
                        p.getCodigo(),
                        p.getDescripcion(),
                        p.getPrecio(),
                        p.getStock(),
                        p.getRubro()
                    });
                }
            }
        }catch(Exception e) {
            borrarFilas();
            cargaTabla();
        }
    }//GEN-LAST:event_jtfDesdeKeyReleased

    private void jtfHastaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfHastaKeyReleased
        try{
            Long desde = Long.parseLong(jtfDesde.getText());
            Long hasta = Long.parseLong(jtfHasta.getText());
            borrarFilas();
            for (Producto_Ej2 p: lista){
                if((desde<=p.getPrecio()&hasta>=p.getPrecio())||(desde>=p.getPrecio()&hasta<=p.getPrecio())){
                    modelo.addRow(new Object[]{
                        p.getCodigo(),
                        p.getDescripcion(),
                        p.getPrecio(),
                        p.getStock(),
                        p.getRubro()
                    });
                }
            }
        }catch(Exception e) {
            borrarFilas();
            cargaTabla();
        }
    }//GEN-LAST:event_jtfHastaKeyReleased
    
    private void armarCabecera(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Categoria");
        tProducto.setModel(modelo);
    }
    
    private void cargaTabla() {
        for (Producto_Ej2 p: lista) {
            agregarFila(p);
        }
    }
    
    private void agregarFila(Producto_Ej2 p) {
        modelo.addRow(new Object[] {
            p.getCodigo(),
            p.getDescripcion(),
            p.getPrecio(),
            p.getRubro(),
            p.getStock()
        });
    }
    
    private void borrarFilas(){ 
        modelo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBusqueda;
    private javax.swing.JLabel jlEntre;
    private javax.swing.JLabel jlListado;
    private javax.swing.JLabel jlY;
    private javax.swing.JTextField jtfDesde;
    private javax.swing.JTextField jtfHasta;
    private javax.swing.JTable tProducto;
    // End of variables declaration//GEN-END:variables
}
