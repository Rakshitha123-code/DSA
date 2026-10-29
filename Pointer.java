// TWO POINTERS---> OPPOSITE ENDS
// REVERSE ARRAY
/*import java.util.*;
public class Pointer {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("AFTER REVERSING:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}*/
// PALINDROME OF A STRING
import java.util.*;
public class Pointer{
    static boolean isPalindrome(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(! Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if(! Character.isLetterOrDigit(s.charAt(left)))
                left++;
            if(Character.toLowerCase(s.charAt(left)) !=Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void  main(String[] args) {
        String s="Never odd or even";
        if(isPalindrome(s))
            System.out.println("STRING IS PALINDROME");
        else
            System.out.println("STRING IS NOT  PALINDROME");
    }
}
  
