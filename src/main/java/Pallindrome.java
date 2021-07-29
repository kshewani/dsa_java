public class Pallindrome {
    public static boolean isPlaindrome(String S) {
        int first=0;
        int last=S.length() - 1;
        while (first < last) {
            if (S.charAt(first++) != S.charAt(last--)) {
                return false;
            }
        }

        return true;
    }
}
