/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap15;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author raei
 */
public class StackTest {

    public static void main(String[] args) {

        Stack<String> minStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        char svar;
        boolean fortsatt = true;;
        while (fortsatt) {
            System.out.println("STACK: ");
            if (minStack.isEmpty()) {
                System.out.print("Ingen stack just nu");
            } else {
                for (String namn : minStack) {
                    System.out.println(namn);
                }
            }
            System.out.println();
            System.out.println("Välj:");
            System.out.println("1. Lägg en tallrik på tallrikstraven");
            System.out.println("2. Vems tallrik ligger nu högst upp?");
            System.out.println("3. Ta bort översta tallriken");
            System.out.println("0. Avsluta");

            try {
                svar = sc.nextLine().charAt(0);
                switch (svar) {
                    case '1':
                        System.out.print("Vems tallrik? ");
                        String namn = sc.nextLine();
                        minStack.push(namn);
                        break;
                    case '2':
                        System.out.print("Högst upp är " + minStack.peek() + " tallrik");
                        System.out.print(" (Tryck ENTER)");
                        sc.nextLine();
                        break;
                    case '3':
                        System.out.print("Tar bort " + minStack.pop() + " tallrik");
                        System.out.print(" (Tryck ENTER)");
                        sc.nextLine();
                        break;
                    case '0':
                        fortsatt = false;
                        System.out.println("SLUT");
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error");
            }//END TRY CATCH
            }
            System.out.println();

        }//end main    
    }//end class
