
public class Bombadeagua
{
    
    private int cantAguatrans;
    private Turril turrilconectado;
    private TanqueAgua tanqueConectado;
    public Bombadeagua()
    {
       cantAguatrans=7;
    }
 
    public void bombear()
    {
      int cantAguaTurril=turrilconectado.getCantAgua();
      cantAguaTurril=cantAguaTurril-cantAguatrans;
      turrilconectado.setCantAgua(cantAguaTurril);
      
      int cantAguaTanque=tanqueConectado.getCantAgua();
      cantAguaTanque=cantAguaTanque+cantAguatrans;
      tanqueConectado.setCantAgua(cantAguaTanque);
    }
    public int cantVecesBombear(){
     int resp= 210/cantAguatrans;
     return resp;
    }
    public void conectarTurril(Turril turril){
     turrilconectado=turril;
    }
    public void conectarTanque(TanqueAgua tanque){
        tanqueConectado=tanque;
    }
}
