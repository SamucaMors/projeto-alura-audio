package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.principal.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.principal.modelos.Musica;
import br.com.alura.minhasmusicas.principal.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast pod = new Podcast();
        pod.setTitulo("Dev Inter");
        pod.setApresentador("Samuel Mors");
        pod.setDescricao("Tudo sobre desenvolvimento de Software");

        Musica music = new Musica();
        music.setCantor("John Huh");
        music.setTitulo("I love Nick forever");
        music.setAlbum("Forever");
        music.setGenero("Romantic");


        for(int i = 1; i<=510; i++){
            pod.curte();
        }
        for(int i = 1; i<=3000; i++){
            music.reproduz();
        }

        MinhasPreferidas favorite = new MinhasPreferidas();

        System.out.println("Título: " + pod.getTitulo());
        System.out.println("Apresentador: " + pod.getApresentador());
        System.out.println("Descricao: " + pod.getDescricao());
        System.out.println(pod.getTotalCurtidas());
        System.out.println(pod.getClassificacao());
        favorite.inclui(pod);

        System.out.println("Título: " + music.getTitulo());
        System.out.println("Cantor: " + music.getCantor());
        System.out.println("Album: " + music.getAlbum());
        System.out.println("Genero: " + music.getGenero());
        System.out.println(music.getTotalReproducoes());
        System.out.println(music.getClassificacao());
        favorite.inclui(music);

    }
}