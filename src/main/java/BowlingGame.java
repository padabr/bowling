public class BowlingGame {
    int last_roll = 0;
    int frame[][] = new int[10][2];
    int extra_roll = 0;
    
    public void roll(int pins) {
        last_roll = pins;
    }

    public int calculateScore() {
        int temp_score = 0;
        for (int f = 1; f < 9; f++){
            temp_score = temp_score + frame[f][1] + frame[f][2];
            if (frame[f][1] + frame[f][2] == 10){
                temp_score = temp_score + frame[f+1][1];
            }
            if (frame[f][1] == 10){
                temp_score = temp_score + frame[f+1][2];
                if (frame[f+1][1] == 10){
                    temp_score = temp_score + frame[f+2][1];
                }
            }
        }
        temp_score = temp_score + frame[9][1] + frame[9][2];
        if ((frame[9][1] + frame[9][2] == 10)) {
            temp_score = temp_score + frame[10][1];
        }
        if (frame[9][1] == 10){
            temp_score = temp_score + frame[10][2];
        }
        temp_score = temp_score + frame[10][1] + frame[10][2] + extra_roll;
        return temp_score;
    }

}
