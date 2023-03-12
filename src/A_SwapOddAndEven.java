import java.util.*;

public class A_SwapOddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        char[] s = S.toCharArray();
        for (int i = 0; i < s.length/2; i++) {
            char tmp = s[2*i+1];
            char tmp2 = s[2*i];

            s[2*i] = tmp;
            s[2*i+1] = tmp2;
            
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}

