import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        //задание1

        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        change(arr1,1,4);
        change(arr2,0,2);

        //задание2

      String[] array = {"1", "2", "3", "4"};
         asList(array);

        //задание3

        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("\nЗадание 3:");
        System.out.println("'g' - addFruit: ");
        or.addFruit(new Orange(),10);
        or1.addFruit(new Orange(),12);
        ap.addFruit(new Apple(),15);
        ap1.addFruit(new Apple(),4);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        System.out.println("'e' - compare(): ");
        System.out.println("Box 1 equals box 3: "+or.compare(ap));
        System.out.println("Box 2 equals box 4: "+or1.compare(ap1));
        System.out.println("'f' - putTo(): ");
        or.putTo(or1);
        ap.putTo(ap1);
        System.out.println("'d' - getWeight(): ");
        System.out.println("Box 1: "+or.getWeight()+" Box1 переложили в Box2");
        System.out.println("Box 2: "+or1.getWeight()+" Вес коробки Box2");
        System.out.println("Box 3: "+ap.getWeight()+" Box3 переложили в Box4");
        System.out.println("Box 4: "+ap1.getWeight()+" Вес коробки Box4");

     }

        //метод добавления
    private static void asList(String[] array) {
        List<String> list = new ArrayList<String>();
        System.out.print("Задание 2: "+Arrays.toString(array));
        Collections.addAll(list, array);
        // Изменяет и массив и ArrayList
        list.add("5");
        array[0]="1";
        System.out.println("\nРезультат преобразования (и добавления элемента) Array в ArrayList с помощью метода Collections.addAll()");
        for (String str : list)
            System.out.print(" " + str);
        System.out.print("\n=======");
    }

        //метод перестановки
    public static void change(Object[] arr, int n1, int n2) {
        System.out.println("Задание 1: "+ Arrays.toString(arr));
        Object sw=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат перестановки: "+Arrays.toString(arr)+"\n=======");
    }

}
