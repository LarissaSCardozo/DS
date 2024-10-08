
public abstract class Conta implements Operacoes {
	
	private double saldo = 0;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void verificarSaldo() {
		System.out.println("Seu saldo é de R$ "+saldo);
	}
 
}