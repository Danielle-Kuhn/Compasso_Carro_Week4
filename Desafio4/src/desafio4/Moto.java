package desafio4;

public class Moto extends Veiculo {
    private boolean partEletrica;

    public Moto(boolean partEletrica, int ano, boolean motor, boolean volante, int qntPassageiro, int qntPorta, int qntRoda, boolean carga, double capaciCarga, Combustivel combustivel) {
        super(ano, motor, volante, qntPassageiro, qntPorta, qntRoda, carga, capaciCarga, combustivel);
        this.partEletrica = partEletrica;
    }

  
    public boolean isPartEletrica() {
        return partEletrica;
    }

    public void setPartEletrica(boolean partEletrica) {
        this.partEletrica = partEletrica;
    }

    @Override
    public String toString() {
        return "Moto:" + "\nPartida eletrica: " + partEletrica + 
                "\nAno:" + ano + 
                "\nQuantidade de passageiros: " + qntPassageiro ;
    }
    
    
    
    
}
