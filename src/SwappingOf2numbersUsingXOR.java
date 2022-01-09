public class SwappingOf2numbersUsingXOR {
    public static void main(String[] args) {

        int a =1;
        int b=2;
        a^=b;
        b^=a;
        a^=b;
        System.out.println(a);
        System.out.println(b);
    }
}
