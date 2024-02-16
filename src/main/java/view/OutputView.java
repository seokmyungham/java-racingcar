package view;

import java.util.List;
import java.util.StringJoiner;
import model.Car;
import model.Race;

public class OutputView {
    private static final String OUTPUT_RESULT_MESSAGE = "\n실행 결과";

    public void printRaceResult() {
        System.out.println(OUTPUT_RESULT_MESSAGE);
    }

    public void printRoundResult(Race race) {
        StringBuilder roundResult = new StringBuilder();

        for (Car car : race.getCars()) {
            roundResult.append(car.getName())
                    .append(" : ")
                    .append(car.showDistance())
                    .append("\n");
        }

        System.out.println(roundResult);
    }

    public void printWinners(Race race) {
        List<String> winners = race.selectWinners();
        StringJoiner result = new StringJoiner(", ", "", "가 최종 우승했습니다.");
        for (String winner : winners) {
            result.add(winner);
        }
        System.out.println(result);
    }
}
