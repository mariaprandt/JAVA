
package Exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exer3 {
    
    public static void main(String[] args) {
       
        int s,p,e;
        s=Integer.parseInt(JOptionPane.showInputDialog ("Digite o salário bruto: "));
        System.out.println(s);
        
        p=Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor da prestação: "));
        System.out.println(p);
        
        e= (s*30)/100;
                
        if (p <= e)
        {
            JOptionPane.showMessageDialog (null,"Empréstimo concedido");
        }
        
        else 
        if (p > e)
        {
            JOptionPane.showMessageDialog (null,"Empréstimo não concedido");
        }
        
    }
}

