import java.util.List;

public class Task6 {
    public void printEvenIndexElems(List<?> list) {
        printEvenIndexElems(list, 0);
    }

    private void printEvenIndexElems(List<?> list, final int index) {
        if (index >= list.size()) {
            return;
        }

        System.out.println(list.get(index));

        printEvenIndexElems(list, index + 2);
    }
}

