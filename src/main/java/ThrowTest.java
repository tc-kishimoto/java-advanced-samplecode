
public class ThrowTest {

	public static void main(String[] args) {

		try {
            throwEx();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("終了します");

	}

	public static void throwEx() throws Exception {
        throw new Exception();
    }

}
