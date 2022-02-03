
public class Main {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		cliente.setNome("Mauricio de Souza");

		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(60, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
