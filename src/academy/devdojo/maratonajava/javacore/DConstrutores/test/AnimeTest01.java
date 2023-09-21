package academy.devdojo.maratonajava.javacore.DConstrutores.test;


import academy.devdojo.maratonajava.javacore.DConstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
         Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime.imprime();

    }
}
