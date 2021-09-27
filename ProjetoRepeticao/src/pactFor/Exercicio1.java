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
public class Exercicio1 {
    public static void main(String[] args) {
        int n,i;
        double c;
        for(i=1;i<=5;i++){
           n=Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser calculado:"));
           c=Math.pow(n,3);
            System.out.println("O número ao cubo é:"+c);
        }
    }
}
