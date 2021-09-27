/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoswitchcase.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author LabInfo03-05
 */
public class ex4 {
     public static void main(String[] args) {
        int op;
        double valC, valF, vParc, valA;
        do{
        valC= Double.parseDouble(JOptionPane.showInputDialog("Valor da Compra:"));
        op= Integer.parseInt(JOptionPane.showInputDialog("Opções de pagamento:" + 
                "\n 1- A vista (10% de desconto)" + 
                "\n 2- 30 dias(sem desconto)" + 
                "\n 3- 60 dias(acrescimo de 10%)" + 
                "\n 4- 90 dias(acrescimo de 20%)" +
                "\n 5- sair" +
                "\n Digite o número correspondente a opção escolhida:"));
        
        
        switch(op){
  case 1: valF=valC*0.9; JOptionPane.showMessageDialog(null,"O valor do pagamento é:" + valF); break;
  case 2: valF=valC; JOptionPane.showMessageDialog(null,"O valor do pagamento é:" + valF ); break;
  case 3: valF=valC*1.1; vParc=valF/2; JOptionPane.showMessageDialog(null,"O valor do pagamento é:" + valF + "\nO valor da parcela é:" + vParc); break;
  case 4: valF=valC*1.2; vParc=valF/3; JOptionPane.showMessageDialog(null,"O valor do pagamento é:" + valF + "\nO valor da parcela é:" + vParc ); break;
  case 5: break;
     default: JOptionPane.showMessageDialog(null,"inválido");         
}
        }
        while(op!=5);
        
}
}