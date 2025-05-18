import banco.Cliente;
import banco.ContaCorrente;
import banco.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente();
        cliente1.setNome("Joel Santos");
        cliente1.setNumeroBilhete("000543446");

        Cliente cliente2=new Cliente();
        cliente1.setNome("Abel Santos");
        cliente1.setNumeroBilhete("51200044");

        ContaCorrente contaCorrente=new ContaCorrente(cliente1);
        ContaCorrente contaCorrente2=new ContaCorrente(cliente2);

ContaPoupanca contaPoupanca=new ContaPoupanca(cliente1);

contaPoupanca.depositar(50000);
contaCorrente.depositar(20000);
contaCorrente.transferir(contaPoupanca,15000);

contaCorrente2.depositar(30000);

contaCorrente.getExtrato();
contaCorrente2.getExtrato();
contaPoupanca.getExtrato();
    }
}