
package grupo2_tp6_c2.Ejercicio1;

import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {
    HashSet<Producto_Ej1> lista;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int col) {
            return false;
        }
    };
    
    public Ventana() {
        lista = new HashSet<>();
        
        Producto_Ej1 p1 = new Producto_Ej1("Harina","Comestible",(long)699.9);
        Producto_Ej1 p2 = new Producto_Ej1("Lavandina","Limpieza",(long)1150.0);
        Producto_Ej1 p3 = new Producto_Ej1("Pan","Comestible",(long)1500.0);
        Producto_Ej1 p4 = new Producto_Ej1("Medias","Ropa",(long)2499.9);
        Producto_Ej1 p5 = new Producto_Ej1("Desodorante","Perfumería",(long)14599.9);
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        
        initComponents();
        this.setTitle("TP6 - Ej1 - Gestión de productos");
        this.setLocationRelativeTo(this);
        
        cargarComboBox();
        armarCabecera();
        cargaTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPanel = new javax.swing.JDesktopPane();
        jPtitulo = new javax.swing.JPanel();
        jLbTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLbCategoria = new javax.swing.JLabel();
        jLbNombre = new javax.swing.JLabel();
        jLbPrecio = new javax.swing.JLabel();
        jComboCat = new javax.swing.JComboBox<>();
        jTextPrecio = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jDesktopPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPtitulo.setBackground(new java.awt.Color(255, 255, 255));

        jLbTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo2_tp6_c2/Ejercicio1/box.png"))); // NOI18N
        jLbTitulo.setText("Gestión de Productos");

        javax.swing.GroupLayout jPtituloLayout = new javax.swing.GroupLayout(jPtitulo);
        jPtitulo.setLayout(jPtituloLayout);
        jPtituloLayout.setHorizontalGroup(
            jPtituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPtituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        jPtituloLayout.setVerticalGroup(
            jPtituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPtituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLbCategoria.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLbCategoria.setText("Categoría: ");

        jLbNombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLbNombre.setText("Nombre:");

        jLbPrecio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLbPrecio.setText("Precio:");

        jComboCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCatActionPerformed(evt);
            }
        });

        jbAgregar.setBackground(new java.awt.Color(204, 204, 204));
        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo2_tp6_c2/Ejercicio1/Carrito compras.png"))); // NOI18N
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbCategoria)
                    .addComponent(jLbNombre)
                    .addComponent(jLbPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboCat, 0, 218, Short.MAX_VALUE)
                            .addComponent(jTextNombre))
                        .addGap(18, 18, 18)
                        .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbCategoria)
                    .addComponent(jComboCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregar)
                    .addComponent(jLbNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbPrecio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Categoría", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        jDesktopPanel.setLayer(jPtitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addComponent(jPtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanel)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCatActionPerformed
        
    }//GEN-LAST:event_jComboCatActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try {
            String nombre = jTextNombre.getText();
            if (!nombre.equalsIgnoreCase("")) {
                String cate = (String)jComboCat.getSelectedItem();
                long precio = Long.parseLong(jTextPrecio.getText());
                Producto_Ej1 p = new Producto_Ej1(nombre,cate,precio);
                if (lista.add(p)) {
                    lista.add(p);
                    agregarFila(p);
                }else
                    JOptionPane.showMessageDialog(this, "Ese producto ya existe","Precaución",JOptionPane.WARNING_MESSAGE);
            }else
                JOptionPane.showMessageDialog(this, "Falta rellenar campos","Error",JOptionPane.ERROR_MESSAGE);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El precio tiene que ser un número","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAgregarActionPerformed
    
    private void cargarComboBox() {
        jComboCat.addItem("Comestible");
        jComboCat.addItem("Limpieza");
        jComboCat.addItem("Ropa");
        jComboCat.addItem("Perfumería");
        
    }
    
    private void armarCabecera() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Categoría");
        modelo.addColumn("Precio");
        jTable.setModel(modelo);
    }
    
    private void agregarFila(Producto_Ej1 p) {
        modelo.addRow(new Object[] {
            p.getNombre(),
            p.getCategoria(),
            p.getPrecio()
        });
    }
    
    private void cargaTabla() {
        
        String pselected = (String)jComboCat.getSelectedItem();
        
        for (Producto_Ej1 p: lista) {
            agregarFila(p);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboCat;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLbCategoria;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JLabel jLbPrecio;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPtitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JButton jbAgregar;
    // End of variables declaration//GEN-END:variables
}
