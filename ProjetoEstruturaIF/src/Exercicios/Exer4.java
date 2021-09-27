
package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exer4 {
     public static void main(String[] args) {
       
         double f, m, p, a, pi,dp;
         DecimalFormat df=new DecimalFormat("0.000");
         String sexo;
         
         a = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));

         p = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
         
         sexo= (JOptionPane.showInputDialog("Digite o sexo: "));
         
         if (sexo.equalsIgnoreCase("m")) {
             pi = (72.7 * a) - 58;
             dp=p-pi;
            JOptionPane.showMessageDialog (null,"A diferença do seu peso e o peso ideal é:"+dp);
             if(p>pi)
             {
                JOptionPane.showMessageDialog (null,"Peso acima do ideal");
                JOptionPane.showMessageDialog (null,"O peso ideal"+pi);
               
             }
             else if (p<pi)
             {
               JOptionPane.showMessageDialog (null,"Peso abaixo do ideal");
               JOptionPane.showMessageDialog (null,"O peso ideal"+pi);
             }
             else
             {
                JOptionPane.showMessageDialog (null,"Peso ideal");
             }        
    }
          if (sexo.equalsIgnoreCase("f")) {
             pi = (62.1*a)-44.7;
             dp=p-pi;
             JOptionPane.showMessageDialog (null,"A diferença do seu peso e o peso ideal é:"+dp);
             if(p>pi)
             {
                JOptionPane.showMessageDialog (null,"Peso acima do ideal");
             }
             else if (p<pi)
             {
               JOptionPane.showMessageDialog (null,"Peso abaixo do ideal");
             }
             else
             {
                JOptionPane.showMessageDialog (null,"Peso ideal");
             }        
    }

     }
}
