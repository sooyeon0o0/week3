import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int first = sc.nextInt(); //첫 번째 숫자 입력

        System.out.print("두 번째 숫자: ");
        int second = sc.nextInt(); // 두 번째 숫자 입력

        System.out.print("연산자(+, -, *, /): ");
        String operator = sc.next(); // 연산자 입력

        System.out.println("결과 : " + first + " " + operator + " " + second);
        // 출력

        /*
        if (operator.equals("+")) {
            System.out.print("결과: " + (first + operator + second));
        }
        else if (operator.equals("-")) {
            System.out.print("결과: " + (first + operator + second));
        }
        else if (operator.equals("*")) {
            System.out.print("결과: " + (first + operator + second));
        }
        else {
            System.out.print("결과: " + (first + operator + second));
        }
        */


    }
}