
package Resistor;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelFaixas extends JPanel{
    
    public PanelFaixas(String numFaixa) {
       super();
       JLabel faixa = new JLabel(numFaixa);
       
      
       
       this.add(faixa);
       this.setBackground(new Color(0,150,150));
       this.setPreferredSize(new Dimension(30,30));
       
    }
    
}
