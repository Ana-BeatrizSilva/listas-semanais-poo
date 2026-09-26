package listasemanal02.projetoplanejadordeviagens;

public class Carro {

    private String modelo;
    private float autonomia;
    private int capacidadeDoTanque;

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public float getAutonomia(){
        return autonomia;
    }

    public void setAutonomia(float autonomia){
        this.autonomia = autonomia;
    }

    public int getCapacidadeDoTanque(){
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(int capacidadeDoTanque){
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

}