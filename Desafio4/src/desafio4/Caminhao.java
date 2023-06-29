package desafio4;

public class Caminhao extends Veiculo {

    private int qntEixo;

    public Caminhao(int qntEixo, int ano, boolean motor, boolean volante, int qntPassageiro, int qntPorta, int qntRoda, boolean carga, double capaciCarga, Combustivel combustivel) {
        super(ano, motor, volante, qntPassageiro, qntPorta, qntRoda, carga, capaciCarga, combustivel);
        this.qntEixo = qntEixo;
    }


    public int getQntEixo() {
        return qntEixo;
    }

    public void setQntEixo(int qntEixo) {
        this.qntEixo = qntEixo;
    }

    @Override
    public String toString() {
        return "Caminhao:" + "\nQuantidade de eixos: " + qntEixo  + 
                "\nAno:" + ano + 
                "\nQuantidade de passageiros: " +qntPassageiro +
                "\nQuantidade de portas: " +qntPorta +
                "\nPeso suportado: " +capaciCarga +"KG";
    }

    
}
