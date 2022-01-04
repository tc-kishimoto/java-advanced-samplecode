
public class ThreadTest extends Thread {

	public String name;

    public ThreadTest(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + ":" + i);
        }
    }

}
