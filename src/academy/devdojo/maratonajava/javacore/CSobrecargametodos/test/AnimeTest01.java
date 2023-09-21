package academy.devdojo.maratonajava.javacore.CSobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.CSobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV", 12, "Ação");
        anime.imprime();
    }
}
