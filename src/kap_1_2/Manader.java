package kap_1_2;

public class Manader {
    
    public static void main(String[] args) {
        
        int manad = 9;
        
        switch (manad) {
            case 1:
                    System.out.println("Jan");
            case 2:
                    System.out.println("Feb");
            case 3:
                    System.out.println("Mars");
            case 4:
                    System.out.println("April");
            case 5:
                    System.out.println("Maj");
            case 6:
                    System.out.println("Juni");
            case 7:
                    System.out.println("Juli");
            case 8:
                    System.out.println("Aug");
            case 9:
                    System.out.println("Sep");
            case 10:
                    System.out.println("Okt");
            case 11:
                    System.out.println("Nov");
            case 12:
                    System.out.println("Dec");
                break;                
            default:
                System.out.println("Fel inmatning");
        }//end switch
    }//end main    
}//end class
