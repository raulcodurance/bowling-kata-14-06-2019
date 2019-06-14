public class Game {
    private int[] rolls = new int[21];
    private int indexRoll =0;

    public void roll(int pins) {

        this.rolls[indexRoll] = pins;
        indexRoll++;
    }

    public int score() {

        int score =0;
        int firstInFrame =0;

        for(int i=0;i<10;i++){ // frames

            score += rolls[firstInFrame] + rolls[firstInFrame+1];
            firstInFrame +=2;
        }
        return score;
    }
}
