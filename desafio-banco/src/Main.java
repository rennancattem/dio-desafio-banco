public class Main {
    public static void main(String[] args) {
        Cliente Rennan = new Cliente();
        Rennan.setNome("Rennan");

        Conta cc = new ContaCorrente(Rennan);
        Conta poupanca = new ContaPoupanca(Rennan);

        cc.depositar(100);
        cc.transferir(70,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}