
public abstract class Veiculo {
	 
	 private String Modelo;
	 private int valorTabela;
	 private String Cor;
	 private String Combustivel;
	 private Double Ipva;
	 
	 public Veiculo(String Modelo, int valorTabela, String Cor, String Combustivel) {
	      this.Modelo = Modelo;
	      this.valorTabela = valorTabela;
	      this.Cor = Cor;
	      this.Combustivel = Combustivel;
	      this.Ipva = calcularipva();
	    }
	 
	 
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}
	
	public int getvalorTabela() {
		return valorTabela;
	}
	public void setvalorTabela(int valorTabela) {
		this.valorTabela = valorTabela;
	}
	
	public String getCor() {
		return Cor;
	}
	public void setCor(String Cor) {
		this.Cor = Cor;
	}
	
	public String getCombustivel() {
		return Combustivel;
	}
	public void setCombustivel(String Combustivel) {
		this.Combustivel = Combustivel;
	}
	
	public Double getIpva() {
		return Ipva;
	}
	public void setIpva(Double Ipva) {
		this.Ipva = Ipva;
	}
	  
	public abstract double calcularipva();
	
	public void imprimirFicha(){
	        System.out.println("Modelo: " + Modelo);
	        System.out.println("Valor Tabela: R$" + valorTabela);
	        System.out.println("Cor: " + Cor);
	        System.out.println("Combustível: " + Combustivel);
	        System.out.println("IPVA: R$ " + Ipva);
	        System.out.println("------------------------");
	    }
}