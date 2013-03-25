
package provovningar;

import java.util.Scanner;


public class Bensin 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double antalKm = 0;
        double literBensin = 0;
        double forbrukning;
        
        System.out.print("Ange antal km du kört: ");
        antalKm = sc.nextDouble();
        System.out.print("Hur mycket bensin har kört upp: ");
        literBensin = sc.nextDouble();
        
        forbrukning = (10 * literBensin)/antalKm;
        System.out.println("Förbrukning " + forbrukning);
        
        if(forbrukning < 0.7){
            System.out.println("Bra bil");
        }else if(forbrukning < 0.9){
            System.out.println("Godkänd bil");
        }else{
            System.out.println("Dålig bil");
        }       
    }   
}
