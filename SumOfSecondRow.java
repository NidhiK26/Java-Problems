public class SumOfSecondRow {
    public static int Sum(int arr[][]){
        int sum=0;
        for(int row=1;row<arr.length-1;row++){
            for(int col=0; col<arr[0].length;col++){
                sum+=arr[row][col];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={ {1,4,9},{11,4,3},{2,2,3} };
        System.out.println(Sum(arr));
    }
    
}
