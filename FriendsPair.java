public class FriendsPair {
 
    public static int CountPairs(int n){
        if(n==1 || n==2){
            return n;
        }

        int fnm1=CountPairs(n-1);

        int fnm2=CountPairs(n-2);
        int CountWays=(n-1) * fnm2;

        int TotalWays=fnm1+CountWays;
        return TotalWays;

    }
    public static void main(String[] args) {
        System.out.println(CountPairs(3));
        
    }
    
}