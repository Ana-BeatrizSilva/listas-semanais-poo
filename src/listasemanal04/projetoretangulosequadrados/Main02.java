package listasemanal04.projetoretangulosequadrados;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int qtdQuadrados = 0;
        int qtdRetangulos = 0;
        int somaPerimetros = 0;

        Retangulo maiorR = null;
        Retangulo menorR = null;

        for (int i = 1; i <= 100; i++){

            Retangulo retangulo = new Retangulo();

            System.out.println("Base do " + i + "º retângulo: ");
            retangulo.setBase(input.nextInt());

            System.out.println("Altura do " + i + "º retângulo: ");
            retangulo.setAltura(input.nextInt());

            if (retangulo.isQuadrado()){
                qtdQuadrados++;
            }else{
                qtdRetangulos++;
            }

            somaPerimetros += retangulo.perimetro();

            if (maiorR == null){
                maiorR = retangulo;
                menorR = retangulo;
            }else{

                if (retangulo.area() > maiorR.area()){
                    maiorR = retangulo;
                }

                if (retangulo.area() < menorR.area()){
                    menorR = retangulo;
                }
            }
        }

        System.out.println("Quantidade de quadrados: " + qtdQuadrados);
        System.out.println("Quantidade de retângulos: " + qtdRetangulos);
        System.out.println("Soma dos perímetros: " + somaPerimetros);

        System.out.println("Maior retângulo:");
        maiorR.autoDesenhar();

        System.out.println("Menor retângulo:");
        menorR.autoDesenhar();

        input.close();
    }
}