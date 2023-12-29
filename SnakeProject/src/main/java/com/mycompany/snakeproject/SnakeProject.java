package com.mycompany.snakeproject;
public class SnakeProject {

    public static void main(String args[]) {
        /* Create and display the intro form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
}