/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JogoDaForca;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aluno
 */
public class JogoDaForcaTela extends javax.swing.JFrame {

    private int tentativas = 6;
    private boolean acertou = false;

    /**
     * Creates new form JogoDaForcaTela
     */
    public JogoDaForcaTela() {
        initComponents();

        //Deixa como padrao a sequencia de underline quando falta letras.
        for (int i = 0; i < letrasAcertadas.length; i++) {
            letrasAcertadas[i] = '_';
        }
    }

    //Palavra do jogo
    String palavra = palavraAleatoria();

    //Var. que se completa conforme ocorre o acerto de palavras.
    char[] letrasAcertadas = new char[palavra.length()];

    private String palavraAleatoria() {

        Random num = new Random();

        ArrayList<String> palavra = new ArrayList<>();

        palavra.add("Enferrujado");
        palavra.add("Civil");
        palavra.add("Natal");
        palavra.add("Enigma");
        palavra.add("Coberto");
        palavra.add("Dicas");
        palavra.add("Esquecendo");
        palavra.add("Maca");
        palavra.add("Gramado");
        palavra.add("Piscadela");

        return palavra.get(num.nextInt(10));
    }

    /**
     * Funcao principal Recebe a letra do botao e faz as verificacoes
     * necessarias.
     *
     * @param letraBotao
     */
    public void jogoDaForca(String letraBotao) {

        //Evita de o jogo continuar caso acabe as tentativas.
        if (tentativas > 0) {

            //Caso esta variavel permanceca como false é descontada uma tentativa.
            acertou = false;

            String letra = letraBotao;//Recebe a letra clicada.

            //Realiza a verificacao se a letra existe na palavra.
            procuraLetra(letra);

            //Realiza a contagem de tentativas.
            tentativas = contagemTentativas(acertou, tentativas);

            jLabelTentativas.setText("Tentativas: " + tentativas);
            jLabelPalavra.setText(String.valueOf(letrasAcertadas));

            //Caso a var. letrasAcertadas seja igual a palavra o jogo acaba.
            comparaPalavras();
        }

        //Caso o num. de tentativas esgote o jogo acaba.
        verificaTentativas();
    }

    /**
     * Verifica se contem a letra na palavra.
     *
     * @param letra
     */
    public void procuraLetra(String letra) {
        for (int i = 0; i < palavra.length(); i++) {
            //Caso contenha a letra, ela e adicionada na var. letrasAcertadas.
            if (palavra.toLowerCase().charAt(i) == letra.toLowerCase().charAt(0)) {
                letrasAcertadas[i] = letra.charAt(0);
                acertou = true;
            }
        }
    }

    /**
     * Realiza a comparacao das palavras
     */
    public void comparaPalavras() {
        if (String.valueOf(letrasAcertadas).toLowerCase().equals(palavra.toLowerCase())) {
            jLabelPlacar.setText("Venceu!");
            desativarBotoes();
        }
    }

    /**
     * Realiza a verificacao de tentativas.
     */
    public void verificaTentativas() {
        if (tentativas == 0) {
            jLabelTentativas.setText("Tentativas: " + tentativas);
            jLabelPlacar.setText("Perdeu!");
            desativarBotoes();
        }
    }

    /**
     * Funcao que desativa todos os botoes.
     */
    public void desativarBotoes() {
        jButtonA.setEnabled(false);
        jButtonB.setEnabled(false);
        jButtonC.setEnabled(false);
        jButtonD.setEnabled(false);
        jButtonE.setEnabled(false);
        jButtonF.setEnabled(false);
        jButtonG.setEnabled(false);
        jButtonH.setEnabled(false);
        jButtonI.setEnabled(false);
        jButtonJ.setEnabled(false);
        jButtonK.setEnabled(false);
        jButtonL.setEnabled(false);
        jButtonM.setEnabled(false);
        jButtonN.setEnabled(false);
        jButtonO.setEnabled(false);
        jButtonP.setEnabled(false);
        jButtonQ.setEnabled(false);
        jButtonR.setEnabled(false);
        jButtonS.setEnabled(false);
        jButtonT.setEnabled(false);
        jButtonU.setEnabled(false);
        jButtonV.setEnabled(false);
        jButtonW.setEnabled(false);
        jButtonX.setEnabled(false);
        jButtonY.setEnabled(false);
        jButtonZ.setEnabled(false);
    }

    /**
     * Realiza a contagem de tentativas.
     *
     * @param acertou
     * @param tentativas
     * @return int
     */
    public static int contagemTentativas(boolean acertou, int tentativas) {
        if (!acertou) {
            tentativas--;
        }
        return tentativas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonA = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButtonK = new javax.swing.JButton();
        jButtonU = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonG = new javax.swing.JButton();
        jButtonL = new javax.swing.JButton();
        jButtonV = new javax.swing.JButton();
        jButtonQ = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonH = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jButtonW = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonI = new javax.swing.JButton();
        jButtonN = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonJ = new javax.swing.JButton();
        jButtonO = new javax.swing.JButton();
        jButtonY = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonZ = new javax.swing.JButton();
        jLabelPalavra = new javax.swing.JLabel();
        jLabelTentativas = new javax.swing.JLabel();
        jLabelPlacar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 300));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonA.setText("A");
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jButtonF.setText("F");
        jButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jButtonK.setText("K");
        jButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jButtonU.setText("U");
        jButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jButtonP.setText("P");
        jButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jButtonB.setText("B");
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jButtonG.setText("G");
        jButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonG, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jButtonL.setText("L");
        jButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jButtonV.setText("V");
        jButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jButtonQ.setText("Q");
        jButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jButtonH.setText("H");
        jButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonH, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jButtonM.setText("M");
        jButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonM, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jButtonW.setText("W");
        jButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jButtonR.setText("R");
        jButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jButtonD.setText("D");
        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jButtonI.setText("I");
        jButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonI, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jButtonN.setText("N");
        jButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jButtonX.setText("X");
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jButtonS.setText("S");
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonS, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jButtonE.setText("E");
        jButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jButtonJ.setText("J");
        jButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jButtonO.setText("O");
        jButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jButtonY.setText("Y");
        jButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonY, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jButtonT.setText("T");
        jButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jButtonZ.setText("Z");
        jButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabelPalavra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPalavra.setText("__________");
        jLabelPalavra.setToolTipText("");
        getContentPane().add(jLabelPalavra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 480, 40));

        jLabelTentativas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTentativas.setText("Tentativas: 6");
        getContentPane().add(jLabelTentativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 160, 50));

        jLabelPlacar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPlacar.setText("---");
        getContentPane().add(jLabelPlacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 50));

        setSize(new java.awt.Dimension(541, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed
        // TODO add your handling code here:
        jogoDaForca("b");
        jButtonB.setEnabled(false);
    }//GEN-LAST:event_jButtonBActionPerformed

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
        // TODO add your handling code here:
        jogoDaForca("d");
        jButtonD.setEnabled(false);
    }//GEN-LAST:event_jButtonDActionPerformed

    private void jButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJActionPerformed
        jogoDaForca("j");
        jButtonJ.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonJActionPerformed

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
        jogoDaForca("a");
        jButtonA.setEnabled(false);
    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jogoDaForca("c");
        jButtonC.setEnabled(false);
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEActionPerformed
        jogoDaForca("e");
        jButtonE.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEActionPerformed

    private void jButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFActionPerformed
        jogoDaForca("f");
        jButtonF.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFActionPerformed

    private void jButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGActionPerformed
        jogoDaForca("g");
        jButtonG.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGActionPerformed

    private void jButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHActionPerformed
        jogoDaForca("h");
        jButtonH.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHActionPerformed

    private void jButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIActionPerformed
        jogoDaForca("i");
        jButtonI.setEnabled(false);
    }//GEN-LAST:event_jButtonIActionPerformed

    private void jButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKActionPerformed
        jogoDaForca("k");
        jButtonK.setEnabled(false);
    }//GEN-LAST:event_jButtonKActionPerformed

    private void jButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLActionPerformed
        jogoDaForca("l");
        jButtonL.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLActionPerformed

    private void jButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMActionPerformed
        jogoDaForca("m");
        jButtonM.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMActionPerformed

    private void jButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNActionPerformed
        jogoDaForca("n");
        jButtonN.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNActionPerformed

    private void jButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOActionPerformed
        jogoDaForca("o");
        jButtonO.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOActionPerformed

    private void jButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPActionPerformed
        jogoDaForca("p");
        jButtonP.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPActionPerformed

    private void jButtonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQActionPerformed
        jogoDaForca("q");
        jButtonQ.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonQActionPerformed

    private void jButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRActionPerformed
        jogoDaForca("r");
        jButtonR.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRActionPerformed

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
        jogoDaForca("s");
        jButtonS.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTActionPerformed
        jogoDaForca("t");
        jButtonT.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTActionPerformed

    private void jButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUActionPerformed
        jogoDaForca("u");
        jButtonU.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUActionPerformed

    private void jButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVActionPerformed
        jogoDaForca("v");
        jButtonV.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVActionPerformed

    private void jButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWActionPerformed
        jogoDaForca("w");
        jButtonW.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonWActionPerformed

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
        jogoDaForca("x");
        jButtonX.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonXActionPerformed

    private void jButtonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYActionPerformed
        jogoDaForca("y");
        jButtonY.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonYActionPerformed

    private void jButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZActionPerformed
        jogoDaForca("z");
        jButtonZ.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonZActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoDaForcaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaForcaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaForcaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaForcaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaForcaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonI;
    private javax.swing.JButton jButtonJ;
    private javax.swing.JButton jButtonK;
    private javax.swing.JButton jButtonL;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonN;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonQ;
    private javax.swing.JButton jButtonR;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonU;
    private javax.swing.JButton jButtonV;
    private javax.swing.JButton jButtonW;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonY;
    private javax.swing.JButton jButtonZ;
    private javax.swing.JLabel jLabelPalavra;
    private javax.swing.JLabel jLabelPlacar;
    private javax.swing.JLabel jLabelTentativas;
    // End of variables declaration//GEN-END:variables
}
