package listasemanal02.projetoagentedeimportacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        ProdutoImportado produtoImportado1 = new ProdutoImportado();

        System.out.println("Informe o tipo do produto: ");
        produtoImportado1.setTipo(input.nextLine());
        System.out.println("Informe o preço do produto em dólares: ");
        produtoImportado1.setPreco(input.nextFloat());

        AgenteDeImportacao agente1 = new AgenteDeImportacao();

        float valorFinal = agente1.converter(produtoImportado1) + agente1.calcularImposto(produtoImportado1);

        System.out.println("Valor final do produto: R$" + valorFinal);
    }
}
