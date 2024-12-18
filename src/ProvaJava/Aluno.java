package ProvaJava;

public class Aluno {

    private String nome;
    private int[] respostas;

    public Aluno(String nome, int numQuestoes){
        this.nome = nome;
        this.respostas = new int[numQuestoes];
    }

    public void registrarRespostas(int numeroQuestao, int resposta){
        respostas[numeroQuestao] = resposta;
    }

    public int[] getRespostas() {
        return respostas;
    }

    public String getNome() {
        return nome;
    }
}
