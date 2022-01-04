public class TryCatchFinallyTest {
    public static void main(String[] args) {
        int[] myarray = new int[3]; // 長さ3の配列

        System.out.println("代入します");
        try {
            //myarray[100] = 0; // 100番の箱（用意していない箱）に値を入れる
        	myarray[1] = 0; // 1番の箱（用意している箱）に値を入れる
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("--例外処理終了--");
        }
        System.out.println("代入しました");
    }
}
