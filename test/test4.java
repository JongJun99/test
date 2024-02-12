package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {

        /*반복문 실습문제 1*/
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 :");
        int num = sc.nextInt();

        int sum =+ 0;   //짝수의 합을 저장할 변수값 초기화

        for(int i =0; i <= num; i++ ) {
            if(i % 2==0) {  //짝수일 때 합 더하기
                sum += i;
            }
        }
        System.out.println("1부터" + num + "까지의 짝수의 합 :" + sum);


        /*실습문제 2*/


        String a1 = "토";
        String a2 = "마";
        String result = "";

        System.out.println("정수를 입력하세요 :");  //사용자로부터 입력받기
        int c = sc. nextInt();

        for(int i = 0; i < c; i++) {
            if(i % 2 ==0) {     //짝수일 때 "토" 출력
                result += a1;

            }else {
                result += a2;   //홀수 일 때 "마" 출력
            }
        }
        System.out.println(result);


        /*실습문제 3*/

        int randomNumber = (int)(Math.random() * 100) + 1;  //난수 생성하여 1~100까지 사용자가 맞출때까지 반복
        int a = 0;

        while (true) {
            System.out.println("정수를 입력하세요 :");
            int number = sc.nextInt();
            a++;

            if(number < randomNumber) {     //사용자로부터 입력받은 숫자랑 랜덤숫자 비교
                System.out.println("입력하신 정수보다 큽니다.");
            }else if (number > randomNumber) {
                System.out.println("입력하신 정수보다 작습니다.");
            }else {     //정답인 경우 루프 종료
                System.out.println("정답입니다."+ a + " 회만에 정답을 맞추셨습니다.");
                break;

            }
        }

    }
}
