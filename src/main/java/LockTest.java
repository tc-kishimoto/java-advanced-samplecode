
public class LockTest {

    public static void main(String[] args) {
        Cashbox cb = new Cashbox();
        SmartPhone sm = new SmartPhone();

        lock(cb);
        lock(sm);

        int pass = 1024;
        unlock(cb, pass);
        unlock(sm, pass);

        if(cb.isLock()) {
            System.out.println("Cashboxはロックされています");
        }

        if(sm.isLock()) {
            System.out.println("SmartPhoneはロックされています");
        }
    }

    public static void lock(Lockable item) {
        item.lock();
    }

    public static void unlock(Lockable item, int pass) {
        item.unlock(pass);
    }
}
