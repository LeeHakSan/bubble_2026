package thread;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BankAccount {

    private int money = 100_000;

    // 기능 -> 입금, 출금

    // 입금 기능
    // synchronized --> 동기화
    public synchronized void  saveMoney(int money) {
        // 현재 금액을 지역 변수에 저장
        int currentMoney = getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 10만원 + 3만원 = 13만원
        setMoney(currentMoney + money);
        System.out.println("입금후 현재 계좌 잔액 : " + getMoney());
    }

    // 출금 기능
    public int withDraw(int money) {
        System.out.println("aaaaaaaaa");
        // 블럭을 사용한 동기화 처리
        synchronized (this) {
            int currentMoney = getMoney();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 만약 10만원에서 1만원 출금하면 9만원이 남아야 한다.
            // 방어적 코드 생략
            setMoney(currentMoney - money);
            System.out.println("출금 후 현재 계좌 잔액 : " + getMoney());
            return money;
        }
    }


}



