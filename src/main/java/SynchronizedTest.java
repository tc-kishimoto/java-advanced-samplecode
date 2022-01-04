
public class SynchronizedTest extends Thread {

    public DataBank dBank;
    public String input;

    public SynchronizedTest(DataBank dBank, String input) {
        this.dBank = dBank;
        this.input = input;
    }

    public void run() {
        this.dBank.setAndCheckData(this.input);
    }

}


