public class mywork {
    public static void main(String[] args) {
        int rows = 5;
        for (int i=1; i<=rows; i++){
            for(int j=1;j<=i; j++){
                if(j==1 || j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k=1; k<=2*(rows-i);k++){
                System.out.print(" ");
            }
            for (int l=1;l<=i;l++){
                if(l==1 || l==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=rows; i>=1; i--){
            for(int j=1;j<=i; j++){
                if(j==1 || j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k=1; k<=2*(rows-i);k++){
                System.out.print(" ");
            }
            for (int l=1;l<=i;l++){
                if(l==1 || l==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
