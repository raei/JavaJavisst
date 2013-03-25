package ovningKap1_2;

public class SupportSkivor 
{   //Metod som skriver ut välkomsttexten     
    public void valkomstText()
    {
        System.out.println("Välkommen till CD shopen");
        System.out.println("Priset per skiva är 9.90kr styck.");
        System.out.println("Du får mängdrabatt. ");
        System.out.println("Vid köp av fler än 10 skivor 5% rabatt");
        System.out.println("Vid köp av fler än 50 skivor 10% rabatt");
        System.out.println("Vid köp av fler än 100 skivor 15% rabatt"); System.out.println("Välkommen till CD shopen");
        System.out.println("Priset per skiva är 9.90kr styck.");        
    }//end valkomstText
    
    //Metod för att räkna ut kostnaden för köpet av skivorna beroende på hur många som köpts
    public double beraknaPris(int antalSkivor) 
    {
        double skivPris = 9.90;//aktuellt skivpris
        double pris = 0.0;//slutliga priset som ska returneras
        
        if(antalSkivor >= 100){
             pris = (antalSkivor * skivPris) * 0.85;
        }else if(antalSkivor >= 50){
            pris = (antalSkivor * skivPris) * 0.90;           
        }else if(antalSkivor >= 10){
            pris = (antalSkivor * skivPris) * 0.95;
        }else{
            pris = (antalSkivor * skivPris) * 1.00;
        }        
        return pris;
    }//end method beraknaPris

    //metod för att skriva ut info om köpet utskriften beror på vilken rabatt kunden fått
    public void skrivUtInkop(int antalSkivor, String formateratOrdPris, String formateratTal) 
    {        
        if(antalSkivor >= 100){
             System.out.println("Ordinarie pris: " + formateratOrdPris);   
             System.out.println("Ditt pris efter rabatten på 15%: " + formateratTal);
        }else if(antalSkivor >= 50){
             System.out.println("Ordinarie pris: " + formateratOrdPris);   
             System.out.println("Ditt pris efter rabatten på 10%: " + formateratTal);            
        }else if(antalSkivor >= 10){
             System.out.println("Ordinarie pris: " + formateratOrdPris);   
             System.out.println("Ditt pris efter rabatten på 5%: " + formateratTal);
        }else{
             System.out.println("Du handlade mindre än 10 skivor så ingen rabatt utgår:");   
             System.out.println("Ditt pris för skivorna: " + formateratTal);
        }
    }//end skrivUtInkop   
    
}//end class
