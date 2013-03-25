package ovningKap1_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Skivor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.##");
        
        int antalSkivor;
        double skivpris;
        String formateratTal;
        
        System.out.println("Välkommen till CD shopen");
        System.out.println("Priset per skiva är 9.90kr styck.");
        System.out.println("Du får mängdrabatt. ");
        System.out.println("Vid köp av fler än 10 skivor 5% rabatt");
        System.out.println("Vid köp av fler än 50 skivor 10% rabatt");
        System.out.println("Vid köp av fler än 100 skivor 15% rabatt");
        System.out.print("Hur många vill du köpa: ");
        antalSkivor = sc.nextInt();
        skivpris = antalSkivor * 9.90;
        formateratTal = d.format(skivpris);
        
        if(antalSkivor >= 100){
            skivpris = skivpris * 0.85;
            formateratTal = d.format(skivpris);
            System.out.println("Du har fått 15 % rabatt ");
            System.out.println("Du får betala " + formateratTal +"kr för ditt köp");
        }else if(antalSkivor >= 50){
            skivpris = skivpris * 0.90;
            formateratTal = d.format(skivpris);
            System.out.println("Du har fått 10 % rabatt ");
            System.out.println("Du får betala " + formateratTal +"kr för ditt köp");
        }else if(antalSkivor >= 10){
            skivpris = skivpris * 0.95;
            formateratTal = d.format(skivpris);
            System.out.println("Du har fått 5 % rabatt ");
            System.out.println("Du får betala " + formateratTal +"kr för ditt köp");
        }else{
            System.out.println("Ingen rabatt denna gång");
            System.out.println("Du får betala " + formateratTal +"kr för ditt köp");
        }
        System.out.println("Grattis till en bra affär!");
        
        
    }//end main    
}//end class
