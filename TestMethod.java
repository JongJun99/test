package qwerty.pratice1;

import java.util.Random;
import java.util.Scanner;

public class TestMethod {

    public void Calculator(int a, int b) {
        int sum = a+=b;
        int min = a-=b;
        int g = a*=b;
        int n = a/=b;
        int s = a%=b;

        System.out.println("더하기 :" + sum);
        System.out.println("빼기 :" + min);
        System.out.println("곱하기 :" + g);
        System.out.println("나누기 :" + n);
        System.out.println("나머지 :" + s);




    }
    public double CircleArea() {
        final double PI = 3.14;

        Scanner sc = new Scanner((System.in));
        System.out.println("반지름을 입력하세요 :");
        double radius = sc.nextDouble();

        double result = PI * radius * radius;

        System.out.println("원의 부피는" + result + "입니다.");

        return result;


    }

    public static int TestRandom() {
        Random random = new Random();   //랜덤 객체생성
        int randomNumber = random.nextInt(10) + 1;

        int result = randomNumber;
        System.out.println(result);

        return randomNumber;
    }

}
