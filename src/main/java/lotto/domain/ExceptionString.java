package lotto.domain;

public enum ExceptionString {
    NOTNUMBER("[ERROR] 숫자가 아닙니다"),
    NOTDIVIDE("[ERROR] 1000원 단위로 나눠지지 않습니다."),
    OVERSIZE("[ERROR] 사이즈가 6을 초과합니다.");

    private String print;
    ExceptionString(String print) {
        this.print = print;
    }

    public String getPrint() {
        return print;
    }
}
