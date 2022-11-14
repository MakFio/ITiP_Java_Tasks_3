//Если задано целое число, создайте функцию, которая возвращает следующее
//простое число. Если число простое, верните само число.

public class Task9 {
    public static void main(String[] args) {
        nextPrime(12);// 13
        nextPrime(24);// 29
        nextPrime(11);// 11
    }

    private static void nextPrime(int n) {
        int del = 0;    //переменная, равная количеству делителей
        for (int i = 2; i < n/2+1; i++) {   //цикл, проходящий от 2 до корня из числа+1
            if (n%i==0)
                del++;  //если n делится на i без остатка, прибавляем 1 к del
        }
        if (del!=0) {   //если del отличен от 0 (число имеет делители), то
            while (del!=0) {    //до тех пор, пока мы не найдем простое число, будет исполняться цикл while
                n++;    //каждый раз прибавляем 1 к n
                del = 0;    //обнуляем del при каждом прохождении
                for (int i = 2; i < n/2+1; i++) {   //ищем делители
                    if (n%i==0)
                        del++;
                }
            }
        }
        System.out.println(n);
    }
}