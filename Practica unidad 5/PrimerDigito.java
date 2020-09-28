

public class PrimerDigito
{
  
    public int PrimerDigito (int numero)
    {
        int primerdigito=0;
        if(numero>99 && numero<1000){
         primerdigito = numero/100;
        
        } else{
            primerdigito = 000 ;
          
        
       }
        return primerdigito;
    }
}
