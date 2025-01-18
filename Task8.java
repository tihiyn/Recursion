import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public List<String> findAllFiles(String pathToDirectory) {
        List<String> files = new ArrayList<>();
        File directory = new File(pathToDirectory);
        File[] nestedFiles = directory.listFiles();

        if (nestedFiles == null) {
            return files;
        }

        for (File file: nestedFiles) {
            if (file.isDirectory()) {
                files.addAll(findAllFiles(file.getPath()));
                continue;
            }

            files.add(file.getName());
        }

        return files;
    }
}

