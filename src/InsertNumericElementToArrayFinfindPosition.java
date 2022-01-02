import java.util.Arrays;

public class InsertNumericElementToArrayFinfindPosition {
    public static void main(String[] args) {
        int[] asd = new int[] {1,3,4,5, 1, 3};
        int pos = Arrays.binarySearch(asd,2);
        System.out.println("Dodane w miejscu = "+~pos);

        for(int i=0 ; i<asd.length ; i++)
        {
            System.out.println(asd[i]);
        }
    }
}
