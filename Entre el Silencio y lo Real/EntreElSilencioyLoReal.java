
public class EntreElSilencioyLoReal
{
    public String entreElSilencioyLoReal(int numero, double numero2){
        String resp="";
        double suma=0;
        while(numero>5||numero2>5){
           numero=numEnteroNuevo(numero,numero2); 
           numero2= numeroDecimalNuevo(numero,numero2); 
           
        }
        suma=(double)numero+numero2;
        resp="El numero entre el silencio y lo real es: "+suma;
        return resp;
    }
    
    public double decimal (int num,double num2){
        double partedecimal=0;
        partedecimal=num2%1;
        return partedecimal;
    }
    
    public double numeroDecimalNuevo(int n,double n2){
        double numNuevo=(double)n+decimal(n,n2);
        return numNuevo;
    }
    
    public double entero (int nume,double nume2){
        double parteEntera=0;
        parteEntera= nume2- decimal(nume,nume2);
        return parteEntera;
    }

    public int numEnteroNuevo (int numeroN,double numeroN2){
        int div=(int)entero(numeroN,numeroN2)/2;
        return div;
    }
}