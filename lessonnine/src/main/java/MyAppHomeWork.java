import setting.Course;
import setting.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyAppHomeWork {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(new Student("Артем", Course.TESTING)
                ,new Student("Алексей",Course.VETERINARIAN)
                ,new Student("Руслан",Course.TESTING)
                ,new Student("Артем",Course.DEVELOPMENT)));
         //1
         students.stream().map(s -> s.getCourse()).collect(Collectors.toSet()).forEach(System.out::println);

        //2
        students.stream().sorted(((o1, o2) -> o2.getCourse().compareTo(o1.getCourse())))
                .collect(Collectors.toSet()).stream().skip(students.size() -1)
                .collect(Collectors.toSet()).stream().forEach(System.out::println);
        //3
        students.stream().filter(student -> student.getCourse() == Course.TESTING).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
