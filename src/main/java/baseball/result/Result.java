package baseball.result;

public class Result {
    private int strike;
    private int ball;

    public Result(int strike, int ball) {
        this.strike = 0;
        this.ball = 0;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
