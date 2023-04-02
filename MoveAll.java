import java.util.Scanner;
import java.util.Arrays;
class MoveAll{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int array[]=new int[n];
        int c=0,j=0;
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            int t=sc.nextInt();
            if(t==1){
                c+=1;
            }
            else{
          array[j]=t;
          j+=1;
            }
        }
        System.out.println("Array elements after moving Ones to end: ");
        for(int i=0; i<c; i++){
            array[j]=1;
            j+=1;
        }
        for(int i=0; i<n; i++){
            System.out.print(array[i]+",");
        }
    }
}