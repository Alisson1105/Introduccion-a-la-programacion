
public class CorazondeArendelCorregido{
    public String corazonDeArendel(int numero){
        String resp="";
        int cant=contarDigitos(numero)/2;
        for(int i=cant;i>0;i--){
            numero = numero/10;
        }
        int mediodigito=numero%10;
        if(mediodigito%3==0){
            resp="Tiene un corazon de Arendel";
        }else{
            resp="Tiene un corazon normal";
        }
        return resp;
    }

    public int contarDigitos(int aux){
        int contador=0;
        while (aux>0){
            aux=aux/10;
            contador++;
        }
        return contador;
    }

}