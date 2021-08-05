package programacao;

/**
 *
 * @author davi.sehn
 */
public class CalculcarMedia {
    
    public static void main(String[] args) {
        int[] valores = new int[3];
        valores[0] = 15;
        valores[1] = 17;
        valores[2] = 12;
        
        double result = media(valores);
        double mediaround = Arredondamento.arredondarValor(result);
        System.out.println("media = " + mediaround);
    }
    
    private static double media(int[] nums){
        double resmedia = 0;
        for(int i = 0; i < nums.length; i++){
            resmedia += nums[i];
        }
        resmedia = resmedia / nums.length;
        
        return resmedia;
    }
}
