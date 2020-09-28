

public class AñoBisiesto
{
    public String añoBisiesto(int año)
    {
    String resp="";
    if(año>0){
      if(año%4==0){
       if((año%100!=0)||(año%400==0)){
            resp="Es año bisiesto";
        } 
       }else{
         resp="No es año bisiesto" ;
     }
    }
     
    return resp;
  
  }  
}
