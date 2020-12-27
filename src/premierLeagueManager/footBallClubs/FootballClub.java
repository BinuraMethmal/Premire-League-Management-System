package premierLeagueManager.footBallClubs;

import premierLeagueManager.Date;
import premierLeagueManager.SportsClub;

import java.io.Serializable;
import java.util.Objects;

public class FootballClub extends SportsClub implements Serializable {


    private int clubWins;
    private int clubDefeats;
    private int clubDraws;
    private int clubGoals;
    private double clubScore;
    private double clubPoints;
    private int clubMatches;





    // Overloading Constructor
    public FootballClub(String clubName, String clubAddress1, String clubCity, String clubZipCode, String clubCountry, int clubWins, int clubDefeats, int clubDraws, int clubGoals, double clubScore, double clubPoints, int clubMatches, String teamOne, String teamTwo, Date matchDate, double matchScore) {
        super(clubName, clubAddress1, clubCity, clubZipCode, clubCountry);
        this.clubWins = clubWins;
        this.clubDefeats = clubDefeats;
        this.clubDraws = clubDraws;
        this.clubGoals = clubGoals;
        this.clubScore = clubScore;
        this.clubPoints = clubPoints;
        this.clubMatches = clubMatches;

    }

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

    public void setClubGoals(int clubGoals) {
        this.clubGoals = clubGoals;
    }

    public void setClubMatches(int clubMatches) {
        this.clubMatches = clubMatches;
    }


    public void setClubPoints(double clubPoints) {
        this.clubPoints = clubPoints;
    }

    public void setClubScore(double clubScore) {
        this.clubScore = clubScore;
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

    public int getClubGoals() {
        return clubGoals;
    }

    public double getClubScore() {
        return clubScore;
    }

    public double getClubPoints() {
        return clubPoints;
    }

    public int getClubMatches() {
        return clubMatches;
    }



    @Override
    public String toString() {
        return "FootballClub{" +
                "Wins=" + clubWins +
                ", Defeats=" + clubDefeats +
                ", Draws=" + clubDraws +
                ", Goals=" + clubGoals +
                ", Score=" + clubScore +
                ", Points=" + clubPoints +
                ", Matches=" + clubMatches +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FootballClub)) return false;
        FootballClub that = (FootballClub) o;
        return getClubWins() == that.getClubWins() &&
                getClubDefeats() == that.getClubDefeats() &&
                getClubDraws() == that.getClubDraws() &&
                getClubGoals() == that.getClubGoals() &&
                Double.compare(that.getClubScore(), getClubScore()) == 0 &&
                Double.compare(that.getClubPoints(), getClubPoints()) == 0 &&
                getClubMatches() == that.getClubMatches();

    }





    @Override
    public int hashCode() {
        return Objects.hash(getClubWins(), getClubDefeats(), getClubDraws(), getClubGoals(), getClubScore(), getClubPoints(), getClubMatches());
    }
}

