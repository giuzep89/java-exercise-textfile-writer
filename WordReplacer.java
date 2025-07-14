import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) throws IOException {
        // GOAL: I wanna replace an word in the file with another word
        Scanner userInput = new Scanner(System.in);
        Scanner fileReader = new Scanner(new File("uitvoer.txt"));

        ArrayList<String> lines = new ArrayList<>();

        // 1) Ask the user to choose the word to replace
        System.out.println("Choose word to replace:");
        String oldWord = userInput.nextLine();

        // 2) Ask the user to choose a new word
        System.out.println("Choose new word:");
        String newWord = userInput.nextLine();

        // 3) Read the file line by line (while loop)
        // 4) If the line contains the old word, replace it with the new word and print
        // "Woord vervangen!"
        boolean isReplaced = false;
        while(fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            if(line.contains(oldWord)){
                line = line.replace(oldWord, newWord);
                isReplaced = true;
                lines.add(line);
            } else {
                lines.add(line);
            }
        }

        System.out.println(isReplaced);
        System.out.println(lines);

        FileWriter writer = new FileWriter("uitvoer.txt");
        if (isReplaced){
            for (String l : lines){
                writer.write(l + "\n");
            }
            System.out.println("Woord vervangen!");
        } else {
            System.out.println("Woord niet aanwezig");
        }

        writer.close();
    }
}
