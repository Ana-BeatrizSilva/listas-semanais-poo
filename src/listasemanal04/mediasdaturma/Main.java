package listasemanal04.mediasdaturma;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float[] mediasTurma = new float[5];
        float soma = 0;
        float media =0;
        int qtdAbaixoMedia = 0;

        for (int i=0; i < mediasTurma.length; i++){
            System.out.printf("Informe a nota do %d° aluno: ", i+1);
            mediasTurma[i] = input.nextFloat();
            soma += mediasTurma[i];
        }

        media = soma/mediasTurma.length;

        for (int n = 0; n < mediasTurma.length; n++){
            if (mediasTurma[n] < media){
                qtdAbaixoMedia++;
            }
        }

        System.out.println("Quantidade de alunos com nota abaixo da média da turma: " + qtdAbaixoMedia);
    }
}
