
public class ContaPoupanca extends Conta{
 
	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	public void depositarValor(double valor) {
		System.out.println("Você depositou R$ "+ valor);
		valor += this.getSaldo();
		this.setSaldo(valor);
	}
	
	public void sacarValor(double valor) {
		double valorAtual = this.getSaldo()-valor;
		this.setSaldo(valorAtual);
		System.out.println("Você sacou R$ "+valor+", seu saldo atual é: "+valorAtual);
	}
	
	public void verificarSaldo() {
		System.out.println("Seu saldo é: "+this.getSaldo());
	}
	
	public void aplicarTaxa(double taxa) {
		double saldoFinal = this.getSaldo() + (this.getSaldo()*taxa);
		this.setSaldo(saldoFinal);
		System.out.println("Você aplicou uma taxa de "+(taxa*100)+"% no seu saldo, então seu saldo final é: "+ this.getSaldo());
	}
}