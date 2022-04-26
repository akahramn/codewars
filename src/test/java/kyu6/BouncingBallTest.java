package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BouncingBallTest {

    @Test
    public void givenInputVariables_whenCalculate_thenReturnBouncing() {
        BouncingBall bouncingBall = new BouncingBall();
        int actualValue = bouncingBall.calculate(3.0, 0.66, 1.5);
        int expectedValue = 3;
        Assertions.assertEquals(expectedValue, actualValue);

    }
}
