public class Principal {
    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        meuFilme.nome = "Kung Fu Panda";
        meuFilme.duracaoEmMinutos = 140;
        meuFilme.anoDeLancamento = 2012;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.obtemMedia());

     }
}
