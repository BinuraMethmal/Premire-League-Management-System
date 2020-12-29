package premierLeagueManager;

public class Match {

    private String teamOne;
    private String teamTwo;
    private Date matchDate;
    private int team1GoalsReceived;
    private int team2GoalsReceived;
    private int team1GoalsScored;
    private int team2GoalsScored;

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

    public void setTeam1GoalsReceived(int team1GoalsReceived) {
        this.team1GoalsReceived = team1GoalsReceived;
    }

    public void setTeam2GoalsReceived(int team2GoalsReceived) {
        this.team2GoalsReceived = team2GoalsReceived;
    }

    public void setTeam1GoalsScored(int team1GoalsScored) {
        this.team1GoalsScored = team1GoalsScored;
    }

    public void setTeam2GoalsScored(int team2GoalsScored) {
        this.team2GoalsScored = team2GoalsScored;
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

    public int getTeam1GoalsReceived() {
        return team1GoalsReceived;
    }

    public int getTeam2GoalsReceived() {
        return team2GoalsReceived;
    }

    public int getTeam1GoalsScored() {
        return team1GoalsScored;
    }

    public int getTeam2GoalsScored() {
        return team2GoalsScored;
    }

    public boolean search(String searchTerm){
        if (matchDate.equals(searchTerm)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Match{" +
                "Team One='" + teamOne + '\'' +
                ", Team Two='" + teamTwo + '\'' +
                ", DOF=" + matchDate +
                ", Team 1 Received Goals=" + team1GoalsReceived +
                ", Team 2 Received Goals=" + team2GoalsReceived +
                ", Team 1 Scored Goals=" + team1GoalsScored +
                ", Team 2 Scored Goals=" + team2GoalsScored +
                '}';
    }
}
