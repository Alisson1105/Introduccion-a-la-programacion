
public class AnomaliEnElEquilibrio
{
    public String anomaliEnElEquilibrio(int[]arreglo)
    {
        String resp="";
        int sumaderecha=0;
        int sumaizquierda=0;
        int aux=arreglo.length;
        int sumaNueva=0;
        for(int i=0; i <arreglo.length/2; i++){
            sumaderecha=sumaderecha+arreglo[i];
        }
        for(int i=arreglo.length;i<arreglo.length;i++){
            sumaizquierda=sumaizquierda+arreglo[i];
        }
        aux=arreglo.length/2;
        while(arreglo.length>=2){
            if(sumaderecha>sumaizquierda){
                for(int i=0;i<aux;i++){
                 sumaNueva=sumaNueva+arreglo[i];
                }
            }

         }
    } 
}