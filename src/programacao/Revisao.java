package programacao;

/**
 *
 * @author davi.sehn
 */
public class Revisao {

    public static void main(String[] args) {

        int tabuada = 10;
        
        for(int i = 0; i <= 10; i++){
            int ct = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + ct);
        }
        
        int contador = 0;
        while(contador > 100){
            System.out.println("while contador é menor que 100 " + contador);
            contador++;
        } System.out.println("fim do while");
        
        do{
            System.out.println("do while contador é menor que 100 " + contador);
            contador+=3;
        }while(contador > 100); System.out.println("fim do do while");
        
    }
    
    private static void soma(double n1, double n2){
        double soma = n1 + n2;
        System.out.println("A soma de " + n1 + " e " + n2 + " é de " + soma);
    }
    
}
