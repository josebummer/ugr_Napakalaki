/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import napakalaki.BadConsequence;

/**
 *
 * @author jose
 */
public class BadConsequenceView extends javax.swing.JPanel {
    private BadConsequence badConsequenceModel;

    /**
     * Creates new form BadConsequenceView
     */
    public BadConsequenceView() {
        initComponents();
    }
    
    public void setBadConsequence (BadConsequence aBadConsequence) {
        badConsequenceModel = aBadConsequence;
        this.jTextAreabadconsequence.setText (badConsequenceModel.toString());
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreabadconsequence = new javax.swing.JTextArea();

        jLabel1.setText("BadConsequence:");

        jTextAreabadconsequence.setBackground(new java.awt.Color(254, 254, 254));
        jTextAreabadconsequence.setColumns(20);
        jTextAreabadconsequence.setLineWrap(true);
        jTextAreabadconsequence.setRows(5);
        jTextAreabadconsequence.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        jTextAreabadconsequence.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreabadconsequence);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreabadconsequence;
    // End of variables declaration//GEN-END:variables
}
