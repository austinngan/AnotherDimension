import java.util.Arrays;

public class ArrayOps{
  public static int sum(int[] arr){
    int sum=0;
    for (int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;
  }
  public static int largest(int[] arr){
    int max=0;
    for (int i=0;i<arr.length;i++){
      max=Math.max(max,arr[i]);
    }
    return max;
  }
  public static int[] sumRows(int[][] matrix){
    int[] finalarr=new int[matrix.length];
    for (int i=0;i<matrix.length;i++){
      finalarr[i]=ArrayOps.sum(matrix[i]);
    }
    return finalarr;
  }
  public static int[] largestInRows(int[][] matrix){
    int[] finalarr=new int[matrix.length];
    for (int i=0;i<matrix.length;i++){
      finalarr[i]=ArrayOps.largest(matrix[i]);
    }
    return finalarr;
  }
}
