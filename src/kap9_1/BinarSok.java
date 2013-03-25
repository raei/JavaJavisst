package kap9_1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarSok {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = {20, 56, 66, 89, 23};
        Arrays.sort(arr);
        int max, min, t, pos, mitten;
        min = 0;
        max = arr.length - 1;
        
        System.out.print("Vilket heltal söker du? ");
        t = sc.nextInt();
        
        pos = -1;
        
        while (min <= max && pos == -1) {
            mitten = (max + min)/2;
            if(t > arr[mitten]){
                min = mitten + 1;
            }else if(t < arr[mitten]){
                max = mitten - 1;
            }else{
                pos = mitten;
            }
        }//end while 
        
        if(pos == -1){
            System.out.println("Talet hittades inte");
        }else{
            System.out.println("Talet finn i element nummer " + pos);
        }//end if/else
        
    }//end main    
}//end class
