package homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class task2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kok");
        map.put(2, "Abdul");
        map.put(3, "Joni");
        map.put(4, "Boris");
        map.put(5, "Boriska");
        map.put(6, "Bobr");
        map.put(7, "Bibik");
        map.put(8, "sss");
        map.put(9, "Joni");
        map.put(10, "qqqqq");
        map.put(11, "dddd");
        map.put(12, "ald");
        map.put(13, "kkkk");
        List<String> reversedNames = map.entrySet().stream()
                .filter(entry -> List.of(1, 2, 5, 8, 9, 13).contains(entry.getKey()))
                .filter(entry -> entry.getValue().length() % 2 != 0)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reversedNames);
    }
}