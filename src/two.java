public class two {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Початковий масив:");
        вивестиМасив(array);

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println("\nОновлений масив:");
        вивестиМасив(array);
    }

    public static void вивестиМасив(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
