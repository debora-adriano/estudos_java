package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("American Idiot");
        minhaMusica.setCantor("Green Day");

        for (int i = 0; i < 500; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 250; i++) {
            minhaMusica.curti();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("É você satanás?");
        meuPodcast.setApresentador("Livia");

        for (int i = 0; i < 100; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            meuPodcast.curti();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
