package premierLeagueManager.footBallClubs;

import premierLeagueManager.Date;
import premierLeagueManager.SportsClub;

import java.io.Serializable;
import java.util.Objects;

public class FootballClub extends SportsClub implements Serializable {


    private int clubWins;
    private int clubDefeats;
    private int clubDraws;
    private int clubGoalsScored;
    private double clubGoalsReceived;
    private double clubPoints;
    private int clubMatches;


    public FootballClub() {
        //Default Constructor
    }




    // Setters

    public void setClubWins (int clubWins){
        this.clubWins = clubWins;
    }

    public void setClubDefeats (int clubDefeats){
        this.clubDefeats = clubDefeats;

    }

    public void setClubDraws (int clubDraws){
        this.clubDraws = clubDraws;
    }

    public void setClubMatches(int clubMatches) {
        this.clubMatches = clubMatches;
    }


    public void setClubPoints(double clubPoints) {
        this.clubPoints = clubPoints;
    }

    public void setClubGoalsScored(int clubGoalsScored) {
        this.clubGoalsScored = clubGoalsScored;
    }

    public void setClubGoalsReceived(double clubGoalsReceived) {
        this.clubGoalsReceived = clubGoalsReceived;
    }

    // Getters


    public int getClubWins() {
        return clubWins;
    }

    public int getClubDefeats() {
        return clubDefeats;
    }

    public int getClubDraws() {
        return clubDraws;
    }

    public double getClubPoints() {
        return clubPoints;
    }

    public int getClubMatches() {
        return clubMatches;
    }

    public int getClubGoalsScored() {
        return clubGoalsScored;
    }

    public double getClubGoalsReceived() {
        return clubGoalsReceived;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FootballClub that = (FootballClub) o;
        return clubWins == that.clubWins && clubDefeats == that.clubDefeats && clubDraws == that.clubDraws && clubGoalsScored == that.clubGoalsScored && Double.compare(that.clubGoalsReceived, clubGoalsReceived) == 0 && Double.compare(that.clubPoints, clubPoints) == 0 && clubMatches == that.clubMatches;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clubWins, clubDefeats, clubDraws, clubGoalsScored, clubGoalsReceived, clubPoints, clubMatches);
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "Club Wins=" + clubWins +
                ", Club Defeats=" + clubDefeats +
                ", Club Draws=" + clubDraws +
                ", Club Goals (Scored)=" + clubGoalsScored +
                ", Club Goals (Received)=" + clubGoalsReceived +
                ", Club Points=" + clubPoints +
                ", Club Matches=" + clubMatches +
                '}';
    }
}

