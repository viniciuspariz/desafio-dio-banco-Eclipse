
public abstract class Conta implements interfaceConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {

		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;

	}

	@Override
	public void sacar(double valor) {
		
		// Implementar verificador de saldo antes de realizar o saque.
		
		boolean saldoSuficiente = this.saldo-=valor>=0;

	//	if (saldoSuficiente)
			this.saldo -= valor;
	//	else
	//		System.out.println(String.format("Saldo insuficiente para saque. Seu saldo é de R$ %.2f", this.saldo);

	}

	@Override
	public void depositar(double valor) {

		this.saldo += valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		// Implementar verificador de saldo antes de realizar o saque.
		// Talvez criar uma nova rotina que retorne o valor do saque.
		
		this.sacar(valor);
		contaDestino.depositar(valor);

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInformacoesConta() {

		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número da conta : %d", this.numeroConta));
		System.out.println(String.format("saldo: %2f", this.saldo));

	}

}
