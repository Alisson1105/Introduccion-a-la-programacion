
import java.util.ArrayList;
public class ListaDeEstudiantes{
    private ArrayList<Estudiante> listaEstudiantes;

    public ListaDeEstudiantes(){
        listaEstudiantes = new ArrayList();
    }

    public void agregar (Estudiante otro){
        listaEstudiantes.add(otro);
    }

    public void Aprobados (){
        int nota1;
        int nota2;
        int promedio;
        System.out.println("Lista de aprobados: ");
        for(Estudiante estu: listaEstudiantes){
            nota1=estu.getNota1erParcial();
            nota2=estu.getNota2doParcial();
            promedio= (nota1+nota2)/2;
            if(promedio>=51){
                System.out.println(estu.getNombre()+" "+estu.getApellido()+"/t Promedio: "+promedio);
            }
        }
    }

    public void Reprobados (){
        int nota1;
        int nota2;
        int promedio;
        System.out.println("Lista de reprobados: ");
        for(Estudiante estu: listaEstudiantes){
            nota1=estu.getNota1erParcial();
            nota2=estu.getNota2doParcial();
            promedio= (nota1+nota2)/2;
            if(promedio<51){
                System.out.println(estu.getNombre()+" "+estu.getApellido()+"/t Promedio: "+promedio);
            }
        }
    }

    public void habilitados2dainstancia (){
        String resp="";
        int nota1;
        int nota2;
        int promedio;
        System.out.println("Lista de habilitados para 2da instancia");
        for(Estudiante estu: listaEstudiantes){
            nota1=estu.getNota1erParcial();
            nota2=estu.getNota2doParcial();
            promedio= (nota1+nota2)/2;
            if(promedio>=26){
                System.out.println(estu.getNombre()+" "+estu.getApellido());
            }
        }
    }
}
