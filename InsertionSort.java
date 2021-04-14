import java.io.*;
import java.util.*;

public class Main {

  public static void insertionSort(int[] arr) {
    for(int i=1; i<arr.length; i++){  //0th index is sorted that we have assume
      for(int j=i-1; j>=0; j--){  //j is started from i-1 index so from above if i=1 then j =i-1= 0
        if(isGreater(arr,j,j+1){  //if 0th index value i.e arr[j] > arr[j+1 i.e i] then do swaping  and arr[j+1] value will come at 0th index
          swap(j,j+1);
         }
           else{
             break;
           }
        }
     }
  }
 // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // return true if jth element is greater than ith element
  public static boolean isGreater(int[] arr, int i, int j) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    insertionSort(arr);
    print(arr);
  }

}
