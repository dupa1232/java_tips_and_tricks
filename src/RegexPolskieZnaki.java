import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPolskieZnaki {
    public static void main(String[] args) {
        //        String miasto_illegal_regex = "[����󶼿�ʣ�Ӧ��]"; // wykrywa tylko poslkie znaki
        String miasto_illegal_regex = "[a-zA-Z����󶼿�ʣ�Ӧ��]"; // wykrywa polskie znaki i inne litery
        String miasto = "Elbl�g";
        Pattern p = Pattern.compile(miasto_illegal_regex);
        Matcher m = p.matcher(miasto);
        System.out.println(m.find());
    }
}
/*
Fajna strona do testowania regex�w:

https://regex101.com/



Jak polskie znaki wykry�? https://4programmers.net/Forum/Java/117681-Wyrazenia_regularne_+_polskie_znaki

Je�li nie dzia�a, to mo�e to by� wynik niew�a�ciwego kodowania. Mnie pomog�o ustawienie w Intellij kodowania ISO8859-2.
Jak ustawi� takie kodowanie w Intellij?
File / Settings... / Editor / File Encodings --- i tutaj ustawi� po��dane kodowanie.
 */