public class Task1 {
    public int raiseToPow(int N, int M) {
        if (M == 1) {
            return N;
        }

        return N * raiseToPow(N, M - 1);
    }
}

