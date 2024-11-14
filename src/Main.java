import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho
        System.out.println("***************************************");
        System.out.println("Nome da Faculdade: Unifan");
        System.out.println("Nome do Aluno: Valcio Vasconcelos Junior");
        System.out.println("Nome do Professor: Brenno");
        System.out.println("Bem-vindo ao Quiz sobre: Ciência Geral");
        System.out.println("Você responderá 15 perguntas de múltipla escolha.");
        System.out.println("***************************************\n");

        // Array com 15 questões
        Questao[] questoes = new Questao[15];
        questoes[0] = new Questao("Qual o maior planeta do Sistema Solar?", "A) Terra", "B) Marte", "C) Júpiter", "D) Saturno", "E) Vênus", "C");
        questoes[1] = new Questao("Qual é o planeta mais quente do sistema solar?", "A) Mercúrio", "B) Vênus", "C) Marte", "D) Júpiter", "E) Saturno", "B");
        questoes[2] = new Questao("Qual é o símbolo químico do Ouro?", "A) Au", "B) Ag", "C) Pb", "D) Fe", "E) Hg", "A");
        questoes[3] = new Questao("Qual é o oceano mais profundo do mundo?", "A) Atlântico", "B) Índico", "C) Ártico", "D) Pacífico", "E) Antártico", "D");
        questoes[4] = new Questao("Quantos planetas há no sistema solar?", "A) 7", "B) 8", "C) 9", "D) 10", "E) 6", "B");
        questoes[5] = new Questao("Em que ano o homem pisou na Lua pela primeira vez?", "A) 1969", "B) 1971", "C) 1965", "D) 1967", "E) 1973", "A");
        questoes[6] = new Questao("Qual é a camada mais externa da Terra?", "A) Núcleo", "B) Manto", "C) Crosta", "D) Litosfera", "E) Estratosfera", "C");
        questoes[7] = new Questao("Qual é o elemento químico com símbolo O?", "A) Oxigênio", "B) Ouro", "C) Ouroboros", "D) Ósmio", "E) Oxônio", "A");
        questoes[8] = new Questao("Qual planeta é conhecido como o Planeta Vermelho?", "A) Marte", "B) Vênus", "C) Júpiter", "D) Saturno", "E) Urano", "A");
        questoes[9] = new Questao("Qual é o único metal líquido em temperatura ambiente?", "A) Mercúrio", "B) Césio", "C) Potássio", "D) Ouro", "E) Prata", "A");
        questoes[10] = new Questao("Qual é a fórmula química da água?", "A) H2O", "B) CO2", "C) NaCl", "D) O2", "E) CH4", "A");
        questoes[11] = new Questao("Qual animal é conhecido como o mais venenoso do mundo?", "A) Cobra-real", "B) Água-viva-caixa", "C) Aranha-marrom", "D) Escorpião", "E) Baiacu", "B");
        questoes[12] = new Questao("Quem é o autor da teoria da relatividade?", "A) Isaac Newton", "B) Albert Einstein", "C) Niels Bohr", "D) Galileo Galilei", "E) Stephen Hawking", "B");
        questoes[13] = new Questao("Qual é o maior animal terrestre?", "A) Elefante Africano", "B) Baleia Azul", "C) Girafa", "D) Hipopótamo", "E) Rinoceronte", "A");
        questoes[14] = new Questao("Qual projeto é um sistema operacional gratuito e de código aberto?", "A) Windows", "B) macOS", "C) Linux", "D) Solaris", "E) BSD", "C");

        int acertos = 0;
        int erros = 0;

        // Loop para exibir e corrigir as questões
        for (int i = 0; i < questoes.length; i++) {
            System.out.println("Questão " + (i + 1) + ":");
            questoes[i].escrevaQuestao();
            String resposta = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(resposta)) {
                acertos++;
            } else {
                erros++;
            }
        }

        // Resultados finais
        System.out.println("***************************************");
        System.out.println("Fim do Quiz!");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
        double porcentagem = (acertos / 15.0) * 100;
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
        System.out.println("***************************************");

        scanner.close();
    }
}
