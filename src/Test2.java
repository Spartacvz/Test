import java.util.ArrayList;

public class Test2 {

    public static void test2Method() {
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        int count = 0;

        for (int i : list) {
            for (int j : list) {
                if (i == j){
                    list.remove(j);
                }
            }
        }
        System.out.println(count);
    }

    public int uniqueArray(int[] nums) {
        int length = nums.length;

        if(length == 0) {
            return 0;
        }

    }
}
