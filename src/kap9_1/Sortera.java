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
public class Sortera 
{ 

    public static void main(String[] args) 
    {
        int n = 100;
        int[] a = new int[n];
        System.out.println("Här skrivs listan ut osorterad:" );
        
        for(int i = 0; i < n; i++) {
            if(i % 10 == 0){
        	System.out.println();
            }//end if
            a[i] = (int)(1000 * Math.random());
            System.out.print(a[i] + "\t");        
        }//end for   
        
        Arrays.sort(a);
        
//        int s;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if(a[i] > a [j]){
//                    s = a[i];
//                    a[i] = a[j];
//                    a[j] = s;
//                }//end if                
//            }//end for inner            
//        }//end for outer
        
        System.out.println("Här skrivs listan ut sorterad:" );        
        for(int i = 0; i < n; i++) {
            if(i % 10 == 0){
        	System.out.println();
            }//end if           
            System.out.print(a[i] + "\t");        
        }//end for 
    }//end main
}//end class
    

