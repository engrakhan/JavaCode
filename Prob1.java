public class Prob1 {
    public static void main(String[] args) {
        int rows = 5;
//        for (int i=1; i<=rows; i++){
//            for (int j=1; j<=rows-i; j++){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=rows; k++){
//                if(i==1 || k==1 || i==rows || k==rows){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
