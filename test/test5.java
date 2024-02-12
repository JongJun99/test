package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        /*배열 실습문제 1*/
        String[] fruit = {"딸기", "바나나", "복숭아", "키위", "사과"};  //배열선언과 동시에 초기화

        Scanner sc = new Scanner(System.in);
        System.out.println("0부터 4까지의 정수를 입력하세요 :");
        int number = sc.nextInt();

        if(number >= 0 && 4 >= number) {    //사용자로부터 입력받은숫자가 0~4까지 일 때
            System.out.println(fruit[number]);
        }else {
            System.out.println("준비된 과일이 없습니다.");
        }


        /*실습문제 2*/


        System.out.println("주민등록번호를 입력하세요 :");
        String num = sc.nextLine();

        char[] array = num.toCharArray();   //toCharArray메소드를 사용해ㅓㅅ 문자열 num을 문자 배열로 반환

        for(int i = 8; i<num.length(); i++) {   //성별자리이후부터 별표시
            if(i>=8) {
                array[i] = '*';
            }
        }
        System.out.println(array);



    }
}
