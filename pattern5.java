public class pattern5 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        for(int row=n;row>0;row--)
        {
            for(int col=0;col<row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
