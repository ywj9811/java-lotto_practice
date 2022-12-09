package lotto.service;

import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;

public class GameProcess {
    private MakeWinningNumber makeWinningNumber = new MakeWinningNumber();
    private MakeBuyLottoNumbers makeBuyLottoNumbers = new MakeBuyLottoNumbers();
    private WinningCheck winningCheck = new WinningCheck();
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private int[] winningCount;

    public void gameStart() {
        outputView.buyMoney();
        int buyMoney = inputView.inputMoney();
        outputView.howMany(buyMoney);
        List<List<Integer>> buyLottos = makeBuyLottoNumbers.buyLotto(buyMoney);
        outputView.myLottos(buyLottos);
        outputView.winningNumber();
        List<Integer> winningNumber = makeWinningNumber.getWinningNumber(inputView.inputNumber());
        outputView.bonusNumber();
        int bonusNumber = makeWinningNumber.makeBonusNumber(inputView.inputNumber());
        winningCount = winningCheck.winningCheck(buyLottos, winningNumber, bonusNumber);
        outputView.winingStatistic(winningCount);
        int getMoney = winningCheck.getMoney(winningCount);
        double returnOfMoney = winningCheck.returnOfMoney(buyMoney, getMoney);
        outputView.getReturn(returnOfMoney);
    }
}
