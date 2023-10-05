import java.util.ArrayList;

public class lab2_exA_task05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("orange");
        list.add("banana");
        list.add("coconut");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("n")) {
                System.out.println(list.get(i) + " :  does contain the letter n");
            } else {
                System.out.println(list.get(i) + " : does not contain the letter n");
            }
        }
    }
}
