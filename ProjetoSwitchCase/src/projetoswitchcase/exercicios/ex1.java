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
public class ex1 {
    public static void main(String[] args) {
        
        int x;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite um número do mês:"));
 
        
switch(x){
  case 1: JOptionPane.showMessageDialog(null,"janeiro"); break;
  case 2: JOptionPane.showMessageDialog(null,"Fevereiro"); break;
  case 3: JOptionPane.showMessageDialog(null,"Março"); break;
  case 4: JOptionPane.showMessageDialog(null,"Abril"); break;
  case 5: JOptionPane.showMessageDialog(null,"Maio"); break;
  case 6: JOptionPane.showMessageDialog(null,"Junho"); break;
  case 7: JOptionPane.showMessageDialog(null,"Julho"); break;
  case 8: JOptionPane.showMessageDialog(null,"Agosto"); break;
  case 9: JOptionPane.showMessageDialog(null,"setembro"); break;
  case 10: JOptionPane.showMessageDialog(null,"Outubro"); break;  
  case 11: JOptionPane.showMessageDialog(null,"Novembro"); break;
  case 12: JOptionPane.showMessageDialog(null,"Dezembro"); break;    
  default: JOptionPane.showMessageDialog(null,"inválido");                
        }
        
        System.exit(0);
    }
}
