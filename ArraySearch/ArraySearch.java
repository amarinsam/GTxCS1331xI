public class ArraySearch{
    public static void main(String[] args){
        String[] concepts = new String[]{"abstraction", "polymorphism", "inheritance", "encapsulation"};
        
        searchKeywordInArray("polymorphism", concepts);

        
        
        System.out.println(searchKeywordInArray("polymorphism", concepts));
    }

    public static String searchKeywordInArray(String wordToSearchFor, String[] arraytoSearch){
        String result = "not found";
        for (String element : arraytoSearch){
            if (element.equals(wordToSearchFor)){
                result = "found";
                break;
            }
        }
        return result;
    }

    public static boolean searchIntInArray(int numberToSearchFor, int[] intArrayToSearch){
        boolean result = false;
        for (int element : intArrayToSearch){
            if (element == numberToSearchFor){
                result = true;
                break;
            }
        }
        return result;
    }
}