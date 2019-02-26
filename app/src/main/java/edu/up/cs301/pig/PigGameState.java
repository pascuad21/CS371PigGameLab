package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState {
    private int idOfTurn; // 0 or 1
    private int player0Score;
    private int player1Score;
    private int runningTotal;
    private int dieVal;

    public PigGameState(){
        idOfTurn = 0;
        player0Score = 0;
        player1Score = 0;
        runningTotal = 0;
        dieVal = 1;
    }

    public PigGameState(PigGameState orig){
        this.idOfTurn = orig.idOfTurn;
        this.player0Score = orig.player0Score;
        this.player1Score = orig.player1Score;
        this.runningTotal = orig.runningTotal;
        this.dieVal = orig.dieVal;
    }

    public int getIdOfTurn() {
        return idOfTurn;
    }

    public int getDieVal() {
        return dieVal;
    }

    public int getPlayer0Score() {
        return player0Score;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getRunningTotal() {
        return runningTotal;
    }

    public void setDieVal(int dieVal) {
        this.dieVal = dieVal;
    }

    public void setIdOfTurn(int idOfTurn) {
        this.idOfTurn = idOfTurn;
    }

    public void setPlayer0Score(int player0Score) {
        this.player0Score = player0Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public void setRunningTotal(int runningTotal) {
        this.runningTotal = runningTotal;
    }
}

