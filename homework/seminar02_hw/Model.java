package homework.seminar02_hw;

public class Model {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int[] createIntArray(int size) {
        int[] array = new int[size];
        return array;
    }

    public static int[] randomFillArray(int[] array, int minValue, int maxValue) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber(minValue, maxValue + 1);
        }
        return array;
    }

    public static void gluing(int[] baseArray, int[] rightArray, int[] leftArray) {
        int rightIndex = 0;
        int leftIndex = 0;
        int baseIndex = 0;
        while (rightIndex < rightArray.length && leftIndex < leftArray.length) {
            if (rightArray[rightIndex] <= leftArray[leftIndex]) {
                baseArray[baseIndex] = rightArray[rightIndex];
                rightIndex++;
            } else {
                baseArray[baseIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            baseIndex++;
        }
        while (rightIndex < rightArray.length) {
            baseArray[baseIndex] = rightArray[rightIndex];
            rightIndex++;
            baseIndex++;
        }
        while (leftIndex < leftArray.length) {
            baseArray[baseIndex] = leftArray[leftIndex];
            leftIndex++;
            baseIndex++;
        }
    }

    public static void mergeSortResult(int[] baseArray) {
        if (baseArray.length <= 1)
            return;
        int axialIndex = baseArray.length / 2;
        int[] rightArray = new int[axialIndex];
        int[] leftArray = new int[baseArray.length - axialIndex];
        for (int i = 0; i < axialIndex; i++)
            rightArray[i] = baseArray[i];
        for (int i = axialIndex; i < baseArray.length; i++)
            leftArray[i - axialIndex] = baseArray[i];
        mergeSortResult(rightArray);
        mergeSortResult(leftArray);
        gluing(baseArray, rightArray, leftArray);
    }
    
}
