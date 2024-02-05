import java.util.HashSet;
public class Exercise2 {
    public static void main(String[] args) {
        HashSet<Integer> nums = filledSet();

        Integer newNum = 6;
        nums.add(newNum);

        if(nums.contains(newNum)) {
            System.out.println("nums set contains " + newNum);
        } else {
            System.out.println("nums set does not contain " + newNum);
        }

    }

    public static HashSet<Integer> filledSet() {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        return nums;
    }
}
