import java.util.*;

class Subset{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        Set<Integer> s = new HashSet<>();
        for (int i=0;i<m;i++) {
            s.add(sc.nextInt());
        }
        Map<Integer, Integer> fmp = new HashMap<>();
        for (int num : a) {
            if (s.contains(num)) {
                fmp.put(num, fmp.getOrDefault(num, 0) + 1);
            }
        }
        for (int num : s) {
            System.out.println("Frequency of " + num + ": " + fmp.getOrDefault(num, 0));
        }
    }
}
