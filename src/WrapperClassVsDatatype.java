public class WrapperClassVsDatatype {
    public static void main(String[] args) {
        int num_1 = 10;
        int num_2 = 10;

        Integer wrapnum_1 = new Integer(10);
        Integer wrapnum_2 = new Integer(10);
        Integer wrapnum_3 = 1;
        Integer wrapnum_4 = 1;
        Integer wrapnum_5 = new Integer(1);

        System.out.println(num_1 == num_2);

        // Compares reference
        System.out.println(wrapnum_1 == wrapnum_2);

        // Compares value of object
        System.out.println(wrapnum_1.equals(wrapnum_2));

        System.out.println(wrapnum_3 == wrapnum_4);
        System.out.println(wrapnum_3.equals(wrapnum_4));
        System.out.println(wrapnum_3 == wrapnum_5);
    }
}
