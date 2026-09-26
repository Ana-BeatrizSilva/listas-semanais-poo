package listasemanal03.compararnomes;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro nome: ");
        String primeiroNome = input.nextLine();
        System.out.println("Informe o segundo nome: ");
        String segundoNome = input.nextLine();

        if (primeiroNome.equals(segundoNome)){
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais");
        }
    }
}
