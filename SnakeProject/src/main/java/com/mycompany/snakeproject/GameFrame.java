package com.mycompany.snakeproject;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
    GameFrame(){
        this.add(new GamePanel());  //game code
        this.setTitle("Snake"); //window title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);   //display window in the middle of the screen
    }
}
