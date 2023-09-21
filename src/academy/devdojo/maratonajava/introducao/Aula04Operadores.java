package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero1 = 10;
        int numero2 = 20;
        double resultado = (numero1 / (double)numero2); //casting, forçando o n2 a ser um numero real
        System.out.println("o valor é igual a "+resultado);

        // % resto da divisão

        int resto = 21 % 7;
        System.out.println(resto);

        // operadores lógicos
        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezIDiferenteQueDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez "+isDezIgualQueDez);
        System.out.println("isDezIDiferenteQueDez "+isDezIDiferenteQueDez);

        // && (AND) || (OR) ! (NOT) OPERADORES LÓGICOS

        int idade = 30;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade > 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorTotalContaCorrente || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //Atribuição
        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        System.out.println(bonus);

        // ++ --  Incrimentador

        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;
        System.out.println(contador);
    }
}
