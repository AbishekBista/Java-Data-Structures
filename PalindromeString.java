public class PalindromeString {

    public boolean checkPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while(start < end) {
            if(charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {
        String word = "word";
        PalindromeString ps = new PalindromeString();
        System.out.println(ps.checkPalindrome(word));
        
    }
}
