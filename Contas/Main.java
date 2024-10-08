
public class Main {
	 public static void main(String[] args) {
    	
        ContaCorrente contaCorrente = new ContaCorrente(1000, 500);
        System.out.println("Testando Conta Corrente");
        
        contaCorrente.verificarSaldo();
        
        contaCorrente.depositarValor(200);
        contaCorrente.verificarSaldo();
        
        contaCorrente.sacarValor(500);
        contaCorrente.verificarSaldo();
        
        // tentando sacar além do saldo + limite especial (saque de 1500)
        contaCorrente.sacarValor(1500); // sacou só 1200
        contaCorrente.verificarSaldo(); 
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(1500);
        System.out.println("\nTestando Conta Poupança");

        contaPoupanca.verificarSaldo();
        
        
        contaPoupanca.depositarValor(300);
        contaPoupanca.verificarSaldo(); 
        
        contaPoupanca.sacarValor(700);
        contaPoupanca.verificarSaldo(); 
        
        // Aplicando uma taxa de rendimento de 2% (0.02)
        contaPoupanca.aplicarTaxa(0.02); // 1100 + 2% = 1122
        contaPoupanca.verificarSaldo();
    }
}