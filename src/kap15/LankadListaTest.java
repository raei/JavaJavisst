package kap15;

import java.util.LinkedList;
import java.util.Scanner;

public class LankadListaTest {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> namnLista = new LinkedList<>();
        int val = 1;
        boolean fortsatt = true;
        String namn;
        int plats;
        
        while (fortsatt) 
        {       
            if(namnLista.isEmpty()){
                System.out.println("Listan är tom");
            }else{
                for (int i = 0; i < namnLista.size(); i++) {                    
                    System.out.println( i + ". " + namnLista.get(i));
                }//end forloop
            }//end if else
            System.out.println("");
            
            System.out.println("DINA VAL");            
            System.out.println("1. Fyll listan med namn ");
            System.out.println("2. Lägg till ett namn ");
            System.out.println("3. Lägg till ett namn på en viss plats ");
            System.out.println("4. Se element nummer ");
            System.out.println("5. Ta bort element nummer ");
            System.out.println("6. Ta bort ett namn ");
            System.out.println("7. Ta bort alla ");
            System.out.println("0. Avsluta: ");
            try {
                
            

            System.out.print("Välj: ");
            val = scanner.nextInt();

            switch (val) {
                case 1:
                    namnLista.add("Kalle"); 
                    namnLista.add("Lisa");
                    namnLista.add("Anna"); 
                    namnLista.add("Johan");
                    namnLista.add("Stina"); 
                    namnLista.add("Pelle");                  
                    System.out.println("");
                    break;
                case 2:
                        System.out.print("Ange namnet: ");
                        namn = scanner.next(); 
                        if(!namn.equals("")){
                            namnLista.add(namn);
                        }
                    break;
                case 3:
                    System.out.print("Ange platsen: ");
                    plats = scanner.nextInt();
                    System.out.print("Ange namnet: ");
                    namn = scanner.next();                    
                    namnLista.add(plats, namn);                   
                    break;
                case 4:
                    System.out.print("Ange vilken du vill granska: ");
                    plats  = scanner.nextInt();
                    System.out.println("Platsen har namnet: " + namnLista.get(plats));                   
                    break;
                case 5:
                    System.out.print("Ange platsen du vill ta bort: ");
                    plats = scanner.nextInt();
                    namnLista.remove(plats);                   
                    break;
                case 6:
                     System.out.print("Ange namnet du vill ta bort: ");
                     namn = scanner.next(); 
                     boolean hittad = false;
                     if(!namn.equals("")){
                        for (String namnetIListan : namnLista) {
                           if(namnetIListan.equals(namn)){
                               namnLista.remove(namn);
                               hittad = true;
                           }
                        }//end for
                     }else{
                         System.out.println("Du måste ange ett namn"); 
                         hittad = true;
                     }
                     
                     if(hittad == false){
                         System.out.println("Namnet finns inte i listan");
                     }
                    break;
                case 7:
                    System.out.println("Ta bort listan(j/n)");
                    char svar = scanner.next().charAt(0);
                    if(svar == 'j' || svar == 'J'){
                        namnLista.clear();
                    }else{
                        System.out.println("Du ångrade dig");
                    }         
                    break;
                case 0:
                    fortsatt = false;
                    System.out.println("Goodbyyyyyye!");
                    break;
                default:
                    System.out.println("Fel inmatning");
            }//end switch 
            } catch (Exception e) {
                System.out.println("Mina fel skyll dig själv");
            }
            
        }//end while        
    }//end main    
}//end class
