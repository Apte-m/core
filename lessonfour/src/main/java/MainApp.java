import phone.Phone;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        // Задача 1
        Set<String> stringList = new HashSet<>(Arrays.asList("orange", "orange", "apple", "table", "char", "char", "java", "tv", "men", "woman", "men"));
        System.out.println(stringList + " Количество элементов уникальных элементов " + stringList.stream().distinct().count());

        // Задача 2
        Phone phone = new Phone();

        phone.add("Одинцов", 56456);
        phone.add("Одинцов", 5645645);
        phone.add("Шамеева", 5654);

        System.out.println(phone.get("Одинцов"));


    }

}
