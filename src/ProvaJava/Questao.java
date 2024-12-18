package ProvaJava;

public class Questao {
    private String enunciado;
    private String[] alternativas;
    private int alternativaCorreta;

    public Questao(String enunciado, String[] alternativas, int alternativaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    // Verificar se a resposta está correta
    public boolean verificarResposta(int resposta) {
        return resposta == alternativaCorreta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }
}

