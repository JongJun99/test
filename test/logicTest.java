package test;

import java.util.Scanner;

public class logicTest {
    public static void main(String[] args) {

        //윤년
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력하세요 :");
        int year = scanner.nextInt();

        //연도가 4의 배수이면서 100의배수가 아닐 때 || 연도가 400의 배수인경우 조건 중 하나라도 참이면 윤년으로 판별
        int leapyear = (year % 4 ==0 && year % 100!= 0) || (year % 400 == 0)? 1:0;

        System.out.println(leapyear);


        //알람시계
        System.out.println("시간입력 : ");
        int hour = scanner.nextInt();
        System.out.println("분 입력 :");
        int minute = scanner.nextInt();

        if(minute>=45) { //분이 45이상이면 유지하고 분을 -45을 함
            minute -= 45;
        }else {     //아니면 시간을 -1하고 분을 +15함
            hour -=1;
        }
        minute += 15;

        System.out.println(hour + " " + minute);

    }
}
