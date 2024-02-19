package qwerty.pratice2;

import java.util.*;

public class RockPaperScissorsGame {
    public static void main(String[] args) {

        Map<Integer, String> team1Members = new HashMap<>();
        Map<Integer, String> team2Members = new HashMap<>();

        // 데이터 초기화
        initializeData(team1Members, team2Members);

        // 팀 멤버 중 랜덤으로 1명씩 선택
        String selectedMemberTeam1 = getRandomMember(team1Members);
        String selectedMemberTeam2 = getRandomMember(team2Members);

        // 가위바위보 중 랜덤으로 선택
        String gestureTeam1 = getRandomGesture();
        String gestureTeam2 = getRandomGesture();

        // 결과 저장
        Map<String, String> result = new HashMap<>();
        result.put(selectedMemberTeam1, gestureTeam1);
        result.put(selectedMemberTeam2, gestureTeam2);

        // 결과 출력
        printResult(result);
    }

    // 데이터 초기화 메소드
    private static void initializeData(Map<Integer, String> team1Members, Map<Integer, String> team2Members) {
        team1Members.put(1, "A");
        team1Members.put(2, "B");
        team1Members.put(3, "C");
        team1Members.put(4, "D");

        team2Members.put(1, "E");
        team2Members.put(2, "F");
        team2Members.put(3, "G");
        team2Members.put(4, "H");
    }

    // 팀 멤버 중 랜덤으로 1명 선택 메소드
    private static String getRandomMember(Map<Integer, String> teamMembers) {
        List<Integer> memberIndexes = new ArrayList<>(teamMembers.keySet());
        Collections.shuffle(memberIndexes);

        int selectedMemberIndex = memberIndexes.get(0);
        return teamMembers.get(selectedMemberIndex);
    }

    // 가위바위보 중 랜덤으로 선택 메소드
    private static String getRandomGesture() {
        String[] gestures = {"가위", "바위", "보"};
        int randomIndex = new Random().nextInt(gestures.length);
        return gestures[randomIndex];
    }

    // 결과 출력 메소드
    private static void printResult(Map<String, String> result) {
        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println(entry.getKey() + "님이 " + entry.getValue() + "를 냈습니다.");
        }

        // 가위바위보 승자 결정
        String winner = determineWinner(result);
        System.out.println("이겼던 멤버는 " + winner + "닙니다.");
    }

    // 가위바위보 승자 결정 메소드
    private static String determineWinner(Map<String, String> result) {
        String[] gestures = result.values().toArray(new String[0]);

        if (gestures[0].equals(gestures[1])) {
            return "무승부";
        } else if ((gestures[0].equals("가위") && gestures[1].equals("보")) ||
                (gestures[0].equals("바위") && gestures[1].equals("가위")) ||
                (gestures[0].equals("보") && gestures[1].equals("바위"))) {
            return result.keySet().toArray(new String[0])[0];
        } else {
            return result.keySet().toArray(new String[0])[1];
        }
    }


}
