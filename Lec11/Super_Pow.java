package Lec11;

public class Super_Pow {
    class Solution {
        public int superPow(int a, int[] b) {
            a = a % 1337;
            int res = 1;
            // Idea (Progressive Exponentiation):
            for (int digit : b) {
                res = supper(res, 10) * supper(a, digit) % 1337;
            }
            return res;
        }

        public static int supper(int a, int n) {
            if (n == 0) return 1;
            if (a == 1) return 1;

            int y = supper(a, n / 2);
            y = y % 1337;

            int res = (y * y) % 1337;

            if (n % 2 == 1) {
                res = (res * (a % 1337)) % 1337;
            }
            return res;
        }
    }
}
