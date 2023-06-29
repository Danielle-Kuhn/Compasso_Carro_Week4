package desafio4;



public class Carro extends Veiculo {

    protected boolean temArCondi;
    protected boolean temRadio;

    public Carro(boolean temArCondi, boolean temRadio, int ano, boolean motor, boolean volante, int qntPassageiro, int qntPorta, int qntRoda, boolean carga, double capaciCarga, Combustivel combustivel) {
        super(ano, motor, volante, qntPassageiro, qntPorta, qntRoda, carga, capaciCarga, combustivel);
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

   

    @Override
    public String toString() {
        return "Carro: " + 
                "\nTem ar condicionado:" + (temArCondi? "Tem": "Nao tem") + 
                "\nTem Radio: " + (temRadio? "Tem": "Nao tem") + 
                "\nAno:" + ano + 
                "\nQuantidade de passageiros: " +qntPassageiro +
                "\nQuantidade de portas: " +qntPorta;
    }
    
    
}
