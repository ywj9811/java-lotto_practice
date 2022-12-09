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

    public List<List<Integer>> buyLotto(int money) {
        List<List<Integer>> myLottos = new ArrayList<>();
        for (int i = 0; i < money/1000; i++) {
            List<Integer> lottoNumber = makeNumbers();
            Collections.sort(lottoNumber);
            myLottos.add(lottoNumber);
        }
        return myLottos;
    }

    public List<Integer> makeNumbers() {
        List<Integer> lottoNumbers = Randoms.pickUniqueNumbersInRange(MIN_NUM, MAX_NUM, SIZE);
        Lotto lotto = new Lotto(lottoNumbers);
        return lotto.getNumbers();
    }
}
