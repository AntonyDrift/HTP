import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {
        int[][] arr1 = {{1}, {2, 3}};
        int[][] arr2 = {{1}, {2, 4}};

        System.out.println("Are these arrays equals? " + Arrays.deepEquals(arr1, arr2));
    }
}
