/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.junit.Test;

/**
 *
 * @author Sniper
 */
public class ImagesSandbox 
{
    
    @Test
    public void showImageTest() throws IOException
    {

//        JOptionPane.showMessageDialog(null, "Testing");
//        ImageBackgroundPane imagePane = new ImageBackgroundPane("C:\\BigHit1.jpg");
//        imagePane.paint(JOptionPane.getRootFrame().getGraphics());
        
//        ImagePanel imagePanel = new ImagePanel("C:\\BigHit1.jpg");
//        
//        imagePanel.paintComponent(JOptionPane.getRootFrame().getGraphics());
        
        
//        JPanel jPanel = new JPanel();      
//        jPanel.add(new JLabel(new ImageIcon("C:\\BigHit1.jpg")));
//        
//        jPanel.setVisible(true);
        
        
        //Create Frame
        JFrame snakeFrame = new JFrame();
        //snakeFrame.setBounds(100, 200, 800, 800);
        snakeFrame.setVisible(true);
        
        //Load image - will be autoSized.
        snakeFrame.add(new JLabel(new ImageIcon("C:\\BigHit1.jpg")));
        snakeFrame.pack();
        
        
        //Close the frame
        snakeFrame.dispose();
        
        
        snakeFrame.dispose();
    }
    
    
}



 class ImageBackgroundPane extends JOptionPane
    {
         private BufferedImage img;

         public ImageBackgroundPane (String image) throws IOException
         {
            this.img = ImageIO.read(new File(image));
         }

         @Override
         public void paint(Graphics g)
         {
           
      
           //If the image can be guaranteed to be larger than the JOptionPane's size
           Dimension curSize = this.getSize();
           g.drawImage(img, 0, 0, curSize.width, curSize.height,null);


           //Make sure to paint all the other properties of Swing components.
           super.paint(g);
         }
    }



 class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel(String path) 
    {
       try 
       {
          image = ImageIO.read(new File(path));
       } 
       catch (IOException ex) {
            // handle exception...
       }
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
    }

}





