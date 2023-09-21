package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasdDeRepeticao04 {
    //Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    //condição valorParcela >= 1000
    public static void main(String[] args) {
        double valoTotal = 30000;
        for (int parcela = 1; parcela <= valoTotal ;parcela++) {
            double valorParcela = valoTotal / parcela;
            if(valorParcela >= 1000){// opcao simples if(valorParcela <1000)
                System.out.println("Parcela "+parcela+ "R$ "+valorParcela);
            }else{
                break;
            }
            System.out.println("fora do if, mas dentro do for "+parcela);
        }

    }
}
