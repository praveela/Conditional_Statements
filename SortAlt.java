import java.util.*;
class AsceDesc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
          array[i]=sc.nextInt();
        }
        int t[]=array;
        Arrays.sort(t);
        System.out.print("The elements in ascending order: ");
        for(int i=0; i<n; i++){
           System.out.print(t[i]+" ");
          }
        System.out.print("\nThe elements in descending order:");
        for(int i=n-1; i>=0; i--){
            System.out.print(t[i]+" ");
           }
    
    }
}