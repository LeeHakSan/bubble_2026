package flappyBird;

import javax.swing.*;
import java.awt.*;

public class FlappyBirdFrame extends JFrame {

    private JLabel backgroundSky;
    private JLabel background;
    private Bird bird;

    public FlappyBirdFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        backgroundSky = new JLabel(new ImageIcon("img/FlappyBirdBackground.png"));

        // 하늘 배경 이미지의 사이즈를 가져와서 변수에 저장
        int backgroundSkyWidth = backgroundSky.getIcon().getIconWidth();
        int backgroundSkyHeight = backgroundSky.getIcon().getIconHeight();

        setTitle("Flappy Bird");
        // 저장한 변수에 담긴 이미지의 사이즈를 사용해서 화면 크기 설정
        setSize(backgroundSkyWidth, backgroundSkyHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        bird = new Bird();

        setContentPane(backgroundSky);

    }

    private void setInitLayout() {
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        background = new JLabel(new ImageIcon("img/FlappyBirdGround.png"));

        int backgroundWidth = background.getIcon().getIconWidth();
        int backgroundHeight = background.getIcon().getIconHeight();
        background.setSize(backgroundWidth,backgroundHeight);
        background.setLocation(0,570);

        backgroundSky.add(background);
        backgroundSky.add(bird);

        setVisible(true);
    }

    private void addEventListener() {
    }


}
