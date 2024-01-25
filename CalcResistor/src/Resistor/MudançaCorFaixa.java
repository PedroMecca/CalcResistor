
package Resistor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class MudançaCorFaixa implements ActionListener {
    private JLabel corCombo;
    private JComboBox combo;
    private Resistor panel = Resistor.getInstance();
    private final static int COR_VERDE [] = {127,255,0};
    private final static int COR_PRETO [] = {0,0,0};
    private final static int COR_VERMELHO [] = {250,0,0}; 
    private final static int COR_MARROM [] = {120,60,0}; 
    private final static int COR_LARANJA [] = {255,165,0}; 
    private final static int COR_AMARELO [] = {255,255,0};
    private final static int COR_DOURADO [] = {238,221,130};
    private final static int COR_PRATA [] = {192, 192, 192};
    private final static int COR_AZUL [] = {0,0,255};
    private final static int COR_VIOLETA [] = {144, 75, 210};
    private final static int COR_CINZA [] = {105,105,105};
    private final static int COR_BRANCO [] = {255,255,255};
    private int NUM_FAIXA;
    
    MudançaCorFaixa(JLabel corCombo,JComboBox combo,int NUM_FAIXA){
        this.corCombo = corCombo;
        this.combo = combo;
        this.NUM_FAIXA = NUM_FAIXA;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        switch (NUM_FAIXA){
            case 1 -> {
               panel.setColorFaixa1(changeColor(getChangeColor((String)combo.getSelectedItem()))); 
            }
            case 2 -> {
                panel.setColorFaixa2(changeColor(getChangeColor((String)combo.getSelectedItem())));
            }
            case 3 -> {
                panel.setColorFaixa3(changeColor(getChangeColor((String)combo.getSelectedItem())));
            }
            case 4 -> {
                panel.setColorFaixa4(changeColor(getChangeColor((String)combo.getSelectedItem())));
            }
            case 5 -> {
                panel.setColorFaixa5(changeColor(getChangeColor((String)combo.getSelectedItem())));
            }
        }
    }
    
    private Color changeColor(int cor[]){
        return new Color(cor[0],cor[1],cor[2]);
    }
    
    private int [] getChangeColor(String cor){
        int corConstante [] = null;
        switch (cor){
            case "Preto" -> {
                corConstante = COR_PRETO;
            }
            case "Marrom"->{
                corConstante = COR_MARROM;
            }
            case "Vermelho"->{
                corConstante = COR_VERMELHO;
            }
            case "Laranja"->{
                corConstante = COR_LARANJA;
            }
            case "Amarelo"->{
                corConstante = COR_AMARELO;
            }
            case "Verde"->{
                corConstante = COR_VERDE;
            }
            case "Dourado"->{
                corConstante = COR_DOURADO;
            }
            case "Prata"->{
                corConstante = COR_PRATA;
            }
            case "Azul"->{
                corConstante = COR_AZUL;
            }
            case "Violeta"->{
                corConstante = COR_VIOLETA;
            }
            case "Cinza"->{
                corConstante = COR_CINZA;
            }
            case "Branco"->{
                corConstante = COR_BRANCO;
            }
            default -> {
                
            }
        }
        return corConstante;
   
    }
    
    
    
   
  
  
}
