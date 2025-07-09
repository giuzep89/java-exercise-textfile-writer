import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileReader = new Scanner(new File("uitvoer.txt"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which word would you like to search?");
        String input = scanner.nextLine();

        int i = 0;
        int y = 0;

        while (fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            if (line.contains(input)){
                System.out.println("Yup!");
                return;
            }
            i++;
        }
        fileReader.close();
        scanner.close();

        Scanner fileReader2 = new Scanner(new File("uitvoer.txt"));

        while(fileReader2.hasNextLine()){
            fileReader2.nextLine();
            y++;
        }

        if (i == y){
            System.out.println("Nopers");
        }


    }
}
