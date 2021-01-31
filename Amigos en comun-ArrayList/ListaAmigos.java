
import java.util.ArrayList;
public class ListaAmigos
{
    private ArrayList <Amigo> listaAmigos;
    private ArrayList <Amigo2> listaAmigos2;
    private String nombre;
    private String nombre2;
    public ListaAmigos(String nombre, String nombre2){
        this.nombre  = nombre;
        listaAmigos  = new ArrayList();
        this.nombre2 = nombre2;
        listaAmigos2 = new ArrayList();
    }

    public void agregar1 (Amigo otro){
        listaAmigos.add(otro);
    }
    
    public void mostarLista1 (){
        System.out.println("Amigos de "+nombre);
        for(Amigo ami : listaAmigos){
            System.out.println(ami.getNombre()+"\t"+ami.getSexo()+"\t"+ami.getEdad());
        }
        System.out.println();
    }
    
    public void agregar2 ( Amigo2 otro){ 
        listaAmigos2.add(otro);
    }

    public void mostarLista2 (){
        System.out.println("Amigos de "+nombre2);
        for(Amigo2 amig : listaAmigos2){
            System.out.println(amig.getNombre()+"\t"+amig.getSexo()+"\t"+amig.getEdad());
        }
        System.out.println();
    }  
    
    public void mismoAmigo(){
        System.out.println("Lista de amigos en comun: ");
        for(Amigo ami: listaAmigos){
            for(Amigo2 amig: listaAmigos2){
               if((ami.getNombre().equals(amig.getNombre())) && (ami.getSexo()==(amig.getSexo())) && (ami.getEdad()==(amig.getEdad()))){
                   System.out.println(amig.getNombre()+"\t"+amig.getSexo()+"\t"+amig.getEdad());
               }
            }
        }
        System.out.println();
    }

}
