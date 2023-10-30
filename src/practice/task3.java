package Homework15.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class task3 {
    public static void main(String[] args) {
        List<Developer> developers = Arrays.asList(
                new Developer(1, "AM"),
                new Developer(5, "Am"),
                new Developer(12, "Annnn"),
                new Developer(8, "aAnn"),
                new Developer(15, "BAn")
        );
        List<Developer> filteredDevelopers = developers.stream()
                .filter(d -> d.getId() > 10 && d.getName().startsWith("An"))
                .collect(Collectors.toList());
        System.out.println(filteredDevelopers);
    }
}