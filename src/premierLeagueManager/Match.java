package premierLeagueManager;

public class Match {

    private String teamOne;
    private String teamTwo;
    private Date matchDate;
    private double teamScore1;
    private double teamScore2;
    private int teamGoals1;
    private int teamGoals2;

    //Setters
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

    public void setTeamGoals1(int teamGoals1) {
        this.teamGoals1 = teamGoals1;
    }

    public void setTeamGoals2(int teamGoals2) {
        this.teamGoals2 = teamGoals2;
    }


    //Getters
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

    public int getTeamGoals1() {
        return teamGoals1;
    }

    public int getTeamGoals2() {
        return teamGoals2;
    }



    public boolean search(String searchTerm){
        if (matchDate.equals(searchTerm)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Match{" +
                "teamOne='" + teamOne + '\'' +
                ", teamTwo='" + teamTwo + '\'' +
                ", matchDate=" + matchDate +
                ", teamScore1=" + teamScore1 +
                ", teamScore2=" + teamScore2 +
                '}';
    }
}
