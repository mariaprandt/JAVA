/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pactFor;

import javax.swing.JOptionPane;

/**
 *
 * @author LabInfo03-05
 */
public class Exercicio7 {
    public static void main(String[] args) {
        double i,m,s=1,n;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser calculado:"));
        for(i=1;i<=n;i++){
             m=i;
             s=m*s;
        }
        System.out.println("A fatorial do número " +n + " é igual a: "+s );
    }
}
