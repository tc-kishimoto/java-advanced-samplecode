
public class GCTest {

    public static void main(String [ ] args) {

        long memory = Long.MAX_VALUE;

        while (true) {

            String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

            if (memory < Runtime.getRuntime().freeMemory()) {
                System.out.println("GCが行われました");
                System.out.println("GC前残メモリ量：" + memory);
                System.out.println("GC後残メモリ量：" +
                                   Runtime.getRuntime().freeMemory());
                break;
            } else {
                memory = Runtime.getRuntime().freeMemory();
                System.out.println("残メモリ量：" + memory);
            }
        }

    }

}

