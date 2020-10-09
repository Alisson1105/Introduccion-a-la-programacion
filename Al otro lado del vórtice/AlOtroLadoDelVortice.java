
public class AlOtroLadoDelVortice
{
    public String alOtroLadoDelVortice(int []arreglo){
        String resp="";
        String valor="";
        int actual=0;
        int mayor=buscarmayor(arreglo);
        int menor=buscarmenor(arreglo);
        if(menor<mayor){
            for(int i=menor;i<(mayor+1);i++){
                actual=arreglo[i];
                valor=valor+" "+arreglo[i]+",";
            }

        } else{
            for(int i=mayor;i<(menor+1);i++){
                actual=arreglo[i];
                valor=valor+" "+arreglo[i]+",";
            }
        }
        resp="El vórtice esta formado por los numeros "+valor;
        return resp;
    }

    public int buscarmenor(int []arreglo)
    {
        int valor=0;
        int menor=0;
        int posicion=0;
        int actual=0;
        for(int i=0;i<arreglo.length;i++){
            valor=arreglo[i];
            if(arreglo[i]<menor){
                menor=valor;
            }  
        }
        for (int i=0;i<arreglo.length;i++){
            if(arreglo[i] == menor){
                actual=i;
            }
        }
        return actual;
    }

    public int buscarmayor(int []arreglo)
    {
        int valor=0;
        int mayor=0;
        int posicion=0;
        int actual=0;
        for(int i=0;i<arreglo.length;i++){
            valor=arreglo[i];
            if(arreglo[i]>mayor){
                mayor=valor;
            }  
        }
        for (int i=0;i<arreglo.length;i++){
            if(arreglo[i] == mayor){
                actual=i;
            }
        }
        return actual;
    }
}
