package listasemanal03.projetocalculadoradeimc;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Paciente paciente01 = new Paciente();

        System.out.println("Informe o peso do paciente: ");
        paciente01.setPeso(input.nextFloat());
        System.out.println("Informe a altura do paciente: ");
        paciente01.setAltura(input.nextFloat());

        Nutricionista nutricionista01 = new Nutricionista();

        System.out.println(nutricionista01.avaliarIMC(paciente01));
    }
}
