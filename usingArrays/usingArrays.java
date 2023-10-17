import java.util.Arrays;

public class usingArrays{
    public static void main(String[] args){
        String[] stringArray = new String[7];
        String[] stringArray2 = new String[] {"yo", null, "hi"};
        Double[] doubleArray = new Double[2];
        doubleArray[0] = (double)2;
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(stringArray2));
        System.out.println(Arrays.toString(doubleArray));

        for (String x : stringArray2){
            if (x != null){
                System.out.println(x);
            }
        }
    }
}