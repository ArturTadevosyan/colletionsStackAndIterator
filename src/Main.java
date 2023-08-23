import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {22, -6, 1, 55, 988, -16, 0};

        List<Integer> reverseList = reverse(array);
        System.out.println(reverseList);
    }

    private static List<Integer> reverse(Integer[] array) {
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : array) {
            stack.push(integer);
        }
        List<Integer> reverseList = new ArrayList<>();

        //iterator
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            reverseList.add(stack.pop());
        }

        return reverseList;
    }
}
