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
}*/
// 
// MAJORITY ELEMET IN ARRAY
/*import java.util.*;
class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for( i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
         
         for( i=0;i<arr.length;i++)
            {
                int count=0;
                for(int j=i+1;j<arr.length;j++)
                {
                if(arr[i]==arr[j])
                {
                    count++;
                }
               }
                if(count>(arr.length)/2)
                {
                    System.out.println("MAJORITY ELEMENT IS:"+arr[i]);
                    break;
                }
                
                
            }
            
    }
}*/
// MAJORITY ELEMENT IN ARRAY USING SORTING
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
        Arrays.sort(arr);
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count>arr.length/2)
            {
                System.out.println("MAJORITY ELEMENT IS:"+arr[i]);
                break;
            }
        }
    }
}*/
// MAJORITY ELEMENT IN AN ARRAY USING MOORE'S ALGORITHM
/*import java.util.*;
class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int freq=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(freq==0)
            {
                ans=arr[i];
            }
            if(ans==arr[i])
            {
                freq++;
            }
            else
            {
                freq--;
            }
            
        }
        freq=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ans)
            {
                freq++;
            }
        }
        if(freq>arr.length/2)
            {
                System.out.println("Majority element is:"+ans);
            }
            else
            {
                System.out.println("No majority element found.");
            }
        
    }
}*/

  

// FREQUENCY OF AN ELEMENT
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
        int key=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                count++;
            }
        }
        System.out.println("Total Occurences of"+ " "+key +" is"+" "+count);
    }
}*/
//  ALL OCCURENCES OF AN ELEMENT
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
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println(key +" is in index: "+ i);
            }
            else{
                continue;
            }
        }
    }
}*/
// PAIR SUM/TWO SUM BRUTE FORCE APPROACH
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
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                 if(arr[i]+arr[j]==target)
                 {
                    System.out.println("TARGET IS IN INDEX "+i+" "+j);
                 }
            }
        }
        

        
    }
}*/
//INTERSECTION OF TWO ARRAYS
/*import java.util.*;
public class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int i;
        for( i=0;i<arr1.length;i++)
        {
            int found=0;
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                     found=1;
                    break;
                }
            }
            if(found==1)
            {
             System.out.println("DUPLICATE ELMENT IS:"+arr1[i]);
            }
        }
            
    }
}*/
// UNION OF TWO ARRAYS
/*import java.util.*;
public class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int result[]=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++)
            {
                boolean found=false;
                for(int j=0;j<k;j++)
                {
                    if(arr1[i]==result[j])
                    {
                        found=true;
                        break;
                    }
                }
                if(!found)
                {
                    result[k]=arr1[i];
                    k++;
                }
             }
             for(int i=0;i<m;i++)
            {
                boolean found=false;
                for(int j=0;j<k;j++)
                {
                    if(arr2[i]==result[j])
                    {
                        found=true;
                        break;
                    }
                }
                if(!found)
                {
                    result[k]=arr2[i];
                    k++;
                }
             }
             for(int i=0;i<k;i++)
             {
                System.out.print(result[i]+" ");
             }
             
            }   
    }*/
   // FINDING LEADER IN AN ARRAY
   /*import java.util.*;
   class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
             if(i==arr.length-1)
                {
                    System.out.println("LEADER IS:"+arr[i]);
                }
                else{
                        for(int j=i+1;j<arr.length;j++)
                          {
                             if(arr[i]<arr[j])
                             {
                                break;
                             }
                                else if(j==arr.length-1)
                                {
                                    System.out.println("LEADER IS:"+arr[i]);
                            }
                        }
                    }
                }
            }
        }*/
       // MAXIMUM CONSECUTIVE 1'S IN AN ARRAY
       import java.util.*;
       class Arrays{
        public static void main(String[] args) {   
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int arr[]=new int[n];
           int count=0;
           int max=0;
           for(int i=0;i<arr.length;i++)
           {
            arr[i]=sc.nextInt();
           }
           for(int i=0;i<arr.length;i++)
           {  
               if(arr[i]==1)
               {
                count++;
                if(count>max)
                {
                    max=count;
                }
              }
                else
                {
                    count=0;

                }
               }
            
              System.out.println("MAXIMUM CONSECUTIVE 1'S IN AN ARRAY IS:"+max);


        }
       }
                
                
                
                
            
        
    



