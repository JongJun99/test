package qwerty.pratice2;

import java.util.Random;
import java.util.Scanner;

public class Exchange {

    public void mainPage() {
        // 오늘의 환율 공시 출력
        USD usd = new USD();
        EUR eur = new EUR();
        AUD aud = new AUD();

        System.out.println("오늘의 환율 공시");
        System.out.println("[" + usd.getUnit() + "] 고시환율 : " + usd.getNotified() + "원 / 현찰살때 : "
                + usd.getBuy() + "원 / 환율우대 : " + usd.getRate() + "% / 일일한도 : " + usd.getLimit() + "만원");
        System.out.println("[" + eur.getUnit() + "] 고시환율 : " + eur.getNotified() + "원 / 현찰살때 : "
                + eur.getBuy() + "원 / 환율우대 : " + eur.getRate() + "% / 일일한도 : " + eur.getLimit() + "만원");
        System.out.println("[" + aud.getUnit() + "] 고시환율 : " + aud.getNotified() + "원 / 현찰살때 : "
                + aud.getBuy() + "원 / 환율우대 : " + aud.getRate() + "% / 일일한도 : " + aud.getLimit() + "만원");

        // 랜덤 추가 환율우대 이벤트
        System.out.println("랜덤 추가 환율우대 이벤트를 진행 중입니다. 참여하시겠습니까?");
        System.out.println("1.예 2.아니오");


        Random random = new Random();
        int eventChoice = random.nextInt(2) + 1; // 1 또는 2 랜덤 생성
        if (eventChoice == 1) {
            System.out.println("축하합니다. 환율우대를 " + (random.nextInt(5) + 1) + "% 더 받고 환전을 진행하실 수 있습니다.");
        } else {
            System.out.println("이벤트에 참여하지 않았습니다.");
        }

        // 환전 진행 여부 확인
        System.out.println("환전을 진행하시겠습니까?");
        System.out.println("1.예 2.아니오");

        // 환전 종류 선택
        int exchangeChoice = 0;
        while (exchangeChoice < 1 || exchangeChoice > 3) {
            System.out.println("환전 종류를 선택해주세요. ");
            System.out.println("1.미국달러 2.유로 3.호주달러");

            //사용자 입력을 받아 exchangeChoice에 저장
            Scanner scanner = new Scanner(System.in);
            exchangeChoice = scanner.nextInt();

            if (exchangeChoice < 1 || exchangeChoice > 3) {
                System.out.println("보기 중에서 선택해주세요");
            }
        }

        // 환전금액 입력
        System.out.println("얼마를 환전하시겠습니까?(단위 : 만원) : ");
        int exchangeAmount = 9999; // 입력 받는 부분은 생략하였습니다. (Scanner 사용)

        // 예외처리 - 최소 금액 미만, 최대 금액 초과
        if (exchangeAmount < 50000) {
            System.out.println("최소 금액 미만 입력 시 5만원으로 자동입력");
            exchangeAmount = 50000;
        } else if (exchangeAmount > usd.getLimit()) {
            System.out.println(usd.getUnit() + "의 일일 환전 한도는 " + usd.getLimit() + "만원 입니다. ");
            System.out.println("최대 금액으로 자동 입력되었습니다.");
            exchangeAmount = usd.getLimit();
        }

        // 환전 계산
        double exchangeRate = usd.getNotified() + (usd.getBuy() - usd.getNotified()) * (1 - (eventChoice == 1 ? (random.nextInt(5) + 1) / 100.0 : 0));
        double finalAmount = exchangeAmount / exchangeRate;

        // 최종 결과 출력
        System.out.println(usd.getUnit() + "을(를) " + (eventChoice == 1 ? (random.nextInt(5) + 1) + "% 우대받아, " : "")
                + finalAmount + usd.getUnit() + "로 환전하였습니다.");
    }
}
