package ovningmetoder;

import java.util.ArrayList;
import java.util.Scanner;

public class TestSoltimmar2 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        
        ArrayList<Soltimmar> stadsLista = new ArrayList<>();
        Soltimmar support = new Soltimmar();        
        support.welcome();//skriver ut välkomsttexten
        System.out.print("Hur många städer vill du mata in? ");
        int antalStader = sc.nextInt();//Du avgör hur många städer du vill ange
        
        for (int i = 0; i < antalStader; i++) {
              support.angeStadsData();//Metodene fixar inmatningen av städer
        }//end for      
    }//end main    
}//end class
