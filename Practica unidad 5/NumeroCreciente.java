

public class NumeroCreciente
{
    public String numeroCreciente(int numero){
    String resp= "";
    if (numero >99 && numero<1000){
      int a =numero/100;
      int b =(numero%100)/10;
      int c= numero%10; 
      if(a<b && b<c){
        resp= "Numero en crecimineto";
        } else{
        resp= "Numero decreciente";
        }
    } else{
      resp="Numero no valido " ;
    }
   
    
    return resp;
    }
    
}
