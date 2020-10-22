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
    int len=matrix.length-1;
    int[] blankarr={};
    int[] finalarr=new int[matrix[0].length];
    if (ArrayOps.isRectangle(matrix)==false){
      return blankarr;
    }
    for (int z=0;z<matrix[0].length;z++){
      sum=0;
      for (int i=0;i<matrix.length;i++){
        sum+=matrix[i][z];
      }
      finalarr[z]=sum;
    }
    return finalarr;
  }
  public static boolean isRectangle(int[][]matrix){
    int rectcount=0;
    int[] finalarr=new int[matrix.length];
    for (int a=0;a<matrix.length-1;a++){
      if (matrix[a].length!=matrix[a+1].length){
        return false;
      }
      if (matrix[a].length==matrix[a+1].length){
        rectcount+=1;
      }
    }
    if (rectcount==matrix.length-1){
      return true;
    }
    else{
      return false;
    }
  }
  public static boolean sameArray(int[][]matrix,int[]arr){
    int count=0;
    if (ArrayOps.isRectangle(matrix)==false){
      return false;
    }
    else{
      for (int i=0;i<matrix.length-1;i++){
        if (arr[i]!=arr[i+1]){
          return false;
        }
        if (arr[i]==arr[i+1]){
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
  public static boolean isRowMagic(int[][] matrix){
    int[] arr2=ArrayOps.sumRows(matrix);
    return ArrayOps.sameArray(matrix,arr2);
  }
  public static boolean isColMagic(int[][] matrix){
    int[] arr=ArrayOps.sumCols(matrix);
    return ArrayOps.sameArray(matrix,arr);
  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    int sumrow=ArrayOps.sum(matrix[row]);
    int[] cols=ArrayOps.sumCols(matrix);
    int sumcol=cols[col];
    if (sumrow==sumcol){
      return true;
    }
    else{
      return false;
    }
  }
}
