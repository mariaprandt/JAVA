
package Exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Modelo3 {
    
    public static void main(String[] args) {
       
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog ("Digite a nota final:"));
        System.out.println(n);
        
        if (n <5)
        {
            JOptionPane.showMessageDialog (null,"Reprovado direto");
        }
        
        else 
            
        if (n >=5 && n <7)
        {
            JOptionPane.showMessageDialog (null,"tem direito de fazer uma prova de recuperação");
        }
        
        else
            JOptionPane.showMessageDialog (null,"Passou direto");
    }
    
}
