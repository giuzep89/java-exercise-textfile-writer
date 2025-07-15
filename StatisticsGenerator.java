import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StatisticsGenerator {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Show statistics in the console (n. of words, n. of lines)

        // - Use a while loop to go through the file
        // - use an index to count the lines
        // - use the next() method to count the words
        Scanner fileReader = new Scanner(new File("uitvoer.txt"));
        int numberOfLines = 0;
        int numberOfWords = 0;

        while(fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            String[] words = line.trim().split("\\s+");
            for (String w : words){
                numberOfWords++;
            }
            numberOfLines++;
        }

        System.out.println("Woorden: " + numberOfWords + "\nRegels: " + numberOfLines);
        fileReader.close();
    }
}
