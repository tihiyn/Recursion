import java.util.List;

public class Task7 {
    public int findSecondMax(List<Integer> list) {
        return findSecondMax(list, 0, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    private int findSecondMax(List<Integer> list, final int index, int firstMax, int secondMax) {
        if (index == list.size()) {
            return secondMax;
        }

        if (list.get(index) > secondMax && list.get(index) < firstMax) {
            secondMax = list.get(index);
        }

        if (list.get(index) >= firstMax) {
            secondMax = firstMax;
            firstMax = list.get(index);
        }

        return findSecondMax(list, index + 1, firstMax, secondMax);
    }
}

