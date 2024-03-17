package Palidrone;

public class Solution {




        public boolean isPalindrome (int x) {

            int temp = 454;
            int r, sum = 0;
            while (x > 0) {
                r = x % 10;
                sum = (sum * 10) + r;
                x = x / 10;
            }
            if (temp == sum)
                return true;
            else
                return false;



    }

    public static void main(String[] args) {
        int d=454;
        Solution s=new Solution();
        s.isPalindrome(d);
    }
}

