import java.util.Scanner;

public class PractiseClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the radius of the circle: ");
//        float radius = sc.nextFloat();
//        double area_of_circle = 3.14*(radius)*(radius);
////        System.out.println("The area of the circle with radius " +area_of_circle);
//        System.out.print("Enter the number whose table you want to have: ");
//        int num = sc.nextInt();
//        for (int i = 1; i <= 15; i++){
//            System.out.println(num+" * "+ i +" = "+num*i);
//        }
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        if(num1 == num2){
//            System.out.println(num1+" is equal to "+ num2);
//        } else if (num1 > num2 ) {
//            System.out.println(num1+" is greater than "+num2);
//        } else {
//            System.out.println(num2+" is greater than "+num1);
//        }
//        int button1 = sc.nextInt();
//        switch (button1){
//            case 1:
//                System.out.println("Asslamoalikum");
//                break;
//            case 2:
//                System.out.println("How are you?");
//                break;
//            case 3:
//                System.out.println("Alhamdulillah");
//                break;
//            default:
//                System.out.println("Have a nice time brother");
//        }
//        System.out.println("Please Enter two numbers for performing an operation");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.print("Please enter respective number for operation: ");
//        System.out.println("\n1) + \n2) - \n3) * \n4) / \n5) %");
//        int operator_num = sc.nextInt();
//        if (operator_num == 1) {
//            int sum = num1 + num2;
//            System.out.println(num1+" + "+num2+" = "+sum);
//        } else if (operator_num == 2) {
//            int sub = num1 - num2;
//            System.out.println(num1+" - "+num2+" = "+sub);
//        } else if (operator_num == 3) {
//            int mul = num1 * num2;
//            System.out.println(num1+" * "+num2+" = "+mul);
//        } else if (operator_num == 4) {
//            int div = num1 / num2;
//            System.out.println(num1+" / "+num2+" = "+div);
//        } else if (operator_num == 5) {
//            int mod = num1 % num2;
//            System.out.println(num1+" % "+num2+" = "+mod);
//        } else {
//            System.out.println("Wrong input for operator");
//        }
//        System.out.print("Please enter no. to get respective month of the year: ");
//        int month_num = sc.nextByte();
//        switch (month_num) {
//            case 1 -> System.out.println("January");
//            case 2 -> System.out.println("February");
//            case 3 -> System.out.println("March");
//            case 4 -> System.out.println("April");
//            case 5 -> System.out.println("May");
//            case 6 -> System.out.println("June");
//            case 7 -> System.out.println("July");
//            case 8 -> System.out.println("August");
//            case 9 -> System.out.println("September");
//            case 10 -> System.out.println("October");
//            case 11 -> System.out.println("November");
//            case 12 -> System.out.println("December");
//            default -> System.out.println("Invalid option");
//        }
//        System.out.print("Enter a number up to which you want to add number: ");
//        int num = sc.nextInt();
//        int i = 1;
//        int sum = 0;
//        while (i <= num){
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);
        // Table of a number using loops
//        int num = sc.nextInt();
//        int i = 1;
//        while(i<=15){
//            int mul = num * i;
//            System.out.println(num +" * "+i+" = "+mul);
//            i++;
//        }
//        System.out.print("Enter a number whose table you want to print: ");
//        int num = sc.nextInt();
//        int mul = 1;
//        for (int i = 1; i<=15; i++){
//            mul = num * i;
//            System.out.println(num +" * "+i+" = "+mul);
//        }
        //Print all even numbers until n
//        System.out.print("Enter a number upto which you want to print even numbers: ");
//        int num = sc.nextInt();
//        for (int i = 1; i<=num; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
        // Menu driven program
        int num;
        do {
            System.out.print("Enter 1 to go use our program further and 0 to quit: ");
            num = sc.nextInt();
           if(num == 1){
               System.out.println("Enter student marks upto 100: ");
               int score = sc.nextInt();
               if(score >=90){
                   System.out.println("This is good");
               } else if(score >= 60 && score <= 89){
                   System.out.println("This is good also");
               } else{
                   System.out.println("This is good as well");
               }
           } else if( num != 0){
               System.out.println("Invalid input! Please input 0 or 1");
           }
        } while(num != 0);
    }
}
