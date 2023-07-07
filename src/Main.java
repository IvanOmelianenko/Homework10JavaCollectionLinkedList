import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<Integer> array = new CustomLinkedList<>();

        array.add(5);
        array.add(25);
        array.add(4);
        array.add(1);
        array.add(9);
        array.set(0, 1);
        System.out.println(array.getFirst());
        System.out.println(array.getLast());


    }
}