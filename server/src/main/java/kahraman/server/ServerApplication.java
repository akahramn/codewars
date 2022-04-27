package kahraman.server;

import kahraman.server.kyu6.BouncingBall;
import kahraman.server.kyu6.ConvertStringToCamelCase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);

		BouncingBall bouncingBall = new BouncingBall();
		bouncingBall.calculate(3.0, 0.66, 1.5);

		System.out.println("hello");

		ConvertStringToCamelCase convertStringToCamelCase = new ConvertStringToCamelCase();
		String str = "the-stealth-warrior";
		String str1 = "The_Stealth_Warrior";
		System.out.println(convertStringToCamelCase.toCamelCase(str));
		System.out.println(convertStringToCamelCase.toCamelCase(str1));
	}

}
