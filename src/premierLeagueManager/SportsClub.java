package premierLeagueManager;

import java.io.Serializable;
import java.util.Objects;

public class SportsClub implements Serializable{

    private static final long serialVersionUID=1L; // to ensure that same class has been

    private String clubName;
    private String clubAddress1;
    private String clubCity;
    private String clubZipCode;
    private String clubCountry;

    public SportsClub() {
        // Default constructor
    }

    // Overloading Constructor
    public SportsClub(String clubName, String clubAddress1, String clubCity, String clubZipCode, String clubCountry) {

        this.clubName = clubName;
        this.clubAddress1 = clubAddress1;
        this.clubCity = clubCity;
        this.clubZipCode = clubZipCode;
        this.clubCountry = clubCountry;
    }

    // Setters
    public void setClubAddress1(String clubAddress1) {
        this.clubAddress1 = clubAddress1;
    }

    public void setClubCity(String clubCity) {
        this.clubCity = clubCity;
    }

    public void setClubCountry(String clubCountry) {
        this.clubCountry = clubCountry;
    }

    public void setClubZipCode(String clubZipCode) {
        this.clubZipCode = clubZipCode;
    }

    public void setClubName(String clubName){
        this.clubName = clubName;
    }




    // Getters
    public String getClubName() {
        return clubName;
    }

    public String getClubAddress1() {
        return clubAddress1;
    }

    public String getClubCity() {
        return clubCity;
    }

    public String getClubCountry() {
        return clubCountry;
    }

    public String getClubZipCode() {
        return clubZipCode;
    }

    @Override
    public String toString() {
        return "SportsClub{" +
                "Club Name='" + clubName + '\'' +
                ", Address Line 1='" + clubAddress1 + '\'' +
                ", City='" + clubCity + '\'' +
                ", ZipCode='" + clubZipCode + '\'' +
                ", Country='" + clubCountry + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportsClub)) return false;
        SportsClub that = (SportsClub) o;
        return getClubName().equals(that.getClubName()) &&
                getClubAddress1().equals(that.getClubAddress1()) &&
                getClubCity().equals(that.getClubCity()) &&
                getClubZipCode().equals(that.getClubZipCode()) &&
                getClubCountry().equals(that.getClubCountry());
    }

    public boolean search(String searchTerm){
        if (clubName.equalsIgnoreCase(searchTerm)) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClubName(), getClubAddress1(), getClubCity(), getClubZipCode(), getClubCountry());
    }
}