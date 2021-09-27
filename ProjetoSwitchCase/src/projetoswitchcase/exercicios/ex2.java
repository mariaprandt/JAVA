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
public class ex2 {
    public static void main(String[] args) {
        String estac;
        estac=(JOptionPane.showInputDialog("Digite uma estação do ano:"));
 
        
        switch(estac.toUpperCase()){
  case "VERÃO": JOptionPane.showMessageDialog(null,"Ocorre nos meses de: Dezembro, Janeiro e Fevereiro" + "\n Boas Férias!" ); break;
  case "INVERNO": JOptionPane.showMessageDialog(null,"Ocorre nos meses de: Junho, Julho e Agosto" + "\n Doe Agasalhos!"); break;
  case "PRIMAVERA": JOptionPane.showMessageDialog(null,"Ocorre nos meses de: Setembro, Outubro e Novembro" + "\n Estação das Flores"); break;
  case "OUTONO": JOptionPane.showMessageDialog(null,"Ocorre nos meses de: Março, Abril e Maio" + "\n Mesmo que todas as folhas caiam, as árvores sempre ficam em pé" ); break;  
  default: JOptionPane.showMessageDialog(null,"inválido"); 
    }
        System.exit(0);
    }
}