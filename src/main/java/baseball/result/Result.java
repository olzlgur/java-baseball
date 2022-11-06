package baseball.result;

public class Result {
    private int strike;
    private int ball;

    public Result(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    private void countStrike(String randomNumber, String userNumber) {
        int count = 0;
        for (int index = 0; index < randomNumber.length(); index++) {
            if (randomNumber.charAt(index) == userNumber.charAt(index)) {
                count++;
            }
        }
        strike = count;
    }

    public void countBall(String randomNumber, String userNumber) {
        int count = 0;
        for (char number : userNumber.toCharArray()) {
            if (randomNumber.contains(String.valueOf(number))) {
                count++;
            }
        }
        ball = count - strike;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isCorrect() {
        return strike == 3;
    }

    public boolean isNothing() {
        if (strike == 0 && ball == 0) {
            return true;
        }
        return false;
    }
}
