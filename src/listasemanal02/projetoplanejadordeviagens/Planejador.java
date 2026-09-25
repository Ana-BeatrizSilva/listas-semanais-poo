package listasemanal02.projetoplanejadordeviagens;

public class Planejador {

    public int estimarAbastecimentos(Carro objCarro, float distanciaDestino){

        float alcanceTanqueCheio = objCarro.getAutonomia() * objCarro.getCapacidadeDoTanque();
        double qtdTanquesNecessarios = (double)distanciaDestino/alcanceTanqueCheio;

        int qtdAbastecimentos = (int) Math.ceil(qtdTanquesNecessarios);

        return qtdAbastecimentos;
    }
}
