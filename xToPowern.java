public class xToPowern {
   
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }

        int halfPower=Power(x,n/2);
        int halfPowersq=halfPower*halfPower;

        if(n%2!=0){
            return x*halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(Power(x, n));
    }
    
}
