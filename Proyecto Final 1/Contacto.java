
import java.util.ArrayList;
public class Contacto
{
    private String nombre;
    private int numeroCelular;
    private String mensaje;
    private String enviar;
    private ArrayList <Contacto>contactos;
    private ArrayList<String>bandejaRecibidos;
    private ArrayList<String>bandejaEnviados;
    public Contacto(String nombre, int numeroCelular){
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        bandejaRecibidos = new ArrayList();
        bandejaEnviados = new ArrayList();
        contactos = new ArrayList();
    }

    public String getNombre(){
        return nombre; 
    }

    public int getNumeroCelular(){
        return numeroCelular;
    }

    public void agregarContactoNuevo (Contacto nuevo){
        contactos.add(nuevo);
    }

    public void buscarContactoPorCelular (int celular){
        for (Contacto per: contactos){
            if(per.getNumeroCelular() == celular){
                System.out.println("Nombre:"+per.getNombre()+"\t"+"Celular:"+per.getNumeroCelular());
            }
        }
    }

    public void buscarContactoPorNombre (String nombre){
        for (Contacto per: contactos){
            if(per.getNombre().equals(nombre)){
                System.out.println("Nombre:"+per.getNombre()+"\t"+"Celular:"+per.getNumeroCelular());
            }
        }
    }

    public void ordenarAlfabeticamente(){
        for(int i=0; i < contactos.size()-1;i++){
            for(int j=0; j<contactos.size()-1-i;j++){
                if(contactos.get(j).getNombre().compareTo(contactos.get(j+1).getNombre())>0){
                    Contacto aux = contactos.get(j+1);
                    contactos.set(j+1,contactos.get(j));
                    contactos.set(j,aux);
                }
            }
        }

        for(int i=0;i<contactos.size();i++){
            System.out.println(contactos.get(i).getNombre());
        }

    }

    public void recibirMensaje(String msj){
        bandejaRecibidos.add(msj);
    }

    public void enviarMensaje(int numCelular, String msj){
        mensaje ="De:"+numeroCelular+"\n"+msj;
        enviar = "Para"+numCelular+"\n"+msj;
        for(int i=0; i<contactos.size();i++){
            Contacto actual = contactos.get(i);
            int numActual = actual.getNumeroCelular();
            if(numCelular == numActual){
                actual.recibirMensaje(mensaje);
                bandejaEnviados.add(enviar);
            }
        }
    }

    public void revisarBandejaDeMensajesRecibidos(){
        for(int i=0;i<bandejaRecibidos.size();i++){  
            System.out.println(bandejaRecibidos.get(i));
            System.out.println("Leído");
        }
    }

    public void revisarBandejaDeMensajesEnviados(){
        for(int i=0;i<bandejaEnviados.size();i++){
            System.out.println(bandejaEnviados.get(i));
        }
    }
    
}