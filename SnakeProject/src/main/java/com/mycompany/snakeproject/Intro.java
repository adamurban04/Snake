package com.mycompany.snakeproject;

//THIS IS THE GAME-INTRO-SCREEN created by using JFrame form (Design)
//The picture was created with Pixlr.com (AI) and it was edited with Photopea.com
//The button runs the game


public class Intro extends javax.swing.JFrame {

    // Creates new form NewJFrame
    public Intro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPlaySnake = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        buttonPlaySnake.setFont(new java.awt.Font("K2D", 1, 13)); // NOI18N
        buttonPlaySnake.setText("Play SNAKE");
        buttonPlaySnake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlaySnakeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlaySnake);
        buttonPlaySnake.setBounds(450, 410, 120, 28);

        jLabel1.setText("ADAM URBAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(920, 740, 90, 17);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeBackground.png"))); // NOI18N
        background1.setText("jLabel2");
        background1.setMaximumSize(new java.awt.Dimension(1024, 768));
        background1.setMinimumSize(new java.awt.Dimension(1024, 768));
        background1.setPreferredSize(new java.awt.Dimension(1024, 768));
        background1.setSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(background1);
        background1.setBounds(0, 0, 1024, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void buttonPlaySnakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlaySnakeActionPerformed
        Levels frame2 = new Levels();
        frame2.show();
        dispose();  //closes the window
    }//GEN-LAST:event_buttonPlaySnakeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background1;
    private javax.swing.JButton buttonPlaySnake;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
