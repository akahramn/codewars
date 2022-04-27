package kahraman.server.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BouncingBallTest {

    @Test
    void calculate() {
         BouncingBall bouncingBall = new BouncingBall();
        int actualValue = bouncingBall.calculate(3.0, 0.66, 1.5);
        int expectedValue = 3;
       assertEquals(expectedValue, actualValue);
    }
}