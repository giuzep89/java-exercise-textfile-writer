import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordOrganizer {
    public static void main(String[] args) throws IOException {
        // TODO Sort all the words in alphabetical order
        // Read all of the lines from the given file and add them to an array
        Scanner fileReader = new Scanner(new File("uitvoer.txt"));
        ArrayList<String> lines = new ArrayList<>();
        
        while(fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            lines.add(line);
        }

        // Use the Collections.sort() method to order the lines

        Collections.sort(lines);

        // Write the file with the new lines

        FileWriter writer = new FileWriter(new File("uitvoer.txt"));

        for (String l : lines) {
            writer.write(l + "\n");
        }

        writer.close();
        fileReader.close();
    }
}
