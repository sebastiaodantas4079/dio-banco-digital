
public abstract class Conta implements iConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected double renda;
	protected double limiteDisponivel;



	public double getLimiteDisponivel() {
		return limiteDisponivel;
	}


	public void setLimiteDisponivel(double limiteDisponivel) {
		this.limiteDisponivel = limiteDisponivel;
	}


	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, iConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getRenda() {
		return renda;
	}
	
	
	public void setRenda(double renda) {
		this.renda = renda;
	}

	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s",this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Limite cheque especial disponível: %.2f", limiteDisponivel = renda * 0.30));
		System.out.println(String.format("Saldo mais Limite do Cheque Especial: %.2f", this.saldo + this.limiteDisponivel));
		
	}



}
