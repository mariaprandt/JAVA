/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pactFor;

/**
 *
 * @author LabInfo03-05
 */
public class Exercicio3 {
    public static void main(String[] args) {
        double i,m,s=0;
        for(i=1;i<=20;i++){
             System.out.println(i);
             m=i/2;
             s=s+m;
        }
        System.out.println("A soma das metades é:"+s);
    }
    
}
