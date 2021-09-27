
package Exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Modelo2 {
    
    public static void main(String[] args) {
       
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog ("Digite um numero:"));
        System.out.println(num);
        
        if (num <0)
        {
            JOptionPane.showMessageDialog (null,"O numero é negativo");
        }
        
        else 
            
        if (num ==0)
        {
            JOptionPane.showMessageDialog (null,"O numero é igual a zero");
        }
        
        else
            JOptionPane.showMessageDialog (null,"O numero é positivo");
    }
    
}
