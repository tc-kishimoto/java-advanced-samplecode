import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("apple", "200");
        map.put("orange", "100");
        map.put("peach", "300");

        String s = "apple";
        if (map.containsKey(s)) {
            System.out.println("りんごの値段：" + map.get(s));
        } else {
            System.out.println("指定したキーは存在しません");
        }
    }
}
