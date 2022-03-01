import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elanor", "Henry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};
        seatingChart[1][2] = "Paul";
        String swap = seatingChart[2][3];
        seatingChart[2][3] = seatingChart[0][0];
        seatingChart[0][0] = swap;
        String[] temp = new String[seatingChart[0].length];
        System.arraycopy(seatingChart[0], 0, temp, 0, temp.length);
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp;
        for (String[] list : seatingChart) {
            System.out.println(Arrays.toString(list));
        }
        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;
        for (int[] list : arr1) {
            System.out.println(Arrays.toString(list));
        }
        for (int[] list : arr2) {
            System.out.println(Arrays.toString(list));
        }
    }
}
