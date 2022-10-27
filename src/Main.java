
public class Main {

	public static void main(String[] args) {
		
		
		Cliente Ana = new Cliente();
		Ana.setNome("Ana");
		
		Cliente Maria = new Cliente();
		Maria.setNome("Maria");
		
		Conta cc = new ContaCorrente(Ana);
		Conta poupanca = new ContaPoupanca(Ana);
		
		Conta cCorrente = new ContaCorrente(Maria);
		Conta cPoupanca = new ContaPoupanca(Maria);


		cc.depositar(100);
		cc.transferir(100, poupanca);
		 

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cCorrente.depositar(1000);
		cCorrente.transferir(150, cc);
		cPoupanca.depositar(50);
		cPoupanca.sacar(10);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cCorrente.imprimirExtrato();
		cPoupanca.imprimirExtrato();
	}

}
