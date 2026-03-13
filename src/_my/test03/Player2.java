package _my.test03;


import javax.swing.*;

public class Player2 extends JLabel implements Moveable2 {

    private int x;
    private int y;

    private ImageIcon playerL;
    private ImageIcon playerR;

    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;
    private final int JUMP_HEIGHT = 130;

    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    private boolean leftWallCrash;
    private boolean rightWallCrash;

    // getter
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isLeftWallCrash() {
        return leftWallCrash;
    }

    public boolean isRightWallCrash() {
        return rightWallCrash;
    }
    // ~ getter

    // setter
    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setLeftWallCrash(boolean leftWallCrash) {
        this.leftWallCrash = leftWallCrash;
    }

    public void setRightWallCrash(boolean rightWallCrash) {
        this.rightWallCrash = rightWallCrash;
    }
    // ~setter

    // 생성자 / 메서드
    public Player2() {
        initData();
        setInitLayout();
    }

    private void initData() {
        playerL = new ImageIcon("img/playerL.png");
        playerR = new ImageIcon("img/playerR.png");
    }

    private void setInitLayout() {
        // 캐릭터 위치 초기 설정
        x = 55;
        y = 535;
        setSize(50, 50);
        setIcon(playerR); // 초기 방향 설정
        setLocation(x, y);
    }


    @Override
    public void left() {
        if (left) {
            return;
        }
        left = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left) {
                    x = x - SPEED;
                    setLocation(x, y);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
    }


    @Override
    public void right() {
        if (right) {
            return;
        }
        right = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right) {
                    x = x + SPEED;
                    setLocation(x, y);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
    }

    @Override
    public void up() {
        if (up) {
            return;
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (up) {

                }
            }
        });

    }

    @Override
    public void down() {

    }
    // ~ 생성자 / 메서드
}
