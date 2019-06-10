import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Sort {

    public void print(URL path, Comparator<Integer> comparator) {
        System.out.println(sort(path, comparator).toString());
    }

    public TreeSet<Integer> sort(URL path, Comparator<Integer> comparator){
        try {
            return Files.lines(Paths.get(path.toURI()))
                    .flatMap(s -> Arrays.stream(s.split(",")))
                    .map(Integer::valueOf)
                    .collect(Collectors.toCollection(() -> new TreeSet<>(comparator)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
