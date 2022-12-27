package homework.seminar01_hw;

public class start {
    public static void main(String[] args) throws Exception {
        double result = calculation.power(inOut.input()[0], inOut.input()[1]);
        System.out.println(result);
        inOut.output(result);
    }
}
