package desafio4;

public class Charrete extends Veiculo {

    public Charrete(int ano, boolean motor, boolean volante, int qntPassageiro, int qntPorta, int qntRoda, boolean carga, double capaciCarga, Combustivel combustivel) {
        super(ano, motor, volante, qntPassageiro, qntPorta, qntRoda, carga, capaciCarga, combustivel);
    }

    @Override
    public String toString() {
        return "Charrete:" + 
                "\nQuantidade de passageiros: "+ qntPassageiro+
                "\nPeso suportado: " +capaciCarga +"KG";
    }
    

}
