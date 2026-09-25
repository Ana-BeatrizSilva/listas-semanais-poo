package listasemanal02.projetoplanejadordeviagens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Carro carro1 = new Carro();

        System.out.println("Informe o modelo do veículo: ");
        carro1.setModelo(input.nextLine());
        System.out.println("Informe a autonomia do veículo: ");
        carro1.setAutonomia(input.nextFloat());
        System.out.println("Informe a capacidade do tanque: ");
        carro1.setCapacidadeDoTanque(input.nextInt());

        System.out.println("Qual a distância que pretende percorrer?: ");
        float distanciaDestino = input.nextFloat();
        Planejador planejador1 = new Planejador();

        System.out.println("Quantidade de abastecimentos que serão necessários: " + planejador1.estimarAbastecimentos(carro1, distanciaDestino));

        input.close();
    }
}
