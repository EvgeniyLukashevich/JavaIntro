package homework.seminar02_hw;

public class Controller {
    public static void start() {
        int size = View.inputArrayOption(View.sizeMessages);
        int min = View.inputArrayOption(View.minMessages);
        int max = View.inputArrayOption(View.maxMessages);
        int[] baseArray = Model.randomFillArray(Model.createIntArray(size), min, max);
        View.showArray(baseArray, "\nВот твой исходный массив:");
        Model.mergeSortResult(baseArray);
        View.showArray(baseArray, "\nА это отсортированный массив:");
    }
}
