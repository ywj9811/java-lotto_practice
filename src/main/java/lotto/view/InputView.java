package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.domain.ExceptionString;

public class InputView {
    public int inputMoney() {
        try {
            String input = Console.readLine();
            int result = Integer.parseInt(input);
            if (result % 1000 != 0)
                throw new IllegalArgumentException(ExceptionString.NOTDIVIDE.getPrint());
            return result;
        } catch (Exception e) {
            throw new IllegalArgumentException(ExceptionString.NOTNUMBER.getPrint());
        }
    }

    public String inputWinningNumbers() {
        String input = Console.readLine();
        return input;
    }

    public String inputNumber() {
        String input = Console.readLine();
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            throw new IllegalArgumentException(ExceptionString.NOTNUMBER.getPrint());
        }
        return input;
    }
}
