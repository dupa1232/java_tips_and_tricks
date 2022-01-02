import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DoubleBraceInitializationForCollections {
    public static void main(String[] args) {
        List<Integer> listaIntegerow = new ArrayList<>() {{
            add(2);
            add(1);
            add(4);
            add(6);
        }};

        Set<String> setStringow = new HashSet<>() {{
            add("dupa");
            add("dupa3");
            add("dupa1");
        }};

        System.out.println(listaIntegerow);
        System.out.println(setStringow);
    }
}
