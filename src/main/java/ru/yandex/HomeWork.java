package ru.yandex;

public class HomeWork {

    /**
     * Функция получает на вход 4-х значное число
     * Функция должна вернуть число в обратном порядке
     * Например дано 1234, тогда необходимо вывести 4321
     * <p>
     * Необходимо написать реализацию, а так же написать
     * тесты (подумайте над кейсами)
     * <p>
     * 1000 -> 1 (это называется не значащие нули)
     * */
    public static int reverse(int value) {
        // todo
        return ((value % 10) * 1000 + ((value % 100) /10) * 100 + ((value / 100) % 10) * 10 + value / 1000);
    }

    /**
     * Функция должна возвращать разность между
     * числом из двух первых цифр и числом из двух
     * последних. Вам дано число от 10 до 9999
     * Пример: 4412 -> 44 - 12 = 32
     * Написать полное решение, написать тесты,
     * подумать над кейсами
     * */
    public static int difference(int value) {
        // todo
        int a = 0;
        int b = 0;
        if (value <= 9 || value >= 10000) {
            return (value);
        } else if (value <= 99) {
            a = value / 10;
            b = value % 10;
            return (a - b);
        } else {
            a = value / 100;
            b = value % 100;
            return (a - b);
        }
    }




    public static void main(String[] args) {
        System.out.println(difference(9191));
    }


}


//        if (value <= 9 || value >= 1000) {
//        return (value);
//        } else if (value <= 99) {
//        b = value % 100;
//        return (a - b);
//        } else if (value < 1000) {
//        a = value / 10;
//        b = value % 100;
//        return (a - b);
//        } else {
//        a = value / 100;
//        b = value % 100;
//        return (a - b);
//        }