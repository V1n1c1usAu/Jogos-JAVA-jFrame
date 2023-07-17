/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JogoDaVelha;

/**
 *
 * @author aluno
 */
public class Logica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jogoDavelha[][] = new int[3][3];
        int jogadaAtual = 0;
    }

    private int atualizarJogada(int jogadaAtual) {

        if (jogadaAtual == 0) {
            jogadaAtual = 1;
        } else {
            jogadaAtual = 0;
        }

        return jogadaAtual;
    }

    private void zerarJogo(int[][] jogoDaVelha) {

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                jogoDaVelha[l][c] = -1;
            }
        }

    }

    private void verificarVerticais(int[][] jogada) {
        if (jogada[0][0] == jogada[1][0] && jogada[1][0] == jogada[2][0]) {
            int jogador = jogada[0][0];
            vencedor(jogador);
        }
        if (jogada[0][1] == jogada[1][1] && jogada[1][1] == jogada[2][1]) {
            int jogador = jogada[1][1];
            vencedor(jogador);
        }
        if (jogada[0][2] == jogada[1][2] && jogada[1][2] == jogada[2][2]) {
            int jogador = jogada[0][2];
            vencedor(jogador);
        }
    }

    private void verificarHorizontais(int[][] jogada) {

        if (jogada[0][0] == jogada[0][1] && jogada[0][1] == jogada[0][2]) {
            int jogador = jogada[0][0];
            vencedor(jogador);
        }
        if (jogada[1][0] == jogada[1][1] && jogada[1][1] == jogada[1][2]) {
            int jogador = jogada[1][1];
            vencedor(jogador);
        }
        if (jogada[2][0] == jogada[2][1] && jogada[2][1] == jogada[2][2]) {
            int jogador = jogada[2][0];
            vencedor(jogador);
        }
    }

    private void verificarDiagonais(int[][] jogada) {
        if (jogada[0][0] == jogada[1][1] && jogada[1][1] == jogada[2][2]) {
            int jogador = jogada[0][0];
            vencedor(jogador);
        }
        if (jogada[0][2] == jogada[1][1] && jogada[1][1] == jogada[2][0]) {
            int jogador = jogada[1][1];
            vencedor(jogador);
        }
    }

    private void adicionaJogadas(int jogadaAtual, int[][] jogoDaVelha, int[][] jogada, int l, int c) {

        if (jogoDaVelha[l][c] == -1) {

            jogoDaVelha[l][c] = atualizarJogada(jogadaAtual);

            verificarDiagonais(jogada);
            verificarHorizontais(jogada);
            verificarVerticais(jogada);

        } else {
            System.out.println("Espaço ocupado!");
        }

    }

    private String vencedor(int jogador) {
        if (jogador == 1) {
            return "Vencedor: X";
        } else {
            return "Vencedor: O";
        }
    }
}
