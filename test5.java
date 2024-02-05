package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        /*반복문 실습문제 1*/
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 :");
        int num = sc.nextInt();

        int sum =+ 0;

        for(int i =0; i <= num; i++ ) {
            if(i % 2==0) {
                sum += i;
            }
        }
        System.out.println("1부터" + num + "까지의 짝수의 합 :" + sum);


        /*실습문제 2*/


        String a1 = "토";
        String a2 = "마";
        String result = "";

        System.out.println("정수를 입력하세요 :");
        int c = sc. nextInt();

        for(int i = 0; i < c; i++) {
            if(i % 2 ==0) {
                result += a1;

            }else {
                result += a2;
            }
        }
        System.out.println(result);


        /*실습문제 3*/

        int randomNumber = (int)(Math.random() * 100) + 1;  //((int)math.random() * 100) +  난수 ()안에 int형이 포함되면 에러
        int a = 0;

        while (true) {
            System.out.println("정수를 입력하세요 :");
            int number = sc.nextInt();
            a++;

            if(number < randomNumber) {
                System.out.println("입력하신 정수보다 큽니다.");
            }else if (number > randomNumber) {
                System.out.println("입력하신 정수보다 작습니다.");
            }else {
                System.out.println("정답입니다."+ a + " 회만에 정답을 맞추셨습니다.");
                break;

            }
        }

    }
}
