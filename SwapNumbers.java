public class SwapNumbers {

    public static void main(String[] args) {
        int a=5;
        int b=7;
    //swap without third variable using XOR
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("a=" + a +" " +"and" + " "+ "b="+ b);

    //swap using third variable
    int temp=a;
    a=b;
    b=temp;
    System.out.println("a=" + a +" " +"and" + " "+ "b="+ b);

//swap without third variable using add & sub

a=a+b;
b=a-b;
a=a-b;
System.out.println("a=" + a +" " +"and" + " "+ "b="+ b);

    }
    
}
