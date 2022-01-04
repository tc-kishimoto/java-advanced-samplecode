
public class DataBank {

    private String tempData;

    public synchronized void setAndCheckData(String input) {
        this.tempData = input;

        System.out.println("情報を格納しました。（" + input + ")");

        if (tempData.equals(input)) {
            System.out.println("一致（" + input + "）");
        } else {
            System.out.println("不一致（" + tempData + ", " + input + ")");
        }
    }

}


