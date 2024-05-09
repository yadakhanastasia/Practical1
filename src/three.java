import java.util.Arrays;
import java.util.Random;

public class three {
    public static void main(String[] args) {

        int[] array1 = fillarray(10);
        int[] array2 = fillarray(10);

        System.out.println("Перший масив: " + Arrays.toString(array1));
        System.out.println("Другий масив: " + Arrays.toString(array2));

        int[] array3 = new int[10];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        System.out.println("Третій масив: " + Arrays.toString(array3));
    }

    public static int[] fillarray(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
        }
        return array;

    }
}
