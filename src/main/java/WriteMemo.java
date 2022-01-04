
public class WriteMemo {
    public static void main(String[] args) {
    	Pocketbook pocketbook = new Pocketbook("TEST");

        // メモに書き込み
        pocketbook.text = "9時にAxiz";

        // メモを標準出力に出力
        pocketbook.printMemo();

        // メモを削除
        pocketbook.deleteMemo();

        // メモを標準出力に出力
        pocketbook.printMemo();

    }
}
