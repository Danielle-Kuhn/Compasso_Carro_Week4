package desafio4;

public class Caminhao extends Veiculo {

    private int qntEixo;

    public Caminhao(int qntEixo, boolean motor, boolean volante, int qntPassageiro, int qntPorta, int qntRoda, boolean carga, double capaciCarga, Combustivel combustivel) {
        super(motor, volante, qntPassageiro, qntPorta, qntRoda, carga, capaciCarga, combustivel);
        this.qntEixo = qntEixo;
    }

    public int getQntEixo() {
        return qntEixo;
    }

    public void setQntEixo(int qntEixo) {
        this.qntEixo = qntEixo;
    }

}
