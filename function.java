import java.util.Scanner;

public class function {
    public static void myName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        myName(name);
    }
}
