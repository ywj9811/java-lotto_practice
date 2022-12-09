package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.Lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class makeLottoNumbers {
    private static final int MAX_NUM = 45;
    private static final int MIN_NUM = 1;
    private static final int SIZE = 6;

    public List<Integer> makeNumbers() {
        List<Integer> lottoNumbers = Randoms.pickUniqueNumbersInRange(MIN_NUM, MAX_NUM, SIZE);
        Lotto lotto = new Lotto(lottoNumbers);
        return lotto.getNumbers();
    }
}
