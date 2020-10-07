
public class TabernaDeLosSueñosCaidos
{
    private Sueño sueños[];
    public TabernaDeLosSueñosCaidos(int n){
        sueños = new Sueño[n];
    }

    public String almacenar (Sueño nuevo){
        String resp="";
        boolean res=false;
        for(int i=0;i<sueños.length&&res==false;i++){
            if(sueños[i] == null){
                sueños[i]=nuevo;
                res=true;
            }
            if (res==true){
                resp="El sueño se almaceno exitosamente";
            }else {
                resp="No se ha sido posible almacenarlo,la memoria esta llena";
            }
        }
        return resp;
    }

    public String eliminar (int posicion){
        String resp="";
        boolean res=false;
        for(int i=0; i<sueños.length;i++){
            int actual=i;
            if(actual == posicion){
                res=true;
                sueños[i]= null;
            }else if (sueños==null&&actual==posicion){
                resp="El espacio indicado esta vacio";
            }
        }
        if(res==false){
         resp="La posicion indicada no existe";
        }
        return resp;
    }
    
    public String buscar(String nombre){
        String resp="";
        boolean res=false;
        for (int i=0;i<sueños.length&&res==false;i++){
            Sueño actual=sueños[i];
            if(actual.equals(nombre)){
                res=true;
            }
            if(res==true){
                resp="El sueño existe y se encuentra en la posicion"+actual+"";
            }else{
                resp="El sueño no existe";
            }
        }
        return resp;
    }
    
    public Sueño sueñosAlmacenados(Sueño lista){
        Sueño resp=null;
        for(int i=0;i<sueños.length;i++){
            Sueño actual= sueños[i];
            resp=actual;
            return resp;
        }
        return resp;
    }

}