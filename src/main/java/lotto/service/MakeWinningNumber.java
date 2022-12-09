package lotto.service;

import camp.nextstep.edu.missionutils.Console;
import lotto.Lotto;

import java.util.ArrayList;
import java.util.List;

public class MakeWinningNumber {
    private List<Integer> winningNumber = new ArrayList<>();

    public List<Integer> getWinningNumber(String input) {
        String[] split = input.split("");
        for (int i = 0; i < split.length; i++) {
            winningNumber.add(Integer.parseInt(split[i]));
        }
        Lotto lotto = new Lotto(winningNumber);
        return winningNumber;
    }

    public int makeBonusNumber(String input) {
        try {
            int bonusNumber = Integer.parseInt(input);
            return bonusNumber;
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
