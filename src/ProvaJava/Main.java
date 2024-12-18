package ProvaJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definindo as questões da prova
        Questao q1 = new Questao(
                "1 - O que é Java?",
                new String[]{"Uma linguagem de marcação", "Uma linguagem de programação", "Um sistema operacional", "Uma ferramenta de design"},
                2
        );

        Questao q2 = new Questao(
                "2 - Qual é o tipo de dado utilizado para armazenar números inteiros em Java?",
                new String[]{"int", "double", "char", "String"},
                1
        );

        Questao q3 = new Questao(
                "3 - Qual palavra-chave em Java é usada para criar uma instância de um objeto?",
                new String[]{"new", "create", "instance", "object"},
                1
        );

        Questao q4 = new Questao(
                "4 - Qual destes métodos é utilizado para imprimir algo na tela em Java?",
                new String[]{"print()", "show()", "echo()", "display()"},
                1
        );

        Questao q5 = new Questao(
                "5 - Como chamamos uma classe que herda as características de outra classe em Java?",
                new String[]{"Polimorfismo", "Abstração", "Herança", "Encapsulamento"},
                3
        );

        Questao q6 = new Questao(
                "6 - Qual é a principal característica de um método em Java?",
                new String[]{"Ele não pode ser chamado fora da classe", "Ele pode retornar valores", "Ele sempre retorna void", "Ele sempre aceita parâmetros"},
                2
        );

        Questao q7 = new Questao(
                "7 - Em Java, o que significa o termo 'encapsulamento'?",
                new String[]{"Quando uma classe herda as propriedades de outra", "Quando os dados são protegidos e acessados por métodos", "Quando um método recebe parâmetros", "Quando há múltiplas implementações para um mesmo método"},
                2
        );

        Questao q8 = new Questao(
                "8 - Em Java, o que a palavra-chave 'static' faz?",
                new String[]{"Torna um método ou variável acessível sem instanciar a classe", "Cria um método privado", "Cria um método abstrato", "Torna uma classe final"},
                1
        );

        Questao q9 = new Questao(
                "9 -Qual estrutura de controle é usada para tomar decisões em Java?",
                new String[]{"if", "switch", "while", "for"},
                1
        );

        Questao q10 = new Questao(
                "10 - Qual é o tipo de dado utilizado para armazenar texto em Java?",
                new String[]{"String", "char", "int", "double"},
                1
        );

        Questao[] questoes = {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10};

        // Criando o aluno
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        Aluno aluno = new Aluno(nomeAluno, questoes.length);

        // Criando a prova
        Prova prova = new Prova(questoes, aluno);

        // Aplicando a prova
        prova.aplicarProva();

        // Calculando e exibindo a nota
        double nota = prova.calcularNota();

        System.out.println("Nota final do aluno " + aluno.getNome() + ": " + nota);

        // Mensagem de retorno
        if (nota < 5){
            System.out.println("Não de desanime! Talvez você precise estudar um pouco mais, foco nos estudos e tente novamente.");
        } else if (nota <=7 ) {
            System.out.println("Você está no caminho certo, mas sabemos que pode fazer melhor");
        } else if (nota <=9) {
            System.out.println("Caramba, parece que temos um futuro desenvolvedor Java por aqui, por pouco você não acertou tudo! ");
        } else{
            System.out.println("Parabéns! Definitivamente você será um bom desenvolvedor Java, está na hora de progredir nos estudos");
        }

    }
}
