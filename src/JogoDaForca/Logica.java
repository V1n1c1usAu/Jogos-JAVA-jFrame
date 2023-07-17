/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaForca;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vini
 */
public class Logica {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("null")
    public static void main(String[] args) {

        String palavra = "Onomatopeia";
        String letra = null;
        char[] letrasAcertadas = new char[palavra.length()];

        //String palavraCompleta = "";
        int tentativas = 6;
        boolean acertou = false;
        boolean acabou = false;

        for (int i = 0; i < letrasAcertadas.length; i++) {
            letrasAcertadas[i] = '_';
        }

        while (!verificaTentativas(tentativas, acabou)) {

            acertou = false;

            System.out.println("Tentativas " + tentativas);
            System.out.println(String.valueOf(letrasAcertadas));

            System.out.println();
            letra = digiteLetra(letra);
            //    letrasTentadas(letra);

            for (int i = 0; i < palavra.length(); i++) {

                if (palavra.toLowerCase().charAt(i) == letra.charAt(0)) {
                    letrasAcertadas[i] = letra.charAt(0);
                    acertou = true;
                }
            }

            //contagemTentativas(acertou, tentativas);
            if (String.valueOf(letrasAcertadas).toLowerCase().equals(palavra.toLowerCase())) {
                System.out.println("Venceu!");
                return;
            }

        }
        tentativas = contagemTentativas(acertou, tentativas);
    }

    public static boolean verificaTentativas(int tentativas, boolean acabou) {
        if (tentativas == 0) {
            System.out.println("");
            System.out.println("Tentativas " + tentativas);
            System.out.println("Perdeu!");
            acabou = true;
        }
        return acabou;
    }

    public static String digiteLetra(String letra) {
        Scanner sc = new Scanner(System.in);
        letra = sc.next();

        return letra;
    }

    public static void letrasTentadas(String letra) {

        ArrayList<String> letrasTentadas = new ArrayList<>();

        if (letrasTentadas.contains(letra.substring(0, 0))) {
            System.out.println("Letra já tentada!");
            letra = digiteLetra(letra);
            letrasTentadas(letra);
        }

        letrasTentadas.add(letra.substring(0, 0));

    }

    public static int contagemTentativas(boolean acertou, int tentativas) {
        if (!acertou) {
            tentativas--;
        }

        return tentativas;
    }

}
