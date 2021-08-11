
package programacao;

/**
 *
 * @author davi.sehn
 */
public class TerminalBanco {
    
    public static void main(String[] args) {
        
        Conta conta1 = new Conta(1, 123, "davi", 500);
        Conta conta2 = new Conta(2, 153, "i", 900);
        
        /*System.out.println(conta1.toString());
        sacar(conta1, 50);
        System.out.println(conta1.toString());
        depositar(conta1, 100);
        System.out.println(conta1.toString());*/
        
        conta1.transfer(conta2, 100);
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());        
    }
    
}
