import java.util.*;
 
public class B_TLE  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N = scanner.nextInt();
        int A[] = new int[N];
        ArrayList<Integer> people = new ArrayList<>();
        ArrayList<Integer> called = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            A[i] = N-i+1;
            people.add(i+1);
            if (!called.contains(i+1)) {
                called.add(A[i]);   
            }
        }
        scanner.close();
 
        people.removeAll(called);

        long start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(people.size());
        for (Integer person : people) {
            // System.out.print(person+" ");
        }

        long end = System.currentTimeMillis();
        System.out.println(end);
    }
}