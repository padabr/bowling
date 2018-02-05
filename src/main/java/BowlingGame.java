public class BowlingGame {
    int last_roll = 0;
    int frame[][] = new int[10][2];
    int extra_roll = 0;

   
    public void roll(int pins) {
        last_roll = pins;
    }

    public int calculateScore() {
        int temp_score = 0;
        for (int f = 0; f < 8; f++){
            temp_score = temp_score + frame[f][0] + frame[f][1];
            if (frame[f][0] + frame[f][1] == 10){
                temp_score = temp_score + frame[f+1][0];
            }
            if (frame[f][0] == 10){
                temp_score = temp_score + frame[f+1][1];
                if (frame[f+1][0] == 10){
                    temp_score = temp_score + frame[f+2][0];
                }
            }
        }
        temp_score = temp_score + frame[8][0] + frame[8][1];
        if ((frame[8][0] + frame[8][1] == 10)) {
            temp_score = temp_score + frame[9][0];
        }
        if (frame[8][0] == 10){
            temp_score = temp_score + frame[9][1];
        }
        temp_score = temp_score + frame[9][0] + frame[9][1] + extra_roll;
        return temp_score;
    }

}
