/*
Создать класс, описывающий промежуток времени
     Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами, часами
     Сделать методы для получения полного количества секунд в объекте,
     сравнения двух объектов(метод должен работать аналогично compareTo в строках)
     Создать 2 конструктора: первый принимает общее количество секунд. Второй - часы, минуты и секунды по отдельности
     Сделать метод для вывода данных
     Написать программу для тестирования возможностей класса.
 */

public class Time{
    private int seconds, minutes, hours, fullSec;

    public int getSec() {
        fullSec = hours * 60 * 60 + minutes * 60 + seconds;
        return fullSec;
    }

    public int getSec2() {
        return fullSec;
    }

    public Time(int fullSec1) {
        fullSec = fullSec1;
    }

    public Time(int sec1, int min1, int hour1) {
        seconds = sec1;
        minutes = min1;
        hours = hour1;

    }

    static int newCompareTo(int a, int b){
        if (a<b)
            return -1;
        else if (a>b)
            return 1;
        else
            return 0;
    }

    private static void print(Object y) {
        System.out.println(y);
    }

    public static void main(String[] args) {

        Time ob1 = new Time(12, 43, 13);
        Time ob2 = new Time(3434);
        System.out.println("dsaf");
        System.out.println(" Всего секунд " + ob1.getSec() + " в 1-ом объекте");
        System.out.println();
        System.out.println(" Всего секунд " + ob2.getSec2() + " во 2-ом объекте");
        int result = newCompareTo(ob1.getSec(),ob2.getSec2());
        System.out.println(result);
    }
}
