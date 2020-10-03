
public class RuecaDeArena
{
    public int RuecaDeArena(int numero,int numero2)
    {
        int numNuevo=0;  
        for( int i=numero2;i>0;i--){
            numNuevo=sumaDeDigitoMayoryMenor(numero);
            int numPrimoONo=numPrimo(numNuevo);
            if(numPrimoONo!=2){
                numNuevo=numNuevo*3;
            } else {
                numNuevo=numNuevo*(numNuevo/10);
            }
            numero=numNuevo;
        } 
        return numNuevo;
    }

    public int sumaDeDigitoMayoryMenor(int num)
    {
        int sumaDeDigitos=0;
        int mayor=num%10;
        int menor=num%10;
        num=num/10;
        while(num>0){
            int dig=num%10;
            if(dig>mayor){
                mayor=dig;

            } else if (dig<menor){
                menor=dig;
            }
            num=num/10;
        }
        sumaDeDigitos=(mayor*10)+menor;
        return sumaDeDigitos;
    }

    public int numPrimo (int num){
        int digito=0;
        int cont=0;
        for (int i=1; i<=num;i++){
            if(num%i==0){
                cont++;
            }
        }
        return cont++;
    }

}