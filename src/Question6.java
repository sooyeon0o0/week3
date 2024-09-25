//사용자가 입력한 연도가 윤년인지 아닌지 판별하는 프로그램을 작성하세요.
//연도가 4로 나누어떨어지고, 100으로 나누어떨어지지 않거나, 400으로 나누어떨어지는 경우 윤년입니다.

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("연도를 입력하세요.: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("윤년입니다.");
        }
        else {
            System.out.println("윤년이 아닙니다.");

        }
    }
}

