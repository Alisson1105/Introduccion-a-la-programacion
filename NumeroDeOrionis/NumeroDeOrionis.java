
public class NumeroDeOrionis
{
    public String numeroDeOrionis(int numero)
    { 
        String resp="";
        double contador=cantDeMultiplos(numero);
        double cantDigitos=cantDeDigitos(numero)/2;
        if(contador>cantDigitos){
            resp="Es de Orionis";
        } else{
            resp="No es de Orionis";
        }
        return resp;
    }

    public int cantDeDigitos(int num)
    { 
        int cont=0;
        while (num>0){
            num=num/10;
            cont++;
        }
        return cont;
    }

    public int cantDeMultiplos(int aux)
    {
        int cant=0;
        while(aux>0){
            int mod=aux%10;
            aux=aux/10;
            if(mod!=0){
                if(mod%3==0){
                    cant++;
                }
            }
        }
        return cant;
    }
}