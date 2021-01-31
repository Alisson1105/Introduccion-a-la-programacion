
public class Analogico extends Reloj
{
    private String siglas;
    public Analogico(int hora, int minuto, int segundo)
    {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public  void mostrarHora(){
        System.out.println("Hora Analogica");

        if(hora<12){
            siglas = "am";
        } else if(hora>=12){
            siglas = "pm";
        }

        while(hora>=0){
            try{
                Thread.sleep(1000);
            }catch( InterruptedException e){}

            segundo++;

            if (segundo == 60){
                segundo = 0;
                minuto++;
            } 

            if(minuto==60){
                minuto=0;
                hora++;
            }

            if(hora>12){
                hora = hora-12;
            }
            System.out.println(hora+":"+minuto+":"+segundo+" "+siglas);
        }
    }
}
