import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public List<String> findAllFiles(String pathToDirectory) {
        List<String> files = new ArrayList<>();
        findAllFiles(files, pathToDirectory);

        return files;
    }

    private void findAllFiles(List<String> files, String pathToDirectory) {
        File directory = new File(pathToDirectory);
        File[] nestedFiles = directory.listFiles();

        if (nestedFiles == null) {
            return;
        }

        for (File file: nestedFiles) {
            if (!file.isDirectory()) {
                files.add(file.getName());
                continue;
            }

            findAllFiles(files, file.getPath());
        }
    }
}

