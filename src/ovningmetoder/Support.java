/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ovningmetoder;

/**
 *
 * @author raei
 */
public class Support {
    
    public double pi(){
        return  3.14159265;
    }//end pi()
    
    public double minst(double tal1, double tal2){
       double min = tal1;       
       if(tal2 < tal1){
           min = tal2;
       }       
        return min;        
    }//end minst()    

    public double spanning(double r, double i) {      
        double u = r * i;
        return u;
    }//end spanning
   
    public void soltimmar(String stad, int soltimmar){
        System.out.print("" + stad + ":");   
        
        for (int i = 0; i < soltimmar; i++) {
            System.out.print("*");
        }//end for   
        System.out.println("");
    }//end soltimmar 
    
    public boolean rekord(double langd, double vind){        
        boolean svar;
        if(langd > 7.92 && vind <= 2.0)
        {
            svar = true;
        }else{
            svar = false;
        }
       return svar;
    }//end area
    
    public double omkrets(){
       
        return 0;
    }//end omkrets
}//end class
