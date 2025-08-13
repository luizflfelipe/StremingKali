package br.com.alura.StremingKali.modelos;

public class Filmes {               //Objeto na memoria (filme)
    private String nome;                       //Parametros que o filme possui
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean disponivelNoPlano;
    private double somaDasAvaliacoes;               //Usamos o private para privar o atributo para que o usuário consiga mudar
    private int totalAvaliacoes;

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setNome(String nome) {              //Atalho ALT Insert.        Comando para autorizar o usuário a mudar o valor da propriedade private.
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        if (anoDeLancamento <2025){
            System.out.println("Esse filme está no futuro!");
        }
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setDisponivelNoPlano(boolean disponivelNoPlano) {
        this.disponivelNoPlano = disponivelNoPlano;
    }

    public void exibeFichaTecnica() { //Metodo (void usado somente para registrar na memoria)
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos);
        System.out.println("Incluído no Plano: " + disponivelNoPlano);
    }

    public void avalia(double nota) {    //Pode ser usado como a função,porem está dentro de uma classe entao é um metodo
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double getObtemMedia() {   //Sempre que usar double, precisamos colocar a funçao return, para ele voltar algum valor
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}