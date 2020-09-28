

public class Turril
{
    private int capacidad;//litros
    private int cantAgua;// litros
    
    public Turril()
    {
        capacidad =210;
        cantAgua=0; // inicialmente esta vacio 
    }
    public void cargarAgua(){//metodo
        cantAgua=capacidad; 
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
