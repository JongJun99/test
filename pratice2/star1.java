package qwerty.pratice2;

import java.util.Scanner;

public class star1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("정수 N을 입력하세요 (1 ≤ N ≤ 100): ");
        int N = scanner.nextInt();

        // 입력된 N에 따라 별 찍기
        for (int i = 1; i <= N; i++) {
            // 각 줄마다 i개의 별을 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
