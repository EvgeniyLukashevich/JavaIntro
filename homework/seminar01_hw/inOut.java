package homework.seminar01_hw;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class inOut {
    public static int[] input() throws Exception {
        FileReader readFile = new FileReader("homework/seminar01_hw/input.txt");
        Scanner scan = new Scanner(readFile);
        int[] values = { 0, 0 };
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] data = line.split(" ");
            if (data[0].equals("a")) {
                values[0] = Integer.parseInt(data[1]);
            } else if (data[0].equals("b")) {
                values[1] = Integer.parseInt(data[1]);
            }
        }
        return values;
    }

    public static void output(double result) throws Exception {
        FileWriter writeFile = new FileWriter("homework/seminar01_hw/output.txt", false);
        String s = String.valueOf(result);
        writeFile.write(s);
        writeFile.close();
    }
}
