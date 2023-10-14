import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculateDiscount() {
        // Проверка суммы покупки со скидкой
        double purchaseAmount = 100;
        int discountAmount = 20;
        double expected = 80;

        double actual = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCalculateDiscountWithZeroPurchaseAmount() {
        // Проверка суммы покупки со скидкой при нулевой сумме покупки
        double purchaseAmount = 0;
        int discountAmount = 10;
        double expected = 0;

        double actual = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCalculateDiscountWithZeroDiscountAmount() {
        // Проверка суммы покупки со скидкой при нулевой скидке
        double purchaseAmount = 100;
        int discountAmount = 0;
        double expected = 100;

        double actual = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCalculateDiscountWithNegativePurchaseAmount() {
        // Проверка выброса исключения при отрицательной сумме покупки
        double purchaseAmount = -100;
        int discountAmount = 20;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid purchase amount");
    }

    @Test
    public void testCalculateDiscountWithNegativeDiscountAmount() {
        // Проверка выброса исключения при отрицательной скидке
        double purchaseAmount = 100;
        int discountAmount = -20;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid discount amount");
    }

    @Test
    public void testCalculateDiscountWithInvalidDiscountAmount() {
        // Проверка выброса исключения при недопустимом значении скидки
        double purchaseAmount = 100;
        int discountAmount = 200;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid discount amount");
    }
}