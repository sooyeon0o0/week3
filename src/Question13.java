// 세 개의 숫자와 연산자(+, -, *, /)를 입력받아
// * , / 연산자를 먼저 계산을 수행하고 결과를 출력하는 프로그램을 작성하세요.
// if 문을 사용 하지 말고 switch 문으로만 작성하세요.

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("첫 번째 연산자를 입력해주세요(+,-,*,/): ");
        String op1 = sc.next();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("두 번째 연산자를 입력해주세요(+,-,*,/): ");
        String op2 = sc.next();

        System.out.print("세 번째 숫자를 입력하세요: ");
        int num3 = sc.nextInt();

        double result = 0.0;

        switch (op1) {

            case "*":
                switch (op2) {
                    case "*":
                        result = (num1 * num2) * num3;
                        break;
                    case "/":
                        result = (num1 * num2) / num3;
                        break;
                    case "+":
                        result = (num1 * num2) + num3;
                        break;
                    case "-":
                        result = (num1 * num2) - num3;
                        break;
                }
                break;

            case"/":
                switch (op2) {
                    case "*":
                        result = (num1 / num2) * num3;
                        break;
                    case "/":
                        result = (num1 / num2) / num3;
                        break;
                    case "+":
                        result = (num1 / num2) + num3;
                        break;
                    case "-":
                        result = (num1 / num2) - num3;
                        break;
                }
                break;
            case "+":
                switch (op2) {
                    case "*":
                        result = num1 + (num2 * num3);
                        break;
                    case "/":
                        result = num1 + (num2 / num3);
                        break;
                    case "+":
                        result = num1 + (num2 + num3);
                        break;
                    case "-":
                        result = num1 + (num2 - num3);
                        break;

                    }
                    break;

            case "-":
                switch (op2) {
                    case "*":
                        result = num1 - (num2 * num3);
                        break;
                    case "/":
                        result = num1 - (num2 / num3);
                        break;
                    case "+":
                        result = num1 - (num2 + num3);
                        break;
                        case "-":
                            result = num1 - (num2 - num3);
                            break;
                        }
                        break;


        }
        System.out.println(result);
    }
}
