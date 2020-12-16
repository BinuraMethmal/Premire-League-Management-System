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
    private String teamOne;
    private String teamTwo;
    private Date matchDate;
    private double teamScore1;
    private double teamScore2;




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
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.matchDate = matchDate;
        this.teamScore1 = matchScore;
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

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public void setTeamScore1(double teamScore1) {
        this.teamScore1 = teamScore1;
    }

    public void setTeamScore2(double teamScore2) {
        this.teamScore2 = teamScore2;
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

    public String getTeamOne() {
        return teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public double getTeamScore1() {
        return teamScore1;
    }

    public double getTeamScore2() {
        return teamScore2;
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

