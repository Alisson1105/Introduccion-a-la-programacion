

public class Sueño
{
    private String nombre;
    private String descripcion;
    public Sueño (String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    
    public boolean equals (Sueño otro){
        return nombre.equals(otro.getNombre());
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
}
