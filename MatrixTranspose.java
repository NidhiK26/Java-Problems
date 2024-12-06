public class MatrixTranspose {
     public static void Transpose(int arr[][]){
        for(int row=0;row<arr.length;row++){
            for(int col=row+1;col<arr[0].length;col++){
                int temp;
                temp=arr[col][row];
                arr[col][row]=arr[row][col];
                arr[row][col]=temp;
            }
        }
        return;
     }
    public static void main(String[] args) {
        int arr[][]={ {1,4,9},{11,4,3},{2,2,3} };
      Transpose(arr);

      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
      }
      System.out.println();
    }
    
}
