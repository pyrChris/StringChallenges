import java.util.ArrayList;

/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        String temp = post;
        ArrayList<String> storage = new ArrayList<>();

        int marker = 0;
        for(int i = 0;i<post.length();i++){
            if(post.charAt(i) == ' ' || i == post.length()-1){
                if(post.charAt(marker+1) == '#') {
                    storage.add(post.substring(marker, i));
                }
                marker = i;
            }
        }
        for(int i = 0;i< storage.size();i++){
            System.out.print("Hashtag: " + storage.get(i));
            if(i!=storage.size()-1){
                System.out.print(", ");
            }
        }
    }

}
