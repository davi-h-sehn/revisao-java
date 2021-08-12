
package programacao;

/**
 *
 * @author davi.sehn
 */
public class Conta {
    
    private int conta;
    private int agencia;
    private String nome;
    private double saldo;

    public Conta(int conta, int agencia, String nome, double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return "Conta: " + this.conta + " - Saldo: " + Tools.formataValor(this.saldo);
    }
    
    public void sacar(double saque){
        this.saldo -= saque;
    }
    
    public void depositar(double deposito){
        this.saldo += deposito;
    }
    
    //saca da primeira conta e deposita na segunda
    public void transfer(Conta contaTrans, double valor){
        //this.saldo -= valor;
        //contaTrans.setSaldo(contaTrans.getSaldo() + valor);
        sacar(valor);
        contaTrans.depositar(valor);
    }
    
}
