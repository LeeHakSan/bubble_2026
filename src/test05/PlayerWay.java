package test05;

/**
 * [enum] 플레이어의 방향 상태를 설정
 *
 * enum 타입을 사용하는 이유
 * - boolean 두 개 (isLeft, isRight) 로 방향을 관리하면
 * 둘 다 true가 되는 잘못된 상태를 가질 수 있음
 * enum은 정해진 값 중 하나만 가질 수 있어서 안전
 *
 * 사용 방법 :
 * playerWay = playerWay.LEFT {}
 * if ( playerWay == playerWay.LEFT ) {}
 *
 * 왜 사용할까?
 * 나의 프로젝트나 논리 안에서 데이터의 범위를 지정 하고 싶을 때 사용
 *
 */
public enum PlayerWay {
    LEFT, RIGHT
}
