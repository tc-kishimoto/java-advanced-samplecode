
public class StartThread {

    public static void main(String[] args) {
        ThreadTest testA = new ThreadTest("A");
        ThreadTest testB = new ThreadTest("B");
        ThreadTest testC = new ThreadTest("C");
        testA.start();
        testB.start();
        testC.start();
    }

}

