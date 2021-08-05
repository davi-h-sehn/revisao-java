package programacao;

/**
 *
 * @author davi.sehn
 */
public class ParImpar {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[5];
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 1;
        vetor[3] = 2;
        vetor[4] = 1;

        funcao(vetor);
    }
    
    private static void funcao(int[] vetor){
        int par = 0;
        int impar = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i]%2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("impar = " + impar);
        System.out.println("par = " + par);
    }
    
}
