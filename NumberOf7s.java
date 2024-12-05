public class NumberOf7s {
    public static int Count7(int arr[][]){
        int count=0;
       for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[0].length;col++){
            if(arr[row][col]==7){
                count++;
            }
       }
    }
       return count;
    }
    public static void main(String[] args) {
        int arr[][]={ {4,7,8},{8,7,7} };
        System.out.println(Count7(arr));
    }
    
}
