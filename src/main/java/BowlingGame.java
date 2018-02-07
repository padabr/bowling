public class BowlingGame {

    private int last_roll = 0;
    private int frame[][] = new int[10][2];
    private int f, f_roll;
    private int extra_roll = 0;
    private boolean gameover = false;
    private boolean bExtraRoll = false;

    private void actualizeFrame(){
        if (gameover == false) {
            if (bExtraRoll == true){
                extra_roll = last_roll; // <--- if extra roll
                gameover = true;
            }else{
                frame[f][f_roll] = last_roll; // <---- here to actualize score table <---
                if (f == 9){                //last frame - beginning
                    if (f_roll == 0){           // the first roll in the last frame
                        f_roll = 1;
                    }else{                     // the second roll in the last frame            
                        if ((frame[f][0] == 10) || (frame[f][0] + frame[f][1] == 10)){ // l_f and the second strike
                            bExtraRoll = true;
                        }else{
                            gameover = true;
                        }
                    }      
                }else{                      // betw frame - beginning
                    if (f_roll == 0){       // the first roll in frame
                        if (frame[f][0] == 10){ // betw frame - strike
                            f = f + 1;
                        }else{             // the second roll in frame
                            f_roll = 1;
                        }
                    }else{
                        f = f + 1;
                        f_roll = 0;
                    }
                }
            }      // not an extra roll
        }    // not game over
    }
    
    public void roll(int pins) {
        last_roll = pins;
//        System.out.println("last roll = " + last_roll);
        actualizeFrame();
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

