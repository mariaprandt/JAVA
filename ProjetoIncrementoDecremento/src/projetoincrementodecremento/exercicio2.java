/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoincrementodecremento;

/**
 *
 * @author LabInfo03-05
 */
public class exercicio2 {
    public static void main(String[] args) {
        int n; 
        n=6;
        System.out.println("n vale"+ n);//6
        System.out.println("n vale"+ n++);//6
        n+=3;
        System.out.println("n vale"+ n);//10
        n-=5;
        System.out.println("n vale"+ n);//5
        n+=20;
        System.out.println("n vale"+ n);//25
        n-=20;
        System.out.println("n vale"+ n++);//5
        System.out.println("n vale"+ n++);//6
        System.out.println("n vale"+ n++);//7
        System.out.println("n vale"+ n);//8
        System.out.println("n vale"+ n++);//8
    }
}
