/*
 Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */
 
public class Task1 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        for (int i = 0; i < 10; i++) {
            mas[i] = (int) (Math.random() * 10 + 1);
            System.out.println("Цифра " + i + " " + mas[i]);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println("Значение " + i + " " + mas[i]);
        }
    }
}
