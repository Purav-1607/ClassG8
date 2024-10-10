public class ReverseString {

    public static void main(String[] args) {
        String input = "HELLO WORLD";
        String reversed = reverseWords(input);
        System.out.println(reversed);
    }

    
    public static String reverseWords(String str) {
        String[] words = str.split(" "); 
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            result.append(reverseWord.reverse().toString()).append(" ");
        }

        return result.toString().trim(); 
    }
}
