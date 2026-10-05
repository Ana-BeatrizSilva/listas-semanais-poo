package listasemanal04.projetoretangulosequadrados;

public class Retangulo {

    private int base;
    private int altura;

    public int getBase(){
        return base;
    }

    public int getAltura(){
        return altura;
    }

    public void setBase(int base){
        this.base = base;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int perimetro(){
        int valorPerimetro = (2 * base) + (2 * altura);
        return valorPerimetro;
    }

    public int area(){
        int valorArea = base * altura;
        return valorArea;
    }

    public boolean isQuadrado(){
       if (base == altura){
           return true;
       }
       return false;
    }


    public boolean eIgual(Retangulo objRetangulo){

        if (this.base == objRetangulo.getBase() && this.altura == objRetangulo.getAltura()){
            return true;
        }

        if (this.base == objRetangulo.getAltura() && this.altura == objRetangulo.getBase()){
            return true;
        }

        return false;
    }

    public void autoDesenhar(){

        for (int i =0; i < altura; i++){
            for (int j=0; j < base; j++){
                System.out.print("O");
            }
            System.out.println();
        }
    }
}
