/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap9_1;

import java.util.Arrays;

/**
 *
 * @author raei
 */
public class TestaArrayer {
    
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3 };
        
        boolean koll = Arrays.equals(a, b);
        
        if(koll == true){
            System.out.println("Lika");
        }else{
            System.out.println("Olika");
        }
        
    }//end main    
}//end class
