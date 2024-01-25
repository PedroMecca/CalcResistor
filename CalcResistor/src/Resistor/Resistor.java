
package Resistor;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Resistor extends JPanel  {
    
    Graphics2D faixa1;
    Graphics2D faixa2;
    Graphics2D faixa3;
    Graphics2D faixa4;
    Graphics2D faixa5;
    Graphics2D mainImage;
    private Color colorFaixa1 = new Color(0,0,0);
    private Color colorFaixa2 = new Color(0,0,0);
    private Color colorFaixa3 = new Color(0,0,0);
    private Color colorFaixa4 = new Color(0,0,0);
    private Color colorFaixa5 = new Color(250,215,0);
    private static Resistor uniqueInstance = new Resistor();
    
    private Resistor(){
       
        this.setLayout(new FlowLayout());
        
        this.setPreferredSize(new Dimension(300,200));
        
    }
    
    public static Resistor getInstance(){
        return uniqueInstance;
    }
    
    @Override
    public void paintComponent(Graphics g){
        mainImage = (Graphics2D) g;
        mainImage.setColor(new Color(250,250,250));
        mainImage.fillRect(200, 50, 300, 95);
        
        mainImage.setColor(new Color(0,0,0));
        mainImage.setStroke(new BasicStroke(2));
        mainImage.drawRect(200,50 , 300, 95);
       
        
        
        faixa1 = (Graphics2D) g;
        faixa1.setColor(getColorFaixa1());
        faixa1.fillRect(220, 50, 10, 95);
        
        faixa2 =(Graphics2D) g;
        faixa2.setColor(getColorFaixa2());
        faixa2.fillRect(270, 50, 10, 95);
        
        faixa3 =(Graphics2D) g;
        faixa3.setColor(getColorFaixa3());
        faixa3.fillRect(290, 50, 10, 95);
        
        faixa4 =(Graphics2D) g;
        faixa4.setColor(getColorFaixa4());
        faixa4.fillRect(310, 50, 10, 95);
        
        faixa5 =(Graphics2D) g;
        faixa5.setColor(getColorFaixa5());
        faixa5.fillRect(430, 50,10, 95);
        
    }
    
    public Color getColorFaixa1(){
        return colorFaixa1;
    }
    
     public Color getColorFaixa2(){
        return colorFaixa2;
    }
    
    public Color getColorFaixa3(){
        return colorFaixa3;
    }
    
     public Color getColorFaixa4(){
        return colorFaixa4;
    }
     public Color getColorFaixa5(){
        return colorFaixa5;
    }
    


    public void setColorFaixa1 (Color getColorFaixa1){
        this.colorFaixa1 = getColorFaixa1;
        repaint(220, 50, 10, 95);
        
    }
    
    
    public void setColorFaixa2 (Color colorFaixa2){
        this.colorFaixa2 = colorFaixa2;
        repaint(270, 50, 10, 95);
        
       
    }
    
    public void setColorFaixa3 (Color colorFaixa3){
        this.colorFaixa3 = colorFaixa3;
        repaint(290, 50, 10, 95);
    }
    
    public void setColorFaixa4 (Color colorFaixa4){
        this.colorFaixa4 = colorFaixa4;
        repaint(310, 50, 10, 95);
    }
    
    public void setColorFaixa5 (Color colorFaixa5){
        this.colorFaixa5 = colorFaixa5;
        repaint(430, 50,10, 95);
    }
  
}
