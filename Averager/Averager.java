public class Averager{
    public static void main(String[] args){
        int sum = 0;
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        for (int x : intArray){
            sum += x;
        }
        int average = sum / intArray.length;
        System.out.println(average);
    }
}