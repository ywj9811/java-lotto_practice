package lotto;

import lotto.controller.GameController;
import lotto.service.GameProcess;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.gameStart();
    }
}
