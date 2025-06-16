import java.util.*;
class Trial
{
    public void Search(int arr[],int s)
    {
        long startTime=System.nanoTime();
        System.out.println("Searching using Arrays.binarySearch()");
        int index = Arrays.binarySearch(arr, s);
        if(index>0)
        {
            System.out.println("The element found at index :" + index );
        }
        else
        {
            System.out.println("Element not found in the array");
        }
        long endTime=System.nanoTime();
        System.out.println("Time taken by Arrays.binarySearch() is "+(endTime-startTime)/1_000_000.0+"ms");

    }
    public void binarySearch(int arr[],int s) {
        long startTime=System.nanoTime();
        int low = 0, high = arr.length - 1;
        boolean res=false;
        System.out.println("Searching using Binary Search Algorithm");
        while (low <=high) 
        {
               int mid = (low + high)/2;
               if(arr[mid]==s)
               {
                System.out.println("Element found at index : " + mid);
                res=true;
                break;
               }
               else if(arr[mid]<s)
               {
                low=mid+1;
               } 
               else {
                high=mid-1;
               }
        }
        if(res==false)
        {
            System.out.println("Element not found");
        }
        long endTime=System.nanoTime();
        System.out.println("Time taken by Binary Search Algorithm is "+(endTime-startTime)/1_000_000.0+"ms");
    }
    public void linearSearch(int arr[],int s)
    {
        long startTime=System.nanoTime();
        int index=-1;
        System.out.println("Searching using Linear Search Algorithm");
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==s)
            {
                index=i;
            }
        }
        if(index>0)
        {
            System.out.println("Element found at index : "+index);

        }
        else{
            System.out.println("Element not found");
        }
        long endTime=System.nanoTime();
        System.out.println("Time taken by Linear Search Algorithm is "+(endTime-startTime)/1_000_000+"ms");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n =ab.nextInt();
        int arr[]=new int[n];
        System.out.println("Adding elements to an array");
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
            {
                arr[i]=ab.nextInt();
            }
        //Binary search using Arrays.binarySearch();
        System.out.println("Enter the search key");
        int key=ab.nextInt();
        Trial obj1=new Trial();
        obj1.Search(arr,key);
        obj1.binarySearch(arr, key);
        obj1.linearSearch(arr, key);
        ab.close();
    }
}