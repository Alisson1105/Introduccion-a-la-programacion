

public class NumerosParientes
{
    public String numerosParientes(int numero1,int numero2)
    {
       String resp="";
       if((numero1%numero2==0)||(numero2%numero1==0)){
        resp="Son parientes";
       
    }else {
      resp="No son parientes";
    }
    return resp;
    }

}
