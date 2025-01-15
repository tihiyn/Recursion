public class Task4 {
    public boolean isPalindrome(String string) {
        return isPalindrome(string, 0);
    }

    private boolean isPalindrome(String string, final int pointer) {
        if (pointer == string.length() / 2) {
            return true;
        }

        if (string.charAt(pointer) != string.charAt(string.length() - 1 - pointer)) {
            return false;
        }

        return isPalindrome(string, pointer + 1);
    }
}

