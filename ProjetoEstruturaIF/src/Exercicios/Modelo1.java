
package Exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Modelo1 {
    
    public static void main(String[] args) {
       
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog ("Digite um numero:"));
        System.out.println(num);
        
        if (num%2==0)
        JOptionPane.showMessageDialog (null,"O numero é par");
   
        else
            JOptionPane.showMessageDialog (null,"O numero é ímpar");
        
    }
    
}
