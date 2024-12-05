public class CountingSort {
   public static void Sort(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        largest=Math.max(largest,arr[i]);

    }
    //Count Frequency
     int count[] = new int[largest+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
    }
    //sorting
    int j=0;
    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
    }
}
}
public static void PrintArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
}
System.out.println();
   }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        Sort(arr);
        PrintArr(arr);

    }
    
}
