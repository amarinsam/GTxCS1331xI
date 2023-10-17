public class Averager2{
    public static void main(String[] args){
        int sum = 0;
        for (String x : args){
            sum += Integer.parseInt(x);
        }
        // double average = sum / args.length;
        System.out.println(sum / args.length);
    }
}