import java.util.List;

public class Task5 {
    public void printEvenElements(List<Integer> list) {
        printEvenElements(list, 0);
    }

    private void printEvenElements(List<Integer> list, final int index) {
        if (index == list.size()) {
            return;
        }

        if (list.get(index) % 2 == 0) {
            System.out.println(list.get(index));
        }

        printEvenElements(list, index + 1);
    }
}

