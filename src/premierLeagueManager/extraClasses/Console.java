package premierLeagueManager.extraClasses;

public class Console { /*
    public static ArrayList<FootballClub> clubData = new ArrayList<>();

    public static void main(String[] args) {

        // Main Menu
        while (true) {
            Scanner myObj = new Scanner(System.in);

            // Labels for every input options
            System.out.println("Enter your Option.");
            System.out.println("'C' for Add new Club. ");
            System.out.println("'M' for Add new Match. ");
            System.out.println("'S' for Display Club Statistics.");
            System.out.println("'P' for Display Premier League Table.");
            System.out.println("'D' for Delete Club.");
            System.out.println("'Q' for Quit.");
            System.out.print("Your Option: ");

            // Take Input option
            String option = myObj.nextLine().toUpperCase();
            System.out.println("\n");

            switch (option) {
                case "C":
                    addClub();
                    break;
                case "M":

                case "S":

                case "P":

                case "D":

                case "Q":
                    System.exit(0);
                    break;
            }

        }
    }

    public static void addClub() {

        String[] location = new String[4];

        while (true) {
            Scanner myObj = new Scanner(System.in);

            // User option 1
            System.out.println("Enter- ");
            System.out.println("'F' for Foot Ball Club ");
            System.out.println("'O' for Other Club ");
            System.out.print("Your Option: ");

            String option1 = myObj.nextLine().toUpperCase();
            System.out.println("\n");

            // Take user inputs for Common data for every club
            if (option1.equalsIgnoreCase("F") || option1.equalsIgnoreCase("O")) {

                if (option1.equalsIgnoreCase("F")) {
                    System.out.print("Enter your Club name-");
                    String name = myObj.nextLine();

                    System.out.println("Enter your location of the Club - ");
                    System.out.print("Address Line 01 - ");
                    location[0] = myObj.nextLine();
                    System.out.print("City - ");
                    location[1] = myObj.nextLine();
                    System.out.print("Zip Code - ");
                    location[2] = myObj.nextLine();
                    System.out.print("Country - ");
                    location[3] = myObj.nextLine();

                    // User option 2 Uni Club or School Club
                    if (option1.equalsIgnoreCase("F")) {

                        FootballClub club = new FootballClub();
                        club.setClubName(name);
                        club.setClubAddress1(location[0]);
                        club.setClubCity(location[1]);
                        club.setClubZipCode(location[2]);
                        club.setClubCountry(location[3]);

                        System.out.println("Enter- ");
                        System.out.println("'U' for University Foot Ball Club ");
                        System.out.println("'S' for School Foot Ball Club ");
                        System.out.print("Your Option: ");

                        String option2 = myObj.nextLine().toUpperCase();

                        // Take user inputs for Foot ball club
                        if (option2.equalsIgnoreCase("U") || option2.equalsIgnoreCase("S")) {

                            // Take user inputs for University Club
                            if (option2.equalsIgnoreCase("U")) {
                                UniversityFootballClub uniClub = new UniversityFootballClub();

                                System.out.print("Enter your University Name-");
                                String uniName = myObj.nextLine();
                                uniClub.setUniversityName(uniName);

                                System.out.print("Enter your University Location-");
                                String uniLocation = myObj.nextLine();
                                uniClub.setUniversityLocation(uniLocation);

                                clubData.add(uniClub);

                                // Take user inputs for School Club
                            } else if (option2.equalsIgnoreCase("S")) {

                                SchoolFootballClub sclClub = new SchoolFootballClub();

                                System.out.print("Enter your University Name-");
                                String sclName = myObj.nextLine();
                                sclClub.setSchoolName(sclName);

                                System.out.print("Enter your University Location-");
                                String sclLocation = myObj.nextLine();
                                sclClub.setSchoolLocation(sclLocation);

                                clubData.add(sclClub);
                            }

                            System.out.println("Enter your statistics of the Club-");
                            System.out.print("Enter your Wins (Count)-");
                            int wins = myObj.nextInt();
                            club.setClubWins(wins);

                            System.out.print("Enter your defeats (Count)-");
                            int defeats = myObj.nextInt();
                            club.setClubDefeats(defeats);

                            System.out.print("Enter your Draws (Count)-");
                            int draws = myObj.nextInt();
                            club.setClubDraws(draws);

                            System.out.print("Goals- ");
                            int goals = myObj.nextInt();
                            club.setClubGoals(goals);

                            System.out.print("Score- ");
                            double score = myObj.nextDouble();
                            club.setClubScore(score);

                            System.out.print("Enter number of points of your club has- ");
                            double points = myObj.nextDouble();
                            club.setClubPoints(points);

                            System.out.print("Enter number of matches of your club-");
                            int matches = myObj.nextInt();
                            club.setClubMatches(matches);

                            clubData.add(club);
                            break;
                        }
                    } else if (option1.equalsIgnoreCase("O")) {
                        SportsClub club = new SportsClub();
                        club.setClubName(name);
                        club.setClubAddress1(location[0]);
                        club.setClubCity(location[1]);
                        club.setClubZipCode(location[2]);
                        club.setClubCountry(location[3]);

                    } else {
                        System.out.println("** Invalid Input. Try Again! **\n");
                    }
                } else {
                    System.out.println("** Invalid Input. Try Again! **\n");
                }
            }
        }
    }*/
}

