public class pattern8 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        for(int row=n;row>0;row--)
        {
            for(int space=n-row;space>0;space--)
            {
                System.out.print(" ");
            }
            for(int col=0;col<2*row -1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
