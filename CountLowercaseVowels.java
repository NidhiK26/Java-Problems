public class CountLowercaseVowels {
   public static int CountVowels(String str){
    int count=0;
    for(int i=0;i<str.length();i++){
        //count only lowercase vowels
        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
            count ++;
        }
    }
    return count;
   }
    public static void main(String[] args) {
        String str="I am Nidhi";
    System.out.println(CountVowels(str));
    }
    
}
