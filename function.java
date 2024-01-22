import java.util.Scanner;

public class function {
//    public static void myName(String name){
//        System.out.println(name);
//    }
    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        myName(name);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to add: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = sum(num1,num2);
        System.out.println(num1+" + "+num2+" = "+result);
    }
}
