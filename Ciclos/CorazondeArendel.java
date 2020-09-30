
public class CorazondeArendel
{

    public String corazonDeArendel(int numero)
    {
        String resp="";
        int contador=0;
        int aux=numero;
        while (aux>0){
            aux=aux/10;
            contador++;
        }
        int cant=contador/2;
        int digito=0;
        for(int i=cant;i>0;i--){
            digito= numero/10;
            numero=digito;
        }

        int mediodigito=digito%10;
        if(mediodigito%3==0){
            resp="Tiene un corazon de Arendel";
        }else{
            resp="Tiene un corazon normal";
        }
        return resp;
    }

}
