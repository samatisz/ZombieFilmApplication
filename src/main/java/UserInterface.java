import java.util.Scanner;

public class UserInterface {

    private Film film;
    private Scanner myScanner;
    private WatchList watchList = new WatchList();

    public UserInterface() {
        myScanner = new Scanner(System.in);
        myScanner.close();

//need to use financialTracker and ADV workshop to do this
    }
    //display goes here, switch case
    //options and gets
    public void displayMenu(){
        while (true) {
            System.out.println("============================");
            System.out.println("      Choose an option      ");
            System.out.println(" ");
            System.out.println("1. Display all films");
            System.out.println("2. Search by director");
            System.out.println("3. Search by country of origin");
            System.out.println("4. Search by language");
            System.out.println("5. Show already-watched list");
            System.out.println("6. Add to watch list");
            System.out.println("7. Remove from watch list");
            System.out.println("8. Show to-watch list");
            System.out.println("9. Exit application");
            System.out.println("> ");

            int choice = myScanner.nextInt();
            myScanner.nextLine();

            switch(choice) {
                case 1:
                    displayAllFilmsRequest();
                    break;
                case 2:
                    searchByDirectorRequest();
                    break;
                case 3:
                    searchByCountryOfOriginRequest();
                    break;
                case 4:
                    searchByLanguageRequest();
                    break;
                case 5:
                    showPreviouslyWatchedListRequest();
                    break;
                case 6:
                    addToWatchListRequest(); //this can show watch list as well
                    break;
                case 7:
                    removeFromWatchListRequest();
                    break;
                case 8:
                    showToWatchListRequest();
                    break;
                case 9:
                    exitApplicationRequest();
                    break;
                default:
                    System.out.println("Invalid, please try again!");
            }
        }
    }

    public void displayAllFilmsRequest(){

    }

    public void searchByDirectorRequest() {

    }

    public void searchByCountryOfOriginRequest(){

    }

    public void searchByLanguageRequest() {

    }

    public void showPreviouslyWatchedListRequest() {

    }

    public void addToWatchListRequest() {

    }

    public void removeFromWatchListRequest() {

    }

    public void showToWatchListRequest() {

    }

    public void exitApplicationRequest() {

    }

}
