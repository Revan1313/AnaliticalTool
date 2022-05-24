package domain;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalyticUtils {
    public AnalyticUtils() {
    }

    List<String> readFile(String fileName) {
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
    List<String> handleFile(String fileName){
        List<String> stringList=readFile(fileName);









        return stringList;
    }
}
