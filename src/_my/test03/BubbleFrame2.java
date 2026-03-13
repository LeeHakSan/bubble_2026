package _my.test03;


import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BubbleFrame2 extends JFrame {

    private JLabel backgroundMap;
    private Player2 player;

    public BubbleFrame2() {
        initData();
        setInitLayout();
        addEventListener();
        
    }

    private void initData() {
        setTitle("버블버블 게임");
        setSize(1000,640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        backgroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
        setContentPane(backgroundMap);

        player = new Player2();
    }

    private void setInitLayout() {
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        backgroundMap.add(player);
        setVisible(true);
        
    }

    private void addEventListener() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        player.left();

                    case KeyEvent.VK_RIGHT:
                        player.right();

//                    case KeyEvent.VK_UP:
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });

    }


} // end of class