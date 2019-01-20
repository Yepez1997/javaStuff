import java.util.Stack;

class PalNum {
    public static void main(String args[]) {
        int num =  1221;
        boolean isPal = palindrome(num);
        System.out.println(isPal);
    }

    public static boolean palindrome(int x) {
        String intToStr = Integer.toString(x);
        Stack<Character> stack = new Stack<Character>();
        if (x < 0) {
            return false;
        }
        for (int i = 0; i < intToStr.length(); ++i) {
            stack.push(intToStr.charAt(i));
        }
        String reversed = "";
        while(!stack.empty()) {
            reversed += stack.pop();
        }
        System.out.println(intToStr);
        System.out.println(reversed);
        if (intToStr == reversed) {
            return true;
        } 
        return false;
    }

}