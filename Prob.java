public class Prob {
    public static void main(String[] args) {
        int rows = 5;
        rows = 8;
//        int columns = 5;
        //Solid rhombus
//        for(int i = 1; i<=rows; i++){
//            for(int j=1; j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=rows;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        Number pyramid
//        for (int i = 1; i <= rows; i++) {
//            // Print spaces before numbers
//            for (int j = 1; j <= rows - i; j++) {
//                System.out.print(" ");
//            }
//
//            // Print the number 'i' repeated 'i' times
//            for (int k = 1; k <= i; k++) {
//                System.out.print(i);
//
//                // Print an extra space after the number if it's a single digit
//                if (i < 10 && k < i) {
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }
//        palindromic number pyramid
//        for(int i=1; i<=rows; i++){
//            for (int j=1; j<=rows-i; j++){
//                System.out.print("  ");
//            }
//            for (int k=i;k>=1; k--){
//                System.out.print(k+" ");
//            }
//            for(int l=2; l<=i; l++){
//                System.out.print(l+" ");
//            }
//            System.out.println();
//        }
//        Butterfly pattern
//
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=i; k>=1; k--){
//                System.out.print(k);
//            }
//            for(int l=2;l<=i;l++){
//                System.out.print(l);
//            }
//            System.out.println();
//        }
//        Diamond
        int n=4;
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
