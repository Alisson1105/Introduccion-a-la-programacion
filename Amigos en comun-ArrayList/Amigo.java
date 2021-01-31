
public class Amigo
{
    private String nombre;
    private char sexo;
    private int edad;
    public Amigo(String nombre, char sexo, int edad){
        this.nombre = nombre;
        this.sexo   = sexo;
        this.edad   = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public int getEdad(){
        return edad;
    }
}
