package ProvaJava;

import java.util.Scanner;

public class Prova {

    private Questao[] questoes;
    private Aluno aluno;

    public Prova(Questao[] questoes, Aluno aluno){
        this.questoes = questoes;
        this.aluno = aluno;
    }

    public double calcularNota(){
        int acertos = 0;
        for(int i=0; i< questoes.length; i++){
            if(questoes[i].verificarResposta(aluno.getRespostas()[i])){
                acertos++;
            }
        }
        return (acertos / (double) questoes.length) *10;
    }

    public void aplicarProva(){
        for (int i=0; i< questoes.length; i++){
            System.out.println(questoes[i].getEnunciado());
            String[] alternativas = questoes[i].getAlternativas();
            for( int j=0; j< alternativas.length; j++){
                System.out.println((j+1) + ". " + alternativas[j]);
            }

            System.out.print("Digite a resposta: ");
            Scanner scanner = new Scanner(System.in);
            int respostaAluno = scanner.nextInt();

            aluno.registrarRespostas(i, respostaAluno);

        }
    }

}
