package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.Test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+ " ");
        }

    }
}
