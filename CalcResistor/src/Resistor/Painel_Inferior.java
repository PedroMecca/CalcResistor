
package Resistor;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;


public class Painel_Inferior extends JPanel implements ActionListener   {
        private JLabel imagem ;   
        private JLabel imagem2 ;   
        private JLabel imagem3 ; 
        private JLabel imagem4 ; 
        private JLabel imagem5 ; 
        private JButton botao;
        private JTextField resultadoResistencia = new JTextField();
        private JComboBox comboFaixa1;
        private JComboBox comboFaixa2;
        private JComboBox comboFaixa3;
        private JComboBox comboFaixa4;
        private JComboBox comboFaixa5; 
        private Resistor panel = Resistor.getInstance();
        private final static int NUM_FAIXA1 = 1;
        private final static int NUM_FAIXA2 = 2;
        private final static int NUM_FAIXA3 = 3;
        private final static int NUM_FAIXA4 = 4;
        private final static int NUM_FAIXA5 = 5;
        
        
    
    Painel_Inferior(){
        
       
        
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(700,300));
        
        String [] fullColors = {"Selecione uma opção","Preto","Marrom","Vermelho","Laranja","Amarelo",
                                "Verde","Azul","Violeta","Cinza","Branco"};
        
        String [] colorFaixa1 = {"Selecione uma opção","Marrom","Vermelho","Laranja","Amarelo",
                                "Verde","Azul","Violeta","Cinza","Branco"};
        
        String [] colorFaixa5 = {"Selecione uma Opção","Dourado","Prata"};
        
        comboFaixa1 = new JComboBox(colorFaixa1); 
        comboFaixa2= new JComboBox(fullColors);
        comboFaixa3= new JComboBox(fullColors);
        comboFaixa4= new JComboBox(fullColors);
        comboFaixa5= new JComboBox(colorFaixa5);
 
        
        GridBagConstraints gb;
       
        resultadoResistencia.setPreferredSize(new Dimension(200,50));
       
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 0;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        this.add(resultadoResistencia,gb);
        
        
        
        
        PanelFaixas faixa1 = new PanelFaixas("FAIXA 1 :");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 1;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(faixa1,gb);
        
        
        PanelFaixas faixa2 = new PanelFaixas("FAIXA 2 :");;
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 3;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(faixa2,gb);
        
        
        PanelFaixas faixa3 = new PanelFaixas("FAIXA 3 :");;
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 5;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(faixa3,gb);
        
        
        PanelFaixas faixa4 = new PanelFaixas("FAIXA 4 :");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 6;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(faixa4,gb);
        
        PanelFaixas faixa5 = new PanelFaixas("FAIXA 5 :");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 7;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(faixa5,gb);
        
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 1;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.insets = new Insets(0,10,0,0);
        this.add(comboFaixa1,gb);
        

        
        
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 3;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,10,0,0);
        this.add(comboFaixa2,gb);
        
        
        
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 5;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,10,0,0);
        this.add(comboFaixa3,gb);
        
        
        
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 6;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,10,0,0);
        this.add(comboFaixa4,gb);
        
        
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 7;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,10,0,0);
        this.add(comboFaixa5,gb);
        
        comboFaixa1.addActionListener(new MudançaCorFaixa(imagem, comboFaixa1,NUM_FAIXA1));
        comboFaixa2.addActionListener(new MudançaCorFaixa(imagem2, comboFaixa2,NUM_FAIXA2));
        comboFaixa3.addActionListener(new MudançaCorFaixa(imagem3, comboFaixa3,NUM_FAIXA3));
        comboFaixa4.addActionListener(new MudançaCorFaixa(imagem4, comboFaixa4,NUM_FAIXA4));
        comboFaixa5.addActionListener(new MudançaCorFaixa(imagem5, comboFaixa5,NUM_FAIXA5));
        comboFaixa1.addActionListener(this);
        comboFaixa2.addActionListener(this);
        comboFaixa3.addActionListener(this);
        comboFaixa4.addActionListener(this);
        comboFaixa5.addActionListener(this);
      
    }
    
    
     
    private int [] getAllIndex(){
        int [] allIndex = new int [] {(comboFaixa1.getSelectedIndex()),comboFaixa2.getSelectedIndex(),comboFaixa3.getSelectedIndex(),comboFaixa4.getSelectedIndex() ,comboFaixa5.getSelectedIndex()} ;
        
        return allIndex;
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboFaixa1){
            resultadoResistencia.setText(new CalculoCores(getAllIndex()).retornaResposta());
            
        }
        if(e.getSource() == comboFaixa2){
           resultadoResistencia.setText(new CalculoCores(getAllIndex()).retornaResposta());
            
        }
         if(e.getSource() == comboFaixa3){
           resultadoResistencia.setText(new CalculoCores(getAllIndex()).retornaResposta());
            
        }
          if(e.getSource() == comboFaixa4){
           resultadoResistencia.setText(new CalculoCores(getAllIndex()).retornaResposta());
            
        }
        if(e.getSource() == comboFaixa5){
           resultadoResistencia.setText(new CalculoCores(getAllIndex()).retornaResposta());
            
        }
        
        
        

   }
}
   
    
    
  
