package listasemanal05.projetobanco;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;

        do {

            System.out.println("1 - Cadastrar uma conta\n2 - Consultar saldo de uma conta\n3 - Sair\nOpção: ");
            opcao = Integer.parseInt(input.nextLine());

            switch (opcao){

                case 1:

                    ContaCorrente conta = new ContaCorrente();

                    System.out.println("Nome do titular: ");
                    conta.setTitular(input.nextLine());
                    System.out.println("Número da conta: ");
                    conta.setNumero(input.nextLine());
                    System.out.println("Saldo da conta: ");
                    conta.setSaldo(Float.parseFloat(input.nextLine()));

                    if (banco.salvarConta(conta)){
                        System.out.println("Conta salva com sucesso");
                    }else{
                        System.out.println("Conta não pôde ser salva");
                    }

                    break;

                case 2:

                    System.out.println("Informe o número da conta que deseja consultar: ");
                    String numero = input.nextLine();

                    ContaCorrente contaBuscar = banco.recuperarConta(numero);

                    if (contaBuscar != null){
                        System.out.println("Saldo: " + contaBuscar.getSaldo());
                    }else{
                        System.out.println("Conta não encontrada");
                    }

                    break;

                case 3:
                    System.out.println("Encerrando . . .");
                    break;
            }
        } while (opcao != 3);
    }
}
