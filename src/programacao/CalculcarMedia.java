package programacao;

/**
 *
 * @author davi.sehn
 */
public class CalculcarMedia {
    
    public static void main(String[] args) {
        int[] valores = new int[3];
        valores[0] = 5;
        valores[1] = 7;
        valores[2] = 2;
        
        double result = media(valores);
        double mediaround = result;
        System.out.println("media = " + result);
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
