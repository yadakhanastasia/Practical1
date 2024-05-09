//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int array = 50;

        int[] array1 = new int[array];

        int a = 1;
        for (int i = 0; i < array; i++) {
            array1[i] = a;
            a += 2;
        }

        for (int b : array1) {
            System.out.println(b);
        }
    }
}
