package premierLeagueManager.footBallClubs;

import java.io.Serializable;
import java.util.Objects;

public class SchoolFootballClub extends FootballClub implements Serializable {

    /*public SchoolFootballClub(String clubName, String addressLine1, String city, String zipCode, String country, int clubWins, int clubDraws, int clubDefeats, int clubGoals, int clubMatches, double clubScore, double clubPoints, String schoolName, String schoolLocation) {
        super(clubName, addressLine1, city, zipCode, country, clubWins, clubDraws, clubDefeats, clubGoals, clubMatches, clubScore, clubPoints);
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
    }*/

    private String schoolName;
    private String schoolLocation;

    public SchoolFootballClub() {
        // Default constructor
    }


    // Overloading Constructor
    public SchoolFootballClub(String schoolName, String schoolLocation) {
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
    }


    //Setters
    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // Getters
    public String getSchoolLocation() {
        return schoolLocation;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "SchoolFootballClub{" +
                "School Name='" + schoolName + '\'' +
                ", School Location='" + schoolLocation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SchoolFootballClub)) return false;
        if (!super.equals(o)) return false;
        SchoolFootballClub that = (SchoolFootballClub) o;
        return Objects.equals(getSchoolName(), that.getSchoolName()) &&
                Objects.equals(getSchoolLocation(), that.getSchoolLocation());
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSchoolName(), getSchoolLocation());
    }
}
