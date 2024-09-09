package grupo2_tp6_c2.Ejercicio2;

import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionDeProductos_Ej2 extends javax.swing.JInternalFrame {

//    ImagenFondo imagenGestion= new ImagenFondo();
    
    TreeSet<Producto_Ej2> lista = new TreeSet<>();
    
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    
    public GestionDeProductos_Ej2(TreeSet<Producto_Ej2> lista) {
//        this.setContentPane(imagenGestion);
        initComponents();
        this.lista = lista;
        setClosable(true);
        setDefaultCloseOperation(GestionDeProductos_Ej2.DISPOSE_ON_CLOSE);
        Deshabilitar();
        
        armarCabecera();
        cargaTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLtitulo = new javax.swing.JLabel();
        jLcategoria = new javax.swing.JLabel();
        jComboCat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLCodigo = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jLCategoria = new javax.swing.JLabel();
        jLStock = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        jTextDescrip = new javax.swing.JTextField();
        jComboCat2 = new javax.swing.JComboBox<>();
        jSpinnerStock = new javax.swing.JSpinner();
        jButtonBuscar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLtitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtitulo.setText("Gestión de Productos");

        jLcategoria.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLcategoria.setText("Filtrar por categoría: ");

        jComboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Perfumeria", "Limpieza" }));
        jComboCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboCatItemStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "Categoría", "Stock"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLCodigo.setText("Código: ");

        jLDescripcion.setText("Descripción: ");

        jLPrecio.setText("Precio:");

        jLCategoria.setText("Categoría:");

        jLStock.setText("Stock:");

        jComboCat2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Perfumeria", "Limpieza" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCodigo)
                    .addComponent(jLDescripcion)
                    .addComponent(jLPrecio)
                    .addComponent(jLCategoria)
                    .addComponent(jLStock))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCodigo)
                    .addComponent(jTextDescrip)
                    .addComponent(jTextPrecio)
                    .addComponent(jComboCat2, 0, 243, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCategoria)
                    .addComponent(jComboCat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLStock)
                    .addComponent(jSpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo2_tp6_c2/Ejercicio2/buscar.png"))); // NOI18N

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 51, 51));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(0, 153, 0));
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbCerrar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        escritorio.setLayer(jLtitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLcategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jComboCat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jButtonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbCerrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jLcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jLtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(17, 17, 17))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCerrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcategoria)
                    .addComponent(jComboCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbActualizar)
                    .addComponent(jbEliminar)
                    .addComponent(jbCerrar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       try {
            int codigo = Integer.parseInt(jTextCodigo.getText());
            String descripcion = jTextDescrip.getText();
            try {
                double precio = Double.parseDouble(jTextPrecio.getText());
                String rubro = jComboCat2.getSelectedItem().toString();
                int stock = Integer.parseInt(jSpinnerStock.getValue().toString());
                if (descripcion.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, "No ha puesto una descripcion para el producto");
                }else{
                    Producto_Ej2 producto = new Producto_Ej2(codigo,descripcion,precio,stock,rubro);
                    if (lista.add(producto)) {
                        lista.add(producto);
                        Limpiar();
                        Deshabilitar();
                        borrarFilas();
                        cargaTabla();
                    }else
                        JOptionPane.showMessageDialog(this, "Ese código ya existe");
                }
            }catch(Exception e) {
                JOptionPane.showMessageDialog(this, "El Precio tiene que ser un número");
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El Código tiene que ser un número entero");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jComboCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboCatItemStateChanged
        borrarFilas();
        String rubro = jComboCat.getSelectedItem().toString();
        for(Producto_Ej2 prod : lista){  //Método para buscar productos colocando una letra en el Box.
            if(prod.getRubro().equalsIgnoreCase(rubro))
                modelo.addRow(new Object[]{
                    prod.getCodigo(),
                    prod.getDescripcion(),
                    prod.getPrecio(),
                    prod.getRubro(),
                    prod.getStock()
                });
        }
    }//GEN-LAST:event_jComboCatItemStateChanged

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        Limpiar();
        Habilitar();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jTextCodigo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jTextDescrip.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextPrecio.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jComboCat2.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 3));
        jSpinnerStock.setValue(jTable1.getValueAt(jTable1.getSelectedRow(), 4));
        Habilitar();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        borrarFilas();
        cargaTabla();
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        try {
            if (!jTextCodigo.getText().equalsIgnoreCase("")) {
                int codigo = Integer.parseInt(jTextCodigo.getText());
                Iterator<Producto_Ej2> iterator = lista.iterator();
                while (iterator.hasNext()) {
                    Producto_Ej2 p = iterator.next();
                    if (p.getCodigo() == codigo) {
                        iterator.remove();
                        borrarFilas();
                        cargaTabla();
                        JOptionPane.showMessageDialog(this, "El producto se elimino exitosamente");
                        break;
                    }
                    if (!iterator.hasNext()) {
                        JOptionPane.showMessageDialog(this, "No se ha encontrado a ningún producto con ese Código al eliminar");
                        Deshabilitar();
                    }
                }
            }else {
                JOptionPane.showMessageDialog(this, "Se requiere el Código del producto que desea eliminar");
                Deshabilitar();
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, "El Código tiene que ser un número entero");
            Deshabilitar();
        }
        Limpiar();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void armarCabecera(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Categoria");
        jTable1.setModel(modelo);
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
    
    private void Limpiar() {
        jTextDescrip.setText("");
        jTextPrecio.setText("");
        jComboCat2.setSelectedIndex(0);
        jSpinnerStock.setValue(0);
    }
    
    private void Habilitar() {
        jTextDescrip.setEnabled(true);
        jTextPrecio.setEnabled(true);
        jComboCat2.setEnabled(true);
        jSpinnerStock.setEnabled(true);
        jbGuardar.setEnabled(true);
    }
    private void Deshabilitar() {
        jTextDescrip.setEnabled(false);
        jTextPrecio.setEnabled(false);
        jComboCat2.setEnabled(false);
        jSpinnerStock.setEnabled(false);
        jbGuardar.setEnabled(false);
    }
//public class ImagenFondo extends JPanel{
//    
//    private Image miImagen;
//    
//    
//    public void paintComponent(Graphics g){
//        ImageIcon icono = new ImageIcon(getClass().getResource("imagesGP.png"));
//        Image miImagen = icono.getImage();
//        
//                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
//                setOpaque(false);
//                super.paint(g);
//            }
    
//    public void initComponents(){
//        
//        jMenuAdmin = new javax.swing.JMenu();
//        
//        
//            
//        };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox<String> jComboCat;
    private javax.swing.JComboBox<String> jComboCat2;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLStock;
    private javax.swing.JLabel jLcategoria;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerStock;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextDescrip;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    // End of variables declaration//GEN-END:variables
    }



