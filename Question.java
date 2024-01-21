import java.util.Scanner;

public class Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String letter;
        do{
            System.out.print("Please enter a number to check weather it is a prime no. or not:");
            int num = sc.nextInt();
            if(isPrime(num)){
                System.out.println("It is a prime number!");
            } else {
                System.out.println("It is not a prime number!");
            }
            System.out.println("Do you want to use the program again!");
            letter = sc.next();
        }while (!letter.equalsIgnoreCase("n"));
        System.out.println("Program ended! Thank you!");
    }
    private static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
