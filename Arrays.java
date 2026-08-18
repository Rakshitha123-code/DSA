import java.util.*;
/*class Arrays{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum=0;
        for (int i = 0; i <= arr.length-1; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}*/
class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }
}