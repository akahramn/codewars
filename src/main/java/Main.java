import kyu6.BouncingBall;
import kyu6.ConvertStringToCamelCase;

public class Main {
    public static void main(String[] args) {
        BouncingBall bouncingBall = new BouncingBall();
        bouncingBall.calculate(3.0, 0.66, 1.5);


        ConvertStringToCamelCase convertStringToCamelCase = new ConvertStringToCamelCase();
        String str = "the-stealth-warrior";
        String str1 = "The_Stealth_Warrior";
        System.out.println(convertStringToCamelCase.toCamelCase(str));
        System.out.println(convertStringToCamelCase.toCamelCase(str1));



    }
}
