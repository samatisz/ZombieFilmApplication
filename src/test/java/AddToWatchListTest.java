import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class AddToWatchListTest {

    @Test
    public void addAFilmToWatchListTestRequest() {
        // Arrange
        String simulatedInput = "28 Days Later\nDanny Boyle\n2002\nUK\nEnglish\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Act
        addAFilmToWatchListTestRequestMethod();

        // Restore the original System.in and System.out
        System.setIn(originalIn);
        System.setOut(originalOut);

        // Assert
        String expectedOutput = "Please enter the information of the film you would like to add.\n" +
                "Title: \n" +
                "Director: \n" +
                "Year of release: \n" +
                "Country of Origin: \n" +
                "Language: \n" +
                "The film you are adding: \n" +
                "Title: 28 Days Later | Director: Danny Boyle | Year of Release: 2002 | Country: UK | Language: English\n";

        assertEquals(expectedOutput, outputStream.toString());
        System.out.println(expectedOutput);
    }

    // Method to be tested
    public void addAFilmToWatchListTestRequestMethod() {
        Scanner zomScanner = new Scanner(System.in);
        System.out.println("Please enter the information of the film you would like to add.");
        System.out.print("Title: ");
        String title = zomScanner.nextLine();
        System.out.print("Director: ");
        String director = zomScanner.nextLine();
        System.out.print("Year of release: ");
        int year = zomScanner.nextInt();
        zomScanner.nextLine(); // Consume the newline left-over
        System.out.print("Country of Origin: ");
        String country = zomScanner.nextLine();
        System.out.print("Language: ");
        String language = zomScanner.nextLine();

        System.out.println("The film you are adding: ");
        System.out.println("Title: " + title +
                " | Director: " + director +
                " | Year of Release: " + year +
                " | Country: " + country +
                " | Language: " + language);

        zomScanner.close();
    }
}
