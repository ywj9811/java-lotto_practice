package lotto.view;

import java.util.List;

public class OutputView {
    private static final String BUYMONEY = "구입금액을 입력해 주세요.";
    private static final String HOWMANY = "개를 구매했습니다.";
    private static final String WINNINGNUMBER = "당첨 번호를 입력해 주세요.";
    private static final String BONUSNUMBER = "보너스 번호를 입력해 주세요.";

    public void buyMoney() {
        System.out.println(BUYMONEY);
    }

    public void howMany(int money) {
        System.out.println(money/1000 + HOWMANY);
    }

    public void myLottos(List<List<Integer>> mine) {
        for (int i = 0; i < mine.size(); i++) {
            System.out.println(mine.get(i));
        }
    }

    public void winningNumber() {
        System.out.println(WINNINGNUMBER);
    }

    public void bonusNumber() {
        System.out.println(BONUSNUMBER);
    }
}
