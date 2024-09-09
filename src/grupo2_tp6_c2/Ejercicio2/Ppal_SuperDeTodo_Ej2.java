package grupo2_tp6_c2.Ejercicio2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.TreeSet;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
//import javax.swing.JDesktopPane;

public class Ppal_SuperDeTodo_Ej2 extends javax.swing.JFrame {
    
    public static TreeSet<Producto_Ej2> listaProductos = new TreeSet<>();
    private EscritorioPersonalizado_Ej2 escritorio;

    
    public Ppal_SuperDeTodo_Ej2() {
        initComponents();
        
        cargarProductos();
        
        escritorio= new EscritorioPersonalizado_Ej2();
        this.setContentPane(escritorio);
        this.setLocationRelativeTo(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        jMenuAdmin = new javax.swing.JMenu();
        jAdminProductos = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jConsultaPrecio = new javax.swing.JMenuItem();
        jConsultaRubro = new javax.swing.JMenuItem();
        jConsultaNombre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuAdmin.setText("Administración");

        jAdminProductos.setText("Productos");
        jMenuAdmin.add(jAdminProductos);

        jMenuBar.add(jMenuAdmin);

        jMenuConsultas.setText("Consultas");

        jConsultaPrecio.setText("Por precio");
        jConsultaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaPrecioActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jConsultaPrecio);

        jConsultaRubro.setText("Por rubro");
        jConsultaRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaRubroActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jConsultaRubro);

        jConsultaNombre.setText("Por nombre");
        jConsultaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaNombreActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jConsultaNombre);

        jMenuBar.add(jMenuConsultas);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 791, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsultaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaNombreActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorNombre_Ej2 bpn = new BusquedaPorNombre_Ej2(listaProductos);
        bpn.setVisible(true);
        escritorio.add(bpn);
        escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jConsultaNombreActionPerformed

    private void jConsultaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaRubroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        listadoPorRubro_Ej2 bpn = new listadoPorRubro_Ej2(listaProductos);
        bpn.setVisible(true);
        escritorio.add(bpn);
        escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jConsultaRubroActionPerformed

    private void jConsultaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaPrecioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        listadoPorRubro_Ej2 bpn = new listadoPorRubro_Ej2(listaProductos);
        bpn.setVisible(true);
        escritorio.add(bpn);
        escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jConsultaPrecioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAdminProductos;
    private javax.swing.JMenuItem jConsultaNombre;
    private javax.swing.JMenuItem jConsultaPrecio;
    private javax.swing.JMenuItem jConsultaRubro;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuConsultas;
    // End of variables declaration//GEN-END:variables

  private void cargarProductos(){
    listaProductos.add(new Producto_Ej2(01,"Poco Robanne",8599.75,12,"Perfumeria"));
    listaProductos.add(new Producto_Ej2(03, "Azucar x 1kg", 750, 5, "Comestible"));
  }

  public class EscritorioPersonalizado_Ej2 extends JDesktopPane{
    private BufferedImage img;
  
    public EscritorioPersonalizado_Ej2() {
        try{
            img=ImageIO.read(getClass().getResourceAsStream("/grupo2_tp6_c2/Ejercicio2/imagesGP.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
          
  }
}
