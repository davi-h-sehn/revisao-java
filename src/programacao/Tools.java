package programacao;

/**
 *
 * @author davi.sehn
 */
public class Tools {
    
    public void verificaparimpar(int nmr){        
            if(nmr%2 == 0){
                System.out.println("é par");
            } else {
                System.out.println("é impar");
            }
    }
    
    public static String formataValor(double valor){
        return "R$ " + valor;
    }
    
}
