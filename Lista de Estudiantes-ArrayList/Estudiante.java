
public class Estudiante
{
    private String nombre;
    private String apellido;
    private int nota1erParcial;
    private int nota2doParcial;

    public Estudiante (String nombre, String apellido, int nota1erParcial, int nota2doParcial){
        this.nombre   = nombre;
        this.apellido = apellido;
        this.nota1erParcial = nota1erParcial;
        this.nota2doParcial = nota2doParcial;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getNota1erParcial(){
        return nota1erParcial;
    }
    
    public int getNota2doParcial(){
        return nota2doParcial;
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+nombre+" "+apellido);
        System.out.println("Nota del 1er parcial: "+nota1erParcial+"\n"+"Nota del 2do parcial: "+nota2doParcial);
        System.out.println();
    }
}
