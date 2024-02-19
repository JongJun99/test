package qwerty.pratice2;

import java.util.Scanner;

public class ABSUM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 두 정수 A와 B를 입력받음
            System.out.print("두 정수 A와 B를 입력하세요 (0 < A, B < 10): ");
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // 입력이 0 0인 경우 반복 종료
            if (A == 0 && B == 0) {
                break;
            }

            // A와 B의 합을 출력
            int sum = A + B;
            System.out.println("A + B = " + sum);
        }

        System.out.println("프로그램을 종료합니다.");
    }

}
