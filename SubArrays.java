public class SubArrays {                                   
    public static void PrintSubarray(int arr[]){
         int total=0;
         
         int maxSum=Integer.MIN_VALUE;
         int minSum=Integer.MAX_VALUE;
         int sumOfAllSubarrays=0;
         for(int i=0;i<arr.length;i++){
          
          for(int j=i;j<arr.length;j++){
           
            int sum=0;
            for(int k=i;k<=j;k++){
                System.out.print( arr[k]+" ");

                sum += arr[k];

            }
            System.out.println();
            
            total++;
            System.out.println("-> Sum os this subarray:" +sum);
            
             maxSum=Math.max(maxSum,sum);
             minSum=Math.min(minSum,sum);

             sumOfAllSubarrays += sum; 
                System.out.println();

          }
         }
        
         System.out.println("Total Subarrays: " + total);
         System.out.println("Sum of All Subarrays: " + sumOfAllSubarrays);
         System.out.println("Maximum Sum: " + maxSum);
         System.out.println("Minimum Sum: " + minSum);
        
                         
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        PrintSubarray(arr);
    }
}
