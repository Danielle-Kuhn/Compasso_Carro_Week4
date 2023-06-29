package desafio4;

public class Carro extends Veiculo {

    private boolean temArCondi;
    private boolean temRadio;

    public Carro(boolean temArCondi, boolean temRadio, boolean motor, boolean volante, int qntPassageiro, int qntPorta, int qntRoda, boolean carga, double capaciCarga, Combustivel combustivel) {
        super(motor, volante, qntPassageiro, qntPorta, qntRoda, carga, capaciCarga, combustivel);
        this.temArCondi = temArCondi;
        this.temRadio = temRadio;
    }

    public boolean isTemArCondi() {
        return temArCondi;
    }

    public void setTemArCondi(boolean temArCondi) {
        this.temArCondi = temArCondi;
    }

    public boolean isTemRadio() {
        return temRadio;
    }

    public void setTemRadio(boolean temRadio) {
        this.temRadio = temRadio;
    }

}
