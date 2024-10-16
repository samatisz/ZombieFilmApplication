import java.util.Scanner;

public class UserInterface {

    private Film film;
    private Scanner myScanner;

    public UserInterface() {
        myScanner = new Scanner(System.in);
        myScanner.close();

//need to use financialTracker and ADV workshop to do this
    }
    //display goes here, switch case
    //options and gets
    public void watchListMenu(){
        while (true) {
            System.out.println("Welcome to Zombie Watch List!");
            System.out.println("All films that have yet to be watched are complied here.");
            System.out.println(" ");
            System.out.println("Choose an option: ");
            System.out.println("1. Display watch list");
            System.out.println("2. Add to watch list");
            System.out.println("3. Remove from watch list");
            System.out.println("4. Exit application to the main menu");
            System.out.println("> ");

            int choice = myScanner.nextInt();
            myScanner.nextLine();

            switch(choice) {
                case 1:
                    displayWatchListRequest();
                    break;
                case 2:
                    addToWatchListRequest();
                    break;
                case 3:
                    removeFromWatchListRequest();
                    break;
                case 4:
                    exitWatchListDisplayRequest(); //this needs to be changed to just an exit
                    break;
                default:
                    System.out.println("Invalid, please try again!");
                    myScanner.close();
            }
        }
    }

    public void displayWatchListRequest(){
        // will need an array list

    }

    public void addToWatchListRequest() {
        Scanner zomScanner = new Scanner(System.in);
        System.out.println("Please enter the information of the film you would like to add.");
        System.out.println("Title: ");
        String title = zomScanner.nextLine();
        System.out.println("Director: ");
        String director = zomScanner.nextLine();
        System.out.println("Year of release: ");
        int year = zomScanner.nextInt();
        System.out.println("Country of Origin: ");
        String country = zomScanner.nextLine();
        System.out.println("Language: ");
        String language = zomScanner.nextLine();

        System.out.println("The film you are adding: \n");
        System.out.println("Title: " + title +
                " | Director: " + director +
                " | Year of Release: " + year +
                " | Country: " + country +
                " | Language: " + language);

        zomScanner.close();
    }

    public void removeFromWatchListRequest() {
        System.out.println("Please enter the ID number for the film you would like to remove.");

    }


    public void exitWatchListDisplayRequest() {
//i don't need this, just need to make an exit
    }

    public void seenListDisplayMenu(){
        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("==================");
            System.out.println(" ");
            System.out.println("1. Display all films");
            System.out.println("2. Search by title");
            System.out.println("3. Search by director");
            System.out.println("4. Search by country of origin");
            System.out.println("5. Search by language");
            System.out.println("6. Add to seen movie list");
            System.out.println("8. Exit application to the main menu");
            System.out.println("> ");

            int choice = myScanner.nextInt();
            myScanner.nextLine();

            switch(choice) {
                case 1:
                    displayAllMoviesRequest();
                    break;
                case 2:
                    searchByTitle();
                    break;
                case 3:
                    searchByDirectorRequest();
                    break;
                case 4:
                    searchByCountryOfOriginRequest();
                    break;
                case 5:
                    searchByLanguageRequest();
                    break;
                case 6:
                    addToSeenMoviesRequest(); //this will make a new Movie object and rating happens here // switch case needed
                    break;
                case 7:
                    exitSeenListDisplayRequest();
                    break;
                default:
                    System.out.println("Invalid, please try again!");
                    myScanner.close();
            }
        }
    }

    public void displayAllMoviesRequest() {
    }

    public void searchByTitle() {
    }

    public void searchByDirectorRequest() {
    }

    public void searchByCountryOfOriginRequest() {
    }

    public void searchByLanguageRequest() {
    }

    public void addToSeenMoviesRequest() {
    }

    public void exitSeenListDisplayRequest() {
    }



}
