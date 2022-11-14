//Число Капрекара-это положительное целое число, которое после возведения в
//квадрат и разбиения на две лексикографические части равно сумме двух
//полученных новых чисел:
//– Если количество цифр квадратного числа четное, то левая и правая части будут иметь
//одинаковую длину.
//– Если количество цифр квадратного числа нечетно, то правая часть будет самой длинной
//половиной, а левая-самой маленькой или равной нулю, если количество цифр равно 1.
//– Учитывая положительное целое число n, реализуйте функцию, которая возвращает true,
//если это число Капрекара, и false, если это не так.

public class Task7 {
    public static void main(String[] args) {
        isKaprekar(3);// false
        isKaprekar(5);// false
        isKaprekar(297);// true
    }

    private static void isKaprekar(int n) {
        int sqr = n*n;  //переменной sqr приравниваем кадрат числа
        String s = Integer.toString(sqr);   //новой переменной приравниваем строчное значение sqr, чтобы найти количество символов числа
        int a = (int) (sqr / Math.pow(10,(s.length() - s.length() / 2))); //к а приравниваем целочисленную часть от деления sqr на 10, возведенного в разницу между длиной sqr и целочисленного деления его на 2
        int b = (int) (sqr % Math.pow(10,(s.length() - s.length() / 2))); //к b приравниваем остаточную часть от деления sqr на 10, возведенного в разницу между длиной sqr и целочисленного деления его на 2
        System.out.println((a+b)==n); //сравниваем сумму a и b с изначальным числом n
    }
}