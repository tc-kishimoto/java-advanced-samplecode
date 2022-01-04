
public class StartSynchronized {

    public static void main(String[] args) {

        DataBank dBank = new DataBank();

        for (int i = 0; i < 5; i++) {
            new SynchronizedTest(dBank, Integer.toString(i)).start();
        }
    }

}

