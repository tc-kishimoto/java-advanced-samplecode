
public class RunnableTest implements Runnable {

    public String name;

    public RunnableTest(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + ":" + i);
        }
    }

}

