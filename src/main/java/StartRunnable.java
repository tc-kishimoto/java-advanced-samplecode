
public class StartRunnable {

    public static void main(String[] args) {
        RunnableTest rTestA = new RunnableTest("A");
        RunnableTest rTestB = new RunnableTest("B");
        Thread testA = new Thread(rTestA);
        Thread testB = new Thread(rTestB);
        testA.start();
        testB.start();
    }

}


