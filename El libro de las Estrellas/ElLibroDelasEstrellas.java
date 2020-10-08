//
public class ElLibroDelasEstrellas
{
    public int[] elLibroDelasEstrellas(int[]arreglo)
    {
        int aux=0;
        int impar=impar(arreglo);
        impar=arreglo.length;
        for(int i =0; i<(arreglo.length-1); i++){
            for (int j=i+1; j <impar;j++){
                int valor=arreglo[i];
                if(valor%2!=0){
                    if(arreglo[j] < arreglo[i]){
                        aux = arreglo[j];
                        arreglo[j]=arreglo[i];
                        arreglo[i]=aux;
                    }
                }
            }
        }
        return arreglo;
    }

    public int impar(int []arreglo)
    {
        boolean res=false;
        int actual=0;
        int cont=0;
        for(int i=0;i<arreglo.length;i++){
            actual=arreglo[i];
            if(actual%2!=0){
                res=true; 
                cont++;
            }
        }
        return cont;
    }

    public int par(int []arreglo)
    {
        boolean res=false;
        int actual=0;
        int cont=0;
        for(int i=0;i<arreglo.length;i++){
            actual=arreglo[i];
            if(actual%2==0){
                res=true; 
                cont++;
            }
        }
        return cont;
    }
}
