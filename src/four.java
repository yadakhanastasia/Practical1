import java.util.Random;

public class four {
    public static void main(String[] args) {
        int[] array = new int[15];
        fill(array);

        System.out.println("Масив:");
        out(array);

        int couple = countcouple(array);

        System.out.println("У масиві " + couple + " парних елементів.");
    }

    public static void fill(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
        }
    }

    public static void out(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int countcouple(int[] array) {
        int couple = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                couple++;
            }
        }
        return couple;
    }
}
