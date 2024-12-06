import java.util.Arrays;

public class Anagram {
   public static void isAnagram(String str1, String str2){
    str1.toLowerCase();
    str2.toLowerCase();

    if(str1.length()== str2.length()){
        char[] str1ToChar= str1.toCharArray();
        char[] str2ToChar= str2.toCharArray();

        Arrays.sort(str1ToChar);
        Arrays.sort(str2ToChar);

        boolean result=Arrays.equals(str1ToChar, str2ToChar);
        if(result){
            System.out.println(str1 + " " + "and" + " "+ str2 +" " + "Is Anagram");
        }
        else{
            System.out.println(str1 + " " + "and" +" " + str2 +" "+ "Is Not Anagram");

        }
    }
    else{
        System.out.println(str1 + " " + "and" +" " + str2 +" " + "Is Not Anagram");

    }
      
   }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        //System.out.println(isAnagram(str1, str2));
        isAnagram(str1, str2);
    }
    
}
