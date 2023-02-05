public class pattern7 {

    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        for(int row=1;row<=n;row++)
        {
            for(int space=row;space<n;space++)
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
