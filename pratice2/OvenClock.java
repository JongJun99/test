package qwerty.pratice2;

import java.util.Scanner;

public class OvenClock {
    public static void main(String[] args) {

        // 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 현재 시각 입력
        System.out.println("현재 시각을 입력하세요 (시 분): ");
        int currentHour = scanner.nextInt();
        int currentMinute = scanner.nextInt();

        // 요리에 필요한 시간 입력
        System.out.println("요리하는 데 필요한 시간을 입력하세요 (분): ");
        int cookingTime = scanner.nextInt();

        // 종료되는 시각 계산
        int endHour = (currentHour + (currentMinute + cookingTime) / 60) % 24;
        int endMinute = (currentMinute + cookingTime) % 60;

        // 종료되는 시각 출력
        System.out.println("오븐 구이가 끝나는 시각: " + endHour + "시 " + endMinute + "분");
    }
    }

