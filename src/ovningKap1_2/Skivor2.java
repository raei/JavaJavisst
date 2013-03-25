package ovningKap1_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Skivor2 {
    // main metoden 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.##");
        
        SupportSkivor support = new SupportSkivor();     
        
        int antalSkivor;
        double skivpris, ordinariepris;
        String formateratSlutpris, formateratOrdPris;        
        support.valkomstText();
        System.out.print("Hur många vill du köpa: ");
        antalSkivor = sc.nextInt();
        ordinariepris = antalSkivor * 9.90;//beräknar ordinarie pris
        formateratOrdPris = d.format(ordinariepris);//formaterar ordpris med två decimaler
        skivpris = support.beraknaPris(antalSkivor);//räknar ut priset med eventuell rabatt
        formateratSlutpris = d.format(skivpris);//formaterar priset som kunden ska betala med två decimaler        
        support.skrivUtInkop(antalSkivor, formateratOrdPris, formateratSlutpris); //skriver ut info om affären  
        System.out.println("Välkommen åter!");
                       
    }//end main 
   
    
}//end class
