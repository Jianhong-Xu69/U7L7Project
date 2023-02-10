import java.util.ArrayList;

public class Search
{
    public static int linearSearchArrayList(ArrayList<Integer> elements, int target) {
        // implement me!
        if (elements.contains(target)){ //why search if it ain't there?
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i) == target){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int linearSearch(String[] elements, String target) {
        // implement me!  Don’t forget to use .equals for strings!
        for (int i = 0; i < elements.length; i++) { //no workaround for this
            if (elements[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}