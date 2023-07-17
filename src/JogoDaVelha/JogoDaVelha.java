/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaVelha;

/**
 *
 * @author Vini
 */
public class JogoDaVelha extends javax.swing.JFrame {

    private final int jogoDaVelha[][] = new int[3][3];
    private int jogadaAtual;

    /**
     * Creates new form JogoDaVelhaaaaaaa
     */
    public JogoDaVelha() {
        initComponents();
        desabilitaBotoes();
    }

    /**
     * Atualiza a var. jogada.
     *
     * @return
     */
    private int atualizarJogada() {

        if (jogadaAtual == 0) {
            jogadaAtual = 1;
        } else {
            jogadaAtual = 0;
        }

        return jogadaAtual;
    }

    /**
     * Habilita os botoes do jogo.
     */
    private void habilitaBotoes() {
        jButton00.setEnabled(true);
        jButton01.setEnabled(true);
        jButton02.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
    }

    /**
     * Desabilita os botoes do jogo.
     */
    private void desabilitaBotoes() {
        jButton00.setEnabled(false);
        jButton01.setEnabled(false);
        jButton02.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        jButton22.setEnabled(false);
        jButtonO.setEnabled(false);
        jButtonX.setEnabled(false);

        jButton00.setText("");
        jButton01.setText("");
        jButton02.setText("");
        jButton10.setText("");
        jButton11.setText("");
        jButton12.setText("");
        jButton20.setText("");
        jButton21.setText("");
        jButton22.setText("");

    }

    /**
     * Reseta as posicoes do jogo da velha
     *
     * @param jogoDaVelha
     */
    private void zerarJogo(int[][] jogoDaVelha) {

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                jogoDaVelha[l][c] = -1;
            }
        }
        desabilitaBotoes();

    }

    /**
     * Verifica as verticais
     */
    private void verificarVerticais() {

        if (jogoDaVelha[0][0] != -1) {
            if (jogoDaVelha[0][0] == jogoDaVelha[1][0] && jogoDaVelha[1][0] == jogoDaVelha[2][0]) {
                int jogador = jogoDaVelha[0][0];
                vencedor();
            }
        }

        if (jogoDaVelha[1][1] != -1) {
            if (jogoDaVelha[0][1] == jogoDaVelha[1][1] && jogoDaVelha[1][1] == jogoDaVelha[2][1]) {
                int jogador = jogoDaVelha[1][1];
                vencedor();
            }
        }
        if (jogoDaVelha[1][2] != -1) {
            if (jogoDaVelha[0][2] == jogoDaVelha[1][2] && jogoDaVelha[1][2] == jogoDaVelha[2][2]) {
                int jogador = jogoDaVelha[0][2];
                vencedor();
            }
        }
    }

    /**
     * Verifica as horizontais
     */
    private void verificarHorizontais() {
        if (jogoDaVelha[0][0] != -1) {
            if (jogoDaVelha[0][0] == jogoDaVelha[0][1] && jogoDaVelha[0][1] == jogoDaVelha[0][2]) {
                int jogador = jogoDaVelha[0][0];
                vencedor();
            }
        }

        if (jogoDaVelha[1][1] != -1) {
            if (jogoDaVelha[1][0] == jogoDaVelha[1][1] && jogoDaVelha[1][1] == jogoDaVelha[1][2]) {
                int jogador = jogoDaVelha[1][1];
                vencedor();
            }
        }

        if (jogoDaVelha[2][1] != -1) {

            if (jogoDaVelha[2][0] == jogoDaVelha[2][1] && jogoDaVelha[2][1] == jogoDaVelha[2][2]) {
                int jogador = jogoDaVelha[2][0];
                vencedor();
            }
        }
    }

    /**
     * Verifica as diagonais
     */
    private void verificarDiagonais() {
        if (jogoDaVelha[1][1] != -1) {

            if (jogoDaVelha[0][0] == jogoDaVelha[1][1] && jogoDaVelha[1][1] == jogoDaVelha[2][2]) {
                int jogador = jogoDaVelha[0][0];
                vencedor();
            }
            if (jogoDaVelha[0][2] == jogoDaVelha[1][1] && jogoDaVelha[1][1] == jogoDaVelha[2][0]) {
                int jogador = jogoDaVelha[1][1];
                vencedor();
            }
        }
    }

    /**
     * Realiza a verificacao e adiciona o valor no indice correspondente
     *
     * @param jogadaAtual
     * @param jogoDaVelha
     * @param l
     * @param c
     * @return
     */
    private boolean adicionaJogadas(int jogadaAtual, int[][] jogoDaVelha, int l, int c) {

        if (jogoDaVelha[l][c] == -1) {

            jogoDaVelha[l][c] = atualizarJogada();

            verificarDiagonais();
            verificarHorizontais();
            verificarVerticais();

            return true;
        } else {
            return false;
        }

    }

    /**
     * Retorna o jogador vencedor
     */
    private void vencedor() {
        if (jogadaAtual == 1) {
            desabilitaBotoes();
            jLabelVencedor.setText("Vencedor: X");
        } else {
            desabilitaBotoes();
            jLabelVencedor.setText("Vencedor: O");
        }
    }

    /**
     * Define e retorna a String da jogada atual.
     * @param jogadaAtual
     * @return 
     */
    private String jogada(int jogadaAtual) {
        if (jogadaAtual == 1) {
            return "X";
        } else {
            return "O";
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

        jButton10 = new javax.swing.JButton();
        jButton00 = new javax.swing.JButton();
        jButton01 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        jButtonO = new javax.swing.JButton();
        jLabelVencedor = new javax.swing.JLabel();
        jButtonZerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo Da Velha");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jButton00.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton00.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton00ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton00, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButton01.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton01.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton01ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton01, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jButton02.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton02.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton02ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton02, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton20.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton22.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton21.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jButtonX.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonX.setText("X");
        jButtonX.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jButtonO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonO.setText("O");
        jButtonO.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonO, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jLabelVencedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelVencedor.setText("Vencedor: ");
        getContentPane().add(jLabelVencedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 180, 70));

        jButtonZerar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonZerar.setText("COMEÇAR");
        jButtonZerar.setActionCommand("");
        jButtonZerar.setPreferredSize(new java.awt.Dimension(110, 25));
        jButtonZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZerarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonZerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 130, -1));

        setBounds(0, 0, 611, 401);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton00ActionPerformed
     

        if (adicionaJogadas(jogadaAtual, jogoDaVelha, 0, 0)) {
            jButton00.setText(jogada(jogadaAtual));

        }
    }//GEN-LAST:event_jButton00ActionPerformed

    private void jButtonZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZerarActionPerformed
        zerarJogo(jogoDaVelha);
        jButtonO.setEnabled(true);
        jButtonX.setEnabled(true);
    }//GEN-LAST:event_jButtonZerarActionPerformed

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
        // TODO add your handling code here:
        jogadaAtual = 1;
        atualizarJogada();
        jButtonX.setEnabled(false);
        jButtonO.setEnabled(false);
        habilitaBotoes();
    }//GEN-LAST:event_jButtonXActionPerformed

    private void jButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton01ActionPerformed
        if (adicionaJogadas(jogadaAtual, jogoDaVelha, 0, 1)) {
            jButton01.setText(jogada(jogadaAtual));

        }
        ;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton01ActionPerformed

    private void jButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton02ActionPerformed

        if (adicionaJogadas(jogadaAtual, jogoDaVelha, 0, 2)) {
            jButton02.setText(jogada(jogadaAtual));

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton02ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        if (adicionaJogadas(jogadaAtual, jogoDaVelha, 1, 0)) {
            jButton10.setText(jogada(jogadaAtual));

        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        if (adicionaJogadas(jogadaAtual, jogoDaVelha, 1, 1)) {
            jButton11.setText(jogada(jogadaAtual));

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        if (adicionaJogadas(jogadaAtual, jogoDaVelha, 1, 2)) {
            jButton12.setText(jogada(jogadaAtual));

        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        if (adicionaJogadas(jogadaAtual, jogoDaVelha, 2, 0)) {
            jButton20.setText(jogada(jogadaAtual));

        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        if (adicionaJogadas(jogadaAtual, jogoDaVelha, 2, 1)) {
            jButton21.setText(jogada(jogadaAtual));

        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed

        if (adicionaJogadas(jogadaAtual, jogoDaVelha, 2, 2)) {
            jButton22.setText(jogada(jogadaAtual));

        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOActionPerformed

        jogadaAtual = 0;
        atualizarJogada();
        jButtonX.setEnabled(false);
        jButtonO.setEnabled(false);
        habilitaBotoes();
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonOActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton00;
    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonZerar;
    private javax.swing.JLabel jLabelVencedor;
    // End of variables declaration//GEN-END:variables
}
