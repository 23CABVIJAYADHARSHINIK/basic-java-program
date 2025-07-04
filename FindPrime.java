import java.util.Scanner;
public class FindPrime {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if(isprime(num))
        {
            System.out.println(num + "it is prime value");
        }else{
            System.out.println(num + "it is not prime value");
        }
    }
    public static boolean isprime(int n){
            if(n<=1){
                return false;
            }for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
}