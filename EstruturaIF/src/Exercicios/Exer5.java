/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author LabInfo03-05
 */
public class Exer5 {
    public static void main(String[] args) {
         String sen,log;
        
          log= (JOptionPane.showInputDialog("Digite seu login "));
          sen= (JOptionPane.showInputDialog("Digite sua senha: "));
          
          if(log.equals("ana.etec")&& sen.equals("12345"))
          { JOptionPane.showMessageDialog (null,"Login e senha corretos");}
          else 
          {
            JOptionPane.showMessageDialog (null,"Login e senha incorretos");  
          }


    }
    
}
