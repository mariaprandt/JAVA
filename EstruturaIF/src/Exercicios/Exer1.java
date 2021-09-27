package Exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exer1 {
    
    public static void main(String[] args) {
       
        int a,b,x;
        a=Integer.parseInt(JOptionPane.showInputDialog ("Digite A:"));
        System.out.println(a);
        
        b=Integer.parseInt(JOptionPane.showInputDialog ("Digite B:"));
        System.out.println(b);
        
        if (a==b)
        {
             x= a+b;
            JOptionPane.showMessageDialog (null,"A soma é "+x);
        }
        
        else 
        {
            x= a*b;
            JOptionPane.showMessageDialog (null,"A multiplicação é "+x);
        }
       
    }
}
