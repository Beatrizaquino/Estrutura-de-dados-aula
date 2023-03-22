
public class Referencias {

    public static class Elo {
        String nome;
        int idade;
        Elo proximo;
    }

    public static void main(String[] args) {
        //criar objeto elo e setar ele dados
        Elo primeiro = new Elo();
        primeiro.nome = "test";
        primeiro.idade = 18;

    }
}