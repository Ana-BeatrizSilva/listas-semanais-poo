package listasemanal02.projetoagentedeimportacao;

public class AgenteDeImportacao {

    public float converter (ProdutoImportado produto){

        float valorReais = produto.getPreco() * 5.13f;
        return valorReais;
    }

    public float calcularImposto(ProdutoImportado produto){
        float valorReais = converter(produto);
        float valorImposto = valorReais * 0.60f;
        return valorImposto;
    }
}
