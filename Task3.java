import java.util.List;

public class Task3 {
    public int calcLength(List<?> list) {
        if (list.isEmpty()) {
            return 0;
        }

        list.remove(0);
        return 1 + calcLength(list);
    }
}

