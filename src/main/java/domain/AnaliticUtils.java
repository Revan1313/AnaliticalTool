package domain;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnaliticUtils {
    List<String> readFile(String fileName){
        List<String> lines= new ArrayList<>();
        File file = new File(fileName);
        int times = 0;
        try (Scanner scanner = new Scanner(file)) {
            lines.add(scanner.)
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains()) {
                    times++;
                }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }


        return
    }
}
