package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ferrari";
        carro1.ano = 2020;
        carro1.modelo = "sport";

        carro2.nome = "Fusca";
        carro2.ano = 1960;
        carro2.modelo = "Tanque";

        carro1 = carro2; //carro1 fazendo referência ao carro2 ou vice versa

        System.out.println("\nCarro1");
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);

        System.out.println("\nCarro2");
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);
    }
}
