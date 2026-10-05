package listasemanal05.projetobanco;

public class ContaCorrente {

    private float saldo;
    private String titular;
    private String numero;

    // gets e sets

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    // métodos

    public boolean eIgual(ContaCorrente objContaCorrente){

        return this.numero.equals(objContaCorrente.getNumero());
    }

}
