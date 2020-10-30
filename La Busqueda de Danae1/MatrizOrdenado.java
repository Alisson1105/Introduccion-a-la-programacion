
public class MatrizOrdenado
{
    public void mostrar(int [][]matriz){
        for(int fila =0;fila<matriz.length;fila++){
            for(int columna=0;columna<matriz.length;columna++){
                System.out.print(matriz[fila][columna]+" ");
            }
            System.out.println();
        }
    }

    public void ordenar(int [][] matriz){
        int a=matriz.length-1;
        int b=0;
        int aux=0;
        int t=0;

        for(int j=0;j<matriz.length;j++){
            for(int i =a;i>=b;i--){
                aux=matriz[a][i];
            }
            for(int i=a-1;i>=b;i--){
                aux=matriz[i][b];
            }
            for(int i =b+1;i<=a;i++){
                aux=matriz[b][i];
            }
            for(int i=b+1;i<a;i++){
                aux=matriz[i][a];
            }
            b++;
            a--;
        }
        
        for(int i=0; i <matriz.length; i++){
            for(int j=0;j< matriz.length; j++){
                for(int k=0; k < matriz.length; k++){
                    for(int l=0; l<matriz.length; l++){
                        if(matriz[i][j] > matriz[k][l]){
                            t= matriz[i][j];
                            matriz[i][j] = matriz[k][l];
                            matriz[k][l] = t;
                        }
                    }
                }
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+"  "); 
            }
            System.out.println();
        }
    }

}