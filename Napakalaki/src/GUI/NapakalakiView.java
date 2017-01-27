/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import napakalaki.*;

/**
 *
 * @author jose
 */
public class NapakalakiView extends javax.swing.JFrame {
    private Napakalaki napakalakiModel;

    /**
     * Creates new form NapakalakiView
     */
    public NapakalakiView() {
        initComponents();
    }
    
    public void setNapakalaki(Napakalaki aNapakalaki){
        napakalakiModel = aNapakalaki;
        this.playerView1.setNapakalaki(napakalakiModel, this);
        this.monsterView1.setVisible(false);
        this.playerView1.setPlayer(napakalakiModel.getCurrentPlayer());
        this.monsterView1.setMonster(napakalakiModel.getCurrentMonster());
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerView1 = new GUI.PlayerView();
        monsterView1 = new GUI.MonsterView();
        jLabelres = new javax.swing.JLabel();
        jButtonmostrar = new javax.swing.JButton();
        jButtoncombat = new javax.swing.JButton();
        jButtonnext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArearesultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        playerView1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        monsterView1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelres.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabelres.setText("Resultados:");

        jButtonmostrar.setFont(new java.awt.Font("Noto Sans", 2, 10)); // NOI18N
        jButtonmostrar.setText("Mostrar al Monstruo");
        jButtonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmostrarActionPerformed(evt);
            }
        });

        jButtoncombat.setFont(new java.awt.Font("Noto Sans", 2, 10)); // NOI18N
        jButtoncombat.setText("Combatir");
        jButtoncombat.setEnabled(false);
        jButtoncombat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncombatActionPerformed(evt);
            }
        });

        jButtonnext.setFont(new java.awt.Font("Noto Sans", 2, 10)); // NOI18N
        jButtonnext.setText("Siguiente Turno");
        jButtonnext.setEnabled(false);
        jButtonnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnextActionPerformed(evt);
            }
        });

        jTextArearesultado.setEditable(false);
        jTextArearesultado.setColumns(20);
        jTextArearesultado.setLineWrap(true);
        jTextArearesultado.setRows(5);
        jScrollPane1.setViewportView(jTextArearesultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monsterView1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonmostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtoncombat)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonnext)
                                .addGap(32, 32, 32)
                                .addComponent(jLabelres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(playerView1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monsterView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelres)
                            .addComponent(jButtonmostrar)
                            .addComponent(jButtoncombat)
                            .addComponent(jButtonnext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmostrarActionPerformed
        // TODO add your handling code here:
        this.monsterView1.setVisible(true);
        if( !this.jButtonnext.isEnabled() ){
            this.jButtoncombat.setEnabled(true);
            this.playerView1.botonesCombat(false);
        }
    }//GEN-LAST:event_jButtonmostrarActionPerformed

    private void jButtoncombatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncombatActionPerformed
        // TODO add your handling code here:
        CombatResult combatResult = napakalakiModel.developCombat();
        switch (combatResult) {
            case WINGAME : 
              this.jTextArearesultado.setText("¡¡¡ H A S   G A N A D O   L A   P A R T I D A !!!");
              System.exit(0);
              break;
            case WIN :
              this.jTextArearesultado.setText("Ganaste el combate");
              break;
            case LOSE :
              this.jTextArearesultado.setText("Has perdido el combate, te toca cumplir el mal rollo");
              break;
            case LOSEANDCONVERT :
              this.jTextArearesultado.setText("Has perdido el combate, y te has convertido en sectario.\n No obstante, tienes que cumplir el mal rollo");
              break;
          }
        this.jButtoncombat.setEnabled(false);
        this.playerView1.botonesCombat(true);
        this.jButtonnext.setEnabled(true);
        setNapakalaki(napakalakiModel);
    }//GEN-LAST:event_jButtoncombatActionPerformed

    private void jButtonnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnextActionPerformed
        // TODO add your handling code here:
        if(napakalakiModel.getCurrentPlayer() == null){
            this.jButtonnext.setEnabled(false);
            this.jButtoncombat.setEnabled(false);
            napakalakiModel.nextTurn();
            this.jTextArearesultado.setText("");
            setNapakalaki(napakalakiModel); 
            this.playerView1.botonesNext();
        }
        else{
            if( napakalakiModel.getCurrentPlayer().validState() ){
                this.jButtonnext.setEnabled(false);
                this.jButtoncombat.setEnabled(false);
                napakalakiModel.nextTurn();
                this.jTextArearesultado.setText("");
                setNapakalaki(napakalakiModel);
                this.playerView1.botonesNext();
            }
            else{
                this.jTextArearesultado.setText("No cumples las condiciones para pasar de turno.");
            }
        } 
    }//GEN-LAST:event_jButtonnextActionPerformed

    
    public void showView() {
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncombat;
    private javax.swing.JButton jButtonmostrar;
    private javax.swing.JButton jButtonnext;
    private javax.swing.JLabel jLabelres;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArearesultado;
    private GUI.MonsterView monsterView1;
    private GUI.PlayerView playerView1;
    // End of variables declaration//GEN-END:variables
}
