package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        /*조건문 실습문제 1*/
        Scanner sc = new Scanner(System.in);
        System.out.println("나이가 어떻게 되세요 ?:");
        int num = sc.nextInt();     //사용자로부터 정수형 입력받기

        if(num>=20) {   //20세이상인경우
            System.out.println("핀매 가능합니다.");
        }else {     //20세미만인경우
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요");
        }



        /*실습문제 2*/
        System.out.print("당첨 번호가 어떻게 되세요? ");
        int num1 = sc.nextInt();    //사용자로부터 정수형 입력받기

        if(num1 > 0 && num1 <= 10) {    //당첨번호가 1~10사이임
            if(num1 % 2 == 0) {     //짝수 일 때
                System.out.println("짝수네요, 모자 선물입니다!");
            } else {    //홀수 일 때
                System.out.println("홀수네요, 인형 선물입니다!");
            }
        } else {    //1~10사이의 번호가 안나왔을 때
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        }



        /*실습문제 3*/
        System.out.println("성실 점수:");
        int sungsil = sc.nextInt();

        System.out.println("서비스 점수:");
        int service = sc.nextInt();

        System.out.println("미소 점수");
        int smile = sc.nextInt();

        int avg = (sungsil + service + smile) /3;   //성실 +서비스 + 미소점수 평균값

        if(avg>=60 && sungsil>=40 && service>=40 && smile>=40){     //평균이 60넘고 각 항의 점수가 40점 이상일 때
            System.out.println("합격입니다.");
        }else {
            if(avg<60){     //평균이 60미만인경우
                System.out.println("평균점수 미달로 불합격입니다.");
            }if(sungsil<40){    //각 항의 점수가 40점 미만인경우
                System.out.println("성실 점수 미달로 불합격입니다.");
            }if(service<40){
                System.out.println("서비스 점수 미달로 불합격입니다.");
            }if(smile<40){
                System.out.println("미소 점수 미달로 불합격입니다.");
            }
        }

        /*실습문제 4*/
        System.out.println("월 급여 입력 :");
        int monthPay = sc.nextInt();

        System.out.println("월 매출액 입력");
        int sales = sc.nextInt();

        double bonus = 0;   //보너스, 총급여 변수 초기화
        int total = 0;

        if(sales >= 50000000) {
            bonus = 0.05;
        } else if(sales >= 30000000) {
            bonus = 0.03;
        } else if(sales >= 10000000) {
            bonus = 0.01;
        } else {
            bonus = 0;
        }

        total = monthPay + (int)(sales * bonus);    //총급여계산

        System.out.println("매출액 :" + sales);
        System.out.println("보너스율 : " + (bonus * 100) + "%");
        System.out.println("월 급여 : " + monthPay);
        System.out.println("보너스 금액 : " + (int)(bonus * sales));
        System.out.println("총 급여 : " + total);

    }
}
