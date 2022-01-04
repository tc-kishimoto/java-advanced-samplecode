
public class Pocketbook extends Memo {
	public Pocketbook() {
        System.out.println("Pocketbookクラス　引数なしのコンストラクター");
    }

    public Pocketbook(String inputStr) {
    	super(inputStr);
    	System.out.println("Pocketbookクラス　引数ありのコンストラクター");
        System.out.println("入力値は" + inputStr + "です。");
    }

    // メモを標準出力に出力
    public void printMemo() {
        System.out.println("オーバーライドしました。");
    }

    // メモを取り消す
    public void deleteMemo() {
        this.text = "空欄";
        System.out.println("メモを削除しました。");
    }


}

