package listasemanal04.projetocdf;

public class CDF {

    public boolean ePrimo(int numero){

        if (numero <= 1)
            return false;

        for (int i =2; i < numero; i++){
            if (numero % i ==0){
                return false;
            }
        }
        return true;
    }
}
