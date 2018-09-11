/*
Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.
*/

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int i = 1;
        for (i = 0; i < array.length; i++) {
            int b = (i + 1) * 13 * 17;
            if (b % 17 == 0 || b % 13 == 0) {
            array[i] = b;
            System.out.println(" Array number " + i + " " + array[i]);
            }
        }
    }
}
