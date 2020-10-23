
public class Tablero
{
    private Carta [][]cartas;
    private int puntaje=0;
    private int intentos=6;
    public Tablero (int n){
        cartas=new Carta[n][n];
    }

    public boolean almacenar (Carta nuevo){
        boolean res=false;
        for(int i=0;i<cartas.length&&res==false;i++){
            for(int j=0;j<cartas.length&&res==false;j++){
                if(cartas[i][j] == null){
                    cartas[i][j]= nuevo;
                    res=true;
                }
            }
        }
        return res;
    }

    public void adivinaLaCarta(int fila,int columna,Carta indica){
        boolean bandera=false;
        while( bandera==false&&intentos>0 && intentos<=6){
            for(int i=0;i<cartas.length&&bandera==false;i++){
                for(int j=0;i<cartas.length&&bandera==false;i++){
                    Carta actual= cartas[fila][columna];
                    if(actual.equals(indica)){
                        puntaje=puntaje+1;
                        bandera=true;
                    }else{
                        puntaje=puntaje-1;
                        bandera=true;
                    }
                }
            }
            intentos--;
        }
    }

    public String puntajeFinal(){ 
        String resp="";
        resp="Tu puntaje final es "+puntaje;
        return resp;
    }
}
