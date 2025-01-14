public class Task4 {
    public boolean isPalindrome(String string) {
        if (string.length() <= 1) {
            return true;
        }

        char firstChar = string.charAt(0);
        char lastChar = string.charAt(string.length() - 1);

        string = string.substring(1, string.length() - 1);

        return firstChar == lastChar && isPalindrome(string);
    }
}

