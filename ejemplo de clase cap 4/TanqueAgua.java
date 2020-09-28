

public class TanqueAgua
{
   private int capacidad;
   private int cantAgua;
   
  public TanqueAgua(){
    capacidad=950;
    cantAgua=0;
  }
  public int cantdeturriles(){
    int resp =capacidad/210;
    return resp;
  }
  public int getCapacidad(){
    return capacidad;
  }
  public int getCantAgua (){
     return cantAgua;
  }
  public void setCapacidad(int nCapacidad){
        capacidad=nCapacidad;
  }
  public void setCantAgua(int nCantAgua){
        cantAgua=nCantAgua;
  }
}
