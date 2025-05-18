package banco;

public abstract class Conta {
    protected static int AGENCIA_PADRAO=1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public int getAgencia(){
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = numero++;
        this.cliente=cliente;
    }
//Metodo para fazer deposito
    public void depositar(double quantia){
        if (quantia<=0) {
            System.out.println("A quantia a depositar nao pode ser menor ou igual a zero");
        }
        saldo+=quantia;
    }
//Metodo para fazer saque
    public void sacar(double quantia){
        if (quantia >saldo) {
            System.out.println("Saldo insuficiente para o valor pretendido");
        }
        saldo-=quantia;
    }
    //Metodo para transferir dinheiro de uma conta para outra
    public void transferir(Conta contaDestino, double quantia){
        if (quantia > saldo) {
            System.out.println("Nao tem valor suficiente para a transferencia desejada");
        }
        contaDestino.depositar(quantia);
        this.sacar(quantia);
    }

 //Metodo para apresentar o extrato de conta
    public void getExtrato(){
        System.out.println("\n\nInformacoes da conta \n\n");
        System.out.println("Saldo: "+saldo);
        System.out.println("Titular: "+cliente.getNome());
        System.out.println("Agencia: "+agencia);
        System.out.println("Numero: "+numero);
    }
}
