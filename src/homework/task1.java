package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> uniqueEvenNumbers = numbers.stream().distinct().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Сумма равна :" + uniqueEvenNumbers.stream().
                mapToInt(Integer::intValue)
                .sum());
        System.out.println("колличесвто элементов коллекции = "+uniqueEvenNumbers.size());
    }
}