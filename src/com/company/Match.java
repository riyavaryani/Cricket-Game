package com.company;

public class Match {
    Team firstTeam, secondTeam;

    public Match(int overs){
        firstTeam = new Team();
        secondTeam = new Team();
        MatchController newMatch = new MatchController(firstTeam, secondTeam, overs);
        newMatch.startGame();

    }
}
