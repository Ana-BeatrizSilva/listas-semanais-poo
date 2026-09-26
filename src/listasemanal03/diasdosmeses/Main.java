package listasemanal03.diasdosmeses;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){


        Scanner input = new Scanner(System.in);
        System.out.println("Informe um mês: ");
        String mes = input.nextLine().toLowerCase();

        switch (mes){

            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println(mes + " tem 31 dias");
                break;

            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                System.out.println(mes + " tem 30 dias");
                break;

            case "fevereiro":
                System.out.println(mes + " tem 28 dias, e 29 dias em anos bissextos");
                break;

            default:
                System.out.println("Entrada inválida");
                break;
        }
    }
}
