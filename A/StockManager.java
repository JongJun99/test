package A;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StockManager {

    private Member member;
    private stockDTO[] stockList;
    private stockMenu menu;

    public StockManager() {
        member = new Member("이름을 입력하세요", 0);
        stockList = new stockDTO[10];
        initializeStockList();
        menu = new stockMenu();
        runStockManager();
    }

    private void initializeStockList() {
        stockList[0] = new stockDTO("삼성전자", 73300);
        stockList[1] = new stockDTO("SK하이닉스", 149600);
        stockList[2] = new stockDTO("LG에너지솔루션", 404000);
        stockList[3] = new stockDTO("삼성바이오로직스", 818000);
        stockList[4] = new stockDTO("삼성전자우", 62900);
        stockList[5] = new stockDTO("현대차", 242000);
        stockList[6] = new stockDTO("기아", 116100);
        stockList[7] = new stockDTO("셀트리온", 179900);
        stockList[8] = new stockDTO("POSCO홀딩스", 440000);
        stockList[9] = new stockDTO("LG화학", 506000);
    }

    private void runStockManager() {
        while (true) {
            int mainChoice = menu.mainPage();

            switch (mainChoice) {
                case 1:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                case 2:
                    displayAllStocks();
                    break;
                case 3:
                    menu.myInfo(member);
                    break;
                case 4:
                    addMoney();
                    break;
                case 5:
                    buyStock();
                    break;
                case 6:
                    sellStock();
                    break;
                default:
                    System.out.println("유효하지 않은 선택입니다. 다시 시도하세요.");
                    break;
            }
        }
    }

    private void displayAllStocks() {
        int sortChoice = menu.selectSortedStock();
        sortStockList(sortChoice);
        menu.sortedStockList(stockList);
    }

    private void sortStockList(int sortChoice) {
        List<stockDTO> stockArrayList = Arrays.asList(stockList);

        switch (sortChoice) {
            case 1:
                Collections.sort(stockArrayList, new AscTitle());
                break;
            case 2:
                Collections.sort(stockArrayList, new AscPrice());
                break;
            default:
                break;
        }

        stockList = stockArrayList.toArray(new stockDTO[0]);
    }

    private void addMoney() {
        int moneyToAdd = menu.inputMoney();
        member.setMoney(member.getMoney() + moneyToAdd);
        menu.myInfo(member);
    }

    private void buyStock() {
        menu.displayAll(stockList);
        int stockIndex = menu.selectStock();
        int quantity = menu.inputQuantity();

        stockDTO selectedStock = stockList[stockIndex];
        int totalPrice = selectedStock.getPrice() * quantity;

        if (totalPrice > member.getMoney()) {
            System.out.println("보유 현금이 부족합니다. 주식을 구매할 수 없습니다.");
            return;
        }

        member.setMoney(member.getMoney() - totalPrice);
        selectedStock.setCount(selectedStock.getCount() + quantity);

        menu.myInfo(member);
        menu.printStock(selectedStock);
    }

    private void sellStock() {
        menu.displayMyStocks(stockList);
        int stockIndex = menu.selectMyStock();
        int quantity = menu.inputQuantity();

        stockDTO selectedStock = stockList[stockIndex];

        if (quantity > selectedStock.getCount()) {
            System.out.println("보유한 주식 수량보다 많이 판매할 수 없습니다.");
            return;
        }

        double randomFactor = Math.random() * 2 - 1;
        int sellAmount = (int) (selectedStock.getPrice() * quantity * (1 + randomFactor));

        member.setMoney(member.getMoney() + sellAmount);
        selectedStock.setCount(selectedStock.getCount() - quantity);

        menu.myInfo(member);
        menu.printSellResult(selectedStock, quantity, sellAmount);
    }


}
