import array.ArrayMethod;
import array.MyArrayDataException;
import array.MyArrayException;

public class MainApp {
    public static void main(String[] args)  {
        ArrayMethod arrayMethod = new ArrayMethod();


        try {
            String[][] a = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "f", "1", "1"}, {"1", "1", "1", "1"}};
            arrayMethod.arrayMethod(a);
        } catch (MyArrayException e) {
            System.out.println("Размер массива превышен");
        } catch (MyArrayDataException e) {
            System.out.println("Введены не верные символы  в ячейке " + e.getJ());

        }

    }
}
