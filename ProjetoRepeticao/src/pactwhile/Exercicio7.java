/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pactwhile;

import javax.swing.JOptionPane;

/**
 *
 * @author LabInfo03-05
 */
public class Exercicio7 {
    public static void main(String[] args) {
        double i=1,m,s=1,n;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser calculado:"));
        while(i<=n){
             m=i;
             s=m*s;
             i++;
        }
        System.out.println("A fatorial do número " +n + " é igual a: "+s );
    }
    }
    

