# Prova de Conhecimentos Básicos em Java <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="Java" width="50" height="50" />

## 📚 Descrição do Projeto

O objetivo principal deste projeto é proporcionar uma ferramenta de aprendizagem e avaliação para desenvolvedores iniciantes em Java. Ao utilizar esta aplicação, os desenvolvedores podem praticar e revisar conceitos básicos da linguagem de uma forma interativa e divertida. A ideia é fazer atualizações com o passar do tempo e melhorar cada vez mais a prova, aplicando novas funcionalidades e interações com o usuário.

Este projeto consiste em uma aplicação simples de prova para testar os conhecimentos básicos em Java. A ideia principal é ajudar os desenvolvedores que estão começando, fornecendo uma ferramenta interativa para avaliar e reforçar seus conhecimentos. A prova cobre conceitos fundamentais da linguagem Java e é composta por um conjunto de questões de múltipla escolha.

## 🛠 Estrutura do Projeto

O projeto está organizado em várias classes, cada uma desempenhando um papel específico na aplicação:

1. **Main**: A classe principal que orquestra a aplicação. Ela inicializa as questões, coleta as respostas do aluno, aplica a prova e calcula a nota final.
   
2. **Questao**: Representa uma questão da prova. Contém o enunciado, as alternativas e a alternativa correta. Esta classe também possui um método para verificar se a resposta fornecida pelo aluno está correta.
   
3. **Aluno**: Representa o aluno que está realizando a prova. Esta classe armazena o nome do aluno e suas respostas às perguntas.

4. **Prova**: Contém um array de questões e um objeto Aluno. Esta classe é responsável por aplicar a prova, coletar as respostas do aluno, calcular a nota final e exibir uma mensagem de feedback baseada no desempenho do aluno.

## 🎯 Funcionamento da Aplicação

A aplicação funciona da seguinte maneira:

1. **Inicialização**: A classe `Main` inicializa um conjunto de questões e cria um objeto `Aluno`.

2. **Aplicação da Prova**: A classe `Prova` apresenta cada questão ao aluno e coleta suas respostas.

3. **Cálculo da Nota**: Após todas as questões serem respondidas, a classe `Prova` calcula a nota final do aluno, com base nas respostas corretas.

4. **Feedback**: A aplicação fornece um feedback ao aluno baseado na sua pontuação, motivando-o a continuar seus estudos e melhorar.
