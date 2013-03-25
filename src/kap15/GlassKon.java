/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap15;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author raei
 */
public class GlassKon {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> glassKon = new LinkedList<>();
        int val = 1;
        boolean fortsatt = true;
        String namn;
        int plats;
        
        glassKon.add("Kalle"); 
        glassKon.add("Lisa");
        glassKon.add("Anna"); 
        glassKon.add("Johan");
        glassKon.add("Stina"); 
        glassKon.add("Pelle");  
        
        while (fortsatt) 
        {       
            if(glassKon.isEmpty()){
                System.out.println("Listan är tom");
            }else{
                for (int i = 0; i < glassKon.size(); i++) {                    
                    System.out.println( i + ". " + glassKon.get(i));
                }//end forloop
            }//end if else
            System.out.println("");
            
            System.out.println("DINA VAL");            
            System.out.println("1. Lägg till en ny person ");
            System.out.println("2. Vem är först i kön ");
            System.out.println("3. Ta bort en person ");
            System.out.println("0. Avsluta: ");
            try {          

                System.out.print("Välj: ");
                val = scanner.nextInt();
                switch (val) {
                    case 1:
                        System.out.print("Ange namnet: ");
                        namn = scanner.next(); 
                        if(!namn.equals("")){
                            glassKon.addLast(namn);
                        }  
                        break;
                    case 2:
                        System.out.println("Först i kön: " + glassKon.getFirst());
                        break;
                    case 3:
                        System.out.println("Ta bort personen som är först i kön");
                        glassKon.removeFirst();
                        break;                
                    case 0:
                        fortsatt = false;
                        System.out.println("Goodbyyyyyye!");
                        break;
                    default:
                        System.out.println("Fel inmatning");
                }//end switch 
                } catch (Exception e) {
                    System.out.println("Avbrott");
                }

        }//end while        
    }//end main    
    
}
