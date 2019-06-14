public class Game {
    private static final int FRAMES_IN_GAME = 10;
    private int[] rolls = new int[21];
    private int indexRoll = 0;

    public void roll(int pins) {

        this.rolls[indexRoll] = pins;
        indexRoll++;
    }

    public int score() {

        int score = 0;
        int firstInFrame = 0;

        for (int currentFrame = 0; currentFrame < FRAMES_IN_GAME; currentFrame++) {

            if (rolls[firstInFrame] == 10) {

                score += 10 + rolls[firstInFrame + 1] + rolls[firstInFrame + 2];

                firstInFrame += 1;

            } else if (rolls[firstInFrame] + rolls[firstInFrame + 1] == 10) {

                score += 10 + rolls[firstInFrame + 2];

                firstInFrame += 2;

            } else {

                score += rolls[firstInFrame] + rolls[firstInFrame + 1];
                firstInFrame += 2;
            }

        }
        return score;
    }
}
