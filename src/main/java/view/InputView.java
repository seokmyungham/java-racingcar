package view;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.)");
        return scanner.next();
    }

    // 메서드 이름 생각
    public static String inputTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.next();
    }
}