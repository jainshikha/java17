package Com.String.SealedTest;

public class testt {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,6,4,1,2};
        //System.out.println(firstMissingPositive(a));
        System.out.println(findPalindrome("?a?"));
    }
    static int firstMissingPositive(int[] A) {
        int n = A.length;
        boolean[] seen = new boolean[n + 1]; // boolean array to mark which values have been seen
        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n) {
                seen[A[i]] = true; // mark value as seen
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) { // check if value has not been seen
                return i; // return first missing positive integer
            }
        }
        return n + 1;
    }

    public static String findPalindrome(String S) {
        int n = S.length();
        int l = 0, r = n - 1;
        char[] s = S.toCharArray();
        while (l <= r) {
            if (s[l] == '?' && s[r] == '?') {
                s[l] = s[r] = 'a';
            } else if (s[l] == '?') {
                s[l] = s[r];
            } else if (s[r] == '?') {
                s[r] = s[l];
            } else if (s[l] != s[r]) {
                return "NO";
            }
            l++;
            r--;
        }
        return new String(s);
    }

}
