// leetcode 739
import java.util.Stack;
class DailyTemperatures {
    public int[] solution(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int top = stack.pop();
                result[top] = i - top;
            }
            stack.push(i);
        }

        return result;
    }
}
