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
public class ModeloTabuada {
    public static void main(String[] args) {
         int t,i=1,r;
        t=Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser calculado:"));
        
        while(i<=10)
        {
            r=t*i;
            System.out.println(t+"x"+i+"="+r);
            i++;
        }
    }
}
