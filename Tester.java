import java.util.Arrays;

public class Tester{
  public static void main(String[] args){
    int[] arr={4,4,6,9};
    int[] arr1={1,3,5,7,8,42};
    int[][] arr2={{1,4,5,9},{9,0,2,1},{7,1,0,0}};
    int[][] arr3={{31,5,52,3},{2,4,6,7},{7,7,7,7,8},{1,1,3,5,4},{2}};
    int[][] samearr={{1,2,3},{1,2,3},{1,2,3}};
    System.out.println(ArrayOps.sum(arr1)); //returns 66
    System.out.println(ArrayOps.sum(arr));  //returns 23
    System.out.println(ArrayOps.largest(arr1)); //returns 42
    System.out.println(ArrayOps.largest(arr));  //returns 9
    System.out.println(Arrays.toString(ArrayOps.sumRows(arr2)));  //returns [19,12,8]
    System.out.println(Arrays.toString(ArrayOps.sumRows(arr3)));  //returns [91,19,36,14,2]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(arr2)));  //returns [9,9,7]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(arr3)));  //returns [52,7,8,5,2]
    System.out.println(ArrayOps.sum(arr2)); //returns 39
    System.out.println(ArrayOps.sum(arr3)); //returns 162
    System.out.println(Arrays.toString(ArrayOps.sumCols(arr2)));
    System.out.println(ArrayOps.isRowMagic(samearr));
    System.out.println(ArrayOps.isColMagic(samearr));
  }
}
