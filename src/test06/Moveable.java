package test06;

public interface Moveable {
    void left();

    void right();

    void up();
    // Adapter 클래스가 너무 많이 생겨 default 문법을 만들었다
    // 인터페이스에서 사용
    // 즉 default 키워드를 사용하면 인터페이스 안에 일반 메서드 호출 가능
    default void down() {
    }
}
