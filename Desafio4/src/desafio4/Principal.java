package desafio4;

public class Principal {

    public static void main(String[] args) {
        Combustivel combustivel = new Combustivel(true, false, false, false, false, false);
        Veiculo veiculo = new Veiculo(true, true, 5, 4, 4, false, 0, combustivel);
        System.out.println(veiculo.getQntPassageiro()); // Saída: 5

    }

}
