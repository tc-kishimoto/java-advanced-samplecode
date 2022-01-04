
public class TryCatchTest {

	public static void main(String[] args) {
		int[] myarray = new int[3]; // 長さ3の配列

        System.out.println("代入します");
        try {
            myarray[100] = 0; // 100番の箱（用意していない箱）に値を入れる
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("代入しました");

    }

}
