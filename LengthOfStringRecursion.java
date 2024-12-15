public class LengthOfStringRecursion{
 
    public static int  length(String str){
        if(str.length()==0){
            return 0;
        }
       return length(str.substring(1))+1;     //reduces string by 1 and increment the count
    }

    public static void main(String[] args) {
        String str="abcde";
        System.out.println(length(str));
}
}