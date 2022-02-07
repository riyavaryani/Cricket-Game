package com.company;

public class Player {
    private int playerNumber;
    private boolean currentlyPlaying;
    private int totalRuns;

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        this.currentlyPlaying = false;
        this.totalRuns = 0;
    }
    public void runsScored(int runs){
        this.totalRuns = runs;
        this. currentlyPlaying = true;
    }
    public void setOut(){
        this.currentlyPlaying = false;
    }
    public String showDetails(){
        String detail = "Player Number: " + this.playerNumber + " - " + this.totalRuns;
        return detail;
    }
}
