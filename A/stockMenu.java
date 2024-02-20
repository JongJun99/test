package A;

import java.util.Scanner;

public class stockMenu {

    private Scanner scanner;

    public stockMenu() {
        scanner = new Scanner(System.in);
    }

    public void inputMemberInfo(Member member) {
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        member.setName(name);

        System.out.print("보유금액을 입력하세요: ");
        int money = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기
        member.setMoney(money);
    }

    public int mainPage() {
        System.out.println("=== 메인 메뉴 ===");
        System.out.println("1. 프로그램 종료");
        System.out.println("2. 전체 주식보기");
        System.out.println("3. 내 정보");
        System.out.println("4. 현금 추가입금");
        System.out.println("5. 주식 구매");
        System.out.println("6. 주식 판매");

        System.out.print("선택: ");
        return scanner.nextInt();
    }

    public void myInfo(Member member) {
        System.out.println("=== 내 정보 ===");
        System.out.println(member);
    }

    public void displayAll(stockDTO[] stockList) {
        System.out.println("=== 전체 주식 목록 ===");
        for (int i = 0; i < stockList.length; i++) {
            System.out.println(i + ". " + stockList[i]);
        }
    }

    public int selectStock() {
        System.out.print("구매할 주식을 선택하세요: ");
        return scanner.nextInt();
    }

    public int inputQuantity() {
        System.out.print("구매할 수량을 입력하세요: ");
        return scanner.nextInt();
    }

    public void sortedStockList(stockDTO[] sortedList) {
        System.out.println("=== 정렬된 주식 목록 ===");
        for (int i = 0; i < sortedList.length; i++) {
            System.out.println(i + ". " + sortedList[i]);
        }
    }

    public int selectSortedStock() {
        System.out.print("정렬 옵션을 선택하세요 (1. 종목명 내림차순, 2. 현재가 내림차순): ");
        return scanner.nextInt();
    }

    public void displayMyStocks(stockDTO[] myStockList) {
        System.out.println("=== 보유한 주식 목록 ===");
        for (int i = 0; i < myStockList.length; i++) {
            System.out.println(i + ". " + myStockList[i]);
        }
    }

    public int selectMyStock() {
        System.out.print("판매할 주식을 선택하세요: ");
        return scanner.nextInt();
    }

    public void printStock(stockDTO stock) {
        System.out.println("=== 주식 정보 ===");
        System.out.println(stock);
    }

    public void printSellResult(stockDTO stock, int quantity, int sellAmount) {
        System.out.println("=== 판매 결과 ===");
        System.out.println("판매한 주식: " + stock.getTitle());
        System.out.println("판매 수량: " + quantity);
        System.out.println("판매 금액: " + sellAmount);
    }

    public int inputMoney() {
        System.out.print("입금할 금액을 입력하세요: ");
        return scanner.nextInt();
    }
}
