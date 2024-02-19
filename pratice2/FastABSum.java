package qwerty.pratice2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FastABSum {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 빠르게 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 개수 T 입력
        int T = Integer.parseInt(br.readLine());

        // 각 테스트 케이스에 대해 A+B를 계산하고 출력
        for (int i = 0; i < T; i++) {
            // 공백으로 구분된 A와 B 입력
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            // A+B를 계산하여 출력
            System.out.println(A + B);
        }

        // BufferedReader를 닫기
        br.close();
    }

}
