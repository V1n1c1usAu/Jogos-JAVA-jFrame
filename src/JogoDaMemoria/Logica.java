/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaMemoria;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Vinicius Augusto dos Santos Silva
 */
public class Logica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> letras = new ArrayList<>();
        String figuras[][] = new String[4][4];

        instanciaValores(letras);
        inserirValores(figuras, letras);

        for (int i = 0; i < figuras.length; i++) {
            for (int j = 0; j < figuras.length; j++) {
                System.out.print(i + "x" + j + " ");
            }
            System.out.println("");
        }
    }

    /**
     * Função que instância os valores que representam as figuras.
     *
     * @param letras
     */
    private static void instanciaValores(ArrayList<String> letras) {

        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");
        letras.add("F");
        letras.add("G");
        letras.add("H");
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");
        letras.add("F");
        letras.add("G");
        letras.add("H");

    }

    /**
     * Insere os valores de forma aleatória e com apenas duas figuras(letras)
     * iguais.
     *
     * @param figuras
     * @param letras
     */
    private static void inserirValores(String[][] figuras, ArrayList<String> letras) {
        Random num = new Random();
        int indice = 17;
        for (int i = 0; i < figuras.length; i++) {
            for (int j = 0; j < figuras.length; j++) {
                figuras[i][j] = letras.get(num.nextInt(letras.size()));

                letras.remove(figuras[i][j]);
            }
        }

    }

    /**
     * Captura os valores dos botoes e verifica se são iguais.
     */
    private static void capturarBotoes() {
        int bt1 = -1;
        int bt2 = -1;

        if (bt1 == -1) {
            bt1 = 1;
        } else {
            bt2 = 2;
        }

        if (bt1 == bt2) {
            //Mantem os valores aparecendo no jFrame

            bt1 = -1;
            bt2 = -1;
            //Retorna True e desativa os botoes.
        } else if (bt1 != -1 && bt2 != 2) {

            bt1 = -1;
            bt2 = -1;
            //Ativa os botoes novamente.
            //Retorna false
        }
    }
}
