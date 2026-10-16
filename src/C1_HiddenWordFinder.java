import java.util.ArrayList;

/***
 * Problem: You are given a long string containing a hidden word.
 * Write a function that finds and prints
 * the word hidden between two markers ("start" and "end").
 * Expected output: Hidden word: Hello
 */

public class C1_HiddenWordFinder {

    public static void main(String[] args) {
        C1_HiddenWordFinder c = new C1_HiddenWordFinder();
    }

    public C1_HiddenWordFinder() {
        String sentence = "This is a test startHelloend string.";
        findHiddenWord(sentence);  // Output: Hidden word: Hello
    }

    public void findHiddenWord(String sentence) {
        ArrayList<String> storage = new ArrayList<>();
        int marker = 0;
        for(int i = 0;i<sentence.length();i++){
            if(sentence.charAt(i) == ' ' || i == sentence.length()-1){
                storage.add(sentence.substring(marker, i));
                marker = i+1;
            }
        }
        for(String word: storage){
//            System.out.println(word);
            if(word.startsWith("start") && word.endsWith("end")){
                System.out.println("Hidden word: "+word.substring(5,word.length()-3));
                break;
            }

        }
    }

}
