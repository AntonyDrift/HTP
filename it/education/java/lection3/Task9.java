/*
Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
*/


public class Task9 {

    public static void main(String[] args) {
        int s = 9;
        int i;
        for (i = 2; i < s; i++) {
            if (s % i == 0) {
                System.out.println("Число не является простым");
                return;
            }
        }
        System.out.println("This number is simple");
    }
}
