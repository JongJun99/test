package test;

public class test1 {
    public static void main(String[] args) {

        /*실습문제 1*/
        int a = 20;
        int b = 30;


        System.out.println("더하기 결과 :" + (a+b));
        System.out.println("빼기 결과 :" + (a-b));
        System.out.println("곱하기 결과 :" + a*b);
        System.out.println("나누기한 몫 :" + a/b);
        System.out.println("나누기한 나머지 :" + a%b);


        /*실습문제 2*/

        double area = 12.5;
        double height = 36.4;

        double result = area * height;
        double result1 = 2 *(area + height);

        System.out.println("면적 :" + result);
        System.out.println("둘레 :" + result1);


        /*실습문제 3*/
        char ch = 'a';
        int unicode = (int)ch;
        System.out.println("문자 a의 unicode :" + unicode);


        /*실습문제 4*/
        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        int total = (int)(korean + math + english);
        int average = (int)(korean + math + english)/3;

        System.out.println("총점 :" + total);
        System.out.println("평균 :" + average);


    }
}
