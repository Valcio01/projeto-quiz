import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho
        System.out.println("***************************************");
        System.out.println("Nome da Faculdade: Unifan");
        System.out.println("Nome do Aluno: Valcio Vasconcelos Junior");
        System.out.println("Nome do Professor: Brenno");
        System.out.println("Bem-vindo ao Quiz sobre: Ciência ");
        System.out.println("Você responderá 15 perguntas de múltipla escolha.");
        System.out.println("***************************************\n");

        // Array com 15 questões
        Questao[] questoes = new Questao[15];
        questoes[0] = new Questao("Qual o maior planeta do Sistema Solar?", "A) Terra", "B) Marte", "C) Júpiter", "D) Saturno", "E) Vênus", "C");
        questoes[1] = new Questao("Quem é considerado o pai da computação?", "A) Charles Babbage", "B) Alan Turing", "C) Steve Jobs", "D) Bill Gates", "E) Ada Lovelace", "A");
        questoes[2] = new Questao("Qual é o símbolo químico do Ouro?", "A) Au", "B) Ag", "C) Pb", "D) Fe", "E) Hg", "A");
        questoes[3] = new Questao("Qual tecnologia é usada pela maioria das criptomoedas?", "A) Blockchain", "B) Computação em Nuvem", "C) Inteligência Artificia", "D) Internet das Coisas", "E) Realidade Aumentada", "A");
        questoes[4] = new Questao("Qual componente do computador faz cálculos e processa dados?", "A) RAM", "B) GPU", "C) CPU", "D) HDD", "E) SSD", "C");
        questoes[5] = new Questao("Em que ano o homem pisou na Lua pela primeira vez?", "A) 1969", "B) 1971", "C) 1965", "D) 1967", "E) 1973", "A");
        questoes[6] = new Questao("Qual tecnologia permite a comunicação sem fio entre dispositivos próximos?", "A) Bluetooth", "B) NFC", "C) Wi-Fi", "D) Zigbee", "E) Infrared", "A");
        questoes[7] = new Questao("Qual é o elemento químico com símbolo O?", "A) Oxigênio", "B) Ouro", "C) Ouroboros", "D) Ósmio", "E) Oxônio", "A");
        questoes[8] = new Questao("Qual planeta é conhecido como o Planeta Vermelho?", "A) Marte", "B) Vênus", "C) Júpiter", "D) Saturno", "E) Urano", "A");
        questoes[9] = new Questao("Quem descobriu a penicilina?", "A) Louis Pasteur", "B) Alexander Fleming", "C) Robert Koch", "D) Edward Jenner", "E) Jonas Salk", "B");
        questoes[10] = new Questao("Qual é a fórmula química da água?", "A) H2O", "B) CO2", "C) NaCl", "D) O2", "E) CH4", "A");
        questoes[11] = new Questao("Qual é o maior oceano do mundo?", "A) Oceano Pacífico", "B) Oceano Atlântico", "C) Oceano Índico", "D) Oceano Ártico", "E) Oceano Antártico", "A");
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
