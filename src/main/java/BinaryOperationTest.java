
public class BinaryOperationTest {

    public static void main(String[] args) {
        BinaryOperation bo1 = new BinaryOperation();
        BinaryOperation bo2 = new BinaryOperation();

        bo1.left = 10;
        bo1.right = 20;

        bo2.left = 2;
        bo2.right = 22;

        System.out.println(bo1.exec());
        System.out.println(bo2.exec());
    }

}
