import java.util.ArrayList;

public class AverageArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        float average = 0;
        for (int i = 1; i < 11; i++) {
            list.add(i);
            sum += i;
        }
        average = sum/list.size();
        System.out.println(list);
        System.out.println(sum);
        System.out.println("average is : " + average);
    }
}
