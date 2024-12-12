public class Factorial {

    public static int Fact(int n){
        if(n==0 || n==1){
            return 1;

        }
        int fac=Fact(n-1);
        return n*fac;
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(Fact(n));
    }
    
}
