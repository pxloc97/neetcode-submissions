class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parenthsesMap = Map.of(
             ')', '(',
             '}', '{',
             ']', '['
        );

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c ==  ')' || c == '}' || c == ']') {
                if(stack.empty() || stack.pop() != parenthsesMap.get(c)) {
                    return false;
                }

                continue;
            }

            stack.push(c);
        }

        return stack.empty();
    }
}
