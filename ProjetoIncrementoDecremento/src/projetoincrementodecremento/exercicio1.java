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
public class exercicio1 {
    public static void main(String[] args) {
        int n;
        n=10;
        System.out.println("n vale"+ n);//10
        System.out.println("n vale"+ --n);//9
        System.out.println("n vale"+ n);//9
        System.out.println("n vale"+ n++);//9
        System.out.println("n vale"+ n);//10
        n+=10;
        System.out.println("n vale"+ n);//20
        n-=10;
        System.out.println("n vale"+ n);//10
        System.out.println("n vale"+ ++n);//11
        System.out.println("n vale"+ n--);//11
        System.out.println("n vale"+ n--);//10
        System.out.println("n vale"+ n);//9
    }
}
