//Напишите функцию, которая возвращает позицию второго вхождения " zip " в
//строку, или -1, если оно не происходит по крайней мере дважды. Ваш код должен
//быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
//произойти в строке.

public class Task2 {
    public static void main(String[] args) {
        findZip("all zip files are zipped");// 18
        findZip("all zip files are compressed");// -1
        findZip("all files are compressed");// -1
        findZip("all zip files are compressed an zipped and zipped again");// 32
    }

    private static void findZip(String s) {
        int index1 = s.indexOf("zip");
        String s2 = s.substring(index1+3, s.length());
        int index2 = s2.indexOf("zip");
        if (index2!=-1) {
            index2 = s2.indexOf("zip") + index1 + 3;
        }
        System.out.println(index2);
    }
}