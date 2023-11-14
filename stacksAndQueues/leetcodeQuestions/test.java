package java6.stacksAndQueues.leetcodeQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // System.out.println(list.stream().toArray(Integer[] :: new));
        System.out.println(Arrays.toString(Arrays.copyOfRange(list.toArray(), 1, list.size())));
    }
}
