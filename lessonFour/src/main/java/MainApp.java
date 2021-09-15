import phone.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Задача 1
        List<String> stringList  = new ArrayList<>(Arrays.asList("orange", "orange", "apple", "table", "char", "char", "java", "tv", "men", "woman", "men"));
        stringList.stream().distinct().forEach(System.out::println);
        System.out.println("Количество элементов уникальных элементов "+stringList.stream().distinct().count());

        // Задача 2
        Phone phone = new Phone();
        phone.add("Одинцов","89166079402");
        phone.add("Одинцов","89166079402");
        phone.add("Шамеева","89998035229");



        System.out.println(phone.get("Шамеева"));
        System.out.println(phone.get("Одинцов"));

    }

}
