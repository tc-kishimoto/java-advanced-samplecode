
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("Alice");
        array.add("Bob");
        array.add("Chris");
        array.add("Michael");

        for (int i = 0; i < array.size(); i++) {
        	String s = array.get(i);
            System.out.println(s);
        }

        //イテレーター
        /*
        for (Iterator<String> it = array.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        */

        //拡張for文
        /*
        for (String name : array) {
            System.out.println(name);
        }
        */
    }

}
