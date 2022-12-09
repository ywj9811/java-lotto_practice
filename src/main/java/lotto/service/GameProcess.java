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
    private List<Integer> winningNumber;
    private int bonusNumber;
    private List<List<Integer>> buyLottos;
    private int buyMoney;

    public void buyLotto() {
        outputView.buyMoney();
        buyMoney = inputView.inputMoney();
        outputView.howMany(buyMoney);
        buyLottos = makeBuyLottoNumbers.buyLotto(buyMoney);
        outputView.myLottos(buyLottos);
    }
    public void winningStatistic() {
        winningCount = winningCheck.winningCheck(buyLottos, winningNumber, bonusNumber);
        outputView.winingStatistic(winningCount);
        int getMoney = winningCheck.getMoney(winningCount);
        double returnOfMoney = winningCheck.returnOfMoney(buyMoney, getMoney);
        outputView.getReturn(returnOfMoney);
    }
    public void getWinningNumbers() {
        outputView.winningNumber();
        winningNumber = makeWinningNumber.getWinningNumber(inputView.inputNumber());
    }

    public void getBonusNumber() {
        outputView.bonusNumber();
        bonusNumber = makeWinningNumber.makeBonusNumber(inputView.inputNumber());
    }
}
