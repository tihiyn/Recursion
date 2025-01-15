import java.util.List;

public class Task6 {
    public void printEvenIndexElems(List<?> list) {
        printEvenIndexElems(list, 0);
    }

    private void printEvenIndexElems(List<?> list, int index) {
        if (index >= list.size()) {
            return;
        }

        System.out.println(list.get(index));
	index += 2;

        printEvenIndexElems(list, index);
    }
}

