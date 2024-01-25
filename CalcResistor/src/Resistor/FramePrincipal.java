
package Resistor;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



public class FramePrincipal extends JFrame {
   
    FramePrincipal(String titulo){
        this.setLayout(new BorderLayout());
        this.setTitle(titulo);
        
        Painel_Inferior inferior = new Painel_Inferior();
        Resistor panel = Resistor.getInstance();
        
        
        this.add(panel,BorderLayout.NORTH);
        this.add(inferior,BorderLayout.CENTER);
        
  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
      
    }
}
    


