package com.mycompany.snakeproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {

    //Fields
    static final int SCREEN_WIDTH = 1024;
    static final int SCREEN_HEIGHT = 768;
    static final int UNIT_SIZE = 32;    //32x32 = 1024   &&    32x24 = 768
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;   //24648
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 3;
    int score = 0;
    int appleX, appleY;
    char direction = 'R';
    boolean running = false;
    boolean victory = false;
    char appleType;
    static int level;
    Timer timer;
    Random random;

    //Window
    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();

    }
    
    
    //-----------------------------GAME CONTROL-----------------------------

    //Start Game
    public void startGame() {

        newApple(); //Apple generation
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();

    }
    
    //Game Victory
    public void gameVictory(Graphics g) {
        victory = false;
        if (isInitialized(Levels.levelUnlocked)){
            if (level == Levels.levelUnlocked){ //when playing highest level you can
                Levels.levelUnlocked = level + 1;   //you will unlock another level
            }
        }
        else {
            Levels.levelUnlocked = level + 1;   //first case (when playing 1st level 1st time), should be 2
        }
        Levels frame2 = new Levels();
        frame2.show();
        JFrame gameFrame = (JFrame) SwingUtilities.getRoot(this);
        gameFrame.dispose();
        
        /* Load the PNG image
        ImageIcon icon = new ImageIcon(getClass().getResource("/snakeVictory.png"));
        Image image = icon.getImage();

        // Draw the image
        g.drawImage(image, 0, 0, this);
*/
    }
    
    //Game Loss
    public void gameLoss(Graphics g) {
        Levels frame2 = new Levels();
        frame2.show();
        JFrame gameFrame = (JFrame) SwingUtilities.getRoot(this);
        gameFrame.dispose();
    }
    
    
    //-----------------------------DRAW-----------------------------
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }
    public void draw(Graphics g) {

        if (running) {
            //RED APPLE (if score == 5, then also CYAN APPLE)
     
            if ((((score % 5) != 0) && (score < (10*level))) || score == 0){
                appleType = 'R';
                g.setColor(Color.RED);
                g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
            }
            
            else if (((score % 5) == 0) && (score < (10*level))) {
                appleType = 'C';
                g.setColor(Color.CYAN);
                g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
            }
            
            //YELLOW APPLE
            else  if (score == 10*level) {
                appleType = 'Y';
                g.setColor(Color.YELLOW);
                g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
            }

            //SNAKE
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(new Color(0,250,0));    //head
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(0,200,50));    //tail
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
        }
        //if not running Game Over
        else if (!running && victory){
            gameVictory(g);
        }
        else {
            gameLoss(g);
        }

    }
    
    //-----------------------------APPLES COORDINATES-----------------------------

    //apple coordinates
    public void newApple() {
        if (((score % 5) == 0) && (score < (10*level))) {
            appleX = random.nextInt((int) ((SCREEN_WIDTH - 192) / UNIT_SIZE)) * UNIT_SIZE;
            appleY = random.nextInt((int) ((SCREEN_HEIGHT - 192) / UNIT_SIZE)) * UNIT_SIZE;
        }
        else {
            appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
            appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
        }    
    }
    
    
    
    //Teleport snake (after eating special apple)
    public void teleportSnakeForward() {
        for (int i = 0; i < bodyParts; i++) {
            x[i] = x[i] + random.nextInt(5) * UNIT_SIZE;
            y[i] = y[i] + random.nextInt(5) * UNIT_SIZE;
        }
    }

    //Movement (coordinates)
    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }

    }

    //-----------------------------APPLES COLLISIONS-----------------------------
    
    //If apple collision 
    public void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            if (appleType == 'R'){
                bodyParts++;
                score++;
                newApple();
            }
            
            else if (appleType == 'C'){
                teleportSnakeForward();
                score +=2;
                newApple();
            }
            
            else if (appleType == 'Y'){
                victory = true;
                running = false;
            }
        }

    }
    


    //if wall collision, stop running (reset the game)
    public void checkCollisions() {
        //checks if head collides with body
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }

        //checks if head touches borders
        if (x[0] < 0) {
            running = false;
        }

        if (x[0] > SCREEN_WIDTH - UNIT_SIZE) {
            running = false;
        }

        if (y[0] < 0) {
            running = false;
        }

        if (y[0] > SCREEN_HEIGHT - UNIT_SIZE) {
            running = false;
        }

        if (!running) {
            timer.stop();
        }

    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (running) {
            move();
            checkApple();
            checkCollisions();

        }
        repaint();
        

    }

    public class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                case KeyEvent.VK_A:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                case KeyEvent.VK_D:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                case KeyEvent.VK_W:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                case KeyEvent.VK_S:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }

        }
    }
    
    // Method to check if a variable is initialized
    private static boolean isInitialized(int variable) {
        try {
            // If no exception is thrown, the variable is initialized
            variable++;
            return true;
        } catch (Exception e) {
            // If an exception is thrown, the variable is not initialized
            return false;
        }
    }
}
