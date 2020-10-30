
public class Casillero
{
    private String nombre;
    public Casillero(String nombre){
        this.nombre=nombre;
    }

    public boolean equals (Casillero otro){
        return nombre.equals(otro.getNombre());
    }

    public String getNombre(){
        return nombre;
    }
}
