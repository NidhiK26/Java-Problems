public class NumToDigits {

    static String digits[]={"zero", "one", "two", "three", "four", "five", "six","seven", "eight","nine"};
  
    public static void PrintDigits(int num){
           if(num==0){
            return;
           }

           int lastDigit=num%10; //find last digit
           PrintDigits(num/10);   //find all except last digit
           System.err.print(digits[lastDigit] +" ");
    }
    public static void main(String[] args) {
        int num=2025;
        PrintDigits(num);
    }
    
}
