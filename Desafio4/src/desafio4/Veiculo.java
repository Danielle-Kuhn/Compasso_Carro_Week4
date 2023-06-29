package desafio4;

import java.time.Year;

public class Veiculo {

    protected int ano;
    private boolean motor;
    private boolean volante;
    protected int qntPassageiro;
    protected int qntPorta;
    private int qntRoda;
    private boolean carga;
    protected double capaciCarga;
    protected Combustivel combustivel;

    public Veiculo(int ano, boolean motor, boolean volante, int qntPassageiro, int qntPorta, int qntRoda, boolean carga, double capaciCarga, Combustivel combustivel) {
        this.ano = ano;
        this.motor = motor;
        this.volante = volante;
        this.qntPassageiro = qntPassageiro;
        this.qntPorta = qntPorta;
        this.qntRoda = qntRoda;
        this.carga = carga;
        this.capaciCarga = capaciCarga;
        this.combustivel = combustivel;
    }

  

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isVolante() {
        return volante;
    }

    public void setVolante(boolean volante) {
        this.volante = volante;
    }

    public int getQntPassageiro() {
        return qntPassageiro;
    }

    public void setQntPassageiro(int qntPassageiro) {
        this.qntPassageiro = qntPassageiro;
    }

    public int getQntPorta() {
        return qntPorta;
    }

    public void setQntPorta(int qntPorta) {
        this.qntPorta = qntPorta;
    }

    public int getQntRoda() {
        return qntRoda;
    }

    public void setQntRoda(int qntRoda) {
        this.qntRoda = qntRoda;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public double getCapaciCarga() {
        return capaciCarga;
    }

    public void setCapaciCarga(double capaciCarga) {
        this.capaciCarga = capaciCarga;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    public boolean veiculoDoAno(){
        if(Year.now().getValue() == ano)
            return true;
        else
            return false;
    }
    
    public boolean pagaIPVA(){
        if(Year.now().getValue()-ano < 20)
            return true;
        else
            return false;
    }

}
