package premierLeagueManager;

public class Date {

    private int[] date = new int[3];

    public Date(String MatchDate){

        try{

            String [] tempDate = MatchDate.split("/");

            if (tempDate[2].length() !=4){
                System.out.println("** Invalid Date **\nPlease Check your Year!");
                throw new IllegalArgumentException();
            } else {
                date[0] = Integer.parseInt(tempDate[0]); // DD (Date)
                date[1] = Integer.parseInt(tempDate[1]); // MM (Month)
                date[2] = Integer.parseInt(tempDate[2]); // YYYY (Year)
            }

            // Check year has 4 characters
            if(date[0]>31 || date[0]<1){
                if (date[0]>31){
                    System.out.println("** Invalid Date **" +
                            "\nMonth should have only maximum 31 Days. Please Check your Date!");
                }else {
                    System.out.println("** Invalid Date **" +
                            "\nMonth should on above 0 Days. Please Check your Date!");
                }
                throw new IllegalArgumentException();
            }
            // Check user's year has 1 to 12 months
            else if (date[1]>12 || date[1]<1){
                if(date[1]>12){
                    System.out.println("** Invalid Date **" +
                            "\nYear should have only maximum 12 Months. Please Check your Month!");;
                } else{
                    System.out.println("** Invalid Date **" +
                            "\nYour month should on above 0 Months. Please Check your Month!");;
                }
            throw new IllegalArgumentException();
            }

        }catch (Exception e){
            System.out.println("** Date Format Error **");
            throw new IllegalArgumentException();

        }
    }

    // Getter for date
    public String getDate(){
        return date[0]+"/"+date[1]+"/"+date[2];
    }

}
