public class SomeOtherProgram{
    public static void main(String[] args){
        String[] lullabies = new String[]{"rockabye", "99bottlesofbeer"};
        int[] ints = new int[]{1, 2, 4, 5};

        System.out.println(ArraySearch.searchKeywordInArray("rockabye", lullabies));
        System.out.println(ArraySearch.searchIntInArray(1, ints));
    }
}