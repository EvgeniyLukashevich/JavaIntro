package homework.seminar01_hw;

public class calculation {
    public static double powerCalculation(int number, int degree) {
        int result = number;
        for (int i = 1; i < degree; i++) {
            result *= number;
        }
        return result;
    }

    public static double power(int number, int degree) {
        if (degree > 0) {
            return powerCalculation(number, degree);
        } else if (degree < 0) {
            return 1 / powerCalculation(number, degree * -1);
        } else {
            return 1;
        }
    }
}
