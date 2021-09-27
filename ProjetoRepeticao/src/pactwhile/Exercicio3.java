/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pactwhile;

/**
 *
 * @author LabInfo03-05
 */
public class Exercicio3 {
    public static void main(String[] args) {
         double i=1,m,s=0;
        while(i<=20){
             System.out.println(i);
             m=i/2;
             s=s+m;
             i++;
        }
        System.out.println("A soma das metades é:"+s);
    }
}
