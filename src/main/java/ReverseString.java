public class ReverseString {
    public static String reverse(String s)
    {
        int n = s.length();
        if (n <= 1) {
            return s;
        }

        int i = 0;
        int j = n-1;
        char temp;
        char[] tempS = s.toCharArray();
        while (i < j) {
            temp = tempS[i];
            tempS[i++] = tempS[j];
            tempS[j--] = temp;
        }

        return new String(tempS);
    }
}
