package SNACK_GAME;

import javax.swing.*;

public class GameFrame extends JFrame {
    GamePanel panel=new GamePanel();
    GameFrame(){
    this.add(panel);
    this.setTitle("Snack");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);

    }
}
