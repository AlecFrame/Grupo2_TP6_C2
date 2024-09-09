
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
        jlEntre = new javax.swing.JLabel();
        jbBusqueda = new javax.swing.JButton();
        jtfDesde = new javax.swing.JTextField();
        jlY = new javax.swing.JLabel();
        jtfHasta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProducto = new javax.swing.JTable();

        jlListado.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jlListado.setText("Listado por Precio");

        jlEntre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jlEntre.setText("Entre");

        jbBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo2_tp6_c2/Ejercicio2/Lupita.png"))); // NOI18N
        jbBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBusquedaActionPerformed(evt);
            }
        });

        jlY.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jlY.setText("y");

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
        jScrollPane1.setViewportView(tProducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlListado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlEntre)
                        .addGap(18, 18, 18)
                        .addComponent(jtfDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jlY)
                        .addGap(18, 18, 18)
                        .addComponent(jtfHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addComponent(jbBusqueda)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlListado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlY)
                            .addComponent(jlEntre)))
                    .addComponent(jbBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
