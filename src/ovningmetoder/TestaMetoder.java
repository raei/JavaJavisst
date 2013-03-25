
package ovningmetoder;

import java.text.DecimalFormat;
import java.util.Scanner;


public class TestaMetoder {
    
    public static void main(String[] args) {
        
        Support program = new Support(); 
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.##");
        
        char fortsatt;
        do {            
            System.out.print("Ange en stad: ");
            String stad = sc.next();
            System.out.print("Ange soltimmar: ");
            int soltimmar = sc.nextInt();
            program.soltimmar(stad, soltimmar); 
            System.out.print("Vill du ange en till stad: (J/N)");
            fortsatt = sc.next().charAt(0);            
        } while (fortsatt == 'J' || fortsatt == 'j');
        
        System.out.println("Hejdå ha en bra dag!");     
       
       
        
        
        
        
    }//end main    
}//end class
