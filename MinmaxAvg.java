import java.util.Scanner;
import java.util.Arrays;;
class MinmaxAvg{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n,s=0;
      System.out.print("Enter the size:");
      n=sc.nextInt();
      int array[]=new int[n];
      System.out.println("Enter the array elements:");
      for(int i=0; i<n; i++){
        array[i]=sc.nextInt();
        s+=array[i];
      }
      Arrays.sort(array);
      System.out.println("1.The element with the Minimum value: "+array[0]);
      System.out.println("2.The element with the Maximum value: "+array[n-1]);
      System.out.println("3.The average of all array elements: "+s/n);
      System.out.println("4.Total number of array elements: "+n);
    }
}