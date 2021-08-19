package programacao;

import java.math.RoundingMode;
import java.text.DecimalFormat;

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
    
    public static String formataValor(double valor, boolean cifrao){
        try{
            
            DecimalFormat format = new DecimalFormat("###,###,###,##0.00");
            format.setRoundingMode(RoundingMode.DOWN);
            if(cifrao){
                return "R$ "+ format.format(valor);
            } else {
                return format.format(valor);
            }
        } catch(Exception ex){
            System.out.println(ex.getMessage());
            return "";
        }
    }
    
}
