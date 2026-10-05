package listasemanal04.projetocdf;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = input.nextInt();

        CDF alunoCDF = new CDF();

        System.out.println(numero + " é primo?: " + alunoCDF.ePrimo(numero));

        input.close();
    }
}
