package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasdDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int contador = 12;
        while(contador < 10){
            System.out.println(contador);
            contador++;
        }
        contador = 0;
        do{
            System.out.println("Dentro do Do-While "+ ++contador);
        }while(contador < 10);

        for(int i = 0;i < 10;i++){
            System.out.println("for "+i);
        }
    }
}
