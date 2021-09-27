/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoswitchcase.exercicios;

import static java.time.Clock.system;
import javax.swing.JOptionPane;

/**
 *
 * @author LabInfo03-05
 */
public class Modelo {
    
    public static void main(String[] args) {
        //variavel
        int x;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 9"));
       
        switch(x){
            case 0: JOptionPane.showMessageDialog(null,"zero"); break;
            case 1: JOptionPane.showMessageDialog(null,"um"); break;
            case 2: JOptionPane.showMessageDialog(null,"dois"); break;
            case 3: JOptionPane.showMessageDialog(null,"três"); break;
            case 4: JOptionPane.showMessageDialog(null,"quatro"); break;
            case 5: JOptionPane.showMessageDialog(null,"cinco"); break;
            case 6: JOptionPane.showMessageDialog(null,"seis"); break;
            case 7: JOptionPane.showMessageDialog(null,"sete"); break;
            case 8: JOptionPane.showMessageDialog(null,"oito"); break;
            case 9: JOptionPane.showMessageDialog(null,"nove"); break;    
            default: JOptionPane.showMessageDialog(null,"inválido");                
        }
        
        System.exit(0);
        
    }
    
}
