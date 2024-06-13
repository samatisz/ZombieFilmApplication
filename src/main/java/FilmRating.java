import java.util.Scanner;

public class FilmRating {
        private int fearFactor;
        private int enjoyability;
        private int storyline;
        private int specialEffects;


  Scanner zomScanner = new Scanner(System.in);

  public void rateZombieMovie() {
    System.out.println("Rate the following aspects of the film from 1 to 10.: ");
    System.out.println("""
            1. Fear Factor
            2. Enjoyability
            3. Storyline
            4. Special Effects
            """);
    System.out.println("Each rating will be averaged to create a single rating.");
  }
}

//     Get ratings from the user
//    double fearFactor = getRating(scanner, "Fear Factor");
//    double enjoyability = getRating(scanner, "Enjoyability");
//    double storyline = getRating(scanner, "Storyline");
//    double specialEffects = getRating(scanner, "Special Effects");
//
//    // Calculate the average rating
//    double averageRating = (fearFactor + enjoyability + storyline + characterDevelopment + specialEffects) / 5;
//       // System.out.printf("Overall Rating: %.2f/10%n", averageRating);
//
//    // private static double getRating(Scanner scanner, String factorName) {
//    System.out.print(factorName + ": ");
//    return scanner.nextDouble();
//}

