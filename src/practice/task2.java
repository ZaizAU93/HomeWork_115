package practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class task2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Ab", "Bc", "CD", "AA", "a");
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredStrings);
    }
}