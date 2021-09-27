/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetoswitchcase.exercicios;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class exPesoIdeal {
    public static void main(String[] args) {
         double f, m, p, a, pi,dp;
         DecimalFormat df=new DecimalFormat("0.00");
         String sexo;
         
          sexo=(JOptionPane.showInputDialog("Digite o sexo: "));        
          
          switch(sexo.toUpperCase()){
  case"MASCULINO": {
          a = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
          p = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
          pi = (72.7 * a) - 58;
          dp=p-pi;
          JOptionPane.showMessageDialog (null,"A diferença do seu peso e o peso ideal é:"+dp);
          do{
              JOptionPane.showMessageDialog (null,"Peso acima do ideal");
              JOptionPane.showMessageDialog (null,"O peso ideal é:"+pi);
          }
          while(p>pi);
          do{
              JOptionPane.showMessageDialog (null,"Peso abaixo do ideal");
               JOptionPane.showMessageDialog (null,"O peso ideal"+pi);
          }
          while(p<pi);
          do{
              JOptionPane.showMessageDialog (null,"Peso ideal");
          }
          while(p==pi);
        
          }
  case"FEMININO": {
          a = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
          p = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
          pi = (62.1*a)-44.7;
          dp=p-pi;
          JOptionPane.showMessageDialog (null,"A diferença do seu peso e o peso ideal é:"+dp);
          do{
              JOptionPane.showMessageDialog (null,"Peso acima do ideal");
              JOptionPane.showMessageDialog (null,"O peso ideal"+pi);
          }
          while(p>pi);
          do{
              JOptionPane.showMessageDialog (null,"Peso abaixo do ideal");
               JOptionPane.showMessageDialog (null,"O peso ideal"+pi);
          }
          while(p<pi);
          do{
              JOptionPane.showMessageDialog (null,"Peso ideal");
          }
          while(p==pi);
          }
  default: JOptionPane.showMessageDialog(null,"inválido"); 
      System.exit(0);
    }
}
}