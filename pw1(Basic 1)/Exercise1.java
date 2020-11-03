package pw1;
public class Exercise1 {
    public static int Add(int a ,int b){
        return a+b;
    }
    public static int Mult(int a, int b) {
        return a * b;
    }
    public static int Max(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static int Min(int a, int b, int c) {
        int x = Math.min(a,b);
        return Math.min(x,c);
    }
    public static int Gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return Gcd(b, a % b);
    }
    public static void main(String[] args) {
        System.out.println("Sum is " +Add(5,3));
        System.out.println("Mult is "+Mult(5,3));
        System.out.println("Max is "+Max(5,3));
        System.out.println("Min is "+Min(5,3,2));
        System.out.println("Gcd is "+Gcd(5,3));
    }
}
