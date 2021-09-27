/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhadepagamento;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LabInfo03-05
 */
public class FolhaDePagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variaveis 
         double totaldep,vdh,sb,phn,pnh100,pnh70,pnh50,salf = 0, sf,ir,inss,vt,vale,fgts,tdesc,sliq,cod,nhn,nh100,nh70,nh50,ndep;
         String nome;
         DecimalFormat df = new DecimalFormat ("R$#,##0.00");
         DecimalFormat df1 = new DecimalFormat ("0.0");
         //leitura
     
         cod = Double.parseDouble(JOptionPane.showInputDialog("Digite o código do funcionário: "));
         nome= (JOptionPane.showInputDialog("Digite seu nome:"));
         vdh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora: "));
         sb= Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário Base: "));
         ndep = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de dependentes: "));
         nhn = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas normais trabalhadas: "));
         nh100 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas extras a 100%: "));
         nh70 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas extras a 70%: "));
         nh50 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas extras a 50%: "));
         
         //Proventos
         
         phn=vdh*nhn;
         pnh100=vdh*nh100*2;
         pnh70=vdh*nh70*1.7;
         pnh50=vdh*nh50*1.5;
         //Provento do salário família 
         if(sb<=531.12)
         salf=ndep*27.24;
         else
             if(sb>531.12 && sb<=798.30)
             {
                 salf=ndep*19.19;
             }
         else
             if(sb>768.30)
             {
                 salf=0;
             }
         //Descontos
         //Imposto de renda
         if (sb>=0 && sb<=1434.59)
         {
             ir=0;
         }
            else
             if(sb>1434.60 && sb<=2150.00)
             {
                 ir=(sb*0.075)-107.59;
             }
            else
             if(sb>2150.01 && sb<=2866.70)
             {
                 ir=(sb*0.15)-268.84;
             }     
         else
             if(sb>2866.71 && sb<=3582.00)
             {
                 ir=(sb*0.225)-483.84;
             }
         else
             {
                 ir=(sb*0.275)-662.94;
             }
         //inss
 
            if(sb>=0 && sb<=1024.97)
             {
                 inss=sb*0.08;
             }
            else
                 if(sb>1024.97 && sb<=1708.27)
             {
                 inss=sb*0.09;
             }
            else
                if(sb>1708.27 && sb<=3416.54)
             {
                 inss=sb*0.11;
             }
            else
                {
                    inss=375.81;
                }
            //vale transporte
            if (sb>=0 && sb<=1500)
            { 
               vt=sb*0.06;           
            }
            else 
            {
                vt=80.00;
            }
            //Vale
            vale=sb*0.4;
            //Total de Descontos
            tdesc=inss+ir+vt+vale;
            // Total de Proventos
            totaldep=pnh100+pnh70+pnh50+phn;
            //Total Líquido
            sf=totaldep-tdesc;
            //FGTS
            fgts=sb*0.08;
            //exibir
            JOptionPane.showMessageDialog (null, "Código do funcionário:"+cod + 
                    "\nNome do funcionário:"+ nome +
                    "\n\nValor do slário por hora:" + df.format(vdh)+
                    "\nSalário base:" + df.format(sb) +
                    "\nNúmero de Dependentes:" + df1.format(ndep) +
                    "\nNúmero de horas normais:" + df1.format(nhn) +
                    "\nNúmero de horas extras a 100%:" + df1.format(nh100) +
                    "\nNúmeros de horas extras a 70%:" + df1.format(nh70) +
                    "\nNúmeros de horas extras a 50%:" + df1.format(nh50) +
                    "\n\nProventos de horas normais trabalhadas:" + df.format(phn)+
                    "\nProventos de horas extras a 100%:" + df.format(pnh100) +
                    "\nProventos de horas extras a 70%:" + df.format(pnh70) +
                    "\nProventos de horas extras a 50%:" + df.format(pnh50) +
                    "\nProventos Salário Familia:" + df.format(salf) +
                    "\nDesconto INSS:" + df.format(inss) +
                    "\nDesconto do Imposto de Renda:" + df.format(ir) +
                    "\nDesconto do vale transporte:" + df.format(vt) +
                    "\nDesconto do Adiantamento:" + df.format(vale) +
                    "\n\nTotal de Proventos:"+ df.format(totaldep) +
                    "\nTotal de Descontos"+ df.format(tdesc) +
                    "\nTotal Líquido:"+ df.format(sf) +
                    "\nCálculo do FGTS para simples conferências:"+ df.format(fgts) , 
                    "Folha Completa de Pagamento Mensalista", JOptionPane.PLAIN_MESSAGE);
               

    }
    
    
}
