public class LastOccurance {

    public static int occur(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=occur(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,8,7,5,9,0};
        System.out.println(occur(arr, 5, 0));   
    }
    
}
