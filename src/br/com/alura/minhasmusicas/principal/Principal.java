package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Emaús");
        minhaMusica.setCantor("Morada");

        for (int i = 0; i < 1322; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setApresentador("Igor3K");
        meuPodcast.setTitulo("Flow");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 900; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
