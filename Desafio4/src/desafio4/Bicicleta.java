package desafio4;

public class Bicicleta extends Veiculo {

    private boolean eletrica;
    private boolean temBagageiro;

    public Bicicleta(boolean eletrica, boolean temBagageiro, boolean motor, boolean volante, int qntPassageiro, int qntPorta, int qntRoda, boolean carga, double capaciCarga, Combustivel combustivel) {
        super(motor, volante, qntPassageiro, qntPorta, qntRoda, carga, capaciCarga, combustivel);
        this.eletrica = eletrica;
        this.temBagageiro = temBagageiro;
    }

    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    public boolean isTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }

}
