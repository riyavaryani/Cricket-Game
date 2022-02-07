package com.company;

public class MatchController {
    private int playingTeam;
    private int overs;
    private Team[] team;

    public MatchController(Team firstTeam, Team secondTeam, int overs){
        team = new Team[2];
        team[0] = firstTeam;
        team[1] = secondTeam;
        this.overs = overs;
        this.playingTeam = 0;
    }
    public void startGame(){
        while(this.playingTeam < 2){
            int totalBalls = this.overs * 6;
            while(totalBalls > 0 && team[playingTeam].showWickets() < 10){
                int result = (int) Math.round(Math.random()*8);
                if(result != 7){
                    team[playingTeam].updateRuns(result);
                }
                else{
                    team[playingTeam].updateWickets();
                }
                totalBalls--;
            }
            this.playingTeam++;
        }
        showOverallScore();
    }
    public void showOverallScore(){
        System.out.println("Score Boards: ");
        team[0].scoreBoard(1);
        team[1].scoreBoard(2);
        int result;
        if(team[0].showTotalScore() > team[1].showTotalScore()) result = 1;
        else if(team[0].showTotalScore() < team[1].showTotalScore()) result = 2;
        else result = 3;
        if(result != 3) System.out.println("=====Team " + result + " won=====");
        else System.out.println("=====It's a draw!!=====");

    }
}
