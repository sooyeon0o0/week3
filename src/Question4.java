//두 개의 숫자와 연산자(+, -, *, /)를 입력받아 해당 연산을 수행하고 결과를 출력하는 프로그램을 작성하세요.
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int num2 = sc.nextInt();

        System.out.print("연산자(+, -, *, /) 입력: ");
        String a = sc.next();

        switch (a) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
        }
    }
}
