package test;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        BookVo bv = new BookVo();
        bv.reuslt();

        BookVo bv1 = new BookVo("자바의 정석", "도우출판", "남궁성");
        bv1.reuslt();

        BookVo bv2 = new BookVo("홍길동전", "활빈당", "허균", 5000000, 0.5 );
        bv2.reuslt();




        Scanner scanner = new Scanner(System.in);
        System.out.print("거래종목 입력(삼성/SK) : ");
        String stockType;
        do {    //올바르게 입력 할 때까지 반복
            stockType = scanner.nextLine().toUpperCase(); // 대문자로 변환하여 입력값 받기
            if (!stockType.equals("삼성") && !stockType.equals("SK")) {   //삼성이나 SK가 아니면 다시입력
                System.out.print("'삼성' 또는 'SK' 둘 중 하나의 종목을 입력해주세요. 거래종목 입력(삼성/SK) : ");
            }
        } while (!stockType.equals("삼성") && !stockType.equals("SK"));

        int nowPrice;   //현재가,보유 자본 초기화, 주식최대구매 초기화
        int haveCash;
        int  maxJusik;
        String companyName;

        if (stockType.equals("삼성")) {   //거래종목 초기값설정
            companyName = "삼성전자";
            nowPrice = 74100;
            maxJusik = 3408600 / nowPrice;
            haveCash = 3408600;
        } else {
            companyName = "SK하이닉스";
            nowPrice = 1428000;
            maxJusik = 42840000 /nowPrice;
            haveCash = 42840000;
        }

        System.out.println(companyName + "의 현재가는 " + nowPrice + " 입니다.");
        System.out.print("원하는 매수량 : ");      //매수량 입력받기
        int buyQuantity = scanner.nextInt();

        if (buyQuantity >  maxJusik) {      //최대주식구매량보다 매수량이 더 클 경우
            System.out.println(companyName + " 주식 " + buyQuantity + "주 매수 실행 실패");
            System.out.println("현재 계좌에 현금 보유액이 " +  haveCash + "원 이하입니다.");
        } else {    //성공출력문
            System.out.println(companyName + " 주식 " + buyQuantity + "주 매수 실행 성공");
        }


        System.out.println("======================================");

        Sanrio[] goodsArray = new Sanrio[]{     //배열 5개 초기화
                new Cinnamoroll("시나모롤", 5000, 5.5, "키링"),
                new Cinnamoroll("시나모롤 학사모", 8000, 15.5, "인형"),
                new Cinnamoroll("시나모롤 하트", 16500, 25.0, "인형"),
                new Kuromi("쿠로미 인형", 16500, 25.0, 'A'),
                new Kuromi("쿠로미 인형", 7000, 13.5, 'B')
        };



        System.out.println("1번부터 5번까지 산리오 굿즈가 있어요");
        System.out.println("한번에 구경하고 싶으면 7번을 눌러주세요");
        System.out.println("0번을 누르면 종료합니다.");

        while(true) {   //사용자로부터 입력받는 반복문
            System.out.println("어떤 굿즈를 구경할지 숫자를 입력하세요 :");
            int input = scanner.nextInt();

            if(input >=1 && input <=5) {    //1~5사이 일 때
                System.out.println("고르신 굿즈는" + goodsArray[input - 1 ].info());
            }else if (input == 7) {
                for (Sanrio goods : goodsArray) {   //7일 때 모든 굿즈 출력
                    System.out.println(goods.info());
                }
            }else if (input == 0) {     //0이면 프로그램 종료 
                System.out.println("다음에 또 오세요 ");
                break;
            }
        }
    }
}
