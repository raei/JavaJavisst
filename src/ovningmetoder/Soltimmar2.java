/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ovningmetoder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raei
 */
public class Soltimmar2 {
    Scanner sc = new Scanner(System.in);
    
    

    public void welcome() {
        System.out.println("Välkommen");
        
    }
    private void skrivUtSolstatus(String stad, int soltimmar) {
        
        System.out.print("" + stad + ":");
        
        for (int i = 0; i < soltimmar; i++) {
            System.out.print("*");            
        }
        System.out.println("");        
    }    

    public String angeStadsData() {
       System.out.print("Ange stad: ");
        String stad = sc.next();
        System.out.print("\nAnge stadens soltimmar: ");
        int soltimmar = sc.nextInt();
        //skrivUtSolstatus(stad, soltimmar);
        return stad + "" +soltimmar;
    }
}
