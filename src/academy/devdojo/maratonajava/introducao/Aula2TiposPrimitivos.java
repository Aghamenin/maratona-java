package academy.devdojo.maratonajava.introducao;

public class Aula2TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int)10000000000L; //Casting, onde força a quantidade limite de byte, de int para long
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = (float) 2500.0D;// de Float para Double usando casting
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;
        String nome = "Goku";

        System.out.println("A idade é " +idade+" anos");
        System.out.println(falso);
        System.out.println("char " +caractere);
        System.out.println(salarioFloat);
        System.out.println("Oi meu nome é "+nome);
    }
}
