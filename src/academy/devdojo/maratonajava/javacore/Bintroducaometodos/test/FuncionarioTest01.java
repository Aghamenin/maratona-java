package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{1200, 897.32, 2000});

        System.out.println("Média "+funcionario.getMedia());

        funcionario.imprime();
        funcionario.imprimeMediaSalario();

    }
}
