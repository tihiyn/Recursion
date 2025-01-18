import java.util.List;

public class Task7<T extends Comparable<T>> {
    public T findSecondMax(List<T> list) {
        if (list.isEmpty() || list.size() == 1) {
            return null;
        }

        T lesser = list.get(0);
        T greater = list.get(1);
        if (lesser.compareTo(greater) > 0) {
            T swapTemp = lesser;
            lesser = greater;
            greater = swapTemp;
        }

        return findSecondMaxRecursive(list, 0, lesser, greater);
    }

    private T findSecondMaxRecursive(List<T> list, final int index, T firstMax, T secondMax) {
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

        return findSecondMaxRecursive(list, index + 1, firstMax, secondMax);
    }
}

