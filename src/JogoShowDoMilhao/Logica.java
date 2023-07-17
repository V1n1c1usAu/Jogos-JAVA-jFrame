/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoShowDoMilhao;

/**
 *
 * @author Vinicius Augusto dos Santos Silva
 */
public class Logica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String perguntasRespostas[][] = new String[5][5];
        
        perguntasDoJogo(perguntasRespostas);
        proximaPergunta(perguntasRespostas);

    }

    /**
     * Instância as perguntas do jogo
     */
    private static void perguntasDoJogo(String[][] perguntasRespostas) {

        //Pergunta 1
        perguntasRespostas[0][0] = "Qual o livro mais lido do mundo?";
        //Alternativas da pergunta 1
        perguntasRespostas[0][1] = "Alice no País das Maravilhas";
        perguntasRespostas[0][2] = "O Pequeno Príncipe";
        perguntasRespostas[0][3] = "Bíblia Sagrada";
        perguntasRespostas[0][4] = "Harry Potter e a Pedra Filosofal";

        //Pergunta 2
        perguntasRespostas[1][0] = "Em que ano teve o fim da segunda guerra mundial?";
        //Alternativas da pergunta 2
        perguntasRespostas[1][1] = "1912";
        perguntasRespostas[1][2] = "1929";
        perguntasRespostas[1][3] = "1945";
        perguntasRespostas[1][4] = "1966";

        //Pergunta 3
        perguntasRespostas[2][0] = "Qual a invenção mais importante do mundo?";
        //Alternativas da pergunta 3
        perguntasRespostas[2][1] = "Matemática";
        perguntasRespostas[2][2] = "Alfabeto";
        perguntasRespostas[2][3] = "Ser humano";
        perguntasRespostas[2][4] = "Eletricidade";

        //Pergunta 4
        perguntasRespostas[3][0] = "Qual a capital da Grécia?";
        //Alternativas da pergunta 4
        perguntasRespostas[3][1] = "Atenas";
        perguntasRespostas[3][2] = "Olímpia";
        perguntasRespostas[3][3] = "Delfos";
        perguntasRespostas[3][4] = "Esparta";

        //Pergunta 5
        perguntasRespostas[4][0] = "Eu falo, mas não tenho boca. Eu ouço, mas não tenho ouvidos. Não tenho corpo, mas vivo com o vento. Quem sou eu?";
        //Alternativas da pergunta 5
        perguntasRespostas[4][1] = "Cordas Vocais";
        perguntasRespostas[4][2] = "O eco";
        perguntasRespostas[4][3] = "Caixa de Som";
        perguntasRespostas[4][4] = "Microfone";

    }

    private static void proximaPergunta(String[][] perguntasRespostas) {
        int numPergunta = 0;
        for (int i = 0; i < 5; i++) {

            System.out.println(perguntasRespostas[numPergunta][i]);
        }

    }

    public static void verificaResposta(int pergunta, int resposta, int ponto) {

        switch (pergunta) {

            case 1:
                if (resposta == 3) {
                    ponto++;
                }
                break;

            case 2:
                if (resposta == 3) {
                    ponto++;
                }
                break;

            case 3:
                if (resposta == 3) {
                    ponto++;
                }
                break;

            case 4:
                if (resposta == 1) {
                    ponto++;
                }
                break;

            case 5:
                if (resposta == 2) {
                    ponto++;
                }
                break;

            default:
                ponto--;

        }

        /* for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
        System.out.print(i + "x" + j + " ");
        }
        System.out.println("");
        }*/
 /*
        perguntas[0] = "Qual o livro mais lido do mundo?";
        perguntas[1] = "Em que ano teve fim a segunda guerra mundial?";
        perguntas[2] = "Qual a invenção mais importante do mundo?";
        perguntas[3] = "Qual a capital da Grécia?";*/
    }

}
