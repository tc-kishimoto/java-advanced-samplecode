
public class Memo {
    public String text; // フィールド

    public Memo() {
        System.out.println("Memoクラス　引数なしのコンストラクター");
    }

    public Memo(String inputStr) {
        System.out.println("Memoクラス　引数ありのコンストラクター");
        System.out.println("入力値は" + inputStr + "です。");
    }

    // メモを標準出力に出力
    public void printMemo() {
        System.out.println(text);
    }
}
