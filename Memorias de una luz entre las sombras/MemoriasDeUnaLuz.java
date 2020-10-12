
public class MemoriasDeUnaLuz
{
    private Recuerdo[] recuerdos;
    public MemoriasDeUnaLuz(int n){
        recuerdos = new Recuerdo[n];
    }

    public boolean almacenar (Recuerdo nuevo){
        boolean res=false;
        for(int i=0;i<recuerdos.length&&res==false;i++){
            if(recuerdos[i] == null){
                recuerdos[i]=nuevo;
                res=true;
            }
        }
        return res;
    }

    public String ordenarFechaDias (){ 
        String resp="";
        boolean bandera=false;
        for(int i=0;i<recuerdos.length;i++){
            Recuerdo posicion=recuerdos[i];
            if(posicion==null){
                bandera=true;
            }else{
                bandera=false;
            }
        }
        if(bandera==true){
            resp="El metodo no se puede invocar,aun hay espaciosvacios en el arreglo";
        }else{
            for(int i=1;i<=recuerdos.length;i++){
                for(int j=0;j<=recuerdos.length-1-i;j++){
                    Recuerdo actual=recuerdos[j];
                    int diaActual=actual.getFecha().getDia();
                    Recuerdo deLado=recuerdos[j+1];
                    int diadeLado=deLado.getFecha().getDia();
                    if(diaActual>diadeLado){
                        Recuerdo aux=recuerdos[j];
                        recuerdos[j]=recuerdos[j+1];
                        recuerdos[j+1]=aux;
                    }
                }
            }
            resp="ordenado";
        }
        return resp;
    }

    public String ordenarFechaMes (){ 
        String resp="";
        boolean bandera=false;
        for(int i=0;i<recuerdos.length;i++){
            Recuerdo posicion=recuerdos[i];
            if(posicion==null){
                bandera=true;
            }else{
                bandera=false;
            }
        }
        if(bandera==true){
            resp="El metodo no se puede invocar,aun hay espaciosvacios en el arreglo";
        }else{
            for(int i=1;i<=recuerdos.length;i++){
                for(int j=0;j<=recuerdos.length-1-i;j++){
                    Recuerdo actual=recuerdos[j];
                    int diaActual=actual.getFecha().getMes();
                    Recuerdo deLado=recuerdos[j+1];
                    int diadeLado= deLado.getFecha().getMes();
                    if(diaActual>diadeLado){
                        Recuerdo aux=recuerdos[j];
                        recuerdos[j]=recuerdos[j+1];
                        recuerdos[j+1]=aux;
                    }
                }
            }
            resp="ordenado";
        }
        return resp;
    }
    
    public String ordenarFechaAño(){ 
        String resp="";
        boolean bandera=false;
        for(int i=0;i<recuerdos.length;i++){
            Recuerdo posicion=recuerdos[i];
            if(posicion==null){
                bandera=true;
            }else{
                bandera=false;
            }
        }
        if(bandera==true){
            resp="El metodo no se puede invocar,aun hay espaciosvacios en el arreglo";
        }else{
            for(int i=1;i<=recuerdos.length;i++){
                for(int j=0;j<=recuerdos.length-1-i;j++){
                    Recuerdo actual=recuerdos[j];
                    int diaActual=actual.getFecha().getAño();
                    Recuerdo deLado=recuerdos[j+1];
                    int diadeLado= deLado.getFecha().getAño();
                    if(diaActual>diadeLado){
                        Recuerdo aux=recuerdos[j];
                        recuerdos[j]=recuerdos[j+1];
                        recuerdos[j+1]=aux;
                    }
                }
            }
            resp="ordenado";
        }
        return resp;
    }
    
    public String buscar(){
        int li=0;
        int ls=recuerdos.length-1;
        int medio=(li+ls)/2;
        Recuerdo deMedio = recuerdos[medio];
        String res =deMedio.getDescripcion();
        return res;
    }
}
