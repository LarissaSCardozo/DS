
public class Main {
	
	    public static void main(String[] args) {
	       
	        Carro carro1 = new Carro("Nivus", 119000, "Cinza", "Gasolina");
	        Carro carro2 = new Carro("Golf", 160000, "Preto", "Gasolina");

	      
	        Moto moto1 = new Moto("Forza 350", 50000, "Vermelha", "Alcool");
	        Moto moto2 = new Moto("Triumph Rocket", 74000, "Preta", "Gasolina");

	      
	        carro1.imprimirFicha();
	        carro2.imprimirFicha();
	        moto1.imprimirFicha();
	        moto2.imprimirFicha();
	    }
	}