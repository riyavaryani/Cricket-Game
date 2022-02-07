package com.company;

public class Team {
    private int score;
    private int totalWickets;
    private Player[] player;
    private int currentPlayerNumber;

    public Team(){
        this.player = new Player[11];
        for(int i=0;i<11;i++){
            this.player[i] = new Player(i+1);
        }
        this.score = 0;
        this.totalWickets = 0;
        this.currentPlayerNumber = 0;
    }
    public int showWickets(){
        return this.totalWickets;
    }
    public int showTotalScore(){
        return this.score;
    }
    public void scoreBoard(int teamNumber){
        System.out.println("Team Number: " + teamNumber + " Score: " + this.score + "/" + this.totalWickets);
        for(int i=0;i<11;i++){
            System.out.println(player[i].showDetails());
        }
    }
    public void updateRuns(int runs){
        score += runs;
        player[this.currentPlayerNumber].runsScored(runs);
    }
    public void updateWickets(){
        player[this.currentPlayerNumber].setOut();
        this.currentPlayerNumber++;
        this.totalWickets++;
    }
}
