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
  public static int sum(int[][] arr){
    int[] arr2=ArrayOps.sumRows(arr);
    int total=ArrayOps.sum(arr2);
    return total;
  }
  public static int[] sumCols(int[][] matrix){
    int sum=0;
    int[] finalarr=new int[matrix.length];
    for (int z=0;z<matrix.length;z++){
      sum=0;
      for (int i=0;i<matrix.length;i++){
        sum+=matrix[i][z];
      }
      finalarr[z]=sum;
    }
    return finalarr;
  }
  public static boolean isRowMagic(int[][] matrix){
    int[] arr2=ArrayOps.sumRows(matrix);
    int count=0;
    if (matrix.length!=matrix[0].length){
      return false;
    }
    else{
      for (int i=0;i<matrix.length-1;i++){
        if (arr2[i]!=arr2[i+1]){
          return false;
        }
        if (arr2[i]==arr2[i+1]){
          count+=1;
        }
      }
      if (count==matrix.length-1){
        return true;
      }
      else{
        return false;
      }
    }
  }
}
