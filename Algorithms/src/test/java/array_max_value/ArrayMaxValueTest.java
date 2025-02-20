package array_max_value;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxValueTest {

    @Test
    @DisplayName("Получить максимальный элемент из пустого массива")
    public void emptyArrayTest() {
        assertThrows(Exception.class, () -> ArrayMaxValue.getMaxValue(new int[0]));
    }

    @Test
    @DisplayName("Массив со значениями")
    public void arrayMaxValueTest() {
        Random random = new Random();
        int n = 10;
        int[] array = new int[n];
        int exp = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int next = random.nextInt();
            array[i] = next;
            if (next > exp) {
                exp = next;
            }
        }
        assertEquals(exp, ArrayMaxValue.getMaxValue(array));
    }

    @Test
    @DisplayName("В метод передаётся null")
    public void nullArrayTest() {
        assertThrows(Exception.class, () -> ArrayMaxValue.getMaxValue(null));
    }
}