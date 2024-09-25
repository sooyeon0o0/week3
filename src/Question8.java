/*
- 사용자로부터 키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고, BMI에 따라 건강 상태를 출력하는 프로그램을 작성하세요.
    - BMI = 몸무게(kg) / (키(m) * 키(m))
    - BMI 18.5 미만: 저체중
    - BMI 18.5 이상 24.9 이하: 정상
    - BMI 25 이상 29.9 이하: 과체중
    - BMI 30 이상: 비만
*/
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키(cm)를 입력하세요: ");
        double cm = sc.nextDouble(); //double : 실수

        double m = cm / 100;

        System.out.println("몸무게(kg)를 입력하세요: ");
        double weight = sc.nextDouble();

        double bmi = weight / (m * m);

        if (bmi < 18.5) {
            System.out.println("저체중입니다.");
        }
        else if (bmi >= 18.5 && bmi <= 24.9 ) {
            System.out.println("정상입니다.");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("과체중입니다.");
        }
        else{
            System.out.println("비만입니다.");
        }
    }
}
