public class FastMultiplicationOrDivisionBy2 {

    public static void main(String[] args) {
        int a = 8;
        a = a << 1;
        int b = 4;
        b = b >> 1;
        System.out.println(a);
        System.out.println(b);
    }
}
