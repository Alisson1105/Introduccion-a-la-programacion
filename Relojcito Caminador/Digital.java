
public class Digital extends Reloj
{
    public Digital (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public void mostrarHora () {
        System.out.println("Hora digital");
        while(hora>=0){
            try{
                Thread.sleep(1000);
            }catch( InterruptedException e){}
          
            segundo++;
            if (segundo== 60){
                segundo = 0;
                minuto++;
            } 
            
            if(minuto==60){
                minuto=0;
                hora++;
            }
            
            if (hora==24){
                hora=0;
            }
            System.out.println(hora+":"+minuto+":"+segundo);
           
        }
    }
}
