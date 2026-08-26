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
// MINIMUM IN ARRAY
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
/*class Arrays{
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
}*/
//LINEAR SEARCH IN ARRAY
/*class Arrays{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[]arr=new int[n];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      int key=sc.nextInt();
      int found=0;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==key)
        {
            found=1;
            System.out.println("Element found at index: " + i);
            break;
        }
    }
    if(found==0)
    {
        System.out.println("Element not found in the array.");
    }

}
}*/
// REVERSE AN ARRAY
/*class Arrays{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("ARRAY IN ORIGINAL ORDER:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("ARRAY IN REVERSE ORDER:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
}
}*/
//SECOND LARGEST ELEMENT IN ARRAY
/*import java.util.*;
class Arrays{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      int slargest=Integer.MIN_VALUE;;
      int max=arr[0];
      for(int i=1;i<arr.length;i++)
      {
        if(arr[i]>max)
        {
           slargest=max;
           max=arr[i];
        }
        else if(arr[i]>slargest && arr[i]!=max)
        {
            slargest=arr[i];
        }
        else if(arr[i]==max)
        {
            continue;
        }
        else
        {
            continue;
        }
      }
      System.out.println("Second largest element in the array: " + slargest);
    }
}*/
// CHECK IF ARRAY IS SORTED OR NOT
/*class Arrays{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      boolean isSorted=true;
      for(int i=0;i<arr.length-1;i++)
      {
        if(arr[i]>arr[i+1])
        {
            isSorted=false;
            break;
        }
      }
      if(isSorted)
      {
        System.out.println("The array is sorted in ascending order.");
      }
      else
      {
        System.out.println("The array is not sorted in ascending order.");
      }
    }
}*/
//
// REMOVE DUPLICATES FROM SORTED ARRAY
/*import java.util.*;
class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
            else
            {
                continue;
            }
        }
        System.out.println("AFTER REMOVING DUPLICATES:");
        for(int k=0;k<=i;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
*/
// ROTATE AN ARRAY  BY ONE
/*class Arrays{
    public static void main(String[] args) {
            
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=arr[n-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }

        arr[0]=temp;
        System.out.println("AFTER ROTATING THE ARRAY:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}*/
// ROTATE ARRY BY K TIMES
/*class Arrays{
    static void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
static void rotate(int arr[],int k)
{
    k=k%arr.length;
    if(k<0)
    {
        k=k+arr.length;
    }
    reverse(arr,0,arr.length-1);
    reverse(arr,0,k-1);
    reverse(arr,k,arr.length-1);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotate(arr,k);  
        System.out.println("AFTER ROTATING THE ARRAY BY " + k + " TIMES:");
        for(int i=0;i<arr.length;i++)   {
            System.out.println(arr[i]);
        }      
    }
}*/
// MOVE 0'S TO END OF ARRAY
/*import java.util.*;
class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int z=0;  // points to zero elemnt 
        int nz=0;   // points to nonzero element
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                nz++;
            }
            else{
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                z++;
                nz++;
            }

        }
        System.out.println("ARRAY AFTER MOVING 0'S TO END:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}*/
// FIND MISSING NUMBER IN ARRAY
/*import java.util.*;
class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)  
            {
                arr[i]=sc.nextInt();
            } 
            int sum=0;
            for(int i=0;i<arr.length;i++)
                {
                    sum+=arr[i];
                }   
                int totalsum=(n*(n+1))/2 ;
                int missing=totalsum-sum;
                System.out.println(missing);  

                
        

        
    }        
    
}*/
// FIND DUPLICATE ELEMENTS IN ARRAY
import java.util.*;
class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]+" ");
                }
            }
        }

    }
}