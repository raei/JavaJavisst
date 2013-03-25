/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ovningKap1_2;

import java.util.Scanner;

/**
 *
 * @author raei
 */
public class Statistik {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int tal = 0;
        int summa = 0;
        int n = 10;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ange ett tal: ");
            tal = sc.nextInt();
            summa = summa + tal;         
        }
        System.out.println("Tal är = " + summa);
        
    }//end main
    
    
}//end class
