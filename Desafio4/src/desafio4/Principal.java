package desafio4;

public class Principal {

    public static void main(String[] args) {
        Combustivel gasolina = new Combustivel(true, false, false, false, false, false);
        Combustivel alcool = new Combustivel(false, true, false, false, false, false);
        Combustivel diesel = new Combustivel(false, false, true, false, false, false);
        Combustivel eletricidade = new Combustivel(false, false, false, true, false, false);
        Combustivel humano = new Combustivel(false, false, false, false, true, false);
        Combustivel animal = new Combustivel(false, false, false, false, true, true);
        
        Carro nvCar= new Carro(false, true, 2010, true, true, 4, 4,4, false, 0,gasolina );

        System.out.println("***Informacoes do carro***");
        System.out.println( nvCar.toString() );
        System.out.println("Carro do ano: " + nvCar.veiculoDoAno());
        System.out.println("Ainda paga IPVA: " + nvCar.pagaIPVA());
        
        Moto nvMoto = new Moto(false,2010,true,true,1,2,3,false,0,gasolina);
        System.out.println("***Informacoes da moto***");
        System.out.println( nvMoto.toString() );
        System.out.println("Ainda paga IPVA: " + nvMoto.pagaIPVA());
        
        Charrete nvCharrete = new Charrete(0,false,false,2,0,4,true, 3.4,animal);
        System.out.println("***Informacoes da charete***");
        System.out.println( nvCharrete.toString() );
        
        Caminhao nvCaminhao = new Caminhao(2, 1998, true, true, 2, 2, 8, true, 600, diesel);
        System.out.println("***Informacoes do Caminhao***");
        System.out.println( nvCaminhao.toString() );
        System.out.println("Ainda paga IPVA: " + nvCaminhao.pagaIPVA());
        
        Bicicleta nvBike = new Bicicleta(true, true, 0, true, true, 2, 0, 0, true, 2, eletricidade);
        System.out.println("***Informacoes da bicicleta***");
        System.out.println( nvBike.toString() );

    }

}
