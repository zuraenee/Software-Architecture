import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("orange");
        list.add("banana");
        list.add("coconut");
        for (int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
