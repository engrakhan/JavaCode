import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
//System.out.println("Alhamdulillah I have done my first attempt");
//        for (int i = 1; i <=5; i++){
//            for (int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        byte num1 = sc.nextByte();
        byte num2 = sc.nextByte();
        int sum = num1 + num2;
        System.out.println(sum);

    }
}
