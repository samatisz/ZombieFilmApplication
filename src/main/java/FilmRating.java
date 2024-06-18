import java.util.Scanner;

public class FilmRating {
    private int zombieRating;
    private int enjoyability;
    private int plot;
    private int specialEffects;
    private int setting;

    Scanner zomScanner = new Scanner(System.in);

    public void rateMovieDisplay() {
        while (true) {
            System.out.println("      Rate the following aspects of the film from 1 to 5: ");
            System.out.println("     Each rating will be averaged to create a single rating.");
            System.out.println("===================================================================");
            System.out.println(" ");
            System.out.println(" 1. Rate the Zombies");
            System.out.println(" 2. Rate the enjoyability");
            System.out.println(" 3. Rate the plot");
            System.out.println(" 4. Rate the special effects (or animation)");
            System.out.println(" 5. Rate the world/setting of the film");
            System.out.println(" 6. Finish and total score");
            System.out.println(" > ");

            int rating = zomScanner.nextInt();
            zomScanner.nextLine();

            switch (rating) {
                case 1:
                    addZombieRating();
                    break;
                case 2:
                    addEnjoyabilityRating();
                    break;
                case 3:
                    addPlotRating();
                    break;
                case 4:
                    addSpecialEffectsRating();
                    break;
                case 5:
                    addSettingRating();
                    break;
                case 6:
                    sumRatingAndAdd();
                    break;
                default:
                    System.out.println("Error, please try again!");
            }
        }
    }

    public void addZombieRating() {

    }

    public void addEnjoyabilityRating() {
    }

    public void addPlotRating() {
    }

    public void addSpecialEffectsRating() {
    }

    public void addSettingRating() {
    }

    public void sumRatingAndAdd() {
        // Calculate the average rating
    }

}



