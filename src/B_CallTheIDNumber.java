import java.util.*;

public class B_CallTheIDNumber  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N = scanner.nextInt();
        int A[] = new int[N];
        TreeSet<Integer> called = new TreeSet<>();
        TreeSet<Integer> unCalled = new TreeSet<>();
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
            if (!called.contains(i+1)) {
                called.add(A[i]);   
                unCalled.add(i+1);
            }
        }
        scanner.close();

        unCalled.removeAll(called);

        System.out.println(unCalled.size());
        for (Integer person : unCalled) {
            System.out.print(person+" ");
        }
    }
}

