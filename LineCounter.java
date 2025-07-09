import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCounter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("uitvoer.txt"));

        int i = 0;

        while(scanner.hasNextLine()){
            scanner.nextLine();
            i++;
        }

        System.out.println("The number of lines is: " + i);
        scanner.close();
    }
}
