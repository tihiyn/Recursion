public class Task2 {
    public int calcDigitsSum(int number) {
        if (number / 10 == 0) {
            return number;
        }

        return number % 10 + calcDigitsSum(number / 10);
    }
}


