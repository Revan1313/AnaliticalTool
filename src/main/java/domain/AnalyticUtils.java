package domain;

import domain.entity.CommonLine;
import domain.entity.QueryLine;
import domain.entity.WaitingLine;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class AnalyticUtils {
    public AnalyticUtils() {
    }

    List<String> readFileWithLines(String fileName) {
        List<String> lines = new ArrayList<>();
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
        return lines;
    }

    List<String> handleFile(String fileName) {
        List<String> stringList = readFileWithLines(fileName);
        List<CommonLine> commonLines;


        return stringList;
    }

    public int betweenTwoDatesInMinutes(Date date1, Date date2) {
        long milliseconds = date2.getTime() - date1.getTime();
        return (int) (TimeUnit.MINUTES.convert(milliseconds, TimeUnit.MILLISECONDS));
    }

    public List<CommonLine> convertStringToComonLine(List<String> stringList) throws ParseException {
        String[] splitArray;
        List<CommonLine> lineList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            splitArray = stringList.get(i).split(" ");
            if ("C".equals(splitArray[0])) {
                lineList.add(new WaitingLine(splitArray));
            } else {
                lineList.add(new QueryLine(splitArray));
            }
        }
        return lineList;
    }

}
