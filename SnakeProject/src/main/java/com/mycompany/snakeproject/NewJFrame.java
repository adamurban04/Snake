package com.mycompany.snakeproject;

//THIS IS THE GAME-INTRO-SCREEN created by using JFrame form (Design)
//The picture was created with Pixlr.com (AI) and it was edited with Photopea.com
//The button runs the game


public class NewJFrame extends javax.swing.JFrame {

    // Creates new form NewJFrame
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        button.setFont(new java.awt.Font("K2D", 1, 13)); // NOI18N
        button.setText("Play SNAKE");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button);
        button.setBounds(450, 410, 120, 28);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeBackground.png"))); // NOI18N
        background.setText("jLabel2");
        background.setMaximumSize(new java.awt.Dimension(1024, 768));
        background.setMinimumSize(new java.awt.Dimension(1024, 768));
        background.setPreferredSize(new java.awt.Dimension(1024, 768));
        background.setSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(background);
        background.setBounds(0, 0, 1024, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        new GameFrame();
    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton button;
    // End of variables declaration//GEN-END:variables
}
