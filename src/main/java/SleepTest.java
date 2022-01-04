
public class SleepTest {

    public static void main(String[] args) {

        // 0～9の数字を表示
        for (int i = 0; i < 10; i++ ) {
            System.out.print(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}


