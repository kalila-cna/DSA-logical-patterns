public class pattern10 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        for(int row=0;row<2*n-1;row++)
        {
            if(row>=n)
            {
                for(int col=row;col<2*n-1;col++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(int col=0;col<=row;col++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
