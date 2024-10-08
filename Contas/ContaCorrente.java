
public class ContaCorrente extends Conta{
	
	private double limiteEspecial;
	
	public ContaCorrente(double saldo, double limiteEspecial) {
		super(saldo);
		this.limiteEspecial = limiteEspecial;
	}
	
	public void depositarValor(double valor) {
		System.out.println("Você depositou R$ "+valor);
		valor += this.getSaldo();
		this.setSaldo(valor);
	}
	
	public void sacarValor(double valor) {
	    if (this.getSaldo() -valor>= -limiteEspecial) {
	        double valorAtual = this.getSaldo() - valor;
	        this.setSaldo(valorAtual);
	        System.out.println("Você sacou R$ " + valor + " e seu saldo atual é: " + valorAtual);
	    } else {
	        double valorPermitido = this.getSaldo() + limiteEspecial; // quanto ainda pode ser sacado
	        this.setSaldo(-limiteEspecial); // ajusta o saldo ao limite especial
	        System.out.println("Você tentou sacar R$ "+valor+", mas só pôde sacar R$ "+valorPermitido+" devido ao limite. Seu saldo agora é: " + this.getSaldo());
	    }
	}
 
	public void verificarSaldo() {
		System.out.println("Seu saldo é: "+this.getSaldo());
	}
 
}