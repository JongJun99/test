package test;

public class test2 {
    public static void main(String[] args) {

        /*실습문제 1*/
        int a = 20;
        int b = 2;

        int num = (a>b)? a:b;
        System.out.println("두 수 중 큰수는 :" + num );


        /*실습문제 2*/
        int score = 50;
        String number = (score>=60)? "합격입니다" : "아쉽지만 불합격입니다.";
        System.out.println(number);


        /*실습문제 3*/
        int num1 = 1;
        String num2 = (num1 % 2!=0)? "홀수입니다." :"짝수입니다.";
        System.out.println(num2);


        /*실습문제 4*/
        double socre = 95;
        int score1 = (int)socre;

        String score2 = (score1>= 90)? "A":
                (score1>=80)? "B":
                        (score1>=70)?"c":
                                (score1>=60)? "D" :
                                        "F";

        System.out.println("박종준의 이번 점수 등급은" + score2 + "입니다.");


        /*실습문제 5*/
        int month =5;
        int day = 1;

        String coupon = "배민 쿠폰";
        String coffee = "스타벅스 커피";
        String candy = "사탕";

        String result = (month<=6 && day <=15)? coupon:
                (month<=12 && day <=31)? coffee :
                        candy;

        System.out.println("박종준의 선물은 " + result + "입니다.");


    }
}
