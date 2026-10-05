package listasemanal05.projetobanco;

public class Banco {

    private ContaCorrente[] listaContas = new ContaCorrente[10];
    private int qtdContasSalvas = 0;

    public boolean salvarConta(ContaCorrente objContaCorrente) {

        if (qtdContasSalvas < listaContas.length) {

            for (int i = 0; i < qtdContasSalvas; i++) {

                if (objContaCorrente.eIgual(listaContas[i])) {
                    return false;
                }
            }

            listaContas[qtdContasSalvas] = objContaCorrente;
            qtdContasSalvas++;
            return true;
        }

        return false;
    }

    public ContaCorrente recuperarConta(String numero){

        for (int n = 0; n < qtdContasSalvas; n++){

            if (numero.equals(listaContas[n].getNumero())){
                return listaContas[n];
            }

        }

        return null;
    }
}
