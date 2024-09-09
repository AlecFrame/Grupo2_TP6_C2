/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo2_tp6_c2.Ejercicio2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author keter
 */
public class EscritorioPersonalizado_Ej2 extends JDesktopPane{
    private BufferedImage img;

    public EscritorioPersonalizado_Ej2() {
        try{
            img=ImageIO.read(getClass().getResourceAsStream("imagesGP.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
   
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
    
    
}
