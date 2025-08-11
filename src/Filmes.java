public class Filmes {               //Objeto na memoria (filme)
    String nome;                       //Parametros que o filme possui
    int anoDeLancamento;
    int duracaoEmMinutos;
    int disponivelNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;

    void exibeFichaTecnica() { //Metodo (void usado somente para registrar na memoria)
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos);
        System.out.println("Incluído no Plano: " + disponivelNoPlano);
    }

    void avalia(double nota) {    //Pode ser usado como a função,porem está dentro de uma classe entao é um metodo
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double obtemMedia() {   //Sempre que usar double, precisamos colocar a funçao return, para ele voltar algum valor
        return somaDasAvaliacoes/totalAvaliacoes;
    }
}