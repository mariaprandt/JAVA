
package Exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exer2 {
    
    public static void main(String[] args) {
       
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog ("Digite um número:"));
        System.out.println(n);
        
        if (n%10==0 && n%5==0 && n%2==0)
        {
            JOptionPane.showMessageDialog (null,"o numero é divisivel por 10,5 e 2 ");
        }
        
        else 
        if(n%5==0)
        {
            JOptionPane.showMessageDialog (null,"o numero é divisivel por 5");
        }
        
        else 
        if(n%2==0)
        {
            JOptionPane.showMessageDialog (null,"o numero é divisivel por 2");
        }
        
        else 
        {
            JOptionPane.showMessageDialog (null,"o numero não é divisivel por 10,5 e 2");
        }
    }
}

