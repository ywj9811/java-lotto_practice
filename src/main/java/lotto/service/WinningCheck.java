package lotto.service;

import java.util.List;

public class WinningCheck {
    private int[] winningCount = new int[5];

    public int[] winningCheck(List<List<Integer>> myLottos, List<Integer> winningNumbers, int bonusNumber) {
        for (int i = 0; i < myLottos.size(); i++) {
            int count = 0;
            for (int j = 0; j < winningNumbers.size(); j++) {
                if (myLottos.get(i).contains(winningNumbers.get(j)))
                    count++;
            }
            if (count == 6)
                count++;
            if (count == 5) {
                if (myLottos.get(i).contains(bonusNumber))
                    count++;
            }
            if (count >= 3) {
                winningCount[count - 3]++;
            }
        }
        return winningCount;
    }
    /**
     * 3개 - 0
     * 4개 - 1
     * 5개 - 2 (5개만 일치하면 보너스 체크)
     * 6개 - 3 (5개만 일치하면 보너스 체크)
     * 7개 - 4 (6개 winningNumbers 모두 일치하면 7로 인정)
     */
}
