import java.util.HashMap;
import java.util.Stack;;
class ValidParenthesis {
    public boolean isValid(String s) {
        HashMap<Character,Character>map = new HashMap<>();

        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                if(stack.empty() || stack.pop() != map.get(c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.empty();
    }
}