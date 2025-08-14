import br.com.alura.StremingKali.modelos.Filmes;
import br.com.alura.StremingKali.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        meuFilme.setNome("Kung Fu Panda");
        meuFilme.setDuracaoEmMinutos(140);
        meuFilme.setAnoDeLancamento(2012);
        meuFilme.setDisponivelNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("A média de avaliações do filme é: " + meuFilme.getObtemMedia());


        Serie flash = new Serie();
        flash.setNome("Flash");
        flash.setAnoDeLancamento(2014);
        flash.exibeFichaTecnica();
        flash.setNumeroTemporadas(9);
     }
}
