package listasemanal03.projetocalculadoradeimc;

public class Nutricionista {

    public String avaliarIMC(Paciente objPaciente){
        float valorIMC = objPaciente.getPeso()/(float)Math.pow(objPaciente.getAltura(), 2);

        if (valorIMC < 18.5){
            return "Classificação: Baixo peso";
        }else if(valorIMC < 25){
            return "Classificação: Normal";
        }else if(valorIMC < 30){
            return "Classificação: Sobrepeso";
        }else{
            return "Classificação: Obesidade";
        }
    }
}
