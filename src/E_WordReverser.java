import java.util.ArrayList;

/***
 * Problem: Write a method that takes a sentence and reverses
 * each word individually without changing their positions.
 * Expected output: avaJ si emosewa
 */

public class E_WordReverser {

    public static void main(String[] args) {
        E_WordReverser e = new E_WordReverser();
    }

    public E_WordReverser() {
        String sentence = "Java is awesome";
        reverseWords(sentence);  // Output: avaJ si emosewa
    }

    public void reverseWords(String sentence) {
        String output = "";
        int marker = 0;
        String temp = "";

        for(int i = 0;i<sentence.length();i++){
            if(sentence.charAt(i) == ' '){
                temp = sentence.substring(marker, i);
                marker = i+1;
                for(int j = 0;j<temp.length();j++){
                    output += temp.charAt(temp.length() - (j + 1));
                }
                output += " ";
            }
            else if(i == sentence.length()-1){
                temp = sentence.substring(marker, i+1);
                for(int j = 0;j<temp.length();j++){
                    output += temp.charAt(temp.length() - (j + 1));
                }
            }
        }
        System.out.println(output);
    }
}
