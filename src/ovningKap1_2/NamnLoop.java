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
public class NamnLoop {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String namn = sc.nextLine();
        System.out.println("Ange hur många namn du vill skriva ut. ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("" + namn);
        }//end for        
    }//end main    
}//end class
