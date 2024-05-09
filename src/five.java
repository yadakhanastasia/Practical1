import java.util.Random;

public class five {
    public static void main(String[] args) {
        int[][] array = createarray();

        outarray(array);
    }

    public static int[][] createarray() {
        int[][] array = new int[15][];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int bars;
            switch (i / 4) {
                case 0:
                    bars = 5;
                    break;
                case 1:
                case 2:
                    bars = 8;
                    break;
                case 3:
                case 4:
                    bars = 3;
                    break;
                default:
                    bars = 9;
            }
            array[i] = new int[bars];
            for (int j = 0; j < bars; j++) {
                array[i][j] = rand.nextInt(16);
            }
        }
        return array;
    }

    public static void outarray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
