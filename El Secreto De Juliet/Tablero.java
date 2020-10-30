
public class Tablero
{
    private Casillero [][] casilleros;
    private int cont=0;
    private int dineroActual=0;
    public Tablero(int n,int m){
        casilleros=new Casillero[n][m];
    }

    public boolean almacenar (Casillero nuevo){
        boolean res=false;
        for(int i=0;i<casilleros.length&&res==false;i++){
            for(int j=0;j<casilleros.length&&res==false;j++){
                if(casilleros[i][j] == null){
                    casilleros[i][j]= nuevo;
                    res=true;
                }
            }
        }
        return res;
    }

    public String contenido(int fila,int columna){
        String resp="";
        boolean res=false;
        //String nom1= "tesoro";
        //String nom2="tiburon";
        for(int i=0;i<casilleros.length&&res==false;i++){
            for(int j=0;j<casilleros.length&&res==false;j++){
                Casillero actual=casilleros[fila][columna];
                if(actual.equals("tesoro")){
                    res=true;
                    resp=actual.getNombre();
                    dineroActual=dineroActual+50;
                }else if (actual.equals("tiburon")){
                    res=true;
                    resp=actual.getNombre();
                    cont++;
                }
            }
        }
        return resp;
    }

    public String dimeroAcumulado(){
        String resp="";
        if(cont==3){
            dineroActual=0;
            resp="Tu dinero acumulado es"+" "+dineroActual;
        }else{
            resp="Tu dinero acumulado es"+" "+dineroActual;
        }
        return resp;
    }

}



