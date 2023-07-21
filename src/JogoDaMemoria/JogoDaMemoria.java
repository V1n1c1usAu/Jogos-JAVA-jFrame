/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaMemoria;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author Vini
 */
public final class JogoDaMemoria extends javax.swing.JFrame {

    private final ArrayList<String> letras = new ArrayList<>();
    private final String figuras[][] = new String[4][4];
    private int jogadaAtual;
    private int jogador0 = 0;
    private int jogador1 = 0;
    private final ArrayList<JButton> btns = new ArrayList<>();
    private int backup = -1;
    private int linhaB;
    private int colunaB;

    /**
     * Creates new form JogoDaMemoria
     */
    public JogoDaMemoria() {
        this.jogadaAtual = 0;
        initComponents();
        inseriBotoesLista();
        instanciarValores();
        inserirValores();
    }

    /**
     * Função que instância os valores que representam as figuras.
     *
     * @param letras
     */
    private void instanciarValores() {

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
    private void inserirValores() {
        Random num = new Random();

        for (int i = 0; i < figuras.length; i++) {
            for (int j = 0; j < figuras.length; j++) {
                figuras[i][j] = letras.get(num.nextInt(letras.size()));

                letras.remove(figuras[i][j]);
            }
        }

    }

    /**
     * Atualiza a var. jogada.
     *
     * @return
     */
    private int atualizarJogada() {

        if (jogadaAtual == 0) {
            jogadaAtual = 1;
            jLabelJogadorAtual.setText("JOGADOR: 2");
        } else {
            jogadaAtual = 0;
            jLabelJogadorAtual.setText("JOGADOR: 1");
        }

        return jogadaAtual;
    }

    /**
     * Instância uma lista de botoes.
     */
    public void inseriBotoesLista() {
        btns.add(jButton0x0);
        btns.add(jButton0x1);
        btns.add(jButton0x2);
        btns.add(jButton0x3);
        btns.add(jButton1x0);
        btns.add(jButton1x1);
        btns.add(jButton1x2);
        btns.add(jButton1x3);
        btns.add(jButton2x0);
        btns.add(jButton2x1);
        btns.add(jButton2x2);
        btns.add(jButton2x3);
        btns.add(jButton3x0);
        btns.add(jButton3x1);
        btns.add(jButton3x2);
        btns.add(jButton3x3);
    }

    /**
     * Faz a contagem dos pontos da partida.
     */
    private void contarPontos() {
        if (jogadaAtual == 0) {
            jogador0++;
            jLabelPontoJ0.setText("" + jogador0);
        } else {
            jogador1++;
            jLabelPontoJ1.setText("" + jogador1);
        }
    }

    /**
     * Realiza as funcoes dos botoes.
     *
     * @param linha
     * @param coluna
     * @param indice
     */
    public void acaoDoBotao(int linha, int coluna, int indice) {

        //Realiza um backup o indice anterior.
        if (backup == -1) {
            backup = indice;
            linhaB = linha;
            colunaB = coluna;
        }

        //Coloca texto nos botoes.
        btns.get(indice).setText(figuras[linha][coluna]);
        btns.get(backup).setText(figuras[linhaB][colunaB]);

        //Caso o indice for diferente significa que são botoes diferentes.
        if (indice != backup) {

            if (figuras[linha][coluna].equals(figuras[linhaB][colunaB])) {

                btns.get(indice).setText(figuras[linha][coluna]);
                btns.get(backup).setText(figuras[linhaB][colunaB]);

                btns.get(indice).setEnabled(false);
                btns.get(backup).setEnabled(false);

                contarPontos();
                atualizarJogada();

                backup = -1;
            } else {

                btns.get(indice).setText(figuras[linha][coluna]);

                SwingUtilities.invokeLater(() -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                    btns.get(indice).setText("");
                    btns.get(backup).setText("");

                    backup = -1;
                });

            }
            atualizarJogada();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3x0 = new javax.swing.JButton();
        jButton0x0 = new javax.swing.JButton();
        jButton1x0 = new javax.swing.JButton();
        jButton2x0 = new javax.swing.JButton();
        jButton3x1 = new javax.swing.JButton();
        jButton0x1 = new javax.swing.JButton();
        jButton1x1 = new javax.swing.JButton();
        jButton2x1 = new javax.swing.JButton();
        jButton3x2 = new javax.swing.JButton();
        jButton0x2 = new javax.swing.JButton();
        jButton1x2 = new javax.swing.JButton();
        jButton2x2 = new javax.swing.JButton();
        jButton3x3 = new javax.swing.JButton();
        jButton0x3 = new javax.swing.JButton();
        jButton1x3 = new javax.swing.JButton();
        jButton2x3 = new javax.swing.JButton();
        jLabelJogador0 = new javax.swing.JLabel();
        jLabelJogador1 = new javax.swing.JLabel();
        jLabelPontoJ0 = new javax.swing.JLabel();
        jLabelPontoJ1 = new javax.swing.JLabel();
        jLabelJogadorAtual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memória");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3x0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3x0.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3x0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3x0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jButton0x0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton0x0.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton0x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0x0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0x0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jButton1x0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1x0.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1x0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1x0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jButton2x0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2x0.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2x0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2x0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jButton3x1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3x1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3x1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jButton0x1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton0x1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton0x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0x1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jButton1x1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1x1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1x1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jButton2x1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2x1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2x1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jButton3x2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3x2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3x2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jButton0x2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton0x2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton0x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0x2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jButton1x2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1x2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1x2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jButton2x2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2x2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2x2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jButton3x3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3x3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3x3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jButton0x3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton0x3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton0x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0x3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jButton1x3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1x3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1x3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jButton2x3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2x3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2x3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jLabelJogador0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelJogador0.setText("JOGADOR 1");
        getContentPane().add(jLabelJogador0, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 120, -1));

        jLabelJogador1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelJogador1.setText("JOGADOR 2");
        getContentPane().add(jLabelJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 110, -1));

        jLabelPontoJ0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPontoJ0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPontoJ0.setText("0");
        getContentPane().add(jLabelPontoJ0, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 70, 70));

        jLabelPontoJ1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPontoJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPontoJ1.setText("0");
        getContentPane().add(jLabelPontoJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 70, 70));

        jLabelJogadorAtual.setText("JOGADOR: 1");
        getContentPane().add(jLabelJogadorAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, 40));

        setSize(new java.awt.Dimension(682, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton0x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0x0ActionPerformed
        acaoDoBotao(0, 0, 0);
    }//GEN-LAST:event_jButton0x0ActionPerformed


    private void jButton0x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0x1ActionPerformed
        acaoDoBotao(0, 1, 1);

    }//GEN-LAST:event_jButton0x1ActionPerformed

    private void jButton0x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0x2ActionPerformed
        acaoDoBotao(0, 2, 2);


    }//GEN-LAST:event_jButton0x2ActionPerformed

    private void jButton0x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0x3ActionPerformed
        acaoDoBotao(0, 3, 3);
    }//GEN-LAST:event_jButton0x3ActionPerformed

    private void jButton1x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1x0ActionPerformed
        acaoDoBotao(1, 0, 4);
    }//GEN-LAST:event_jButton1x0ActionPerformed

    private void jButton1x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1x1ActionPerformed

        acaoDoBotao(1, 1, 5);


    }//GEN-LAST:event_jButton1x1ActionPerformed

    private void jButton1x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1x2ActionPerformed
        acaoDoBotao(1, 2, 6);

    }//GEN-LAST:event_jButton1x2ActionPerformed

    private void jButton1x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1x3ActionPerformed
        acaoDoBotao(1, 3, 7);
    }//GEN-LAST:event_jButton1x3ActionPerformed

    private void jButton2x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2x0ActionPerformed
        acaoDoBotao(2, 0, 8);
    }//GEN-LAST:event_jButton2x0ActionPerformed

    private void jButton2x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2x1ActionPerformed

        acaoDoBotao(2, 1, 9);

    }//GEN-LAST:event_jButton2x1ActionPerformed

    private void jButton2x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2x2ActionPerformed

        acaoDoBotao(2, 2, 10);

    }//GEN-LAST:event_jButton2x2ActionPerformed

    private void jButton2x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2x3ActionPerformed

        acaoDoBotao(2, 3, 11);

    }//GEN-LAST:event_jButton2x3ActionPerformed

    private void jButton3x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3x0ActionPerformed

        acaoDoBotao(3, 0, 12);

    }//GEN-LAST:event_jButton3x0ActionPerformed

    private void jButton3x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3x1ActionPerformed

        acaoDoBotao(3, 1, 13);


    }//GEN-LAST:event_jButton3x1ActionPerformed

    private void jButton3x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3x2ActionPerformed

        acaoDoBotao(3, 2, 14);


    }//GEN-LAST:event_jButton3x2ActionPerformed

    private void jButton3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3x3ActionPerformed

        acaoDoBotao(3, 3, 15);


    }//GEN-LAST:event_jButton3x3ActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0x0;
    private javax.swing.JButton jButton0x1;
    private javax.swing.JButton jButton0x2;
    private javax.swing.JButton jButton0x3;
    private javax.swing.JButton jButton1x0;
    private javax.swing.JButton jButton1x1;
    private javax.swing.JButton jButton1x2;
    private javax.swing.JButton jButton1x3;
    private javax.swing.JButton jButton2x0;
    private javax.swing.JButton jButton2x1;
    private javax.swing.JButton jButton2x2;
    private javax.swing.JButton jButton2x3;
    private javax.swing.JButton jButton3x0;
    private javax.swing.JButton jButton3x1;
    private javax.swing.JButton jButton3x2;
    private javax.swing.JButton jButton3x3;
    private javax.swing.JLabel jLabelJogador0;
    private javax.swing.JLabel jLabelJogador1;
    private javax.swing.JLabel jLabelJogadorAtual;
    private javax.swing.JLabel jLabelPontoJ0;
    private javax.swing.JLabel jLabelPontoJ1;
    // End of variables declaration//GEN-END:variables

}
