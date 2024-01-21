public class Prob1 {
    public static void main(String[] args) {
        int rows = 4;
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
//        for (int i=0; i<=rows; i++){
//            int counter = 1;
//            for (int j=0; j<=rows-i; j++){
//                System.out.print(" ");
//            }
//            for (int k=0; k<=i; k++){
//                System.out.print(" "+counter);
//                counter = counter*(i-k)/(k+1);
//            }
//            System.out.println();
//        }
//        for (int i=1; i<=rows; i++){
//            for (int j=1; j<=rows-i; j++){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=i; k++){
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }
        int counter = 1;
        for (int i=rows; i>=1; i--){
            for (int j=1; j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(" "+counter);
            }
            counter++;
            System.out.println();
        }
    }
}
