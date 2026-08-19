import java.util.*;
// SUM OF ARRAY ELEMENTS
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
// MAXIMUM IN ARRAY
/*class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }
}*/
// MINIMUM IN ARRAy
/*class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element in the array: " + min);
    }
}*/
//COUNT OF EVEN AND ODD ELEMENTS IN ARRAY
class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int evenCount=0, oddCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Count of even elements in the array: " + evenCount);
        System.out.println("Count of odd elements in the array: " + oddCount);
    }
}
