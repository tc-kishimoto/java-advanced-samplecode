package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    public void 割り切れる計算() {
        int result = Sample.dividing(500, 100);
        int expected = 5; // 想定される結果

        // 想定される結果と処理結果とを比較
        assertEquals(expected, result);
    }

}
