
/*
 Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты.
        Вывести результат в формате "Карта of Масть". Например, "AceofSpades".
        Валет - Jack, Дама - Queen, Король - King, Туз - Ace, Червы - Hearts, Пики - Spades, Трефы - Clubs, Бубны - Diamonds
        */

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        String n[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack,", "queen", "king", "ace"};
        String[] mast = {"hearts", "spades", "clubs", "diamonds"};
        int pos = random.nextInt(n.length);
        int mastpos = random.nextInt(mast.length);
        System.out.print("У вас " + n[pos] + " of " + mast[mastpos]);
    }
}
