
public interface Lockable {
    // フィールド
    int PASSWORD1 = 1024;
    int PASSWORD2 = 2048;

    // メソッド
    boolean isLock();
    void lock();
    void unlock(int pass);
}
