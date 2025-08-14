package br.com.alura.StremingKali.modelos;

public class Filmes extends Titulo{          //Extends é usada para aplicar a herança, nesse caso a Class filme está herdando os atributos da Class Titulo
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    //Objeto na memoria (filme)
}