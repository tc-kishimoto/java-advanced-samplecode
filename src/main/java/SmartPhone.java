
public class SmartPhone extends Player implements Lockable {
	public boolean isLock = false;

    public boolean isLock() {
        return isLock;
    }

    public void lock() {
        isLock = true;
    }

    public void unlock(int pass) {
    	if (pass == Lockable.PASSWORD2) {
            isLock = false;
        }
    }

    public void play() {
        System.out.println("ミュージックプレイヤーを再生します。");
    }

}
