package homework.seminar03_hw;
import java.util.ArrayList;

public class program {

    static ArrayList<String> ways = new ArrayList<>();

    static void launching(int startNum, int finishNum , int operationMult, int operationSum, String way) {
        if (startNum == finishNum) {
            ways.add(way);
        }
        if (startNum < finishNum) {
            launching(startNum * operationMult, finishNum, operationMult, operationSum, way + "* " + operationMult + " ");
            launching(startNum + operationSum, finishNum, operationMult, operationSum, way + "+ " + operationSum + " ");
        }
    }

    static String shortestWay(ArrayList<String> arr) {
        String shortestWay = arr.get(0);
        for (String value : arr) {
            if (value.length() < shortestWay.length())
                shortestWay = value;
        }
        return shortestWay;
    }

    public static void main(String[] args) {
        int startNum = 7;
        int finishNum = 1400;
        int operationMult = 5;
        int operationSum = 7;
        launching(startNum , finishNum, operationMult, operationSum, startNum + " ");
        if (ways.isEmpty())
            System.out.println("Решений нет!");
        else {
            StringBuilder resultString = new StringBuilder();
            resultString.append("Все решения:\n");
            for (String value : ways) {
                resultString.append(value).append(" = ").append(finishNum);
                resultString.append("\n");
            }
            resultString.append("\n");
            resultString.append("Кратчайшее решение:\n");
            resultString.append(shortestWay(ways));
            System.out.println(resultString + " = " + finishNum);
        }
    }
    
}