import java.io.IOException;
import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) throws IOException {
        AppDate appDate = new AppDate();
        appDate.load("LessonFive/demo.csv");

        System.out.println(Arrays.toString(appDate.getHeader()));
        System.out.println(Arrays.deepToString(appDate.getData()));
        appDate.save("LessonFive/demoTwo.csv");


    }

}

