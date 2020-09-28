
public class Gato
{ 
    private int edad;
    private double peso;
    private String nombre;
    public Gato (int edad,double peso,String nombre)
    {
        this.edad=edad;
        this.peso=peso;
        this.nombre=nombre;
    }
    public int getEdad ()
    {
        return edad;
    }
    public void setEdad(int cambioedad)
    { 
        edad=cambioedad;
    }
    public double getPeso ()
    {
        return peso;
    }
    public void setPeso( double cambiopeso)
    { 
        peso=cambiopeso;
    }
    public String getNombre ()
    {
        return nombre;
    }
    
}
