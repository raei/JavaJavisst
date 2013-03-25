/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap2;

import java.util.Scanner;

/**
 *
 * @author raei
 */
public class BytaTecken {
    
    public static void main(String[] args) {
        
        StringBuilder sp = new StringBuilder("????");
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < sp.length(); i++) {
              char t  =sc.next().charAt(0);
        
                
        
                sp.setCharAt(i, t);
        }
        
      
        
        
    }//end main    
}//end class
