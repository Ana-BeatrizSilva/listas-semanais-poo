package listasemanal04.projetoretangulosequadrados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Retangulo r01 = new Retangulo();
        Retangulo r02 = new Retangulo();

        // dados do primeiro retângulo
        System.out.println("Base do primeiro retângulo: ");
        r01.setBase(input.nextInt());
        System.out.println("Altura do primeiro retângulo: ");
        r01.setAltura(input.nextInt());

        // dados do segundo retângulo
        System.out.println("Base do segundo retângulo: ");
        r02.setBase(input.nextInt());
        System.out.println("Altura do segundo retângulo: ");
        r02.setAltura(input.nextInt());

        boolean eQuadrado01 = r01.isQuadrado();
        if (eQuadrado01){
            System.out.println("O primeiro retângulo é um quadrado");
        }else{
            System.out.println("O primeiro retângulo não é um quadrado");
        }

        boolean eQuadrado02 = r02.isQuadrado();

        if (eQuadrado02){
            System.out.println("O segundo retângulo é um quadrado");
        }else{
            System.out.println("O segundo retângulo não é um quadrado");
        }

        int area1 = r01.area();
        int area2 = r02.area();
        boolean saoIguais = r01.eIgual(r02);

        if (saoIguais){
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais");

            if (area1 > area2){
                System.out.println("Retângulo 1: ");
                r01.autoDesenhar();
            }else if(area2 == area1){
                System.out.println("Retângulos 1 e 2: ");
                r01.autoDesenhar();
                r02.autoDesenhar();
            }else{
                System.out.println("Retângulo 2: ");
                r02.autoDesenhar();
            }
        }

        input.close();
    }
}
