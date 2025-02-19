class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0;
        long res = 0;

        // Handle sign
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Parse digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i) - '0');

            // Check for overflow
            if (res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (res * sign);
    }
}
