public class Task4 {
    public boolean isPalindrome(String string) {
        return isPalindrome(string, 0, string.length() - 1);
    }

    private boolean isPalindrome(String string, int leftPointer, int rightPointer) {
        if (leftPointer >= rightPointer) {
            return true;
        }

        if (string.charAt(leftPointer) != string.charAt(rightPointer)) {
            return false;
        }

        leftPointer++;
        rightPointer--;

        return isPalindrome(string, leftPointer, rightPointer);
    }
}

