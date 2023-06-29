package desafio4;

public class Bicicleta extends Veiculo {

    private boolean eletrica;
    private boolean temBagageiro;

    public Bicicleta(boolean eletrica, boolean temBagageiro, int ano, boolean motor, boolean volante, int qntPassageiro, int qntPorta, int qntRoda, boolean carga, double capaciCarga, Combustivel combustivel) {
        super(ano, motor, volante, qntPassageiro, qntPorta, qntRoda, carga, capaciCarga, combustivel);
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

    @Override
    public String toString() {
        return "Bicicleta: " + 
                "\neletrica: " + (eletrica? "Sim": "Nao") + 
                "\ntem bagageiro: " + (temBagageiro? "Possui":"Nao Possui") +
                "\nQuantidade de passageiros: "+ qntPassageiro+
                "\nPeso suportado: " +capaciCarga +"KG";
    }

    
}
