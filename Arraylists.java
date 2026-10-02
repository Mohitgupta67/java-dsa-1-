import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

        System.out.println(list);

        int element = list.get(0);
        System.out.println(element);

        list.add(1, 10);
        System.out.println(list);

        list.set(0, 9);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }
}