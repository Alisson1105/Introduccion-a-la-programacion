
public class Carta
{
    private int numero;
    private String simbolo;

    public Carta(int numero, String simbolo){
        this.numero=numero;
        this.simbolo=simbolo;
    }
    
    public boolean equals (Carta otro){
        return simbolo.equals(otro.getSimbolo()) && numero==otro.getNumero();
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getSimbolo(){
        return simbolo;
    }
}
