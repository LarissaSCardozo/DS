
public class Carro extends Veiculo {

 public Carro(String Modelo, int valorTabela, String Cor, String Combustivel) {
     super(Modelo, valorTabela, Cor, Combustivel);
 }

 @Override
 public double calcularipva() {
     return getvalorTabela()*0.04;
 }
}
