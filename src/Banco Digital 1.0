
public class Main {

	public static void main(String[] args) {
		
		Cliente junior = new Cliente();
		junior.setNome("Junior");
		
		
		
		Conta cc = new ContaCorrente(junior);
		cc.setRenda(5000);
		cc.depositar(1000);
		
		Conta poupanca = new ContaPoupanca(junior);
		poupanca.depositar(1000.0);
		poupanca.setRenda(8000);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
		
	}

}
