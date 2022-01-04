
public class Cashbox implements Lockable, Dial {
    public boolean isLock = false;

    public boolean isLock() {
        return isLock;
    }

    public void lock() {
        isLock = true;
    }

    public void unlock(int pass) {
        if (pass == Lockable.PASSWORD1) {
            isLock = false;
        }
    }
}
