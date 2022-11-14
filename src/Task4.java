//Создайте функцию, которая принимает строку и возвращает новую строку с
//заменой ее первого и последнего символов, за исключением трех условий:
//– Если длина строки меньше двух, верните "несовместимо".".
//– Если первый и последний символы совпадают, верните "два-это пара."

public class Task4 {
    public static void main(String[] args) {
        flipEndChars("Cat, dog, and mouse.");// ".at, dog, and mouseC"
        flipEndChars("ada");// "Two's a pair."
        flipEndChars("Ada");// "adA"
        flipEndChars("z");// "Incompatible."
    }

    private static void flipEndChars(String s) {
        if (s.charAt(0)==s.charAt(s.length()-1) && s.length()>1)
            System.out.println("Two's a pair");
        if (s.charAt(0)!=s.charAt(s.length()-1) && s.length()>1)
            System.out.println(s.charAt(s.length()-1) + s.substring(1, s.length()-1) + s.charAt(0));
        if (s.length()<2)
            System.out.println("Incompatible");
    }
}