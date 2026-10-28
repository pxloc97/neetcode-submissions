class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;

        while (left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);

            if (!(charLeft >= 'a' && charLeft <= 'z') && !(charLeft >= 'A' && charLeft <= 'Z')
                && !(charLeft >= '0' && charLeft <= '9')) {
                left++;
                continue;
            }

            if (!(charRight >= 'a' && charRight <= 'z') && !(charRight >= 'A' && charRight <= 'Z')
                && !(charRight >= '0' && charRight <= '9')) {
                right--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
