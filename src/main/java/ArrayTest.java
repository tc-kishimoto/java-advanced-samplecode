
public class ArrayTest {

    public static void main(String[] args) {
        String[] array = new String[4]; // 長さ4の文字列の配列

        array[0] = "Alice";
        array[1] = "Bob";
        array[2] = "Chris";
        array[3] = "Michael";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

