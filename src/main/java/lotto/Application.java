package lotto;

import lotto.controller.GameController;
import lotto.service.GameProcess;

public class Application {
    public static void main(String[] args) {
        try {
            GameController gameController = new GameController();
            gameController.gameStart();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
