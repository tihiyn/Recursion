import java.util.List;

public class Task7<T extends Comparable<T>> {
    public T findSecondMax(List<T> list) {
        if (list.isEmpty() || list.size() == 1) {
            return null;
        }

        if (list.get(0).compareTo(list.get(1)) <= 0) {
            return findSecondMax(list, 0, list.get(0), list.get(1));
        }

        return findSecondMax(list, 0, list.get(1), list.get(0));
    }

    private T findSecondMax(List<T> list, final int index, T firstMax, T secondMax) {
        if (index == list.size()) {
            return secondMax;
        }

        if (list.get(index).compareTo(secondMax) > 0 && list.get(index).compareTo(firstMax) < 0) {
            secondMax = list.get(index);
        }

        if (list.get(index).compareTo(firstMax) >= 0) {
            secondMax = firstMax;
            firstMax = list.get(index);
        }

        return findSecondMax(list, index + 1, firstMax, secondMax);
    }
}

