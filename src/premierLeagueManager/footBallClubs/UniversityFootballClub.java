package premierLeagueManager.footBallClubs;

import java.io.Serializable;
import java.util.Objects;

public class UniversityFootballClub extends FootballClub implements Serializable {
    private String universityName;
    private String universityLocation;

    /*public UniversityFootballClub(String clubName, String addressLine1, String city, String zipCode, String country,
                                  int clubWins, int clubDraws, int clubDefeats, int clubGoals, int clubMatches,
                                  double clubScore, double clubPoints, String universityName, String universityLocation) {
        super(clubName, addressLine1, city, zipCode, country, clubWins, clubDraws, clubDefeats, clubGoals, clubMatches, clubScore, clubPoints);
        this.universityName = universityName;
        this.universityLocation = universityLocation;
    } */

    public UniversityFootballClub() {
        // Default constructor
    }

    // Overloading Constructor
    public UniversityFootballClub(String universityName, String universityLocation) {
        this.universityName = universityName;
        this.universityLocation = universityLocation;
    }


    // Setters
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }


    public void setUniversityLocation(String universityLocation) {
        this.universityLocation = universityLocation;
    }

    //Getters
    public String getUniversityName() {
        return universityName;
    }

    public String getUniversityLocation() {
        return universityLocation;
    }

    @Override
    public String toString() {
        return "UniversityFootballClub{" +
                "universityName='" + universityName + '\'' +
                ", universityLocation='" + universityLocation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniversityFootballClub)) return false;
        UniversityFootballClub that = (UniversityFootballClub) o;
        return getUniversityName().equals(that.getUniversityName()) &&
                getUniversityLocation().equals(that.getUniversityLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUniversityName(), getUniversityLocation());
    }




}
