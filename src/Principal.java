public class Principal {
    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        meuFilme.nome = "Kung Fu Panda";
        meuFilme.duracaoEmMinutos = 140;
        meuFilme.anoDeLancamento = 2012;
        meuFilme.disponivelNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("A média de avaliações do filme é: " + meuFilme.getObtemMedia());
     }
}
