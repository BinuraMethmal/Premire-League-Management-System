package premierLeagueManager;

//import javafx.application.Application;
//import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import premierLeagueManager.footBallClubs.FootballClub;
import premierLeagueManager.footBallClubs.SchoolFootballClub;
import premierLeagueManager.footBallClubs.UniversityFootballClub;

import java.io.*;
import java.util.*;
import java.util.Comparator;
import java.lang.Double;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PremierLeagueManager extends Application implements LeagueManger  {

    // Arrays for store Objects temporary
    public static ArrayList<FootballClub> clubData = new ArrayList<>(); // --> Football Clubs Details
    public static ArrayList<Match> matchData = new ArrayList<>(); // --> Matches Details
    public static ArrayList<SportsClub> normalClub = new ArrayList<>(); // --> Normal Clubs Details

    @Override
    public void start(Stage primaryStage) throws IOException, ClassNotFoundException {

        loadData(); // Load past objects -> Array List

        // Main Menu
        while (true) {
            Scanner myObj = new Scanner(System.in);

            // Labels for every input options
            System.out.print("\n");
            System.out.println("Enter your Option.");
            System.out.println("'C' for Add new Club. ");
            System.out.println("'M' for Add Played Match. ");
            System.out.println("'S' for Display Club Statistics.");
            System.out.println("'P' for Display Premier League Table in CLI.");
            System.out.println("'G' for Display Premier League Table in GUI.");
            System.out.println("'D' for Delete Club.");
            System.out.println("'Q' for Quit.");
            System.out.print("Your Option: ");

            // Take user option
            String option = myObj.nextLine().toUpperCase();
            System.out.print("\n");

            switch (option) {
                case "C":
                    addClub();
                    break;
                case "M":
                    addMatch();
                    break;

                case "S":
                    displayStats();
                    break;

                case "P":
                    statsTableCLI();
                    break;

                case "G":
                    gui();
                    break;

                case "D":
                    deleteClub();
                    break;
                case "Q":
                    saveData();
                    System.exit(0);
                    break;
            }

        }

    }

    // Add new club method
    public void addClub(){

        String[] location = new String[4];

        while (true) {
            Scanner myObj = new Scanner(System.in);

            // User option 1
            System.out.println("Enter- ");
            System.out.println("'F' for Foot Ball Club ");
            System.out.println("'O' for Other Club ");
            System.out.print("Your Option: ");

            String option1 = myObj.nextLine().toUpperCase();
            System.out.print("\n");

            // Take user inputs for Common data for every club
            if (option1.equalsIgnoreCase("F") || option1.equalsIgnoreCase("O")) {

                // User option 2 Uni Club or School Club
                if (option1.equalsIgnoreCase("F")) {


                    System.out.println("Enter- ");
                    System.out.println("'N' for Normal Foot Ball Club ");
                    System.out.println("'U' for University Foot Ball Club ");
                    System.out.println("'S' for School Foot Ball Club ");
                    System.out.print("Your Option: ");

                    String option2 = myObj.nextLine().toUpperCase();

                    // Take user inputs for Foot ball club
                    if (option2.equalsIgnoreCase("N")||option2.equalsIgnoreCase("U") ||
                            option2.equalsIgnoreCase("S")) {

                        System.out.print("Enter your Club name- ");
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

                        if (option2.equalsIgnoreCase("N")) {

                            FootballClub club = new FootballClub();

                            // Set Default values
                            club.setClubName(name);
                            club.setClubAddress1(location[0]);
                            club.setClubCity(location[1]);
                            club.setClubZipCode(location[2]);
                            club.setClubCountry(location[3]);
                            clubData.add(club);

                            // Take user inputs for University Club
                        }else if (option2.equalsIgnoreCase("U")) {


                            UniversityFootballClub club = new UniversityFootballClub();

                            // Set Default values
                            club.setClubName(name);
                            club.setClubAddress1(location[0]);
                            club.setClubCity(location[1]);
                            club.setClubZipCode(location[2]);
                            club.setClubCountry(location[3]);

                            System.out.print("Enter your University Name- ");
                            String uniName = myObj.nextLine();
                            club.setUniversityName(uniName);

                            System.out.print("Enter your University Location- ");
                            String uniLocation = myObj.nextLine();
                            club.setUniversityLocation(uniLocation);

                            clubData.add(club);

                            // Take user inputs for School Club
                        } else if (option2.equalsIgnoreCase("S")) {

                            SchoolFootballClub club = new SchoolFootballClub();

                            // Set Default values
                            club.setClubName(name);
                            club.setClubAddress1(location[0]);
                            club.setClubCity(location[1]);
                            club.setClubZipCode(location[2]);
                            club.setClubCountry(location[3]);

                            System.out.print("Enter your School Name- ");
                            String sclName = myObj.nextLine();
                            club.setSchoolName(sclName);

                            System.out.print("Enter your School Location- ");
                            String sclLocation = myObj.nextLine();
                            club.setSchoolLocation(sclLocation);

                            clubData.add(club);
                        } else {
                            System.out.println("** Invalid Input **");
                        }

                        break;
                    }

                // Take other clubs inputs
                } else if (option1.equalsIgnoreCase("O")) {

                    System.out.print("Enter your Club name- ");
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


                    SportsClub club = new SportsClub();
                    club.setClubName(name);
                    club.setClubAddress1(location[0]);
                    club.setClubCity(location[1]);
                    club.setClubZipCode(location[2]);
                    club.setClubCountry(location[3]);

                    normalClub.add(club);

                } else {
                    System.out.println("** Invalid Input. Try Again! **\n");
                }
            } else {
                System.out.println("** Invalid Input. Try Again! **\n");
            }
        }
    }

    // Delete Club method
    public void deleteClub(){

        while (true){

            // Take name of the club which is need to delete
            Scanner myObj = new Scanner(System.in);
            String clubName;
            SportsClub deleteClub = null;
            System.out.println("Enter Club name to Delete: ");

            // Check Club Name is String
            try {
                clubName = myObj.nextLine().toUpperCase();
            } catch (InputMismatchException e){
                System.out.println("** Text or String Required **");
                continue;
            }

            //
            for (FootballClub club : clubData){
                if (club.getClubName().toUpperCase().equalsIgnoreCase(clubName)){
                    deleteClub = club;
                } else {
                    System.out.println("** This System haven't a Club called "+ clubName +". **");
                }
            }

            // Take final confirmation before delete the club
            if (deleteClub!=null){
                System.out.println(deleteClub);
                System.out.print("Are you sure to delete this Club? (Y/N) ");
                String option = myObj.nextLine().toUpperCase();

                // Delete club after confirmed
                if(option.equalsIgnoreCase("Y")){
                    clubData.remove(deleteClub);
                    System.out.println("Deleted - "+ deleteClub.getClubName());
                    break;

                } else if(option.equalsIgnoreCase("N")){
                    System.out.println("** Deletion Canceled **");
                    break;

                } else {
                    System.out.println("** You entered wrong command **");
                }
            }

        }
    }

    // Display club statistics method
    public void displayStats(){

        while (true) {
            Scanner myObj = new Scanner(System.in);
            String clubName;
            System.out.print("Enter club Name: ");


            // Check Club Name is String
            try {
                clubName = myObj.nextLine().toUpperCase();
            } catch (InputMismatchException e) {
                System.out.println("** Text or String Required **");
                continue;
            }

            // Check which club should need to display
            for (FootballClub club : clubData) {
                if (club.getClubName().toUpperCase().equalsIgnoreCase(clubName)) {

                    // Print all the statistics in clubData array
                    for (FootballClub stats : clubData) {

                        String name = stats.getClubName();
                        int wins = stats.getClubWins();
                        int draws = stats.getClubDraws();
                        int defeat = stats.getClubDefeats();
                        int goals = stats.getClubGoalsScored();
                        int score = stats.getClubGoalsScored();
                        double points = stats.getClubPoints();
                        int matches = stats.getClubMatches();


                        System.out.println("Club Statistics: "+ name + "\n Wins: " + wins + "\n Draws: " + draws + "\n Defeats: " + defeat +
                                "\n Goals: " + goals + "\n Score: " + score + "\n Points: " + points + "\n Matches: " + matches+"\n");

                    }

                } else {
                    System.out.println("** This System haven't a Club called " + clubName + ". **");
                }
            }
            break;
        }
    }

    // Add Played match method
    public void addMatch(){


        int team1GoalsReceived =0;
        int team2GoalsReceived =0;
        int team1GoalsScored = 0;
        int team2GoalsScored = 0;

        Date date = null;
        String teamOne;
        String teamTwo;

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter Team One: ");
        teamOne = myObj.nextLine();

        FootballClub firstTeam = null;
        for(FootballClub club : clubData){
            if(club.getClubName().equals(teamOne))
                firstTeam = club;
        }

        if (firstTeam == null) {
            System.out.println("** This kind club not Registered in system. **");
            return;
        }

        System.out.print("Enter Team Two: ");
        teamTwo = myObj.nextLine();

        FootballClub secondTeam = null;
        for(FootballClub club : clubData){
            if(club.getClubName().equals(teamTwo))
                secondTeam = club;
        }

        if (secondTeam == null) {
            System.out.println("** This kind club not Registered in system. **");
            return;
        }

        while (true) {

            // Enter Match Date
            System.out.print("Enter Match date (Format - 'DD/MM/YYYY'): ");
            String matchDate = myObj.nextLine();

            // Check date is in right format
            try {
                date = new Date(matchDate);

            } catch (IllegalArgumentException e) {
                continue;

            }

            // Enter Team 1 Score
            System.out.println("Enter Number of Team One Scored Goals: ");

            // Check score is in correct data type (Double)
            try {
                team1GoalsScored = myObj.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("** Double Value Required! **");
            }

            // Enter Team 2 Score
            System.out.println("Enter Number of Team Two Scored Goals: ");

            // Check score is in correct data type (Double)
            try {
                team2GoalsScored = myObj.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("** Double Value Required! **");
            }

            // Enter Team 1 Goals
            System.out.println("Enter Team One goals: ");

            try {
                team1GoalsReceived = myObj.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("** You have to enter number of Goals. It should be integer value! **");
            }

            // Enter Team 2 Goals
            System.out.println("Enter Team Two goals: ");

            try {
                team2GoalsReceived = myObj.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("** You have to enter number of Goals. It should be integer value! **");
            }


            Match match = new Match();
            match.setMatchDate(date);
            match.setTeamOne(teamOne);
            match.setTeamTwo(teamTwo);
            match.setTeam1GoalsScored(team1GoalsScored);
            match.setTeam2GoalsScored(team2GoalsScored);
            match.setTeam2GoalsReceived(team1GoalsReceived);
            match.setTeam2GoalsReceived(team2GoalsReceived);

            matchData.add(match);

            firstTeam.setClubGoalsReceived(firstTeam.getClubGoalsReceived() + team1GoalsReceived);
            secondTeam.setClubGoalsReceived(secondTeam.getClubGoalsReceived() + team2GoalsReceived);
            firstTeam.setClubGoalsScored(firstTeam.getClubGoalsScored() + team1GoalsScored);
            secondTeam.setClubGoalsScored(secondTeam.getClubGoalsScored() + team2GoalsScored);

            firstTeam.setClubMatches(firstTeam.getClubMatches()+1);
            secondTeam.setClubMatches(secondTeam.getClubMatches()+1);

            if (team1GoalsScored > team2GoalsScored) {
                firstTeam.setClubWins(firstTeam.getClubWins()+1);
                secondTeam.setClubDefeats(secondTeam.getClubDefeats()+1);
                firstTeam.setClubPoints(firstTeam.getClubPoints()+3);

            } else if (team1GoalsScored < team2GoalsScored) {
                secondTeam.setClubWins(secondTeam.getClubWins()+1);
                firstTeam.setClubDefeats(firstTeam.getClubDefeats()+1);
                secondTeam.setClubPoints(secondTeam.getClubPoints()+3);

            } else {
                firstTeam.setClubDraws(firstTeam.getClubDraws()+1);
                secondTeam.setClubDraws(secondTeam.getClubDraws()+1);
                firstTeam.setClubPoints(firstTeam.getClubPoints()+1);
                secondTeam.setClubPoints(secondTeam.getClubPoints()+1);
            }
            break;
        }

    }

    // Data Sorting and Display Table in CLI Method
    public void sortData(){

        clubData.sort(new Comparator<FootballClub>() {
            @Override
            public int compare(FootballClub o1, FootballClub o2) {
                int result;

                // Compare 1st point to 2nd point
                Double x = o1.getClubPoints();
                Double y = o2.getClubPoints();

                result = y.compareTo(x);

                // when both points are equal comparing with Goals
                if (x.equals(y)){

                    Integer p = o1.getClubGoalsScored();
                    Integer q = o2.getClubGoalsScored();

                    result = q.compareTo(p);

                }
                return result;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
    }

    // Display Statistics in a Table using CLI
    public void statsTableCLI(){

        sortData();

        // Print some of attributes of the table after sorted
        for (FootballClub club: clubData){
            System.out.println(
                    "Club Points: "+ club.getClubPoints()+ "\t" +
                            "Club Goals: "+club.getClubGoalsScored()+"\t"+
                            "Club Name: "+club.getClubName()+"\t"+
                            "Club Score: "+club.getClubGoalsScored()+"\t"+
                            "Club Wins: "+club.getClubWins()+"\t");

        }

//        // Table Formatting
//
//        String leftAlign = "| %-15s | %-6d | %-6d | %-6d | %-6d | %-6d | %-6d | %-6d |%n";
//        System.out.format("+-----------------+---------+--------+--------+--------+-----------+--------+--------------+%n");
//        System.out.format("| Club Name       | Matches | Won    | Lost   | Draw   | Goals     | Points    | Score     |%n");
//        System.out.format("+-----------------+---------+--------+--------+--------+-----------+--------+--------------+%n");
//
//        // Print some of attributes of the table after sorted
//        for (FootballClub club: clubData){
//            System.out.format(leftAlign, club.getClubName(),club.getClubMatches(), club.getClubWins()
//                    , club.getClubDefeats(), club.getClubGoals(), club.getClubPoints(), club.getClubScore() );
//        }
//
//        System.out.format("+-----------------+---------+--------+--------+--------+-----------+--------+--------------+%n");
//        System.out.println("\n");
    }

    public void randomMatch(){
        
    }

    // Method for Save data to Local file
    public void saveData()throws IOException  {

        File file1 = new File("PremierLeagueMangerData.txt");
        file1.createNewFile();

        FileOutputStream fileOut = new FileOutputStream(file1,true);
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

        Iterator it1 = clubData.iterator();
        Iterator it2 = matchData.iterator();

        while (it1.hasNext()){

            FootballClub clubTemp = (FootballClub) it1.next();
            objOut.writeObject(clubTemp);

        }

        while (it2.hasNext()){

            FootballClub matchTemp = (FootballClub) it2.next();
            objOut.writeObject(matchTemp);

        }

        fileOut.close();
        objOut.close();

    }

    // Method to Load data from saved file
    public void loadData() throws IOException, ClassNotFoundException{

        FileInputStream fileIn = new FileInputStream("PremierLeagueMangerData.txt");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);

        while (true){
            try {
                FootballClub club = (FootballClub) objIn.readObject();
                clubData.add(club);

            } catch (IOException | ClassNotFoundException e){
                break;

            }
        }

        while (true){
            try {
                Match match = (Match) objIn.readObject();
                matchData.add(match);

            } catch (IOException | ClassNotFoundException e){
                break;

            }
        }

        fileIn.close();
        objIn.close();

    }

    // Display Statistics in a Table using GUI
    public void statsTableGUI(Stage stage, Scene back){

        TableView <FootballClub> table = new TableView<>();

        // Column Design
        TableColumn<FootballClub, String> clubName = new TableColumn<>("Club Name");
        clubName.setCellValueFactory(new PropertyValueFactory<>("clubName"));
        clubName.setStyle("-fx-alignment: CENTER;");

        TableColumn<FootballClub, String> clubWins = new TableColumn<>("Wins");
        clubWins.setCellValueFactory(new PropertyValueFactory<>("clubWins"));
        clubWins.setStyle("-fx-alignment: CENTER;");

        TableColumn<FootballClub, String> clubDefeats = new TableColumn<>("Defeat");
        clubDefeats.setCellValueFactory(new PropertyValueFactory<>("clubDefeats"));
        clubDefeats.setStyle("-fx-alignment: CENTER;");

        TableColumn<FootballClub, String> clubDraws = new TableColumn<>("Draws");
        clubDraws.setCellValueFactory(new PropertyValueFactory<>("clubDraws"));
        clubDraws.setStyle("-fx-alignment: CENTER;");

        TableColumn<FootballClub, String> clubGoalsScored = new TableColumn<>("Scored Goals");
        clubGoalsScored.setCellValueFactory(new PropertyValueFactory<>("clubGoalsScored"));
        clubGoalsScored.setStyle("-fx-alignment: CENTER;");

        TableColumn<FootballClub, String> clubPoints = new TableColumn<>("Points");
        clubPoints.setCellValueFactory(new PropertyValueFactory<>("clubPoints"));
        clubPoints.setStyle("-fx-alignment: CENTER;");

        TableColumn<FootballClub, String> clubGoalsReceived = new TableColumn<>("Received Goals");
        clubGoalsReceived.setCellValueFactory(new PropertyValueFactory<>("clubGoalsReceived"));
        clubGoalsReceived.setStyle("-fx-alignment: CENTER;");


        // Add data to column and show column in GUI
        table.getColumns().setAll(clubName, clubWins, clubDefeats, clubDraws,clubGoalsScored,clubGoalsReceived, clubPoints);
        table.setPrefWidth(800);
        table.setPrefHeight(600);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.getItems().setAll(clubData);
        table.setStyle("-fx-pref-rows: 100");

        // Search Option
        TextField searchField = new TextField();
        Button searchBtn =  new Button();
        searchBtn.setText("Search");

        searchBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String searchMe = searchField.getText();
                searchField.clear();

                //System.out.println("Searched Objects.");
                //System.out.println(searchMe);

                if (searchMe.equals("")){
                    table.getItems().setAll(clubData);
                }else{
                    ArrayList<FootballClub> tempArray = new ArrayList<>();
                    for (FootballClub club : clubData){
                        if (club.search(searchMe)){
                            tempArray.add(club);
                        }
                    }
                    table.getItems().setAll(tempArray);
                }
            }
        });

        // back button
        Button backBtn = new Button();
        backBtn.setText("Back");

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(back);
            }
        });

        // Interface Design
        Label label = new Label("Premier League Manager");
        label.setStyle("-fx-font-size: 20");

        HBox search = new HBox(label,searchField,searchBtn,backBtn);
        search.setSpacing(10);
        search.setStyle("-fx-padding: 10");
        VBox mainContainer = new VBox(search,table);
        //mainContainer.setSpacing(10);

        Scene scene = new Scene(mainContainer);
        stage.setScene(scene);
    }

    // Display Played matches in a Table using GUI
    public void matchTable(Stage stage, Scene back){

        TableView <Match> table = new TableView<>();

        // Column Design
        TableColumn<Match, String> teamOne = new TableColumn<>("Team One");
        teamOne.setCellValueFactory(new PropertyValueFactory<>("teamOne"));
        teamOne.setStyle("-fx-alignment: CENTER;");

        TableColumn<Match, String> teamTwo = new TableColumn<>("Team Two");
        teamTwo.setCellValueFactory(new PropertyValueFactory<>("teamTwo"));
        teamTwo.setStyle("-fx-alignment: CENTER;");

        TableColumn<Match, String> team1GoalsScored = new TableColumn<>("Team 1 Scored Goals");
        team1GoalsScored.setCellValueFactory(new PropertyValueFactory<>("team1GoalsScored"));
        team1GoalsScored.setStyle("-fx-alignment: CENTER;");

        TableColumn<Match, String> team2GoalsScored = new TableColumn<>("Team 2 Scored Goals");
        team2GoalsScored.setCellValueFactory(new PropertyValueFactory<>("team2GoalsScored"));
        team2GoalsScored.setStyle("-fx-alignment: CENTER;");

        TableColumn<Match, String> team1GoalsReceived = new TableColumn<>("Team 1 Received Goals");
        team1GoalsReceived.setCellValueFactory(new PropertyValueFactory<>("team1GoalsReceived"));
        team1GoalsReceived.setStyle("-fx-alignment: CENTER;");

        TableColumn<Match, String> team2GoalsReceived = new TableColumn<>("Team 2 Received Goals");
        team2GoalsReceived.setCellValueFactory(new PropertyValueFactory<>("team2GoalsReceived"));
        team2GoalsReceived.setStyle("-fx-alignment: CENTER;");

        TableColumn<Match, String> matchDate = new TableColumn<>("D.O.M");
        matchDate.setCellValueFactory(new PropertyValueFactory<>("matchDate"));
        matchDate.setStyle("-fx-alignment: CENTER;");

        // Add data to column and show column in GUI
        table.getColumns().setAll(teamOne,teamTwo,team1GoalsScored,team2GoalsScored,team1GoalsReceived,team2GoalsReceived,matchDate);
        table.setPrefWidth(1000);
        table.setPrefHeight(400);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.getItems().setAll(matchData);
        table.setStyle("-fx-pref-rows: 100");

        // Search Option
        TextField searchField = new TextField();
        Button searchBtn =  new Button();
        searchBtn.setText("Search");

        searchBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String searchMe = searchField.getText();
                searchField.clear();

                //System.out.println("Searched Objects.");
                //System.out.println(searchMe);

                if (searchMe.equals("")){
                    table.getItems().setAll(matchData);
                }else{

                    ArrayList<Match> tempArray = new ArrayList<>();
                    for (Match club : matchData){

                        if (club.search(searchMe)){
                            tempArray.add(club);
                        }
                    }
                    table.getItems().setAll(tempArray);
                }
            }
        });

        // back button
        Button backBtn = new Button();
        backBtn.setText("Back");

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(back);
            }
        });

        // Interface Design
        Label label = new Label("Premier League Manager");
        label.setStyle("-fx-font-size: 20");

        HBox search = new HBox(label,searchField,searchBtn,backBtn);
        search.setSpacing(10);
        search.setStyle("-fx-padding: 10");
        VBox mainContainer = new VBox(search,table);
        //mainContainer.setSpacing(10);

        Scene scene = new Scene(mainContainer);
        stage.setScene(scene);

    }

    // GUI Part
    public void gui(){
        Stage stage = new Stage();
        stage.setTitle("Premier League Manager");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label label = new Label("Premier League Manager");
        label.setStyle("-fx-font-size: 20");
        GridPane.setConstraints(label,3,0);

        Button bt1 = new Button();
        bt1.setText("Statics");

        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sortData();
                statsTableGUI(stage, grid.getScene());
            }
        });

        GridPane.setConstraints(bt1,1,2);

        // Sort by Goals part
        Button bt2 = new Button();
        bt2.setText("Sort by Goals");

        bt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                clubData.sort(new Comparator<FootballClub>() {
                    @Override
                    public int compare(FootballClub o1, FootballClub o2) {
                        int result;

                        // Compare 1st point to 2nd point
                        Integer x = o1.getClubGoalsScored();
                        Integer y = o2.getClubGoalsScored();

                        result = y.compareTo(x);

                        // when both points are equal comparing with Goals
                        if (x.equals(y)){

                            Double p = o1.getClubPoints();
                            Double q = o2.getClubPoints();

                            result = q.compareTo(p);

                        }
                        return result;

                    }
                });
                statsTableGUI(stage, grid.getScene());
            }
        });

        GridPane.setConstraints(bt2,2,2);

        //Sort by wins part
        Button bt3 = new Button();
        bt3.setText("Sort by Wins");

        bt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                clubData.sort(new Comparator<FootballClub>() {
                    @Override
                    public int compare(FootballClub o1, FootballClub o2) {
                        int result;

                        // Compare 1st point to 2nd point
                        Integer x = o1.getClubWins();
                        Integer y = o2.getClubWins();

                        result = y.compareTo(x);

                        // when both points are equal comparing with Goals
                        if (x.equals(y)){

                            Double p = o1.getClubPoints();
                            Double q = o2.getClubPoints();

                            result = q.compareTo(p);

                        }
                        return result;

                    }
                });
                statsTableGUI(stage, grid.getScene());

            }
        });

        GridPane.setConstraints(bt3,3,2);

        // Random Played Match
        Button bt4 = new Button();
        bt4.setText("Random Match");

        bt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


            }
        });

        GridPane.setConstraints(bt4,1,4);

        // Match Table sort by date part
        Button bt5 = new Button();
        bt5.setText("Match Table");

        bt5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                matchTable(stage, grid.getScene());

            }
        });

        GridPane.setConstraints(bt5,2,4);

        grid.getChildren().addAll(label,bt1,bt2,bt3,bt4,bt5);

        Scene scene = new Scene(grid,600,400);
        stage.setScene(scene);
        stage.showAndWait();

    }

    // Main method
    public static void main(String[] args) {
        launch(args);
    }
}
