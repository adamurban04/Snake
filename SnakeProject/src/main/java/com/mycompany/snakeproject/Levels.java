package com.mycompany.snakeproject;


public class Levels extends javax.swing.JFrame {

    
    public Levels() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonLevel1 = new javax.swing.JButton();
        ButtonLevel2 = new javax.swing.JButton();
        ButtonLevel3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ExplanatoryText = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(1024, 768, 0, 0));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        ButtonLevel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/level1.png"))); // NOI18N
        ButtonLevel1.setText("LEVEL 1");
        ButtonLevel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ButtonLevel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLevel1ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLevel1);
        ButtonLevel1.setBounds(140, 280, 240, 180);

        ButtonLevel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/level2"+ levelUnlocked + ".png")));
        ButtonLevel2.setText("LEVEL 2");
        ButtonLevel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ButtonLevel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLevel2ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLevel2);
        ButtonLevel2.setBounds(412, 280, 240, 180);

        ButtonLevel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/level3" + levelUnlocked + ".png")));
        ButtonLevel3.setText("LEVEL 3");
        ButtonLevel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ButtonLevel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLevel3ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLevel3);
        ButtonLevel3.setBounds(680, 280, 240, 180);

        jScrollPane1.setFocusTraversalKeysEnabled(false);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setRequestFocusEnabled(false);
        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        ExplanatoryText.setColumns(20);
        ExplanatoryText.setFont(new java.awt.Font("K2D", 1, 13)); // NOI18N
        ExplanatoryText.setRows(5);
        ExplanatoryText.setText(" Heyy, these are the rules:\n \n - Do NOT crash with the snake\n - Eat apples (watch out, blue ones may teleport you!)\n \n RED APPLES [+1]\n BLUE APPLES [+2]\n GOLDEN APPLE [VICTORY]\n");
        ExplanatoryText.setAutoscrolls(false);
        ExplanatoryText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ExplanatoryText.setFocusTraversalKeysEnabled(false);
        ExplanatoryText.setFocusable(false);
        ExplanatoryText.setRequestFocusEnabled(false);
        ExplanatoryText.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(ExplanatoryText);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 60, 500, 170);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("K2D", 1, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 51));
        jTextField1.setText("REQUIRED SCORE: 30");
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField1.setFocusTraversalKeysEnabled(false);
        jTextField1.setFocusable(false);
        jTextField1.setRequestFocusEnabled(false);
        jTextField1.setVerifyInputWhenFocusTarget(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(680, 480, 240, 20);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("K2D", 1, 13)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 255, 51));
        jTextField2.setText("REQUIRED SCORE: 10");
        jTextField2.setAutoscrolls(false);
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField2.setFocusTraversalKeysEnabled(false);
        jTextField2.setFocusable(false);
        jTextField2.setRequestFocusEnabled(false);
        jTextField2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 480, 240, 20);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("K2D", 1, 13)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 153, 0));
        jTextField3.setText("REQUIRED SCORE: 20");
        jTextField3.setAutoscrolls(false);
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField3.setFocusTraversalKeysEnabled(false);
        jTextField3.setFocusable(false);
        jTextField3.setRequestFocusEnabled(false);
        jTextField3.setVerifyInputWhenFocusTarget(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(410, 480, 240, 20);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("K2D", 1, 13)); // NOI18N
        jTextField4.setText("  CHOOSE THE DIFFICULTY:");
        jTextField4.setAutoscrolls(false);
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField4.setFocusTraversalKeysEnabled(false);
        jTextField4.setFocusable(false);
        jTextField4.setRequestFocusEnabled(false);
        jTextField4.setVerifyInputWhenFocusTarget(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(110, 240, 200, 27);

        jLabel1.setText("ADAM URBAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(920, 740, 90, 17);

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeLevels.png"))); // NOI18N
        getContentPane().add(background2);
        background2.setBounds(0, 0, 1024, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLevel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLevel2ActionPerformed
        if (levelUnlocked >= 2) {
            GamePanel.level = 2;
            dispose();
            new GameFrame();
        }   
    }//GEN-LAST:event_ButtonLevel2ActionPerformed

    private void ButtonLevel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLevel3ActionPerformed
        if (levelUnlocked >= 3) {
            GamePanel.level = 3;
            dispose();
            new GameFrame();
        }   
    }//GEN-LAST:event_ButtonLevel3ActionPerformed

    private void ButtonLevel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLevel1ActionPerformed
        if (levelUnlocked >= 1) {
            GamePanel.level = 1;
            dispose();
            new GameFrame();
        }    
    }//GEN-LAST:event_ButtonLevel1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLevel1;
    private javax.swing.JButton ButtonLevel2;
    private javax.swing.JButton ButtonLevel3;
    private javax.swing.JTextArea ExplanatoryText;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    public static int levelUnlocked = 1;

}
