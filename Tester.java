import java.util.Arrays;

public class Tester{
  public static void main(String[] args){
    int[] arr1={1,3,5,7,8,42};
    int[][] arr2={{1,4,5,9},{9,0,2,1,0},{7,1,0,0}};
    System.out.println(ArrayOps.sum(arr1));
    System.out.println(ArrayOps.largest(arr1));
    System.out.println(Arrays.toString(ArrayOps.sumRows(arr2)));
  }
}
