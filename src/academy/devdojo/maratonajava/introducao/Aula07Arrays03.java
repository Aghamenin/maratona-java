package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5,};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
        for (int num:numeros3){ // modo simplificado
            System.out.println(num);
        }


    }
}
