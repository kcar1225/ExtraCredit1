
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//sorts the anagrams and display them next to each other

public class Problem1 {
    public static void main(String[] args) {
         //list of anagrams
        String[] anagrams = {"heart", "earth", "iceman", "listen", "cinema", "silent"};
        displayAnagrams(anagrams);
        }

        public static void displayAnagrams(String[] anagrams){
            List<List<String>> anagramWords = new ArrayList<>();

            for(String anagram : anagrams) {
                char[] charArray = anagram.toCharArray(); //sorts the word
                Arrays.sort(charArray);
                String sortedAnagram = new String(charArray);

                // add anagram to a group
                boolean added = false;
                for (List<String> group : anagramWords) {
                    if (group.isEmpty() || sortAnagram(group.get(0)).equals(sortedAnagram)) {
                        group.add(anagram);
                        break;

                    }
                }

                //if anagram does not correspond to a group, create a new group
                if (!added) {
                    List<String> newGroup = new ArrayList<>();
                    newGroup.add(anagram);
                    anagramWords.add(newGroup);

                }
            }


            for (List<String> group : anagramWords) {  //print
                for (String anagram : group) {
                    System.out.print(anagram + " ");
                }
                System.out.println();

                }

            }

    private static String sortAnagram(String anagram) {
        char[] charArray = anagram.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);

    }

}





