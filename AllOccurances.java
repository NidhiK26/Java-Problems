public class AllOccurances {

    public static void FindAllOccr(int arr[], int key, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
        System.out.println(i+" ");
        }

        FindAllOccr(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[]={2,3,5,4,6,7,5,1,8,5};
    
        FindAllOccr(arr, 5, 0);
    }
    
}
