package lotto.controller;

import lotto.service.GameProcess;

public class GameController {
    public void gameStart() {
        GameProcess gameProcess = new GameProcess();
        gameProcess.buyLotto();
        gameProcess.getWinningNumbers();
        gameProcess.getBonusNumber();
        gameProcess.winningStatistic();
    }
}
