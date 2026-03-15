package flappyBird;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
public class Bird extends JLabel implements MoveBird {

    // 상수
    private static final int flyHeight = 70;
    private static final int flyingSpeed = 3;
    private static final int fallingSpeed = 2;

    // 좌표
    private int x;
    private int y;

    // 움직임 up down 여부 확인
    private boolean flying = false;
    private boolean falling = true;

    // 충돌 판정

    private ImageIcon defaultBird;
    private ImageIcon flyingBird;
    private ImageIcon fallingBird;

    public Bird() {
        initData();
        setInitLayout();

    }

    private void initData() {
        defaultBird = new ImageIcon("img/FlappyBirdDefault.png");
    }

    private void setInitLayout() {
        // 420 , 750
        // 1/3 지점 정도에서 시작해야 파이프를 볼 수 있음
        x = 120;
        y = 240;
        setSize(50, 50);
        setIcon(defaultBird);
        setLocation(x, y);
    }

    @Override
    public void flying() {
        flying = true;
        setIcon(flyingBird);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < flyHeight; i++) {
                    y = y - flyingSpeed;
                    setLocation(x, y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                flying = false;
                falling();
            }
        }).start();

    }

    @Override
    public void falling() {
        if (falling) {
            return;
        }
        falling = true;
        setIcon(flyingBird);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    y = y + fallingSpeed;
                    setLocation(x, y);
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

    }
}
