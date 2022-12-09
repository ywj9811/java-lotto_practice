package lotto.view;

import lotto.domain.WinningMoney;

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

    public void winingStatistic(int[] winningCheck) {
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println(WinningMoney.FIFTH.getPrint() + winningCheck[0] + "개");
        System.out.println(WinningMoney.FOURTH.getPrint() + winningCheck[1] + "개");
        System.out.println(WinningMoney.THIRD.getPrint() + winningCheck[2] + "개");
        System.out.println(WinningMoney.SECOND.getPrint() + winningCheck[3] + "개");
        System.out.println(WinningMoney.FIRST.getPrint() + winningCheck[4] + "개");
    }

    public void getReturn(double value) {
        System.out.println("총 수익률은 " + value + "%입니다.");
    }

    public void winningNumber() {
        System.out.println(WINNINGNUMBER);
    }

    public void bonusNumber() {
        System.out.println(BONUSNUMBER);
    }
}
