
public class FragmentoDeNelthari
{
    public int fragmentodeNelthari(int numero1,int numero2){
        int moduloDeNumero2=0;
        int suma=SumaDeDigitosDePrimerNumero(numero1);
        int resultado=0;

        while(numero2!=0){
            moduloDeNumero2=numero2%10;
            if(moduloDeNumero2%2==0){
                resultado=suma+moduloDeNumero2;
            } else{
                resultado=suma-moduloDeNumero2;
            }
            suma=resultado;
            numero2=numero2/10;

        }

        return resultado;

    }

    public int SumaDeDigitosDePrimerNumero(int num1){
        int suma=0;
        int modulo=0;
        while(num1!=0){
            modulo=num1%10;
            suma=suma+modulo;
            num1=num1/10;
        }
        return suma;
    }
}
