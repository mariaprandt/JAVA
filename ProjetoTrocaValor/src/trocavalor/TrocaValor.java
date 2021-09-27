/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trocavalor;

import java.util.Scanner;

/**
 *
 * @author Aluno_2
 */
public class TrocaValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner s = new Scanner(System.in);
        int valorA,valorB, valorC;
      
        //Leitura de dados
        System.out.println("Entre com o valor A:");
        valorA = s.nextInt();
        System.out.println("Entre com o valor B:");
        valorB = s.nextInt();
        //Processamento
        valorC = (valorA);
        valorA = (valorB);
        valorB = (valorC);
        System.out.println("valorA:"+ valorA
        +"\nvalorB:"+ valorB
        );
    }
    
}
