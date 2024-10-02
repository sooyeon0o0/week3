// 4개 과목의 점수를 각각 입력받은 후 각 과목의 등급을 출력하고
// 평균 점수를 구한 뒤 평균 점수가 60점 이상이면 "합격", 그렇지 않으면 "불합격"


import java.util.Scanner;

class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 과목의 점수를 입력해주세요: ");
        int score1 = sc.nextInt();
        if (score1 >= 90) {
            System.out.println("A 등급");
        } else if (score1 >= 80) {
            System.out.println("B 등급");
        } else if (score1 >= 70) {
            System.out.println("C 등급");
        } else if (score1 >= 60) {
            System.out.println("D 등급");
        } else {
            System.out.println("F 등급");
        }

        System.out.println("두 번째 과목의 점수를 입력해주세요: ");
        int score2 = sc.nextInt();
        if (score2 >= 90) {
            System.out.println("A 등급");
        } else if (score2 >= 80) {
            System.out.println("B 등급");
        } else if (score2 >= 70) {
            System.out.println("C 등급");
        } else if (score2 >= 60) {
            System.out.println("D 등급");
        } else {
            System.out.println("F 등급");
        }

        System.out.println("세 번째 과목의 점수를 입력해주세요: ");
        int score3 = sc.nextInt();
        if (score3 >= 90) {
            System.out.println("A 등급");
        } else if (score3 >= 80) {
            System.out.println("B 등급");
        } else if (score3 >= 70) {
            System.out.println("C 등급");
        } else if (score3 >= 60) {
            System.out.println("D 등급");
        } else {
            System.out.println("F 등급");
        }

        System.out.println("네 번째 과목의 점수를 입력해주세요: ");
        int score4 = sc.nextInt();
        if (score4 >= 90) {
            System.out.println("A 등급");
        } else if (score4 >= 80) {
            System.out.println("B 등급");
        } else if (score4 >= 70) {
            System.out.println("C 등급");
        } else if (score4 >= 60) {
            System.out.println("D 등급");
        } else {
            System.out.println("F 등급");
        }

        int average = (score1 + score2 + score3 + score4) / 4;

        if (average >= 60) {
            System.out.println("합격");
        }
        else {
            System.out.println("불합격");
        }

    }
}
