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
public class ex3 {
     public static void main(String[] args) {
        String op;
        double a,b,c;
        op=(JOptionPane.showInputDialog("Opções Bases:" + "\n adição(+)" + "\n Subtração(-)" + "\n Divisão(/)" + "\n Multiplicação(x)" + "\nDigite o nome de qual das 4 operações bases você irá realizar:"));
        a= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        b= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
       
        switch(op){
  case "adição": c=a+b; JOptionPane.showMessageDialog(null,"o resultado é:" + c); break;
  case "subtração": c=a-b;JOptionPane.showMessageDialog(null,"o resultado é:" + c); break;
  case "divisão": c=a/b;JOptionPane.showMessageDialog(null,"o resultado é:" + c); break;
  case "multiplicação": c=a*b;JOptionPane.showMessageDialog(null,"o resultado é:" + c); break;  
  default: JOptionPane.showMessageDialog(null,"inválido"); 
    }
        System.exit(0);
}
}