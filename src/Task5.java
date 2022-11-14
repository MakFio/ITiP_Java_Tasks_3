//Создайте функцию, которая определяет, является ли строка допустимым
//шестнадцатеричным кодом.
//Шестнадцатеричный код должен начинаться с фунтового ключа # и иметь длину ровно 6
//символов. Каждый символ должен быть цифрой от 0-9 или буквенным символом от A-F.
//все буквенные символы могут быть прописными или строчными.

import java.util.Locale;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(isValidHexCode("#CD5C5C"));// true
        System.out.println(isValidHexCode("#EAECEE"));// true
        System.out.println(isValidHexCode("#eaecee"));// true
        System.out.println(isValidHexCode("#CD5C58C"));// false
        System.out.println(isValidHexCode("#CD5C5Z"));// false
        System.out.println(isValidHexCode("#CD5C&C"));// false
        System.out.println(isValidHexCode("CD5C5C"));// false
    }

    private static boolean isValidHexCode(String s) {
        s = s.toLowerCase();
        if (s.charAt(0)!='#' || s.length() != 7) {
            return false;
        }
        if (s.charAt(0)=='#' && s.length() == 7) {
            for (int i = 1; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i)) == false) {
                    if (s.charAt(i) > 'f' || s.charAt(i) < 'a')
                        return false;
                }
            }
        }
        return true;
    }
}