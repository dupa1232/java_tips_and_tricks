import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPolskieZnaki {
    public static void main(String[] args) {
        //        String miasto_illegal_regex = "[±æê³ñó¶¼¿¡Ê£ÑÓ¦¬¯]"; // wykrywa tylko poslkie znaki
        String miasto_illegal_regex = "[a-zA-Z±æê³ñó¶¼¿¡Ê£ÑÓ¦¬¯]"; // wykrywa polskie znaki i inne litery
        String miasto = "Elbl¶g";
        Pattern p = Pattern.compile(miasto_illegal_regex);
        Matcher m = p.matcher(miasto);
        System.out.println(m.find());
    }
}
/*
Fajna strona do testowania regexów:

https://regex101.com/



Jak polskie znaki wykryæ? https://4programmers.net/Forum/Java/117681-Wyrazenia_regularne_+_polskie_znaki

Je¶li nie dzia³a, to mo¿e to byæ wynik niew³a¶ciwego kodowania. Mnie pomog³o ustawienie w Intellij kodowania ISO8859-2.
Jak ustawiæ takie kodowanie w Intellij?
File / Settings... / Editor / File Encodings --- i tutaj ustawiæ po¿±dane kodowanie.
 */