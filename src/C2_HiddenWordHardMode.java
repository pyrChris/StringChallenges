import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/***
 * Problem: You are given a long string containing multiple hidden words.
 * Write a function that finds and prints
 * the word hidden between two markers ("*" and "~").
 * Identify the song hidden in the text!
 */


public class C2_HiddenWordHardMode {

    public static void main(String[] args) {
        C2_HiddenWordHardMode c = new C2_HiddenWordHardMode();
    }

    public C2_HiddenWordHardMode() {
        findHiddenLyrics("hidden_lyrics.txt");
    }

    public void findHiddenLyrics(String fileName) {

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            String storage = "";
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int start = 0;
                int end = 0;
                for(int i=0;i<line.length();i++){
                    if(line.charAt(i) == '*'){
                        start = i;
                    }
                    else if(line.charAt(i) == '~'){
                        end = i;
                    }
                }
                if(end != 0){
                    storage += line.substring(start+1, end);
                    storage += " ";
                }
            }
            scanner.close();
            System.out.println(storage);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}
