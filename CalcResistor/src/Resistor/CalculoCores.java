package Resistor;


public class CalculoCores {
    private  int [] allIndex;
    
     CalculoCores(int [] allIndex){
        this.allIndex = allIndex;
    }
    
    public String retornaResposta(){
        int num = ((allIndex[0])*100)+(allIndex[1]*10)+allIndex[2];
        int porcentagem = (allIndex[4]==0)?5:10;
        int mult = 0;
        String multilplicao = null;
        String resposta = null;
        
        if(allIndex[3] !=0){
            while(mult <allIndex[3])
                mult++;

            if(mult>=7){
                multilplicao = "kΩ";
                
                if(mult==7)    
                    num*=10;
                
                else if(mult==8) 
                    num*=Math.pow(10, 2);
                
                else if(mult==9) 
                    multilplicao = "kΩ";
                   
                resposta =  Integer.toString(num)+ multilplicao + "+-" + Integer.toString(porcentagem)+ '%' ;
             }
             
            
            else{
               num *= Math.pow(10, mult); 
               resposta =  Integer.toString(num) + "+-" + Integer.toString(porcentagem)+ '%';
            }
        }  
        else
            resposta =  Integer.toString(num) + "+-" + Integer.toString(porcentagem)+ '%';
        
        return resposta;
    
    }
 }
  
