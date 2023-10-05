import java.util.ArrayList;

public class lab2_exA_task04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("orange");
        list.add("banana");
        list.add("coconut");
        boolean found = false;
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).contains("banana")){
                found = true;
            }
        }
        if(found == true){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
