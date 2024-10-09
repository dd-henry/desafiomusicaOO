package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >=9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto na plataforma");
        }else {
            System.out.println(audio.getTitulo() + " é uma ótima opção para ver depois");
        }
    }
}
