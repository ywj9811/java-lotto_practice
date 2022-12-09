package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public int inputMoney() {
        try {
            String input = Console.readLine();
            int result = Integer.parseInt(input);
            if (result % 1000 != 0)
                throw new IllegalArgumentException();
            return result;
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public String inputNumber() {
        String input = Console.readLine();
        return input;
    }
}
